package session9.challenges.collegemanagementsystem;

public class Main {
    public static void main(String[] args) {

//  1. College Management System -  Design a system for a college to efficiently manage information about students, professors, and courses:
//  Store comprehensive profiles for every student, capturing their first name, last name, sex, age, date of birth, CNP, and address.
//  Similarly, maintain detailed profiles for every professor, including their first name, last name, sex, age, date of birth, CNP, and address.
//  The college offers eight distinct courses: Math, Computer Science, Physics, Chemistry, Biology, Geography, English, and History.
//  For each course, track details like its schedule, duration, description, and the assigned professor.
//  Allow for the assignment of a professor to a specific course and ensure the ability to retrieve and view course details, including its assigned professor.



        Professors professorOne = new Professors("Jack","Daniel",'M',175,"1848-09-05",180905,"Northern Ireland");

        Professors professorTwo = new Professors("Aron","Cobb",'M',30,"1970-07-02",190702,"California");

        Professors professorThree = new Professors("George","Everett",'M',50,"1950-01-03",190103,"Texas");

        Professors professorFour = new Professors("Etan","Clements",'M',30,"1970-04-02",190402,"Houston");

        Students studentOne = new Students("Andrew","Sutton",'M',20,"1980-01-03",190103,"Alabama");

        Students studentTwo = new Students("Rory","Hoover",'M',20,"1980-05-02",190502,"Texas");

        Students studentThree = new Students("Henny","Cash",'F',20,"1980-07-09",190709,"Houston");

        Students studentFour = new Students("Mariam","Huber",'F',20,"1980-04-03",190403,"New York");

        Courses mathCourse = new Courses("Math","March 2nd","two hours","Basic math.");

        Courses computerScienceCourse = new Courses("Computer Science","February 3rd","1 hour","Binary string operations.");

        Courses physicsCourse = new Courses("Physics","September 1st","2 hours and a half","Momentum and impulse.");

        Courses chemistryCourse = new Courses("Chemistry","january 15th","one hour and a half","Fundamental chemistry");

        Courses biologyCourse = new Courses("Biology","june 10th","one hour and fifteen minutes","Basic biology.");

        Courses geographyCourse = new Courses("Geography","august 5th","one hour","Geological land information.");

        Courses englishCourse = new Courses("English","september 3rd","one hour","English syntax.");

        Courses historyCourse = new Courses("History","april 4th","two hours","History of programming languages.");

        mathCourse.courseAssignments(professorOne,studentOne);
        System.out.println();
        computerScienceCourse.courseAssignments(professorTwo,studentTwo);
        System.out.println();
        physicsCourse.courseAssignments(professorThree,studentThree);
        System.out.println();
        chemistryCourse.courseAssignments(professorFour,studentFour);
        System.out.println();
        biologyCourse.courseAssignments(professorOne,studentOne);
        System.out.println();
        geographyCourse.courseAssignments(professorTwo,studentThree);
        System.out.println();
        englishCourse.courseAssignments(professorThree,studentOne);
        System.out.println();
        historyCourse.courseAssignments(professorOne,studentFour);




    }
}
