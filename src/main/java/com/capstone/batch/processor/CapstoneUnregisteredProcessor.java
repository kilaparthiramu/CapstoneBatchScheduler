package com.capstone.batch.processor;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.capstone.batch.model.VolunteerUnregistered;

@Component
public class CapstoneUnregisteredProcessor implements ItemProcessor<VolunteerUnregistered, VolunteerUnregistered> {
	
	@Override
	public VolunteerUnregistered process(VolunteerUnregistered volunteerUnregistered) throws Exception {
		
		return volunteerUnregistered;
	}

}
