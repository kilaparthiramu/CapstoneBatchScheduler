package com.capstone.batch.reader;

import java.io.FileNotFoundException;
import java.net.MalformedURLException;

import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.excel.poi.PoiItemReader;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.FileSystemResource;
import org.springframework.stereotype.Component;

import com.capstone.batch.mapper.CasptoneParticipatedMapper;
import com.capstone.batch.model.OutreachEventInformation;

@Component
public class CapstonePariticipatedReader {
	
	@Bean
    ItemReader<OutreachEventInformation> outReachEventInfoReader() throws MalformedURLException, FileNotFoundException {
        PoiItemReader<OutreachEventInformation> reader = new PoiItemReader<>();
        reader.setLinesToSkip(1);
        reader.setResource(new FileSystemResource("D:\\Users\\848063\\Documents\\data\\OutReachEventInformation.xlsx"));
        reader.setRowMapper(new CasptoneParticipatedMapper());
        return reader;
    }

}

