package io.theBMan.springBootStarter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LectureService {
    private List<Lecture> lectureList = new ArrayList<Lecture>(Arrays.asList(
            new Lecture("Physics 101","Physics 101 class for freshmen",3),
            new Lecture("CS 304","Advanced Algorithms",11)
    ));

    public List<Lecture> getLectures() {
        return lectureList;
    }
}
