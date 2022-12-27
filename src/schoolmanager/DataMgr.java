package schoolmanager;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author npks
 */
public class DataMgr {
    List<Teacher> lstTeachers;
    List<Student> lstStudents;
    List<Subject> lstSubjects;
    List<Course> lstCourses;
    List<Schedule> lstSchedules;
    List<Attendance> lstAttendances;
    
    private static DataMgr instance = null;
    
    private DataMgr() {
        lstTeachers = new ArrayList<>();
        lstStudents = new ArrayList<>();
        lstSubjects = new ArrayList<>();
        lstCourses = new ArrayList<>();
        lstSchedules = new ArrayList<>();
        lstAttendances = new ArrayList<>();
    }
    
    public synchronized static DataMgr getInstance() {
        if (instance ==  null) {
            instance = new DataMgr();
        }
        return instance;
    }
    
    public void setDependency() {
        Schedule.setDependency(lstTeachers, lstSubjects, lstCourses);
        Attendance.setDependency(lstStudents);
    }
    
    //instance.getListSchedule.add(new Schedule()->input)

    public List<Teacher> getLstTeachers() {
        return lstTeachers;
    }

    public List<Student> getLstStudents() {
        return lstStudents;
    }

    public List<Subject> getLstSubjects() {
        return lstSubjects;
    }

    public List<Course> getLstCourses() {
        return lstCourses;
    }

    public List<Schedule> getLstSchedules() {
        return lstSchedules;
    }

    public List<Attendance> getLstAttendances() {
        return lstAttendances;
    }
    

}
