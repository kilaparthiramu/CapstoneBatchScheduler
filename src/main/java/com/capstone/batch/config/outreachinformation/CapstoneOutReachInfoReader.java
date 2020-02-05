package com.capstone.batch.config.outreachinformation;

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
import org.springframework.batch.item.excel.poi.PoiItemReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.FileSystemResource;

import com.capstone.batch.model.OutreachEventInformation;

@Configuration
@EnableBatchProcessing
public class CapstoneOutReachInfoReader {
	
	@Autowired
	public JobBuilderFactory jobBuilderFactory;

	@Autowired
    private StepBuilderFactory stepBuilderFactory;
	  
	@Bean
    public Job job(JobBuilderFactory jobBuilderFactory, 
    		StepBuilderFactory stepBuilderFactory, 
    		ItemReader<OutreachEventInformation> outReachEventInfoReader, 
    		ItemProcessor<OutreachEventInformation, OutreachEventInformation> itemProcessor, 
    		ItemWriter<OutreachEventInformation> itemWriter) {

        Step step = stepBuilderFactory.get("ETL-file-load")
                .<OutreachEventInformation, OutreachEventInformation>chunk(100)
                .reader(outReachEventInfoReader)
                .processor(itemProcessor)
                .writer(itemWriter)
                .build();


        return jobBuilderFactory.get("ETL-Load")
                .incrementer(new RunIdIncrementer())
                .start(step)
                .build();
    }
	
	@Bean
    ItemReader<OutreachEventInformation> outReachEventInfoReader() throws MalformedURLException, FileNotFoundException {
        PoiItemReader<OutreachEventInformation> reader = new PoiItemReader<>();
        reader.setLinesToSkip(1);
        reader.setResource(new FileSystemResource("D:\\Users\\848063\\Documents\\data\\OutReachEventInformation.xlsx"));
        reader.setRowMapper(new CapstoneOutReachMapper());
        return reader;
    }
	
	/*private RowMapper<OutreachEventInformation> excelRowMapper() {
        BeanWrapperRowMapper<OutreachEventInformation> rowMapper = new BeanWrapperRowMapper<>();
        rowMapper.setTargetType(OutreachEventInformation.class);
        return rowMapper;
    }*/

}
