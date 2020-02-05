package com.capstone.batch.config.outreachinformation;

import org.springframework.batch.item.*;
import org.springframework.stereotype.Component;

import com.capstone.batch.model.OutreachEventInformation;

@Component
public class CapstoneOutReachInfoProcessor implements ItemProcessor<OutreachEventInformation, OutreachEventInformation> {
	
	@Override
	public OutreachEventInformation process(OutreachEventInformation outreachEventInformation) throws Exception {
		
		//String name = outreachEventInformation.getBeneficiaryName();
		//String processed_name = name.concat("_processed");
		//System.out.println(processed_name);
		
		return outreachEventInformation;
	}

}