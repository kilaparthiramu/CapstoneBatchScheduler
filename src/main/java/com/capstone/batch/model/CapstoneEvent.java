package com.capstone.batch.model;


import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
@Table(value="event1")
public class CapstoneEvent {
	
	@Column(value="event_id")
	private String eventId;
	@Column(value="event_name")
	private String eventName;

}
