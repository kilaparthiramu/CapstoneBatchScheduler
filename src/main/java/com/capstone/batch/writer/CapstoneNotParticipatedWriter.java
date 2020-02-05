package com.capstone.batch.writer;

import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.stereotype.Component;

import com.capstone.batch.model.VolunteerNotPrticipated;


@Component
public class CapstoneNotParticipatedWriter implements ItemWriter<VolunteerNotPrticipated> {
	
	@Override
	public void write(List<? extends VolunteerNotPrticipated> volunteerNotPrticipatedList) throws Exception {
		for(VolunteerNotPrticipated volunteerNotPrticipated: volunteerNotPrticipatedList) {
			System.out.println(volunteerNotPrticipated);
		}		
	}
}