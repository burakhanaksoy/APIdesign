package io.theBMan.springBootStarter.student;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends CrudRepository<Student,String> {
    public List<Student> findByLectureName(String lectureName);
}
