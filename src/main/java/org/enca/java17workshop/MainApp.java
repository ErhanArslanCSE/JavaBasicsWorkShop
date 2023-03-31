package org.enca.java17workshop;

import java.util.Date;
import java.util.List;

/**
 * Hello world!
 *
 */
public class MainApp
{
    public static void main( String[] args )
    {
        System.out.println( "Welcome to University Course Backend App" );
        System.out.println( "******************************************" );
        System.out.println( "Initializing setup..." );
        MainApp newApp=new MainApp();
        newApp.initializeUniSetup();

    }
    public void initializeUniSetup()
    {
        University newUni=new University(
                "Marmara University",
                "Turkey",
                "Istanbul",
                "Kadikoy"
        );
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

        newUni.getUniversityPrograms().add(appliedAIPostGraduate);
        newUni.getUniversityPrograms().add(appliedCSEUnderGraduate);
        initializeCourses(appliedCSEUnderGraduate.getCourseList());

        System.out.println(newUni.toString());

    }

    public void initializeCourses(List<Course> courseList)
    {
        Course mathForCSE=new Course(
                "Math For CSE",
                "Y",
                "Erhan Arslan",
                "Wednesday"
        );

        courseList.add(mathForCSE);
    }
}
