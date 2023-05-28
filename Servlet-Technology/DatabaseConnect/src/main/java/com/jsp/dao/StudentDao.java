package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.dto.Student;

public class StudentDao {
	
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("rushali");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	public Student saveStudent(Student student) {
		entityTransaction.begin();
		entityManager.persist(student);
		entityTransaction.commit();
		return student;
	}
	
	public Student getStudentById(int id) {
		Student student=entityManager.find(Student.class, id);
		return student;
	}
	
	public List<Student> getAllStudent(){
		String sql="select s from Student s";
		Query query= entityManager.createQuery(sql);
		List<Student> students = query.getResultList();
		return students;
	}
	
	public Student updateStudent(Student student) {
		entityTransaction.begin();
		entityManager.merge(student);
		entityTransaction.commit();
		return student;
	}
	
	public void deleteStudentById(int id) {
		Student student=entityManager.find(Student.class, id);
		entityManager.remove(student);
	}

}
