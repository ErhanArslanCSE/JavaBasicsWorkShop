package org.enca.java17workshop;

import java.util.ArrayList;
import java.util.List;

public class Course {

    public Course(String courseName, String isMendatory, String courseTutor, String courseDay) {
        this.courseName = courseName;
        this.isMendatory = isMendatory;
        this.courseTutor = courseTutor;
        this.courseDay = courseDay;
        this.examList=new ArrayList<Exam>();
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getIsMendatory() {
        return isMendatory;
    }

    public void setIsMendatory(String isMendatory) {
        this.isMendatory = isMendatory;
    }

    public String getCourseTutor() {
        return courseTutor;
    }

    public void setCourseTutor(String courseTutor) {
        this.courseTutor = courseTutor;
    }

    public String getCourseDay() {
        return courseDay;
    }

    public void setCourseDay(String courseDay) {
        this.courseDay = courseDay;
    }

    public List<Exam> getExamList() {
        return examList;
    }

    public void setExamList(List<Exam> examList) {
        this.examList = examList;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", isMendatory='" + isMendatory + '\'' +
                ", courseTutor='" + courseTutor + '\'' +
                ", courseDay='" + courseDay + '\'' +
                ", examList=" + examList +
                '}';
    }

    private String courseName;
    private String isMendatory;
    private String courseTutor;
    private String courseDay;
    private List<Exam> examList;
}
