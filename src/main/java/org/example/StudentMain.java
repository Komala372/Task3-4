package org.example;

public class StudentMain {

    public static void main(String[] args) {

        StudentService studentService = new StudentService();
         studentService.addStudent(new Student(1,"Alisha",12));
         studentService.addStudent(new Student(2,"Ram",14));
         studentService.addStudent(new Student(3,"Rahul",13));
         studentService.addStudent(new Student(4,"Somya",15));

         Student student = studentService.findStudentById(1);
         System.out.println("After finding student by id..Student is::"+student.getName());

    }



}
