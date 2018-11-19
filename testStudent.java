import java.util.*;

public class testStudent {
    public static void main(String[]args){

         Student s1 = new Student();
         Student s2 = new Student("Robert Resendez", "007", 4.0);
         s2.setGpa(3.9);

         // prints 0 because it's nto definded yet
         System.out.println("gpa of s1: " + s1.getGpa());

         // quick way to do it with a function below
         System.out.println(s2.toString());

         // writing them out one by one
         System.out.println("gpa of s2: " + s2.getGpa());
         System.out.println("s2 name: " + s2.getName());
         System.out.println("s2 name: " + s2.getID());

        // create an array object of 10
        Circle[] arrayCircle = new Circle[10];

        // randomly print out the arrayCicle with different values
        for (int i = 0; i < arrayCircle.length; i++) {
            double r = (int)(Math.random() * ( 5 - 1 + 1 )) + 1;
            arrayCircle[i] = new Circle(r);
            System.out.println(arrayCircle[i].toString());
        }

        // Circle function calls
        Circle c1 = new Circle(1.0);
        Circle c2 = new Circle(2.0);
        System.out.println(c1);
        System.out.println(c2.toString());

    }

}

class Student {
    private String name;
    private String id;
    private double gpa;

    // empty constructor
    public Student(){}

    // overload constructor
    public Student(String name, String id, double gpa) {

        this.name = name;
        this.id = id;
        // this.gpa = gpa;
        setGpa(gpa);
    }

    public void setName(String n) {
        name = n;
    }

    public void setID(String id) {
        this.id = id;
    }

    public void setGpa(double gpa) {
        if( gpa >= 0 ) { this.gpa = gpa; }
        else{ System.out.println("GPA not negitive"); }
    }

    public String getName() {
        return name;
    }

    public String getID() {
        return id;
    }

    public double getGpa() {
        return gpa;
    }

    public String toString() {
        return "Name: " + name + "\n" + "ID: " + id + "\n" + "GPA: " + gpa + "\n";
    }

}


class Circle {

    // variable declaration double radius
    private  double radius;

    public Circle(double radius) {
        // return r;
        this.setRadius(radius);
    }

    public void setRadius(double radius) {

        if(radius >= 0) {
            this.radius = radius;
        }
        else{
            System.out.println("Can't be Negitive");
        }

    }

    // getter for Radius
    public double getRadius() {
        return radius;
    }

    // getter for Area
    public double getArea() {
        return radius * radius * Math.PI;
    }

    // getter for Perimeter
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    // to String function for getting all perameters values in one
    public String toString() {
        return "Radius: " + radius +  "\n" + "Area: " + getArea() + "\n" + "Perimeter: " +  getPerimeter() + "\n";
    }

}