package br.com.springBoot.awesome.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.com.springBoot.awesome.model.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {
	List<Student> findByNameIgnoreCaseContaining(String name);
}
