package org.zzw.service;

import org.zzw.entity.Student;

public interface StudentService {
		Student queryStudentByNo(int stuNo);
		void addStudent(Student student);
}
