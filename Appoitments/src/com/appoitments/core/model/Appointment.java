package com.appoitments.core.model;

public class Appointment {

	private int id;
	private long start;
	private long end;
	private Customer customer;
	private Employee employee;
	private Service service;
	
	public Appointment(int id, long start, long end, Employee employee,
			Customer customer, Service service) {
		this.id = id;
		this.start = start;
		this.end = end;
		this.employee = employee;
		this.customer = customer;
		this.service = service;
	}

	public Customer getCustomer() {
		return customer;
	}

	public Service getService() {
		return service;
	}
	
	public int getId() {
		return id;
	}

	public long getStart() {
		return start;
	}

	public long getEnd() {
		return end;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((customer == null) ? 0 : customer.hashCode());
		result = prime * result + ((service == null) ? 0 : service.hashCode());
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
		Appointment other = (Appointment) obj;
		if (customer == null) {
			if (other.customer != null)
				return false;
		} else if (!customer.equals(other.customer))
			return false;
		if (employee == null) {
			if (other.employee != null)
				return false;
		} else if (!employee.equals(other.employee))
			return false;
		if (service == null) {
			if (other.service != null)
				return false;
		} else if (!service.equals(other.service))
			return false;
		return true;
	}
}
