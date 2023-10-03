package org.example;

public class StudentService {

    private Student[] studentArray=new Student[5];
    int index;

    public void addStudent(Student student){
        studentArray[index] = student;
        index++;
        System.out.println("Student added::"+student.getName());
    }

    public Student findStudentById(int id){
        System.out.println("Inside method findStudentById");
        for (Student stu:studentArray) {
            if(stu.getId() == id){
                return stu;
            }
        }
        return null;
    }


}
