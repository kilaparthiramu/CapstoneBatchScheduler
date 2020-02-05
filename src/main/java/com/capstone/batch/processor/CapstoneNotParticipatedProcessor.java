package com.capstone.batch.processor;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.capstone.batch.model.VolunteerNotPrticipated;

@Component
public class CapstoneNotParticipatedProcessor implements ItemProcessor<VolunteerNotPrticipated, VolunteerNotPrticipated> {
	
	@Override
	public VolunteerNotPrticipated process(VolunteerNotPrticipated volunteerNotPrticipated) throws Exception {
		
		return volunteerNotPrticipated;
	}

}
