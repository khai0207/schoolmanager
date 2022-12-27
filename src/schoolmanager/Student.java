package schoolmanager;

import java.util.Scanner;

/**
 *
 * @author npks
 */
public class Student {
    String rollNo,fullName,Address;
    int gender;

    public Student() {
    }

    public Student(String rollNo, String fullName, String Address, int gender) {
        this.rollNo = rollNo;
        this.fullName = fullName;
        this.Address = Address;
        this.gender = gender;
    }

    public String getRollNo() {
        return rollNo;
    }

    public String getFullName() {
        return fullName;
    }

    public String getAddress() {
        return Address;
    }

    public int getGender() {
        return gender;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }
    
    public void input() {
        Scanner inp = new Scanner(System.in);
        System.out.println("Input etudiant");
        System.out.println("Input numero etudiant");
        rollNo = inp.nextLine();
        System.out.println("Input nom et prenom de etudiant");
        fullName = inp.nextLine();
        System.out.println("Input l'address");
        Address = inp.nextLine();
        System.out.println("Input sexe (0=homme,1=femme)");
        gender = Integer.parseInt(inp.nextLine());
    }
    @Override
    public String toString() {
    	if (gender==0){
    		return "etudiant{" + "id de etudiant: " + rollNo + ", nom et prenom de etudiant: " + fullName + ", l'address: " + Address + ", sexe: homme" + '}';
    	}
    	else {
    		return "etudiant{" + "id de etudiant: " + rollNo + ", nom et prenom de etudiant: " + fullName + ", l'address: " + Address + ", sexe: femme" + '}';
    	}
    }
    
    public void output() {
        System.out.println(toString());
    
    }
}
