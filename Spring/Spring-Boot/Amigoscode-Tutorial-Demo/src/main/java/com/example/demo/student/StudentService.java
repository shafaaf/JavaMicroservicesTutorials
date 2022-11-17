package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class StudentService {
    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    public void addNewStudent(Student student) {
        System.out.println("addNewStudent: student is: " + student);
        Optional<Student> optionalStudent = studentRepository.findStudentByEmail(student.email);
        if (optionalStudent.isPresent()) {
            throw new IllegalStateException("Email taken");
        }
        studentRepository.save(student);
    }

    public void deleteStudent(Long studentId) {
        System.out.println("deleteStudent: studentId is: " + studentId);
        boolean exists = studentRepository.existsById(studentId);
        if (!exists) {
            throw new IllegalStateException("Student with id: " + studentId + " does not exist");
        }
        studentRepository.deleteById(studentId);
    }

    @Transactional
    public void updateStudent(Long studentId, String name, String email) {
        System.out.println("updateStudent: studentId is: " + studentId);
        System.out.println("updateStudent: name is: " + name);
        System.out.println("updateStudent: email is: " + email);

        Student student = studentRepository.findById(studentId)
                .orElseThrow(() -> new IllegalStateException("student with id: " + studentId + " does not exist!"));

        if (name != null && name.length() > 0 && !Objects.equals(student.name, name)) {
            student.name = name;
        }

        if (email != null && email.length() > 0 && !Objects.equals(student.email, email)) {
            Optional<Student> optionalStudent = studentRepository.findStudentByEmail(email);
            if (optionalStudent.isPresent()) {
                throw new IllegalStateException("Email taken");
            }
            student.email = email;
        }

    }
}
