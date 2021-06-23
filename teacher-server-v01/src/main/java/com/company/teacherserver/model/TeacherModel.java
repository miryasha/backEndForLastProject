package com.company.teacherserver.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;
import java.util.Set;


@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name = "teacherTbl")
public class TeacherModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "teacher_id")
    @NotNull
    private Long teacherId;


    @Column(name = "first_name")
    @NotNull
    private String firstName;

    @Column(name = "last_name")
    @NotNull
    private String lastName;

    @Column(name = "email")
    @NotNull
    private String email;

    @Column(name = "password")
    @NotNull
    private String passWord;

    @Column(name = "bio_short")
    @NotNull
    private String bioShort;

    @Column(name = "bio_long")
    @NotNull
    private String bioLong;


    @OneToMany( cascade=CascadeType.ALL, fetch=FetchType.EAGER)
    @JoinColumn//This table has a column with a foreign key to the referenced table
    private Set<CourseModel> courseModels;


    public TeacherModel(){}


    public TeacherModel(Long teacherId, String firstName, String lastName, String email, String passWord, String bioShort, String bioLong, Set<CourseModel> courseModels) {
        this.teacherId = teacherId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.passWord = passWord;
        this.bioShort = bioShort;
        this.bioLong = bioLong;
        this.courseModels = courseModels;
    }

    public Long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getBioShort() {
        return bioShort;
    }

    public void setBioShort(String bioShort) {
        this.bioShort = bioShort;
    }

    public String getBioLong() {
        return bioLong;
    }

    public void setBioLong(String bioLong) {
        this.bioLong = bioLong;
    }

    public Set<CourseModel> getCourseModels() {
        return courseModels;
    }

    public void setCourseModels(Set<CourseModel> courseModels) {
        this.courseModels = courseModels;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TeacherModel that = (TeacherModel) o;
        return Objects.equals(teacherId, that.teacherId) && Objects.equals(firstName, that.firstName) && Objects.equals(lastName, that.lastName) && Objects.equals(email, that.email) && Objects.equals(passWord, that.passWord) && Objects.equals(bioShort, that.bioShort) && Objects.equals(bioLong, that.bioLong) && Objects.equals(courseModels, that.courseModels);
    }

    @Override
    public int hashCode() {
        return Objects.hash(teacherId, firstName, lastName, email, passWord, bioShort, bioLong, courseModels);
    }

    @Override
    public String toString() {
        return "TeacherModel{" +
                "teacherId=" + teacherId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", passWord='" + passWord + '\'' +
                ", bioShort='" + bioShort + '\'' +
                ", bioLong='" + bioLong + '\'' +
                ", courseModels=" + courseModels +
                '}';
    }
}
