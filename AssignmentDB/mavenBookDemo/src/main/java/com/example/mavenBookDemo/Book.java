package com.example.mavenBookDemo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book {
	@Id
	private String id;

	public Book(String id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}

	private String name;
	private String description;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public Book() {

	}

	public void setDescription(String description) {
		this.description = description;
	}

}
