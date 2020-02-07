package com.capstone.batch.writer;

import java.util.ArrayList;
import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.capstone.batch.dao.CapstoneEmployeeRepository;
import com.capstone.batch.dao.CapstoneEventRepository;
import com.capstone.batch.model.CapstoneEmployee;
import com.capstone.batch.model.CapstoneEvent;
import com.capstone.batch.model.OutreachEventInformation;

@Component
public class CapstoneParticipatedWriter implements ItemWriter<OutreachEventInformation> {
	
	List<CapstoneEmployee> employee = new ArrayList<CapstoneEmployee>(); 
	
	@Autowired
	CapstoneEmployeeRepository capstoneEmployeeRepository;
	
	@Autowired
	CapstoneEventRepository capstoneEventRepository;
	
	@Override
	public void write(List<? extends OutreachEventInformation> outreachEventInfoList) throws Exception {
		
		//List<CapstoneEvent> capstoneEvents = new ArrayList<CapstoneEvent>();
		//List<CapstoneEmployee> capstoneEmployees = new ArrayList<CapstoneEmployee>();
		for(OutreachEventInformation outreachEventInformation: outreachEventInfoList) {
			CapstoneEvent capstoneEvent = new CapstoneEvent();
			//CapstoneEmployee capstoneEmployee = new CapstoneEmployee();
			capstoneEvent.setEventId(outreachEventInformation.getEventId());
			capstoneEvent.setEventName(outreachEventInformation.getEventName());
			//capstoneEvents.add(capstoneEvent);
			//capstoneEmployee.setEventId(outreachEventInformation.getEventId());
			//capstoneEmployee.setId(outreachEventInformation.getEmployeeId());
			//capstoneEmployee.setName(outreachEventInformation.getEmployeeName());
			//capstoneEmployees.add(capstoneEmployee);
			System.out.println("=========111==================");
			System.out.println(capstoneEvent.getEventId()+"...."+capstoneEvent.getEventName());
			System.out.println("===========2222================");
			capstoneEventRepository.save(capstoneEvent);
			System.out.println("===========================");
			//System.out.println(cap);
			
		}
		//capstoneEventRepository.saveAll(capstoneEvents);
		//capstoneEmployeeRepository.saveAll(capstoneEmployees);
		
	}
}
