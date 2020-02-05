package com.capstone.batch.model;

import java.util.Date;

public class VolunteerNotPrticipated {
	
	private String eventId;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((baseLocation == null) ? 0 : baseLocation.hashCode());
		result = prime * result
				+ ((beneficiaryName == null) ? 0 : beneficiaryName.hashCode());
		result = prime * result
				+ ((employeeId == null) ? 0 : employeeId.hashCode());
		result = prime * result
				+ ((eventDate == null) ? 0 : eventDate.hashCode());
		result = prime * result + ((eventId == null) ? 0 : eventId.hashCode());
		result = prime * result
				+ ((eventName == null) ? 0 : eventName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		VolunteerNotPrticipated other = (VolunteerNotPrticipated) obj;
		if (baseLocation == null) {
			if (other.baseLocation != null)
				return false;
		} else if (!baseLocation.equals(other.baseLocation))
			return false;
		if (beneficiaryName == null) {
			if (other.beneficiaryName != null)
				return false;
		} else if (!beneficiaryName.equals(other.beneficiaryName))
			return false;
		if (employeeId == null) {
			if (other.employeeId != null)
				return false;
		} else if (!employeeId.equals(other.employeeId))
			return false;
		if (eventDate == null) {
			if (other.eventDate != null)
				return false;
		} else if (!eventDate.equals(other.eventDate))
			return false;
		if (eventId == null) {
			if (other.eventId != null)
				return false;
		} else if (!eventId.equals(other.eventId))
			return false;
		if (eventName == null) {
			if (other.eventName != null)
				return false;
		} else if (!eventName.equals(other.eventName))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "VolunteerNotPrticipated [eventId=" + eventId + ", eventName="
				+ eventName + ", beneficiaryName=" + beneficiaryName
				+ ", baseLocation=" + baseLocation + ", eventDate=" + eventDate
				+ ", employeeId=" + employeeId + ", getEventId()="
				+ getEventId() + ", getEventName()=" + getEventName()
				+ ", getBeneficiaryName()=" + getBeneficiaryName()
				+ ", getBaseLocation()=" + getBaseLocation()
				+ ", getEventDate()=" + getEventDate() + ", getEmployeeId()="
				+ getEmployeeId() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	private String eventName;
	private String beneficiaryName;
	private String baseLocation;
	private Date eventDate;
	private Double employeeId;
	
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
	public String getBeneficiaryName() {
		return beneficiaryName;
	}
	public void setBeneficiaryName(String beneficiaryName) {
		this.beneficiaryName = beneficiaryName;
	}
	public String getBaseLocation() {
		return baseLocation;
	}
	public void setBaseLocation(String baseLocation) {
		this.baseLocation = baseLocation;
	}
	public Date getEventDate() {
		return eventDate;
	}
	public void setEventDate(Date eventDate) {
		this.eventDate = eventDate;
	}
	public Double getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Double employeeId) {
		this.employeeId = employeeId;
	}


}
