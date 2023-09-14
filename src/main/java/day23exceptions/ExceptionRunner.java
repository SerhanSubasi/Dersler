package day23exceptions;

public class ExceptionRunner {


    public static void main(String[] args) {
 // getStudentGrade(77);
 // getStudentGrade(-77);
 // getStudentGrade(777);
 // System.out.println("main method");

// getTheNumberOfStudents(-15);
    }

    public static void getTheNumberOfStudents(int numOfStudents) {
        if (numOfStudents<0) {
            throw new InvalidNumberException("Student number are cannot be less then 0");
        } else {
            System.out.println(numOfStudents);
        }

    }





    public static void getStudentGrade (int grade) {
        if (grade <0 ||grade >100) {
            try {
                throw new InvalidStudentGradeException("Student's grades cannot be less than 0 or more than 100");
            } catch (InvalidStudentGradeException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println(grade);
        }

    }
}
