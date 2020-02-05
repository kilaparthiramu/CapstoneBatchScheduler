package com.capstone.batch.reader;

import java.io.FileNotFoundException;
import java.net.MalformedURLException;

import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.excel.poi.PoiItemReader;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.FileSystemResource;
import org.springframework.stereotype.Component;

import com.capstone.batch.mapper.CapstoneUnregisteredMapper;
import com.capstone.batch.model.VolunteerUnregistered;

@Component
public class CapstoneUnregisteredReader {
	
	@Bean
    ItemReader<VolunteerUnregistered> unRegisteredReader() throws MalformedURLException, FileNotFoundException {
        PoiItemReader<VolunteerUnregistered> reader = new PoiItemReader<>();
        reader.setLinesToSkip(1);
        reader.setResource(new FileSystemResource("D:\\Users\\848063\\Documents\\data\\UnRegistered.xlsx"));
        reader.setRowMapper(new CapstoneUnregisteredMapper());
        return reader;
    }
}
