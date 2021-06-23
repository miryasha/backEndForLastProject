package com.company.teacherserver.controller;


import com.company.teacherserver.model.CourseModel;
import com.company.teacherserver.model.TeacherModel;
import com.company.teacherserver.repository.CourseRepo;
import com.company.teacherserver.repository.TeacherRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataLoaderController {




    @Autowired
    CourseRepo courseRepo;
    @GetMapping("/load-data-course")
    public void loadCourseData(){
        CourseModel courseModel1 = new CourseModel();
        courseModel1.setCourseTitle("Java");
        courseModel1.setCourseDuration(5);
        courseModel1.setStartingDate("1111-22-22");
        courseModel1.setCapacity(14);
        courseModel1.setDescription("sfsfsdfsf");
        courseModel1.setCategory("IT");
        courseRepo.save(courseModel1);

        CourseModel courseModel2 = new CourseModel();
        courseModel2.setCourseTitle("Mathlab");
        courseModel2.setCourseDuration(5);
        courseModel2.setStartingDate("2222-11-11");
        courseModel2.setCapacity(14);
        courseModel2.setDescription("sfsdfsdffsf");
        courseModel2.setCategory("WW");
        courseRepo.save(courseModel2);

    }


    @Autowired
    TeacherRepo teacherRepo;


    @GetMapping("/load-data-teacher")
    public void loadTeachersData(){

        TeacherModel teacherModel1 = new TeacherModel();
        teacherModel1.setFirstName("Yasha");
        teacherModel1.setLastName("Asgharpour");
        teacherModel1.setEmail("yasha123@gmail.com");
        teacherModel1.setPassWord("1234");
        teacherModel1.setBioShort("I'm so experienced ");
        teacherModel1.setBioLong("kjksdtasfsfsfsdfsdf");
        teacherRepo.save(teacherModel1);



        TeacherModel teacherModel2 = new TeacherModel();
        teacherModel2.setFirstName("Name2");
        teacherModel2.setLastName("Las2");
        teacherModel2.setEmail("NameLast2@gmail.com");
        teacherModel2.setPassWord("5678");
        teacherModel2.setBioShort("as experienced name last2");
        teacherModel2.setBioLong("kjksdtasfsfsfsdfsdf as experienced name last2");
        teacherRepo.save(teacherModel2);


        TeacherModel teacherModel3 = new TeacherModel();
        teacherModel3.setFirstName("Name3");
        teacherModel3.setLastName("Las3");
        teacherModel3.setEmail("NameLast3@gmail.com");
        teacherModel3.setPassWord("99999");
        teacherModel3.setBioShort("as experienced name last3");
        teacherModel3.setBioLong("kjksdtasfsfsfsdfsdf as experienced name last3");
        teacherRepo.save(teacherModel3);
    }



}
