package org.zzw.mapper;

import org.zzw.entity.Student;

public interface StudentMapper {
	public void addStudent(Student student	);

	Student queryStudentByStuno(int stuno);
}
