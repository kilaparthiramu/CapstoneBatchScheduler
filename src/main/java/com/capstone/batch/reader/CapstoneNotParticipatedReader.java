package com.capstone.batch.reader;

import java.io.FileNotFoundException;
import java.net.MalformedURLException;

import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.excel.poi.PoiItemReader;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.FileSystemResource;
import org.springframework.stereotype.Component;

import com.capstone.batch.mapper.CapstoneNotParticipatedMapper;
import com.capstone.batch.model.VolunteerNotPrticipated;

@Component
public class CapstoneNotParticipatedReader {
	
	@Bean
    ItemReader<VolunteerNotPrticipated> notParticipated() throws MalformedURLException, FileNotFoundException {
        PoiItemReader<VolunteerNotPrticipated> reader = new PoiItemReader<>();
        reader.setLinesToSkip(1);
        reader.setResource(new FileSystemResource("D:\\Users\\848063\\Documents\\data\\NotParticipated.xlsx"));
        reader.setRowMapper(new CapstoneNotParticipatedMapper());
        return reader;
    }

}
