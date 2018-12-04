import java.util.Scanner;

public class SuperClassAndSubClass {
    public static void main(String[] args) {

        APerson p1 = new APerson();
        APerson p2 = new APerson("Robert", "Resendez", "888-111-3333", 21, "email@email.com" );

        System.out.println("p1 age: " + p1.getAge());
        System.out.println(p2);

    }
}

class APerson implements Driver {

    private String fName;
    private String lName;
    private String eMail;
    private String socialSecurity;
    private int age;

    // basic constructor empty
    public APerson() {

    }

    public String howToDrive() {

        return "Drives Carefully";

    }

    // designated constructor
    public APerson(String fN, String lName, String ss, int age, String e) {

        fName = fN;
        this.lName = lName;
        socialSecurity = ss;
        this.age = age;
        eMail = e;
    }

    public void  setfName(String fName) {
        fName = fName;
    }

    public void setLname(String lname) {
        lname = lname;
    }

    public void seteMail(String email) {
        eMail = email;
    }

    public void setSSN(String ssn) {
        socialSecurity = ssn;
    }

    public void setAge (int a) {
        if (a >= 0)
            age = a;
        else
            System.out.println("age can't be negitive");
    }


    public String getfirstName() {
        return fName;
    }

    public String getLastName(){
        return lName;
    }

    public String getEMail(){
        return eMail;
    }

    public String getSSN(){
        return socialSecurity;
    }

    public int getAge(){
        return age;
    }


    public String toString(){
        return "First Name: " + fName + " Last Name: " + lName + " Email Address: " + eMail + " Social Security # " + socialSecurity + " Age: " + age + " Driving Status: " + howToDrive();
    }

}

interface Driver {

    public String howToDrive();



}
