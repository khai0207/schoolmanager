package schoolmanager;

import java.util.Scanner;

/**
 *
 * @author npk
 */
public class Course {
    int id;
    String name;

    public Course() {
    }

    public Course(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void input() {
        Scanner inp = new Scanner(System.in);
        System.out.println("Input course");
        System.out.println("Input nom de cours");
        name = inp.nextLine();
        System.out.println("Input cours id");
        id = Integer.parseInt(inp.nextLine());

    }
    @Override
    public String toString() {
        return "cours{"+"ID cours: "+id+", nom de cours: "+ name+" } ";
    }
    
    public void output() {
        System.out.println(toString());
    }
    
}