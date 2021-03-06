package com.capstone.batch.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class OutreachEventInformation {
	
	private String eventId;
	private String eventName;
	private String employeeId;
	private String employeeName;


}
