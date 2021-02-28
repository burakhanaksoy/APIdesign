package io.theBMan.springBootStarter.student;

import io.theBMan.springBootStarter.lecture.Lecture;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    List<Student> studentList;

    public List<Student> getStudents(String lectureName){
        studentList = new ArrayList<Student>();
        studentRepository.findByLectureName(lectureName)
                .stream().forEach(studentList::add);
        return studentList;
    }
    public Student getStudent(String studentId){
        return studentRepository.findById(studentId).orElse(new Student());
    }

    public void addStudent(String lectureName, Student student){
        Lecture lecture = new Lecture(lectureName,"","");
        student.setLecture(lecture);
        studentRepository.save(student);
    }

    public void updateStudent(String studentId, Student student){
            studentRepository.save(student);

    }

    public void deleteStudent(String studentId){
        studentRepository.findById(studentId)
                .ifPresent(s -> studentRepository.delete(s));
    }



}
