package com.company.teacherserver.controller;


import com.company.teacherserver.model.TeacherModel;
import com.company.teacherserver.repository.TeacherRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class TeacherController {

    @Autowired
    TeacherRepo teacherRepo;



    @PostMapping("/teachers")
    @ResponseStatus(HttpStatus.CREATED)
    public TeacherModel addTeacher(@RequestBody TeacherModel teacherModel) {
        return teacherRepo.save(teacherModel);
    }

    @GetMapping("/teachers")
    @ResponseStatus(HttpStatus.OK)
    public List<TeacherModel>  getAllTeachers() {
        return teacherRepo.findAll();
    }


    @GetMapping("/teachers/{id}")
    public TeacherModel getTeacherById(@PathVariable Long id) {
        Optional<TeacherModel> returnVal = teacherRepo.findById(id);
        if (returnVal.isPresent()) {
            return returnVal.get();
        } else {
            return null;
        }
    }

//    @GetMapping(value = "/teachers/{id}")
//    public TeacherModel getTeacherByIdSecondMethod(@PathVariable Long id) {
//        Optional<TeacherModel> teacher = teacherRepo.findById(id);
//
//        if (!teacher.isPresent()) {
//            return null;
//        }
//
//        return teacher.get();
//    }


    @PutMapping("/teachers")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateTeacher(@RequestBody TeacherModel teacherModel) {
        teacherRepo.save(teacherModel);
    }

    @DeleteMapping("/teachers/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteTeacher(@PathVariable Long id) {
        teacherRepo.deleteById(id);
    }

    //    @GetMapping("/teachers/level/{level}")
//    public List<TeacherModel> getCustomersByLevel(@PathVariable String level) {
//        return repo.findAllCustomersByLevel(level);
//    }
//
//    @GetMapping("/teachers/state/{state}")
//    public List<Customer> getCustomersByState(@PathVariable String state) {
//        return repo.findAllCustomersByState(state);
//    }

}
