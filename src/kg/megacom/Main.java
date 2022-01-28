package kg.megacom;

import kg.megacom.models.Group;
import kg.megacom.models.Student;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){


        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите имя студента ");
            String name = scanner.next();

            System.out.println("Возраст ");
            int age = scanner.nextInt();

            Student student = new Student(name, age);
            Group group = new Group("Java");
            int result = group.registrationStudent(student);

            System.out.println(result);

            if (result == 1){
                break;
            } else if (result == 2){
                break;
            }

        }
    }
}
