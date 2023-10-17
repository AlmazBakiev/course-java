package View;

import Data.Student;

public class StudentView {
    public void printOnConsole(Student student){
        System.out.println(student.toString());
    }
    public void printOnConsoleStudentId(Student student){
        System.out.println(student.getStudentId() + " ");
    }
}
