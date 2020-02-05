/*package com.capstone.batch.service;

import org.springframework.batch.item.excel.RowMapper;
import org.springframework.batch.item.excel.support.rowset.RowSet;
import org.springframework.stereotype.Component;

import com.capstone.batch.model.Employee;

@Component
public class CapstoneBatchServiceImpl implements RowMapper<Employee> {
	
    @Override
    public Employee mapRow(RowSet rs) throws Exception {
    	Employee employee = new Employee();
    	employee.setEventID(rs.getColumnValue(0));
    	System.out.println("========================================");
    	System.out.println(employee.getEventID());
    	System.out.println("========================================");
		return employee;
    }
}*/