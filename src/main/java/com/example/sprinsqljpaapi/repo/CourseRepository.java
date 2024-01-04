package com.example.sprinsqljpaapi.repo;

import com.example.sprinsqljpaapi.binding.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
@Repository
public interface CourseRepository extends JpaRepository<Course, Serializable> {
}
