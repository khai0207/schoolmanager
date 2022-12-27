package schoolmanager;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author npk
 */
public class Attendance {
    static List<Student> lstStudents;
    String rollNo;
    int schedule_id;
    STATUS status;
    static enum STATUS {
        PRESENT,
        ABSENT,
        PA
    }
    String Date;

    public Attendance() {
    }

    public Attendance(String rollNo, int schedule_id, STATUS status, String Date) {
        this.rollNo = rollNo;
        this.schedule_id = schedule_id;
        this.status = status;
        this.Date = Date;
    }

    public STATUS getStatus() {
        return status;
    }

    public void setStatus(STATUS status) {
        this.status = status;
    }

    public String getRollNo() {
        return rollNo;
    }

    public int getSchedule_id() {
        return schedule_id;
    }

    public String getDate() {
        return Date;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public void setSchedule_id(int schedule_id) {
        this.schedule_id = schedule_id;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }
    
    static void setDependency(List<Student> _lstStudents) {
        lstStudents = _lstStudents;
    }
    
    public boolean input() {
        if (lstStudents == null) {
            System.out.println("il faut ajouter info de student");
            return false;
        }
        Scanner inp = new Scanner(System.in);
        System.out.println("Input numero etudiant");
        String input = inp.nextLine();
        if (validateStudent(input)) rollNo = input;
        else {
            System.out.println("numero etudiant n'existe pas");
            return false;
        }
        System.out.println("Input date (dd/mm/yyyy)");
        Date = inp.nextLine();
        
        System.out.println("Input schedule_id");
        schedule_id=inp.nextInt();
        
        System.out.println("Input status");
        System.out.println("1. present");
        System.out.println("2. absent");
        System.out.println("3. pa");
        System.out.println("choix: ");
        int choose = inp.nextInt();
        
        switch(choose) {
            case 1:
                status = STATUS.PRESENT;
                break;
            case 2:
                status = STATUS.ABSENT;
                break;
            default:
                status = STATUS.PA;
                break;
        }
        return true;
    }
    
    private boolean validateStudent(String _rollNo) {
        if (lstStudents == null) return false;
        return lstStudents.stream().anyMatch((student) -> (student.getRollNo().equals(_rollNo)));
    }

    @Override
    public String toString() {
        return "l'appel{" + "numero etudiant: " + rollNo + ", id de planning: " + schedule_id + ", statut: " + status + ", date: " + Date + '}';
    }
    
    public void output() {
        System.out.println(toString());
    }
}
