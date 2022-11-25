import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Handle {
    private ArrayList<Student> list;

    public Handle(){
        list = new ArrayList<Student>();
    }
    public void add(Student student){
        this.list.add(student);
    }

    public void addStudent(){
        Student student = new Student();
        student.addStudent();
        if((findStudent(student.getId()) != null)){
            System.out.println("Student id already exist! Try again");
            addStudent();
        }
        this.add(student);
    }

    public void updateStudent(){
        System.out.println("Your student ID for update?");
        int id = Integer.parseInt((new Scanner(System.in)).nextLine());
        for (Student student : list) {
            if (student.getId() == id) {
                student.updateStudent();
            }
        }
        System.out.println("Updated!");
    }

    public Student findStudent(int id){
        for (Student student : list) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }

    public void outStudent(){
        System.out.println("Print all student:");
        for(Student student: list){
            student.outStudent();
            System.out.println("____");
        }
    }

    //Delete student
    public void destroyById() {
        System.out.println("ID?");
        int id = Integer.parseInt((new Scanner(System.in)).nextLine());
        for (Student student : list) {
            if (student.getId() == id) {
                list.remove(student);
            }
        }
        System.out.println("Destroyed");
    }

    public void sortName() {
        Collections.sort(list, new sortName());
    }
}
