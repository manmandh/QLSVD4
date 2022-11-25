import java.util.Scanner;

public class Main {
    public static void displayMenu() {
        System.out.println("1. Add student");
        System.out.println("2. Update information about student");
        System.out.println("3. Delete student from ID");
        System.out.println("4. Arrange student from name");
        System.out.println("5. Display list of student");
        System.out.println("6. Quit");

    }

    public static void main(String[] args) {
        Handle handle = new Handle();
        boolean programme = true;
        Scanner sc = new Scanner(System.in);
        while (programme) {
            try {
                Main.displayMenu();
                int choice = Integer.parseInt(sc.nextLine());
                switch (choice) {
                    case 1:
                        handle.addStudent();
                        break;
                    case 2:
                        handle.updateStudent();
                        break;
                    case 3:
                        handle.destroyById();
                        break;
                    case 4:
                        handle.sortName();
                        break;
                    case 5:
                        handle.outStudent();
                        break;
                }
            } catch (Exception e) {
                System.out.println("Error, restart menu");
            }
        }
    }
}