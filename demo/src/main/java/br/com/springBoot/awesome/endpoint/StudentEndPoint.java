package br.com.springBoot.awesome.endpoint;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.springBoot.awesome.error.CustomErrorType;
import br.com.springBoot.awesome.model.Student;
import br.com.springBoot.awesome.repository.StudentRepository;

@RestController
@RequestMapping("student")
public class StudentEndPoint {

	
	private final StudentRepository studentDAO;
	
	@Autowired
	public StudentEndPoint(StudentRepository studentDAO) {
		this.studentDAO = studentDAO;
	}

//	@RequestMapping(method = RequestMethod.GET)
	@GetMapping()
	public ResponseEntity<?> listAll() {
		return new ResponseEntity<>(studentDAO.findAll(), HttpStatus.OK);
	}

	/**
	 * Método GET Resquest
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping(path = "/{id}")
	public ResponseEntity<?> getStudentById(@PathVariable("id") Long id) {		
		
		Optional<Student> students = studentDAO.findById(id);
//		Student students = studentDAO.findById(id).orElse(null);
		if (students == null) {
			return new ResponseEntity<>(new CustomErrorType("Student not found"), HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<>(students, HttpStatus.OK);

	}

	/**
	 * Método POST Request
	 * 
	 * @param student
	 * @return
	 * 
	 */
//	@RequestMapping(method = RequestMethod.POST)
	@PostMapping
	public ResponseEntity<?> save(@RequestBody Student students) {
		return new ResponseEntity<>(studentDAO.save(students), HttpStatus.OK);
	}

	/**
	 * Método DELETE Request
	 * 
	 * @param student
	 * @return
	 */
//	@RequestMapping(method = RequestMethod.DELETE)
	@DeleteMapping(path = "/{id}")
	public ResponseEntity<?> delete(@PathVariable Long id) {
		studentDAO.deleteById(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

	/**
	 * Método PUT Request
	 * 
	 * @param student
	 * @return
	 */
//	@RequestMapping(method = RequestMethod.PUT)
	@PutMapping
	public ResponseEntity<?> update(@RequestBody Student student) {
		studentDAO.save(student);
		return new ResponseEntity<>(HttpStatus.OK);

	}

}
