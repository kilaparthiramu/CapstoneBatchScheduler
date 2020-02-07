package com.capstone.batch.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.batch.item.excel.RowMapper;
import org.springframework.batch.item.excel.support.rowset.RowSet;
import org.springframework.stereotype.Component;

import com.capstone.batch.model.OutreachEventInformation;

@Component
public class CasptoneParticipatedMapper implements RowMapper<OutreachEventInformation>{
	
	List<OutreachEventInformation> list = new ArrayList<OutreachEventInformation>();
	
	@Override
	public OutreachEventInformation mapRow(RowSet rs) throws Exception {
		OutreachEventInformation outreachEventInformation = new OutreachEventInformation();
		outreachEventInformation.setEventId(rs.getColumnValue(0));
		//outreachEventInformation.setBaseLocation(rs.getColumnValue(1));
		//outreachEventInformation.setBeneficiaryName(rs.getColumnValue(2));
		//outreachEventInformation.setCouncilName(rs.getColumnValue(3));
		outreachEventInformation.setEventName(rs.getColumnValue(4));
		//outreachEventInformation.setEventDescription(rs.getColumnValue(5));
		//outreachEventInformation.setEventDate((new SimpleDateFormat("dd-MM-yyyy").parse(rs.getColumnValue(6))));
		outreachEventInformation.setEmployeeId(rs.getColumnValue(7));
		outreachEventInformation.setEmployeeName(rs.getColumnValue(8));
		//outreachEventInformation.setVolunteerHours(Double.parseDouble(rs.getColumnValue(9)));
		//outreachEventInformation.setTravelHours(Double.parseDouble(rs.getColumnValue(10)));
		//outreachEventInformation.setLivesImpacted(Double.parseDouble(rs.getColumnValue(11)));
		//outreachEventInformation.setBusinessUnit(rs.getColumnValue(12));
		//outreachEventInformation.setStatus(rs.getColumnValue(13));
		//outreachEventInformation.setIiepCategory(rs.getColumnValue(14));
		return outreachEventInformation;
	}

}

