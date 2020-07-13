package br.com.springBoot.awesome.model;

import javax.persistence.Entity;

import com.sun.istack.NotNull;


@Entity
public class Student extends AbstractEntity{
	

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
