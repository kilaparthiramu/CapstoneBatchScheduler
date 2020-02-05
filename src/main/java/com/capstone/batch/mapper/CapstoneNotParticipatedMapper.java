package com.capstone.batch.mapper;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.springframework.batch.item.excel.RowMapper;
import org.springframework.batch.item.excel.support.rowset.RowSet;
import org.springframework.stereotype.Component;

import com.capstone.batch.model.VolunteerNotPrticipated;
	
@Component
public class CapstoneNotParticipatedMapper implements RowMapper<VolunteerNotPrticipated>{
	
	List<VolunteerNotPrticipated> list = new ArrayList<VolunteerNotPrticipated>();
	
	@Override
	public VolunteerNotPrticipated mapRow(RowSet rs) throws Exception {
		VolunteerNotPrticipated volunteerNotPrticipated = new VolunteerNotPrticipated();
		volunteerNotPrticipated.setEventId(rs.getColumnValue(0));
		volunteerNotPrticipated.setEventName(rs.getColumnValue(1));
		volunteerNotPrticipated.setBeneficiaryName(rs.getColumnValue(2));
		volunteerNotPrticipated.setBaseLocation(rs.getColumnValue(3));
		volunteerNotPrticipated.setEventDate((new SimpleDateFormat("dd-MM-yyyy").parse(rs.getColumnValue(4))));
		volunteerNotPrticipated.setEmployeeId(Double.parseDouble(rs.getColumnValue(5)));
	
		return volunteerNotPrticipated;
	}
}
