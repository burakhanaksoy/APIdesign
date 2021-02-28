package io.theBMan.springBootStarter.lecture;

import io.theBMan.springBootStarter.student.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LectureController {

    @Autowired
    private LectureService lectureService;

    @RequestMapping("/lectures")
    public List<Lecture> getLectures(){
        return lectureService.getLectures();
    }

    @RequestMapping("/lectures/{name}")
    public Lecture getLecture(@PathVariable String name){
        return lectureService.getLecture(name);
    }

    @PostMapping("/lectures")
    public void addLecture(@RequestBody Lecture lecture){
        lectureService.addLecture(lecture);
    }

    @PutMapping("/lectures/{name}")
    public Lecture updateLecture(@PathVariable String name, @RequestBody Lecture lecture){
        return lectureService.updateLecture(name,lecture);
    }

    @DeleteMapping("/lectures/{name}")
    public void deleteLecture(@PathVariable String name){
        lectureService.deleteLecture(name);
    }
}
