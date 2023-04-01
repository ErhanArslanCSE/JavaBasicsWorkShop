package org.enca.java17workshop;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Hello world!
 *
 */
public class MainApp
{
    public static String appName="ErhanArslan University Test Automation";
    public static String appVersion="v1.0";
    public static List<Program> programList;

    static {
        programList=new ArrayList<Program>();
        Program appliedAIPostGraduate=new Program(
                "APPLIED_AI",
                "Applied Artificial Intelligence Postgraduate Programs",
                "Computer Science",
                new Date()
        );

        Program appliedCSEUnderGraduate=new Program(
                "APPLIED_CSE",
                "Applied Computer Science Undergraduate Programs",
                "Computer Science",
                new Date()
        );
        programList.add(appliedAIPostGraduate);
        programList.add(appliedCSEUnderGraduate);
    }

    public static void main( String[] args )
    {
        System.out.println( "Welcome to University Course Backend App" );
        System.out.println( "******************************************" );
        MainApp newApp=new MainApp();
        newApp.initializeUniSetup();
    }
    public void initializeUniSetup()
    {
        System.out.println( "Initializing setup of application :"+appName+" "+appVersion );


        University newUni=new University(
                "Marmara University",
                "Turkey",
                "Istanbul",
                "Kadikoy",
                programList
        );

        initializeCourses(programList.get(0).getCourseList());

        System.out.println(newUni.toString());

    }

    public void initializeCourses(List<Course> courseList)
    {
        Exam semiFinalExam=new Exam();
        Exam finalExam=new Exam();
        semiFinalExam.setExamType(ExamTypes.SemiFinal);
        semiFinalExam.setExamCode("MathSemiFinal");
        semiFinalExam.setExamDate(new Date());

        finalExam.setExamType(ExamTypes.Final);
        finalExam.setExamCode("MathFinal");
        finalExam.setExamDate(new Date());

        Course mathForCSE=new Course(
                "Math For CSE",
                "Y",
                "Erhan Arslan",
                "Wednesday",
                semiFinalExam,finalExam
        );

        courseList.add(mathForCSE);
    }

}
