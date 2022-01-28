package kg.megacom.models;

import kg.megacom.service.RegistrationService;

import java.util.Arrays;

public class Group implements RegistrationService {
    private String groupName;
    private Student[] students;

    private int indexStudents = 0;

    public Group(String groupName){
        this.groupName = groupName;
        this.students = new Student[5];

    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }


    @Override
    public String toString() {
        return "Group{" +
                "groupName='" + groupName + '\'' +
                ", students=" + Arrays.toString(students) +
                '}';
    }


    @Override
    public int registrationStudent(Student student) {
        boolean  isPresent = checkPresentStudent(student);
        if (students.length<indexStudents){
            System.out.println("Мест нету ");
            return 2;
        }

     //  boolean  isPresent = checkPresentStudent(student);
        else if (isPresent==false){
            System.out.println("Вы уже есть в массиве!");
            return 1;
        } else {
            students[indexStudents] = student;
            System.out.println("Успех");
            indexStudents++;
            return 0;
        }
    }
    private boolean checkPresentStudent(Student student){
        for (Student s : students) {
            if (s != null){
                if (s.getName().equals(student.getName()) && s.getAge() == student.getAge()){
                    return false;
                }
            }
        }
        return true;
    }
}

/*

    Uson

* null
* null
* null
* */
