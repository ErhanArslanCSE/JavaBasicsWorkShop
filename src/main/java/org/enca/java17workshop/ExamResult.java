package org.enca.java17workshop;

public class ExamResult {
    public ExamResult(Exam exam, ExamResultCodes resultCode) {
        this.exam = exam;
        this.resultCode = resultCode;
    }

    @Override
    public String toString() {
        return "ExamResult{" +
                "exam=" + exam +
                ", resultCode=" + resultCode +
                '}';
    }

    Exam exam;
    ExamResultCodes resultCode;
}
