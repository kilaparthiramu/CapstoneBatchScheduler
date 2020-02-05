package com.capstone.batch.writer;

import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.stereotype.Component;

import com.capstone.batch.model.VolunteerUnregistered;

@Component
public class CapstoneUnregisteredWriter implements ItemWriter<VolunteerUnregistered> {
	
	@Override
	public void write(List<? extends VolunteerUnregistered> volunteerUnregisteredList) throws Exception {
		for(VolunteerUnregistered volunteerUnregistered: volunteerUnregisteredList) {
			System.out.println(volunteerUnregistered);
		}		
	}
}
