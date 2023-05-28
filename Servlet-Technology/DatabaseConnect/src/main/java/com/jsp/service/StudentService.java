package com.jsp.service;

import java.util.List;

import com.jsp.dao.StudentDao;
import com.jsp.dto.Student;

public class StudentService {
	
	StudentDao studentDao=new StudentDao();
	
	public Student saveStudent(Student student) {
		if(student!=null) {
		return studentDao.saveStudent(student);
		}else {
			return null;
		}
	}
	
	public Student getStudentById(int id) {
		if(id>0) {
		Student student = studentDao.getStudentById(id);
		return student;
	}else {
		return null;
	}
}
	
	
	public List<Student> getAllStudent(){
		List<Student> students = studentDao.getAllStudent();
		return students;
		
	}
	
	public Student updateStudentName(int id,String name) {
		if(id>0) {
		Student student = studentDao.getStudentById(id);
		student.setName(name);
		Student student2 = studentDao.updateStudent(student);
		return student2;
	}else {
		return null;
	}
		}
	
	public Student updateStudentEmail(int id,String email) {
		if(id>0) {
		Student student = studentDao.getStudentById(id);
		student.setEmail(email);
		Student student2 = studentDao.updateStudent(student);
		return student2;
	}else {
		return null;
	}
		}
	
	public void deleteStudentById(int id) {
		if (id>0) {
			studentDao.deleteStudentById(id);
		}else {
			System.out.println("Incorrect Id");
		}
	}
	
}