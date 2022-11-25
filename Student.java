import java.io.IOException;
import java.util.Scanner;

public class Student {
    private int id;
    private String name;
    private String address;
    private int age;
    private double GPA;
    public Student(){

    }

    public Student(int id, String name, String address, double GPA, int age) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.GPA = GPA;
        this.age = age;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public double getGPA() {
        return GPA;
    }
    public void setGPA(double GPA) {
        this.GPA = GPA;
    }
    public void addStudent(){
        System.out.println("------Enter student about information:\n------- ");
        setId(inputId());
        setName(inputName());
        setAge(inputAge());
        setAddress(inputAddress());
        setGPA(inputGPA());
    }
    public void updateStudent(){
        System.out.println("------Update student information:\n------- ");
        System.out.println("------Original student information:\n------- ");
        this.outStudent();
        System.out.println("------New student information (Keep id only):\n------- ");
        setName(inputName());
        setAge(inputAge());
        setAddress(inputAddress());
        setGPA(inputGPA());
    }
    public int inputId() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input student id: ");
        while (true) {
            try {
                int id = Integer.parseInt((sc.nextLine()));
                return id;
            } catch (NumberFormatException ex) {
                System.out.print("invalid! Input student id again: ");
            }
        }
    }
    // input name - return
    public String inputName() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input student name: ");
        while (true) {
            try {
                String name = sc.nextLine();
                if(name.equals("") || name == null || name.matches(".*\\d.*")){
                    throw new Throwable("Invalid name");
                }
                return name;
            } catch (Throwable e) {
                System.out.println("Invalid! Input student name again:");
            }
        }
    }
    // input age - return
    public int inputAge() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input student age: ");
        while (true) {
            try {
                byte age = Byte.parseByte((sc.nextLine()));
                if (age <0 && age > 100) {
                    throw new NumberFormatException();
                }
                return age;
            } catch (NumberFormatException ex) {
                System.out.print("invalid! Input student age again: ");
            }
        }
    }
    // input address - return
    public String inputAddress() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input student address: ");
        return sc.nextLine();
    }
    // input GPD - return
    private double inputGPA() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input student gpa: ");
        while (true) {
            try {
                float gpa = Float.parseFloat((sc.nextLine()));
                if (gpa < 0.0 || gpa > 10.0) {
                    throw new Throwable("Not in valid range");
                }
                return gpa;
            } catch (Throwable ex) {
                System.out.print("invalid! Input student age again: ");
            }
        }
    }
    public void outStudent(){
        System.out.println("Id: "+ getId());
        System.out.println("Name: "+ getName());
        System.out.println("Address: "+ getAddress());
        System.out.println("GPA: "+ getGPA());
        System.out.println("Age: "+ getAge());
    }

}
/*
* 2
* Nhap ma sinh vien can chinh sua
* (tim sinh vien)
* -> (obj) student
*   -> ten sinh vien:
*   -> ma sinh vien:
*
*
* */
