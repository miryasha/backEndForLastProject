package com.company.teacherserver.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name = "courseTbl")
public class CourseModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "course_id")
    @NotNull
    private Long courseId;


    @Column(name = "course_title")
    @NotNull
    private String courseTitle;

    @Column(name = "course_duration")
    @NotNull
    private Integer courseDuration;

    @Column(name = "starting_date")
    @NotNull
    private String startingDate;

    @Column(name = "capacity")
    @NotNull
    private Integer capacity;

    @Column(name = "description")
    @NotNull
    private String description;


    @Column(name = "category")
    @NotNull
    private String category;

   public CourseModel(){}


    public CourseModel(Long courseId, String courseTitle, Integer courseDuration, String startingDate, Integer capacity, String description, String category) {
        this.courseId = courseId;
        this.courseTitle = courseTitle;
        this.courseDuration = courseDuration;
        this.startingDate = startingDate;
        this.capacity = capacity;
        this.description = description;
        this.category = category;
    }

    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public Integer getCourseDuration() {
        return courseDuration;
    }

    public void setCourseDuration(Integer courseDuration) {
        this.courseDuration = courseDuration;
    }

    public String getStartingDate() {
        return startingDate;
    }

    public void setStartingDate(String startingDate) {
        this.startingDate = startingDate;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CourseModel that = (CourseModel) o;
        return Objects.equals(courseId, that.courseId) && Objects.equals(courseTitle, that.courseTitle) && Objects.equals(courseDuration, that.courseDuration) && Objects.equals(startingDate, that.startingDate) && Objects.equals(capacity, that.capacity) && Objects.equals(description, that.description) && Objects.equals(category, that.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(courseId, courseTitle, courseDuration, startingDate, capacity, description, category);
    }

    @Override
    public String toString() {
        return "CourseModel{" +
                "courseId=" + courseId +
                ", courseTitle='" + courseTitle + '\'' +
                ", courseDuration=" + courseDuration +
                ", startingDate='" + startingDate + '\'' +
                ", capacity=" + capacity +
                ", description='" + description + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}
