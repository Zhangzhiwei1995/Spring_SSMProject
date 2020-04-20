package org.zzw.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zzw.entity.Student;
import org.zzw.service.StudentService;

@RequestMapping("controller")
@Controller//StudentController����Ioc����
public class StudentController {
	//������������Service
	@Autowired
	@Qualifier("studentService") 
	private StudentService  studentService;
		
	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}

	@RequestMapping("queryStudentByNo/{stuno}")
	public String queryStudentByNo(@PathVariable("stuno") Integer stuNo ,Map<String,Object> map) {
		Student student = studentService.queryStudentByNo(stuNo) ;
		map.put("student", student) ;
		return "result" ;
	}  
	
	@RequestMapping("addStudent")
	public String addStudent(Student student) {
		studentService.addStudent(student) ;
		return "result" ;
	}  

}
