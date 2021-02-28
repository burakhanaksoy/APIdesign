package io.theBMan.springBootStarter.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("/lectures/{lectureName}/students")
    public List<Student> getStudentList(@PathVariable String lectureName){
        return studentService.getStudents(lectureName);
    }
    @RequestMapping("/lectures/{lectureName}/students/{studentId}")
    public Student getStudentList(@PathVariable String lectureName,
                                        @PathVariable String studentId){
        return studentService.getStudent(studentId);
    }

    @PostMapping("/lectures/{lectureName}/students")
    public void addStudent(@PathVariable String lectureName, @RequestBody Student student){
        studentService.addStudent(lectureName, student);
    }

    @PutMapping("/lectures/{lectureName}/students/{studentId}")
    public void updateStudent(@PathVariable String studentId, @RequestBody Student student){
        studentService.updateStudent(studentId, student);
    }

    @DeleteMapping("/lectures/{lectureName}/students/{studentId}")
    public void deleteStudent(@PathVariable String studentId){
        studentService.deleteStudent(studentId);
    }
}
