package com.example.sprinsqljpaapi.service;

import com.example.sprinsqljpaapi.binding.Course;
import com.example.sprinsqljpaapi.repo.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseServiceImplementation implements CourseService {
    @Autowired
    private CourseRepository courseRepository;
    @Override
    public String upsert(Course course) {
        courseRepository.save(course);
        return "Course saved successfully";//upsert (insert or update)
    }

    @Override
    public Course getById(Integer cid) {
         Optional<Course> findById = courseRepository.findById(cid);
         if(findById.isPresent()){
            return findById.get();
//             return course.toString();
         }
        return null;
    }

    @Override
    public List<Course> getAllCourses() {
      return  courseRepository.findAll();

    }

    @Override
    public String deleteById(Integer cid) {
        if(courseRepository.existsById(cid)){
            courseRepository.deleteById(cid);
            return "Course deleted successfully";
        }
        else
            return "Course not found";
    }
}
