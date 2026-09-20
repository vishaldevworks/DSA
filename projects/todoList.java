package projects;

import java.util.*;

public class todoList {
    public static void main(String[] args) {

        // To-Do List

        ArrayList<String> tasks = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        boolean istrue = true;

        while (istrue) {
            System.out.println("---Main Menu---");
            System.out.println("1: ---Add Task---");
            System.out.println("2: ---View Tasks---");
            System.out.println("3: ---Remove task---");
            System.out.println("4: ---Exit---");
            System.out.print("Which operation do you want to perform : ");

            int choise = sc.nextInt();
            sc.nextLine();

            switch (choise) {
                case 1:
                    System.out.print("Enter your task : ");
                    String task = sc.nextLine();
                    tasks.add(task);
                    System.out.println("task added");
                    break;
                case 2:

                    if (tasks.size() == 0) {
                        System.out.println("List is empty :)----");
                    } else {
                        System.out.println("---Your Tasks---");
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println(tasks.get(i));
                        }
                    }
                    break;
                case 3:
                    System.out.print("Enter the number of task which you want to delete : ");
                    int index = sc.nextInt();
                    index -= 1;
                    if (index > 0 && index < tasks.size()) {
                        tasks.remove(index);
                        System.out.println("task removed");
                    } else {
                        System.out.println("invalid input ");
                    }
                    break;
                case 4:
                    istrue = false;
                    System.out.println("---Good Bye :)---");
                    break;
                default:
                    System.out.println("invalid input ");

            }

        }

    }

}
