package schoolmanager;

import java.util.Scanner;

/**
 *
 * @author npk
 */
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        DataMgr.getInstance().setDependency();
        int choice;
        do {
            showMenu();
            choice = Integer.parseInt(inp.nextLine());            
            switch(choice) {
                case 1:
                    addTeacher();
                    break;
                case 2:
                    addStudent();
                    break;
                case 3:
                    addSubject();
                    break;
                case 4:
                    addCourse();
                    break;
                case 5:
                    addSchedule();
                    break;
                case 6:
                    addAttendance();
                    break;  
                case 7:
                	showProf();
                	break;
                case 8:
                	showStudent();
                	break;
                case 9:
                	showSubject();
                	break;
                case 10:
                	showCourse();
                	break;
                case 11:
                	showSchedule();
                	break;
                case 12:
                    showAttending();
                    break;  
            }
        } while (choice != 13); 
    }
    
    static void showMenu() {
        System.out.println("1. ajouter un prof");
        System.out.println("2. ajouter un etudiant");
        System.out.println("3. ajouter une matiere");
        System.out.println("4. ajouter un cours");
        System.out.println("5. ajouter planning");
        System.out.println("6. faire l'appel");
        System.out.println("7. afficher liste prof");
        System.out.println("8. afficher liste etudiant");
        System.out.println("9. afficher liste matiere");
        System.out.println("10. afficher liste cours");
        System.out.println("11. afficher planning");
        System.out.println("12. afficher l'information de l'appel de l'etudiant");
        System.out.println("13. arret programme");
        System.out.println("Choix:");
    }
    
    static void addTeacher() {
        Teacher newTeacher = new Teacher();
        newTeacher.input();
        DataMgr.getInstance().getLstTeachers().add(newTeacher);
    }
    
    static void addStudent() {
        Student newStudent = new Student();
        newStudent.input();
        DataMgr.getInstance().getLstStudents().add(newStudent);
    }
    
    static void addSubject() {
        Subject newSubject = new Subject();
        newSubject.input();
        DataMgr.getInstance().getLstSubjects().add(newSubject);
    }
    
    static void addCourse() {
        Course newCourse = new Course();
        newCourse.input();
        DataMgr.getInstance().getLstCourses().add(newCourse);
    }
    
    static void addSchedule() {
        Schedule newSchedule = new Schedule();
        if (newSchedule.input()) DataMgr.getInstance().getLstSchedules().add(newSchedule);
    }
    
    static void addAttendance() {
        Attendance newAttendance = new Attendance();
        if (newAttendance.input()) DataMgr.getInstance().getLstAttendances().add(newAttendance);
    }
    
    static void showAttending() {
        Scanner inp = new Scanner(System.in);
        System.out.println("Input date (jj/mm/yyyy)");
        String date = inp.nextLine();
        boolean found = false;
        for (Attendance item : DataMgr.getInstance().getLstAttendances()) {
            if (item.getDate().equalsIgnoreCase(date)){
                item.output();
                found = true;
            }
        }
        if (! found) System.out.println("liste l'appel est vide");
    }
    static void showProf() {
    	Scanner inp = new Scanner(System.in);
    	boolean found= false;
    	for (Teacher item : DataMgr.getInstance().getLstTeachers()) {
    		item.output();
    		found = true;
    	}
    	if (! found) System.out.println("liste prof est vide");
    }
    static void showStudent() {
    	Scanner inp = new Scanner(System.in);
    	boolean found= false;
    	for (Student item : DataMgr.getInstance().getLstStudents()) {
    		item.output();
    		found = true;
    	}
    	if (! found) System.out.println("liste etudiant est vide");	
    }
    static void showCourse() {
    	Scanner inp = new Scanner(System.in);
    	boolean found= false;
    	for (Course item : DataMgr.getInstance().getLstCourses()) {
    		item.output();
    		found = true;
    	}
    	if (! found) System.out.println("liste cours est vide");
    }
    static void showSchedule() {
    	Scanner inp = new Scanner(System.in);
    	boolean found= false;
    	for (Schedule item : DataMgr.getInstance().getLstSchedules()) {
    		item.output();
    		found = true;
    	}
    	if (! found) System.out.println("liste planning est vide");
    }
    static void showSubject() {
    	Scanner inp = new Scanner(System.in);
    	boolean found= false;
    	for (Subject item : DataMgr.getInstance().getLstSubjects()) {
    		item.output();
    		found = true;
    	}
    	if (! found) System.out.println("liste matiere est vide");
    }
}
