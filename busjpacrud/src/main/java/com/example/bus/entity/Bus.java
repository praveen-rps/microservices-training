package com.example.bus.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "bus")
public class Bus {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long busId;
	private String busNumber;
	private String source;
	private String destination;
	private int capacity;

	public Bus() {
	}

	public Bus(String busNumber, String source, String destination, int capacity) {
		this.busNumber = busNumber;
		this.source = source;
		this.destination = destination;
		this.capacity = capacity;
	}

	public Long getBusId() {
		return busId;
	}

	public void setBusId(Long busId) {
		this.busId = busId;
	}

	public String getBusNumber() {
		return busNumber;
	}

	public void setBusNumber(String busNumber) {
		this.busNumber = busNumber;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public String toString() {
		return "Bus{id=" + busId + ", number=" + busNumber + ", source=" + source + ", destination=" + destination
				+ ", capacity=" + capacity + "}";
	}
}
