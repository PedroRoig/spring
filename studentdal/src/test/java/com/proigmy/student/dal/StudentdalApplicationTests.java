package com.proigmy.student.dal;

import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.proigmy.student.dal.entities.Student;
import com.proigmy.student.dal.repos.StudentRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentdalApplicationTests {
	@Autowired
	private StudentRepository studentRepository;

	@Test
	public void testCreateStudent() {
		Student student = new Student();
		student.setName("Juan");
		student.setCourse("Pipon");
		student.setFee(30d);
		studentRepository.save(student);
	}

	@Test
	public void testFindStudentById() {
		Optional<Student> studentResult = studentRepository.findById(1l);
		if (studentResult.isPresent())
			System.out.println(studentResult.get());
	}

	@Test
	public void testUpdateStudent() {
		Optional<Student> studentResult = studentRepository.findById(1l);
		if (studentResult.isPresent()) {
			Student student = studentResult.get();
			student.setFee(50d);
			studentRepository.save(student);
		}
	}

	@Test
	public void testDeleteStudent() {
		studentRepository.deleteById(1l);
	}
}