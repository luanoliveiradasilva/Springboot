package br.com.springBoot.awesome.model;

import static java.util.Arrays.asList;

import java.util.ArrayList;
import java.util.List;

public class Student {

	private int id;
	private String name;
	public static List<Student> studentList;

	static {
		studentRepository();
	}

	public Student(int id, String name) {
		this(name);
		this.id = id;
	}

	public Student(String name) {
		this.name = name;
	}

	public Student() {

	}

	private static void studentRepository() {
		studentList = new ArrayList<>(asList(new Student(1, "Pedro"), new Student(2, "Tiago")));
	}



	/*
	 * O hashCode é uma ferramenta da JVM usada para montar a tabela de hash de modo correto.
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
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
		Student other = (Student) obj;
		if (id != other.id)
			return false;
		return true;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
