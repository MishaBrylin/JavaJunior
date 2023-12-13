package HW03;

import java.util.ArrayList;
import java.util.List;

import static HW03.ToDoListApp.*;
import static HW03.ToDoListApp.FILE_XML;

public class Program {

    public static void main(String[] args) {

        Student student = new Student("Валера", 20, 4.5);
        Student student2 = new Student("Екатерина", 22, 4.2);
        Student student3 = new Student("Ксения", 21, 4.3);
        List<Student> students = new ArrayList<>();
        students.add(student);
        students.add(student2);
        students.add(student3);

        ToDoListApp.saveStudentsToFile(FILE_JSON, students);
        ToDoListApp.saveStudentsToFile(FILE_BIN, students);
        ToDoListApp.saveStudentsToFile(FILE_XML, students);




        System.out.println("JSON: " + ToDoListApp.loadStudentsFromFile(FILE_JSON));
        System.out.println("BIN: " + ToDoListApp.loadStudentsFromFile(FILE_BIN));
        System.out.println("XML: " + ToDoListApp.loadStudentsFromFile(FILE_XML));



    }

}
