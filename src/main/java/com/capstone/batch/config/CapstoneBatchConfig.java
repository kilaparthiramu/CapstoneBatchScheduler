package com.capstone.batch.config;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.capstone.batch.model.OutreachEventInformation;
import com.capstone.batch.model.VolunteerNotPrticipated;

@Configuration
@EnableBatchProcessing
public class CapstoneBatchConfig {
	
	@Autowired
	public JobBuilderFactory jobBuilderFactory;

	@Autowired
    private StepBuilderFactory stepBuilderFactory;
	
	@Autowired
	ItemReader<OutreachEventInformation> participatedRedaer;
	
	@Autowired
	ItemProcessor<OutreachEventInformation, OutreachEventInformation> participatedProcessor;
	
	@Autowired
	ItemWriter<OutreachEventInformation> participatedWriter;
	
	@Autowired
	ItemReader<VolunteerNotPrticipated> notParticipatedRedaer;
	
	@Autowired
	ItemProcessor<VolunteerNotPrticipated, VolunteerNotPrticipated> notParticipatedProcessor;
	
	@Autowired
	ItemWriter<VolunteerNotPrticipated> notParticipatedWriter;
	
	@Bean
    public Job job(JobBuilderFactory jobBuilderFactory, 
    		StepBuilderFactory stepBuilderFactory) {

        Step participatedStep = stepBuilderFactory.get("ETL-file-load")
                .<OutreachEventInformation, OutreachEventInformation>chunk(100)
                .reader(participatedRedaer)
                .processor(participatedProcessor)
                .writer(participatedWriter)
                .build();
        
        Step notParticipatedStep = stepBuilderFactory.get("ETL-file-load")
                .<VolunteerNotPrticipated, VolunteerNotPrticipated>chunk(100)
                .reader(notParticipatedRedaer)
                .processor(notParticipatedProcessor)
                .writer(notParticipatedWriter)
                .build();


        return jobBuilderFactory.get("ETL-Load")
                .incrementer(new RunIdIncrementer())
                .start(participatedStep).next(notParticipatedStep)
                .build();
    }

}
