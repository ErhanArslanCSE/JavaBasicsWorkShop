package org.enca.java17workshop;

import java.util.Date;

public class Exam {
    public String getExamCode() {
        return examCode;
    }

    public void setExamCode(String examCode) {
        this.examCode = examCode;
    }

    public ExamTypes getExamType() {
        return examType;
    }

    public void setExamType(ExamTypes examType) {
        this.examType = examType;
    }

    public Date getExamDate() {
        return examDate;
    }

    public void setExamDate(Date examDate) {
        this.examDate = examDate;
    }

    @Override
    public String toString() {
        return "Exam{" +
                "examCode='" + examCode + '\'' +
                ", examType=" + examType +
                ", examDate=" + examDate +
                '}';
    }

    String examCode;
    ExamTypes examType;
    Date examDate;

}
