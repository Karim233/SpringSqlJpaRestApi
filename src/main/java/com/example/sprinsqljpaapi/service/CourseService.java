package com.example.sprinsqljpaapi.service;
import com.example.sprinsqljpaapi.binding.Course;

import java.util.List;

public interface Service {
    public String upsert(Course course);
    public String getById(Integer cid);
    public List<Course> getAll();
    public String deleteById(Integer cid);


}
