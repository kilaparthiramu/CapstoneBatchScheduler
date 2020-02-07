package com.capstone.batch.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@ToString
public class CapstoneOutReach {
	
	private List<CapstoneEvent> event;
	private List<CapstoneEmployee> employee;

}
