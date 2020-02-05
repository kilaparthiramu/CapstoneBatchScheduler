package com.capstone.batch.writer;

import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.stereotype.Component;

import com.capstone.batch.model.OutreachEventInformation;

@Component
public class CapstoneParticipatedWriter implements ItemWriter<OutreachEventInformation> {
	
	@Override
	public void write(List<? extends OutreachEventInformation> outreachEventInfoList) throws Exception {
		for(OutreachEventInformation outreachEventInformation: outreachEventInfoList) {
			//System.out.println(outreachEventInformation);
		}		
	}
}
