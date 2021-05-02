
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cont = 1;
        Test t = new Test();

        while (cont == 1) {
            System.out.println("Press 1 to add data: ");
            System.out.println("Press 2 to delete first data: ");
            System.out.println("Press 3 to delete last data: ");
            System.out.println("Press 4 to delete data by index: ");
            System.out.println("Press 5 to Clear database: ");
            System.out.println("Press 6 to display data: ");
            System.out.println("Press 0 to Exit: ");

            System.out.print("Enter your choice: ");

            int x = scan.nextInt();

            switch (x) {
                case 1:
                    System.out.println("Enter the total number of database: ");

                    int n = scan.nextInt();
                    int age;
                    String name,
                     id;

                    for (int i = 0; i < n; i++) {

                        System.out.print("Enter student name: ");
                        name = scan.next();

                        System.out.print("Enter student ID: ");
                        id = scan.next();

                        System.out.print("Enter student age: ");
                        age = scan.nextInt();

                        Info info = new Info(name, id, age);

                        t.insert(info);
                    }
                    break;

                case 2:
                    t.deletefirst();

                    break;
                case 3:
                    t.deleteLast();

                    break;
                case 4:
                    t.delete();

                    break;
                case 5:
                    t.clear();

                    break;

                case 6:
                    if (t.check()) {
                        System.err.println("Linked list is empty");
                    } else {
                        t.display();
                    }
                    break;

                case 0: {
                    System.out.println("The Programmers....");
                    System.out.println(" Md. Abdul Halim       (ID: 171-15-1408 )");
                    System.out.println(" Mobile:+8801786571095  E-mail:mdabdulhalim.cse@gmail.com");
                    System.out.println("With  the Unexplainable Help of Md. Abdul Halim");
                    System.out.println("Exiting in 3 second...........PESS->0");

                }

            }

            System.out.println("Enter 1 to continue or Enter 0 to exit: ");
            cont = scan.nextInt();
        }
    }
}
