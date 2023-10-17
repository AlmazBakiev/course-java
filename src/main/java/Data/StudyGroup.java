package Data;

import java.util.List;

public class StudyGroup {

    private List<Student> students;
    private Teacher teacher;

    public StudyGroup(List<Student> students, Teacher teacher) {
        this.students = students;
        this.teacher = teacher;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}