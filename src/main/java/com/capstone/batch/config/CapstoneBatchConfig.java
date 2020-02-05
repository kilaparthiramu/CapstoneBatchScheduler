package com.capstone.batch.config;

import java.io.FileNotFoundException;
import java.net.MalformedURLException;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.excel.RowMapper;
import org.springframework.batch.item.excel.mapping.BeanWrapperRowMapper;
import org.springframework.batch.item.excel.poi.PoiItemReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.FileSystemResource;
import com.capstone.batch.model.Student;

@Configuration
@EnableBatchProcessing
public class CapstoneBatchConfig{
	
	@Autowired
	public JobBuilderFactory jobBuilderFactory;

	@Autowired
    private StepBuilderFactory stepBuilderFactory;
	  
	@Bean
    public Job job(JobBuilderFactory jobBuilderFactory, 
    		StepBuilderFactory stepBuilderFactory, 
    		ItemReader<Student> excelStudentReader, 
    		ItemProcessor<Student, Student> itemProcessor, 
    		ItemWriter<Student> itemWriter) {

        Step step = stepBuilderFactory.get("ETL-file-load")
                .<Student, Student>chunk(100)
                .reader(excelStudentReader)
                .processor(itemProcessor)
                .writer(itemWriter)
                .build();


        return jobBuilderFactory.get("ETL-Load")
                .incrementer(new RunIdIncrementer())
                .start(step)
                .build();
    }
	
	@Bean
    ItemReader<Student> excelStudentReader() throws MalformedURLException, FileNotFoundException {
        PoiItemReader<Student> reader = new PoiItemReader<>();
        reader.setLinesToSkip(1);
        reader.setResource(new FileSystemResource("D:\\Users\\848063\\Documents\\data\\students.xlsx"));
        reader.setRowMapper(excelRowMapper());
        return reader;
    }
	
	private RowMapper<Student> excelRowMapper() {
        BeanWrapperRowMapper<Student> rowMapper = new BeanWrapperRowMapper<>();
        rowMapper.setTargetType(Student.class);
        return rowMapper;
    }	

}
