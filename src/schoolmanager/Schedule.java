package schoolmanager;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author npks
 */
public class Schedule {
    static List<Teacher> lstTeachers;
    static List<Subject> lstSubjects;
    static List<Course> lstCourses;

    
    
    int scheduleId;
    int teacherId;
    int subjectID;
    int courseId;
    int timeFrame;
    int timeSched;
    String startDate;
    String endDate;
    

    public Schedule() {
    }

    public Schedule(int scheduleId, int teacherId, int subjectID, int courseId, int timeFrame, int timeSched, String startDate, String endDate) {
        this.scheduleId = scheduleId;
        this.teacherId = teacherId;
        this.subjectID = subjectID;
        this.courseId = courseId;
        this.timeFrame = timeFrame;
        this.timeSched = timeSched;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public int getScheduleId() {
        return scheduleId;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public int getSubjectID() {
        return subjectID;
    }

    public int getCourseId() {
        return courseId;
    }

    public int getTimeFrame() {
        return timeFrame;
    }

    public int getTimeSched() {
        return timeSched;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setScheduleId(int scheduleId) {
        this.scheduleId = scheduleId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public void setSubjectID(int subjectID) {
        this.subjectID = subjectID;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public void setTimeFrame(int timeFrame) {
        this.timeFrame = timeFrame;
    }

    public void setTimeSched(int timeSched) {
        this.timeSched = timeSched;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
    
    static void setDependency(List<Teacher> _lstTeachers,
        List<Subject> _lstSubjects,List<Course> _lstCourses) {
        lstTeachers = _lstTeachers;
        lstSubjects = _lstSubjects;
        lstCourses = _lstCourses;
    }
    
    public boolean input() {
        if (lstSubjects.isEmpty() || lstSubjects.isEmpty() ||
                lstCourses.isEmpty()) {
            System.out.println("il faut ajouter matiere et cours");
            return false;
        }
        System.out.println("Input planning info");
        Scanner inp = new Scanner(System.in);
        System.out.println("Input jour debut (dd/mm/yyyy)");
        startDate = inp.nextLine();
        
        System.out.println("Input jour termine (dd/mm/yyyy)");
        endDate = inp.nextLine();
        
        System.out.println("Input id de planning");
        scheduleId= inp.nextInt();
        
        System.out.println("Input id de prof");
        int input = inp.nextInt();        
        //validate
        int i = 0;
        for (; i < lstTeachers.size(); i++) {
            if (input == (lstTeachers.get(i).getId())) break;
        }
        if (i == lstTeachers.size()) {
            System.out.println("Id de prof n'existe pas");
            return false;
        }
        teacherId = input;
        //end validate
        
        System.out.println("Input id matiere");
        input = inp.nextInt();
        //validate
        i = 0;
        for (; i < lstSubjects.size(); i++) {
            if (input == (lstSubjects.get(i).getSubjectId())) break;
        }
        if (i == lstSubjects.size()) {
            System.out.println("Id matiere n'existe pas");
            return false;
        }
        subjectID = input;
        //end validate
        
        System.out.println("Input id de cours");
        input = inp.nextInt();
        //validate
        i = 0;
        for (; i < lstCourses.size(); i++) {
            if (input == (lstCourses.get(i).getId())) break;
        }
        if (i == lstCourses.size()) {
            System.out.println("Id de cours n'existe pas");
            return false;
        }
        courseId = input;
        //end validate
        
        System.out.println("Input temps planning");
        System.out.println("0 -> matin");
        System.out.println("1 -> apres midi");
        System.out.println("2 -> soir");
        timeFrame = inp.nextInt();
        System.out.println("0 -> Lundi");
        System.out.println("1 -> Mardi");
        System.out.println("2 -> mercredi");
        System.out.println("3 -> jeudi");
        System.out.println("4 -> vendredi");
        
        timeSched = inp.nextInt();
        
        
        
        return true;
    }
    @Override
    public String toString() {
    	if (timeSched==0) {
    		if (timeFrame==0) {
    			return "planning{id de planning: "+ scheduleId+", ID de prof: " + teacherId + ", id de matiere: "+ subjectID+ ", id de cours: " + courseId + ", time: lundi matin" + " - " + startDate + "-" + endDate+"}";
    		}
    		else if (timeFrame==1) {
    			return "planning{id de planning: "+ scheduleId+", ID de prof: " + teacherId + ", id de matiere: "+ subjectID+ ", id de cours: " + courseId + ", time: lundi apres midi" + " - " + startDate + "-" + endDate+"}";
    		}
    		else{
    			return "planning{id de planning: "+ scheduleId+", ID de prof: " + teacherId + ", id de matiere: "+ subjectID+ ", id de cours: " + courseId + ", time: lundi soir" + " - " + startDate + "-" + endDate+"}";
    		}
    	}
    	else if (timeSched==1) {
    		if (timeFrame==0) {
    			return "planning{id de planning: "+ scheduleId+", ID de prof: " + teacherId + ", id de matiere: "+ subjectID+ ", id de cours: " + courseId + ", time: mardi matin" + " - " + startDate + "-" + endDate+"}";
    		}
    		else if (timeFrame==1) {
    			return "planning{id de planning: "+ scheduleId+", ID de prof: " + teacherId + ", id de matiere: "+ subjectID+ ", id de cours: " + courseId + ", time: mardi apres midi" + " - " + startDate + "-" + endDate+"}";
    		}
    		else{
    			return "planning{id de planning: "+ scheduleId+", ID de prof: " + teacherId + ", id de matiere: "+ subjectID+ ", id de cours: " + courseId + ", time: mardi soir" + " - " + startDate + "-" + endDate+"}";
    		}
    	}
    	else if (timeSched==2) {
    		if (timeFrame==0) {
    			return "planning{id de planning: "+ scheduleId+", ID de prof: " + teacherId + ", id de matiere: "+ subjectID+ ", id de cours: " + courseId + ", time: mercredi matin" + " - " + startDate + "-" + endDate+"}";
    		}
    		else if (timeFrame==1) {
    			return "planning{id de planning: "+ scheduleId+", ID de prof: " + teacherId + ", id de matiere: "+ subjectID+ ", id de cours: " + courseId + ", time: mercredi apres midi" + " - " + startDate + "-" + endDate+"}";
    		}
    		else{
    			return "planning{id de planning: "+ scheduleId+", ID de prof: " + teacherId + ", id de matiere: "+ subjectID+ ", id de cours: " + courseId + ", time: mercredi soir" + " - " + startDate + "-" + endDate+"}";
    		}
    	}
    	else if (timeSched==3) {
    		if (timeFrame==0) {
    			return "planning{id de planning: "+ scheduleId+", ID de prof: " + teacherId + ", id de matiere: "+ subjectID+ ", id de cours: " + courseId + ", time: jeudi matin" + " - " + startDate + "-" + endDate+"}";
    		}
    		else if (timeFrame==1) {
    			return "planning{id de planning: "+ scheduleId+", ID de prof: " + teacherId + ", id de matiere: "+ subjectID+ ", id de cours: " + courseId + ", time: jeudi apres midi" + " - " + startDate + "-" + endDate+"}";
    		}
    		else{
    			return "planning{id de planning: "+ scheduleId+", ID de prof: " + teacherId + ", id de matiere: "+ subjectID+ ", id de cours: " + courseId + ", time: jeudi soir" + " - " + startDate + "-" + endDate+"}";
    		}
    	}
    	else {
    		if (timeFrame==0) {
    			return "planning{id de planning: "+ scheduleId+", ID de prof: " + teacherId + ", id de matiere: "+ subjectID+ ", id de cours: " + courseId + ", time: vendredi matin" + " - " + startDate + "-" + endDate+"}";
    		}
    		else if (timeFrame==1) {
    			return "planning{id de planning: "+ scheduleId+", ID de prof: " + teacherId + ", id de matiere: "+ subjectID+ ", id de cours: " + courseId + ", time: vendredi apres midi" + " - " + startDate + "-" + endDate+"}";
    		}
    		else{
    			return "planning{id de planning: "+ scheduleId+", ID de prof: " + teacherId + ", id de matiere: "+ subjectID+ ", id de cours: " + courseId + ", time: vendredi soir" + " - " + startDate + "-" + endDate+"}";
    		}
    	}
    }
    
    public void output() {
        System.out.println(toString());
    }   
    
}