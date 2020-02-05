package com.capstone.batch.processor;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.capstone.batch.model.OutreachEventInformation;

@Component
public class CapstoneParticipatedProcessor implements ItemProcessor<OutreachEventInformation, OutreachEventInformation> {
	
	@Override
	public OutreachEventInformation process(OutreachEventInformation outreachEventInformation) throws Exception {
		
		return outreachEventInformation;
	}

}