package com.capus.controler;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.capus.bean.Student;
@RestController
public class StudentControler {
	
	//RETURNS A SIMPLE JSON OBJECT
	@GetMapping("student")
	public Student getStudent() {
		
		Student student = new Student(1, "Doe", "John");
		return student;

	}
	
	//RETURNS A LIST OF JSON OBJECTs
	@GetMapping("students")
	public List<Student> getStudents() {
		
		List<Student> students = new ArrayList<Student>();
		students.add(new Student(1, "Doe", "John"));
		students.add(new Student(2, "Dae", "Jane"));
		students.add(new Student(3, "Due", "luke"));
		return students;

	}
	
	//RETURNS A SIMPLE JSON OBJECT with PATH parameters (thru URI /FOO/params)
	@GetMapping("student/{lname}/{fname}")
	public Student getStudentPath(@PathVariable String lname,@PathVariable String fname) {
		
		Student student = new Student(1, lname, fname);
		return student;
	}
	
	//RETURNS A SIMPLE JSON OBJECT with QUERY parameters (thru URI /FOO?params)
		@GetMapping("student/query")
		public Student getStudentQuery(@RequestParam String lname,@RequestParam String fname) {
			
			Student student = new Student(1, lname, fname);
			return student;
		}
	
}
