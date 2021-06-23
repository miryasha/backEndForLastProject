package com.company.teacherserver.repository;

import com.company.teacherserver.model.TeacherModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TeacherRepo extends JpaRepository<TeacherModel, Long> {
    List<TeacherModel> findByEmail(String email);
//    List<Customer> findAllCustomersByState(String state);
//    List<Customer> findAllCustomersByLevel(String level);

}
