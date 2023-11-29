// This is done by Asrat worku tegegne
import java.util.Scanner;


class StudentRegistrationSystem {
    final private String name;
  final  private int age;
   final private int studentId;
   final private String address;
   final private int phoneNumber;
   final  private String email;

// creating a constructor
    public StudentRegistrationSystem(String name, int age, int studentId, String address, int phoneNumber, String email) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;

        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }


    // getters and setters

    @Override
    public String toString() {
        return "Student Name: " + name + ", Age: " + age  + ", Student ID: " + studentId +
                ", Address: " + address + ", Phone Number: " + phoneNumber + ", Email: " + email;
    }
}

