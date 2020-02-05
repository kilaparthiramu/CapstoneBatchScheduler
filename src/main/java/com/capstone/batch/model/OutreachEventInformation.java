package com.capstone.batch.model;

import java.util.Date;



public class OutreachEventInformation {
	
	private String eventId;
	private String eventName;
	private String eventDescription;
	private Date eventDate;
	private String baseLocation;
	private String beneficiaryName;
	private String councilName;
	private Double livesImpacted;
	private String status;
	private String iiepCategory;
	private Double employeeId;
	private String employeeName;
	
	private Double volunteerHours;
	private Double travelHours;
	private String businessUnit;
	
	
	public String getEventId() {
		return eventId;
	}
	public void setEventId(String eventId) {
		this.eventId = eventId;
	}
	public String getEventName() {
		return eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	public String getEventDescription() {
		return eventDescription;
	}
	public void setEventDescription(String eventDescription) {
		this.eventDescription = eventDescription;
	}
	public Date getEventDate() {
		return eventDate;
	}
	public void setEventDate(Date eventDate) {
		this.eventDate = eventDate;
	}
	public String getBaseLocation() {
		return baseLocation;
	}
	public void setBaseLocation(String baseLocation) {
		this.baseLocation = baseLocation;
	}
	public String getBeneficiaryName() {
		return beneficiaryName;
	}
	public void setBeneficiaryName(String beneficiaryName) {
		this.beneficiaryName = beneficiaryName;
	}
	public String getCouncilName() {
		return councilName;
	}
	public void setCouncilName(String councilName) {
		this.councilName = councilName;
	}
	public Double getLivesImpacted() {
		return livesImpacted;
	}
	public void setLivesImpacted(Double livesImpacted) {
		this.livesImpacted = livesImpacted;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getIiepCategory() {
		return iiepCategory;
	}
	public void setIiepCategory(String iiepCategory) {
		this.iiepCategory = iiepCategory;
	}
	public Double getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Double employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public Double getVolunteerHours() {
		return volunteerHours;
	}
	public void setVolunteerHours(Double volunteerHours) {
		this.volunteerHours = volunteerHours;
	}
	public Double getTravelHours() {
		return travelHours;
	}
	public void setTravelHours(Double travelHours) {
		this.travelHours = travelHours;
	}
	public String getBusinessUnit() {
		return businessUnit;
	}
	public void setBusinessUnit(String businessUnit) {
		this.businessUnit = businessUnit;
	}
	public OutreachEventInformation(String eventId, String eventName, String eventDescription, Date eventDate,
			String baseLocation, String beneficiaryName, String councilName, Double livesImpacted, String status,
			String iiepCategory, Double employeeId, String employeeName, Double volunteerHours, Double travelHours,
			String businessUnit) {
		super();
		this.eventId = eventId;
		this.eventName = eventName;
		this.eventDescription = eventDescription;
		this.eventDate = eventDate;
		this.baseLocation = baseLocation;
		this.beneficiaryName = beneficiaryName;
		this.councilName = councilName;
		this.livesImpacted = livesImpacted;
		this.status = status;
		this.iiepCategory = iiepCategory;
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.volunteerHours = volunteerHours;
		this.travelHours = travelHours;
		this.businessUnit = businessUnit;
	}
	@Override
	public String toString() {
		return "OutreachEventInformation [eventId=" + eventId + ", eventName=" + eventName + ", eventDescription="
				+ eventDescription + ", eventDate=" + eventDate + ", baseLocation=" + baseLocation
				+ ", beneficiaryName=" + beneficiaryName + ", councilName=" + councilName + ", livesImpacted="
				+ livesImpacted + ", status=" + status + ", iiepCategory=" + iiepCategory + ", employeeId=" + employeeId
				+ ", employeeName=" + employeeName + ", volunteerHours=" + volunteerHours + ", travelHours="
				+ travelHours + ", businessUnit=" + businessUnit + "]";
	}
	
	public OutreachEventInformation() {}

}
