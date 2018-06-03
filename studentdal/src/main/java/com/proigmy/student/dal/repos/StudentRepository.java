package com.proigmy.student.dal.repos;

import org.springframework.data.repository.CrudRepository;

import com.proigmy.student.dal.entities.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {

}
