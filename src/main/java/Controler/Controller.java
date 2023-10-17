package Controler;

import Data.Student;
import Data.Teacher;
import Data.Type;
import Data.User;
import Service.DataService;
import Service.StudyGroupService;
import View.StudentView;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    private final DataService service = new DataService();
    private final StudentView studentView = new StudentView();
    private final StudyGroupService groupService = new StudyGroupService();

    public void createStudent(String firstName, String secondName,
                              String lastName, String dateB) {
        service.create(firstName, secondName, lastName, dateB, Type.STUDENT);
    }

    public void getAllStudent() {
        List<User> userList = service.getAllStudent();
        for (User user : userList) {
            studentView.printOnConsole((Student) user);
        }
    }

    public void createTeacher(String firstName, String secondName,
                              String lastName, String dateB) {
        service.create(firstName, secondName, lastName, dateB, Type.TEACHER);
    }

    public void getStudyGroup() {
        List<User> allUser = service.getAllUser();
        List<Student> students = new ArrayList<>();
        Teacher teacher = null;
        for (User user : allUser) {
            if (user instanceof Teacher) {
                teacher = (Teacher) user;
            } else {
                students.add((Student) user);
            }
        }
        groupService.createStudyGroup(teacher, students);
        System.out.println("Teacher ID:");
        System.out.println(teacher.getTeacherId());
        System.out.println("Students ID:");
        for (Student student : students) {
            studentView.printOnConsoleStudentId(student);
        }
    }
}
