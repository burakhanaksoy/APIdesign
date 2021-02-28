package io.theBMan.springBootStarter.lecture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class LectureService {

    @Autowired
    private LectureRepository lectureRepository;

    private List<Lecture> lectureList ;

    public List<Lecture> getLectures() {
        lectureList = new ArrayList<Lecture>();
        lectureRepository.findAll()
        .forEach(lectureList::add);
        return lectureList;
    }

    public Lecture getLecture(String name){
        return lectureRepository.findById(name).orElse(new Lecture());
    }
    public void addLecture(Lecture lecture){
        lectureRepository.save(lecture);
    }

    public Lecture updateLecture(String name, Lecture lecture){
        if(lectureRepository.findById(name).isPresent()){
            lectureRepository.save(lecture);
        }else
            addLecture(lecture);
        return lecture;
    }
    public void deleteLecture(String name){
        lectureRepository.findById(name)
                .ifPresent(lecture -> lectureRepository.delete(lecture));
    }
}
