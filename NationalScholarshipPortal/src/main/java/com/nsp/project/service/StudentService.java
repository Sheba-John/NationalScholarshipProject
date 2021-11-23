package com.nsp.project.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.nsp.project.entity.Student;
@Service
public interface StudentService {
  public List<Student> getAllStudents();
  public Optional<Student> getStudent(int id);
  public void saveStudent (Student s);
  public void updateStudentDetail(int id,Student s);
  public void deleteStudent(int id);
  
}
