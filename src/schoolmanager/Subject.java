package schoolmanager;

import java.util.Scanner;

/**
 *
 * @author npks
 */
public class Subject {
    String subjectName;
    int subjectId;

    public Subject() {
    }
    
    public Subject(int subjectId, String subjectName) {
        this.subjectId = subjectId;
        this.subjectName = subjectName;
    }

    public int getSubjectId() {
        return subjectId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }
    
    public void input() {
        Scanner inp = new Scanner(System.in);
        System.out.println("Input matiere");
        System.out.println("Input nom de matiere");
        subjectName = inp.nextLine();
        System.out.println("Input matiere id");
        subjectId = Integer.parseInt(inp.nextLine());
    }
    @Override
    public String toString() {
        return "cours{"+"ID matiere "+subjectId+", nom de matiere: "+ subjectName+" } ";
    }
    
    public void output() {
        System.out.println(toString());
    }
    
}
