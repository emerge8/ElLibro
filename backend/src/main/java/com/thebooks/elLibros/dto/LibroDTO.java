package com.thebooks.elLibros.dto;

import java.io.Serializable;

import com.thebooks.elLibros.entities.Libro;
import com.thebooks.elLibros.entities.enums.Platform;

public class LibroDTO implements Serializable  {
	private static final long serialVersionUID = 1;
	
	private Long id;
	private String title;
	private Platform platform;
	
	public LibroDTO(){
	}
	
	public LibroDTO(Libro entity) {
		id = entity.getId();
		title = entity.getTitle();
		platform= entity.getPlatform();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Platform getPlatform() {
		return platform;
	}

	public void setPlatform(Platform platform) {
		this.platform = platform;
	}
	
}
