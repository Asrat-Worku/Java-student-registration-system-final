import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StudentRegistrationSystem[] students = new StudentRegistrationSystem[100]; // initialize with a capacity of 100
        int count = 0; // variable to count the number of students
        int choice;

        do {
            System.out.println("Welcome");
            System.out.println("\n1. Register Student");
            System.out.println("2. Show Registered Students");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            input.nextLine(); // consume newline not consumed by nextInt()



            switch (choice) {
                case 1:

                    System.out.print("Enter The Name: ");

                    String name = input.nextLine();
                    System.out.print("Enter Age In Number: ");
                    int age = input.nextInt();

                    input.nextLine(); // consume newline not consumed by nextInt()

                    System.out.print("Enter ID In Number Form: ");
                    int studentId = input.nextInt();

                    System.out.print("Enter Address: ");
                    String address = input.nextLine();
                    input.nextLine();

                    System.out.print("Enter Phone Number In Number: ");
                    int phoneNumber = input.nextInt();
                    input.nextLine();

                    System.out.print("Enter Email: ");
                    String email = input.nextLine();


                    StudentRegistrationSystem student;
                    student = new StudentRegistrationSystem(name, age , studentId, address, phoneNumber , email);
                    students[count++] = student; // increment the count after adding a student

                    System.out.println("\n Student registered successfully.");
                    break;


                case 2:
                    if (count == 0) {
                        System.out.println("No students registered yet.");
                    } else {
                        System.out.println("\nList of Registered Students:");

                        for (int i = 0; i < count; i++) {
                            System.out.println(students[i]);
                        }
                    }
                    break;

                case 3:
                    System.out.println("Exiting the system...");
                    break;

                default:

                    System.out.println("Invalid choice. Please enter a valid choice.");
            }



        } while (choice != 3);
    }
}


