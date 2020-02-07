package com.capstone.batch.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table(value="employee1")
@Setter 
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Data
public class CapstoneEmployee {
	
	@Column(value="emp_id")
	private String id;
	@Column(value="emp_name")
	private String name;
	@Column(value="event_Id")
	private String eventId;
	

}
