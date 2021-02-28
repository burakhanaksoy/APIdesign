package io.theBMan.springBootStarter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LectureController {

    @Autowired
    private LectureService lectureService;

    @RequestMapping("/classroom")
    public List<Lecture> getClassrooms(){
        return lectureService.getLectures();
    }
}
