package schoolmanager;

import java.util.Scanner;

/**
 *
 * @author npk
 */
public class Teacher {
    String name,birthday,address;
    int gender,id;

    public Teacher() {
    }

    public Teacher(int id, String name, String birthday, String address, int gender) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.address = address;
        this.gender = gender;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getAddress() {
        return address;
    }

    public int getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }
    
    public void input() {
        Scanner inp = new Scanner(System.in);
        System.out.println("Input prof");
        System.out.println("Input id de prof");
        id = Integer.parseInt(inp.nextLine());
        System.out.println("Input nom et prenom de prof");
        name = inp.nextLine();
        System.out.println("Input date d'anniversaire (dd/mm/yyy)");
        birthday = inp.nextLine();
        System.out.println("Input l'address");
        address = inp.nextLine();
        System.out.println("Input sexe (0=homme,1=femme) ");
        gender = Integer.parseInt(inp.nextLine());        
    }
    @Override
    public String toString() {
    	if (gender==0){
    		return "prof{" + "id de prof: " + id + ", nom et prenom de prof: " + name + ", date d'anniversaire: " + birthday + ", l'address: " + address + ", sexe: homme" + '}';
    	}
    	else {
    		return "prof{" + "id de prof: " + id + ", nom et prenom de prof: " + name + ", date d'anniversaire: " + birthday + ", l'address: " + address + ", sexe: femme" + '}';
    	}
    }
    
    public void output() {
        System.out.println(toString());
    }

}