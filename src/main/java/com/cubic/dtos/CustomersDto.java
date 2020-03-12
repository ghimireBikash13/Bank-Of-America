package com.cubic.dtos;

public class CustomersDto {

	private int id;
	private String name;
	private String address;
	private String email;
	private String uuid;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;

	}

	@Override
	public String toString() {
		return "CustomersDto [id=" + id + ", name=" + name + ", address=" + address + ", email=" + email + ", uuid="
				+ uuid + "]";
	}
	
}
