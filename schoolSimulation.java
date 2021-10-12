package week3;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class schoolSimulation extends person {

    public static void main(String[] args){
        person student;
        person teacher;
        courses course;
        Random random = new Random();

        ArrayList teacherArr = new ArrayList();
        ArrayList<Object> studentArr = new ArrayList<>();
        ArrayList<String> courseTechArr = new ArrayList<String>();
        ArrayList<String> courseStArr = new ArrayList<>();

        System.out.println("Do you want to enter student information? Y/N:");
        Scanner scanner = new Scanner(System.in);
        String chooseSt = scanner.next();
        boolean continueStu = true;

        if(chooseSt.equals("Y")) {
            int i=0;
            while (i <= random.nextInt()) {
                System.out.println("Please student information:");
                System.out.println("Student name:");
                String studentName = scanner.next();
                System.out.println("Student surname:");
                String studentSurname = scanner.next();
                System.out.println("Student age:");
                int studentAge = scanner.nextInt();
                System.out.println("Student gender:");
                String studentGender = scanner.next();
                System.out.println("Student year:");
                int studentYear = scanner.nextInt();

                student = new person(studentName, studentSurname, studentAge, studentGender, studentYear);
                String st= "Name: " + student.name + " Surname: " + student.surname + " Age: " + student.age + " Gender: " + student.gender + " Year: " + student.year;
                studentArr.add(st);

                System.out.println("Student information are added. Could you continue? Y/N");
                String continueSt = scanner.next();
                if (continueSt.equals("Y")) {
                    i++;
                    continueStu = false;
                } else if (continueSt.equals("N")) {
                    System.out.println("You can skip entering the student information...");
                    System.out.println("Do you want to enter teacher information? Y/N:");
                    String chooseTch = scanner.next();
                    boolean continueTch = true;

                    if(chooseTch.equals("Y")) {
                        int j = 0;
                        while (j <= random.nextInt()) {
                            System.out.println("Please teacher information:");
                            System.out.println("Teacher name:");
                            String teacherName = scanner.next();
                            System.out.println("Teacher surname:");
                            String teacherSurname = scanner.next();
                            System.out.println("Teacher age:");
                            int teacherAge = scanner.nextInt();
                            System.out.println("Teacher gender:");
                            String teacherGender = scanner.next();

                            teacher = new person(teacherName, teacherSurname, teacherAge, teacherGender);
                            String tch = "Name: " + teacher.name + " Surname: " + teacher.surname + " Age: " + teacher.age + " Gender: " + teacher.gender + " Year: " + teacher.year;
                            teacherArr.add(tch);

                            System.out.println("Teacher information are added. Could you continue? Y/N");
                            if (chooseTch.equals("Y")) {
                                j++;
                                continueTch = false;
                            } else if (chooseTch.equals("N")) {
                                System.out.println("You can skip entering the teacher information...");
                                break;
                            }
                        }
                    }
                }
            }
        }
        else if(chooseSt.equals("N")) {
            System.out.println("You can skip entering the student information...");
            System.out.println("Do you want to enter teacher information? Y/N:");
            String chooseTch = scanner.next();
            boolean continueTch = true;

            if(chooseTch.equals("Y")) {
                int j = 0;
                while (j <= random.nextInt()) {
                    System.out.println("Please teacher information:");
                    System.out.println("Teacher name:");
                    String teacherName = scanner.next();
                    System.out.println("Teacher surname:");
                    String teacherSurname = scanner.next();
                    System.out.println("Teacher age:");
                    int teacherAge = scanner.nextInt();
                    System.out.println("Teacher gender:");
                    String teacherGender = scanner.next();

                    teacher = new person(teacherName, teacherSurname, teacherAge, teacherGender);
                    String tch = "Name: " + teacher.name + " Surname: " + teacher.surname + " Age: " + teacher.age + " Gender: " + teacher.gender + " Year: " + teacher.year;
                    teacherArr.add(tch);

                    System.out.println("Teacher information are added. Could you continue? Y/N");
                    if (chooseTch.equals("Y")) {
                        j++;
                        continueTch = false;
                    } else if (chooseTch.equals("N")) {
                        System.out.println("You can skip entering the teacher information...");
                        break;
                    }
                }
            }
        }
        scanner.close();
        for(int x=1; x<studentArr.size(); x++) {
            int totalCourseCredit = 0;

            while(totalCourseCredit <= 20){
                int credit = x+1;
                String courseName = "Course";
                int studentCount = 20;
                course = new courses(courseName, credit, studentCount);
                String courses = "Course Name: " + course.courseName + " Course Credit: " + course.credit + " Student Count: " + course.studentCount;
                courseStArr.add(courses);
            }

        }


        for(int y=1; y<teacherArr.size(); y++) {

            for (int z = 1; z <= 3; z++) {
                int credit = y + 1;
                String courseName = "Course";
                int studentCount = 20;
                course = new courses(courseName, credit, studentCount);
                String courses = "Course Name: " + course.courseName + " Course Credit: " + course.credit + " Student Count: " + course.studentCount;
                courseTechArr.add(courses);
            }
        }

    }

}