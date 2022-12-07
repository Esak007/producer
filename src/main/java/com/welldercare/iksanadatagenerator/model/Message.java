package com.welldercare.iksanadatagenerator.model;

import java.util.Date;

public class Message {
	
	private String eventType;
	private String deviceId;
	private String message;
	private String date;
	private String veteranId;

	@Override
	public String toString() {
		return "{ eventType=" + eventType + ", deviceId=" + deviceId + ", message=" + message
				+ ", date=" + date + ", veteranId=" + veteranId + "}";
	}
	
	public String getEventType() {
		return eventType;
	}

	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	
	
	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getVeteranId() {
		return veteranId;
	}
	public void setVeteranId(String veteranId) {
		this.veteranId = veteranId;
	}
	public String getDeviceId() {
		return deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	

}
