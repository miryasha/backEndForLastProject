package com.company.teacherserver.repository;

import com.company.teacherserver.model.CourseModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepo extends JpaRepository<CourseModel, Long> {
}
