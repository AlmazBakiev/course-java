package Controller;

import Data.Teacher;
import Service.StudentGroupService;
import Service.TeacherService;
import View.TeacherView;

import java.time.LocalDate;
import java.util.List;

public class TeacherController implements UserController<Teacher> {

    private final TeacherService dataService = new TeacherService();
    private final StudentGroupService studentGroupService = new StudentGroupService();
    private final TeacherView teacherView = new TeacherView();

    @Override
    public void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        dataService.create(firstName, secondName, patronymic, dateOfBirth);
        teacherView.sendOnConsole(dataService.getAll());
    }

    public void editingTeacher(Long teacherId, Long newTeacherId) {
        List<Teacher> teachers = dataService.getAll();
        for (Teacher teacher : teachers) {
            if (teacher.getTeacherId() == teacherId) {
                teacher.setTeacherId(newTeacherId);
            }
        }
    }

    public void editingTeacher(Long teacherId, String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        List<Teacher> teachers = dataService.getAll();
        for (Teacher teacher : teachers) {
            if (teacher.getTeacherId() == teacherId) {
                teacher.setFirstName(firstName);
                teacher.setSecondName(secondName);
                teacher.setPatronymic(patronymic);
                teacher.setDateOfBirth(dateOfBirth);
            }
        }
    }

    public void consoleOutput() {
        List<Teacher> teachers = dataService.getAll();
        teacherView.sendOnConsole(teachers);
    }
}
