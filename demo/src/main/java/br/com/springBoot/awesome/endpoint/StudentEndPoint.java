package br.com.springBoot.awesome.endpoint;

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
import br.com.springBoot.awesome.util.DateUtil;

@RestController
@RequestMapping("student")
public class StudentEndPoint {

	private final DateUtil dateUtil;

	@Autowired
	public StudentEndPoint(DateUtil dateUtil) {
		this.dateUtil = dateUtil;
	}

//	@RequestMapping(method = RequestMethod.GET)
	@GetMapping()
	public ResponseEntity<?> listAll() {
		return new ResponseEntity<>(Student.studentList, HttpStatus.OK);
	}

	/**
	 * Método GET Resquest
	 * 
	 * @param id
	 * @return
	 */
//	@RequestMapping(method = RequestMethod.GET, path = "/{id}")
	@GetMapping(path = "/{id}")
	public ResponseEntity<?> getStudentById(@PathVariable("id") int id) {
		Student student = new Student();
		student.setId(id);
		int index = Student.studentList.indexOf(student);

		if (index == -1) {
			return new ResponseEntity<>(new CustomErrorType("Student not found"), HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity<>(Student.studentList.get(index), HttpStatus.OK);

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
	public ResponseEntity<?> save(@RequestBody Student student) {
		Student.studentList.add(student);
		return new ResponseEntity<>(student, HttpStatus.OK);
	}

	/**
	 * Método DELETE Request
	 * 
	 * @param student
	 * @return
	 */
//	@RequestMapping(method = RequestMethod.DELETE)
	@DeleteMapping
	public ResponseEntity<?> delete(@RequestBody Student student) {
		Student.studentList.remove(student);
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
		Student.studentList.remove(student);
		Student.studentList.add(student);
		return new ResponseEntity<>(HttpStatus.OK);
		
	}

}
