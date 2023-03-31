package org.enca.java17workshop;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Program {

    public Program(String programCode, String programName, String programMajor, Date programStartDate) {
        this.programCode = programCode;
        this.programName = programName;
        this.programMajor = programMajor;
        this.programStartDate = programStartDate;
        this.studentList=new ArrayList<Student>();
        this.courseList=new ArrayList<Course>();
    }

    public String getProgramCode() {
        return programCode;
    }

    public void setProgramCode(String programCode) {
        this.programCode = programCode;
    }

    public String getProgramName() {
        return programName;
    }

    public void setProgramName(String programName) {
        this.programName = programName;
    }

    public String getProgramMajor() {
        return programMajor;
    }

    public void setProgramMajor(String programMajor) {
        this.programMajor = programMajor;
    }

    public Date getProgramStartDate() {
        return programStartDate;
    }

    public void setProgramStartDate(Date programStartDate) {
        this.programStartDate = programStartDate;
    }

    public List<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    @Override
    public String toString() {
        return "Program{" +
                "programCode='" + programCode + '\'' +
                ", programName='" + programName + '\'' +
                ", programMajor='" + programMajor + '\'' +
                ", programStartDate=" + programStartDate +
                ", courseList=" + courseList +
                ", studentList=" + studentList +
                '}';
    }

    String programCode;
    String programName;
    String programMajor;
    Date programStartDate;
    List<Course> courseList;
    List<Student> studentList;

}
