package org.zzw.service.impl;

import org.zzw.entity.Student;
import org.zzw.mapper.StudentMapper;
import org.zzw.service.StudentService;

public class StudentServiceImpl implements StudentService {
	//service������dao(mapper)
	private StudentMapper  studentMapper ;
	
	public void setStudentMapper(StudentMapper studentMapper) {
		this.studentMapper = studentMapper;
	}


	@Override
	public Student queryStudentByNo(int stuNo) {
		return  studentMapper.queryStudentByStuno(stuNo) ;
	}


	@Override
	public void addStudent(Student student) {
		studentMapper.addStudent(student);
	}

}
