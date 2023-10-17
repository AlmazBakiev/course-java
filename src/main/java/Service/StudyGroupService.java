package Service;

import Data.Student;
import Data.StudyGroup;
import Data.Teacher;

import java.util.List;

public class StudyGroupService {
    StudyGroup studyGroup;

    public StudyGroup createStudyGroup(Teacher teacher, List<Student> students) {
        return this.studyGroup = new StudyGroup(students, teacher);
    }
}
