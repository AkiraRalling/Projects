package JavaHard.Collections.OthersClasses;

import java.util.*;

public class RunClass {
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        taskMethod();
        /*TaskCompareTo task1 = new TaskCompareTo("Leo",23);
        TaskCompareTo task2 = new TaskCompareTo("leo",11);
        TaskCompareTo task3 = new TaskCompareTo("John", 33);
        TaskCompareTo task4 = new TaskCompareTo("Leo",10);

        List<TaskCompareTo> list = new ArrayList<>();
        list.add(task1);
        list.add(task2);
        list.add(task3);
        list.add(task4);

        System.out.println("\t==Before sort==");
        for(TaskCompareTo task : list) {
            System.out.println(task);
        }

        System.out.println("\n\t==After sort==");
        Collections.sort(list);
        for(TaskCompareTo t: list) {
            System.out.println(t);
        }*/

    }

    private static void taskMethod() {
        ToList list = new ToList();
        boolean continueLoop = true;
        System.out.println("\tInput what do you want");
        System.out.println("1 - Add text\n" +
                "2 - Remove text\n" +
                "3 - Set (replace) elements\n" +
                "4 - Show am element with index\n" +
                "5 - Print all values\n" +
                "0 - Exit the program");
        try {
            int firstNum = scan.nextInt();
            while (continueLoop) {
                switch (firstNum) {
                    case 1:
                        System.out.println("Please enter the task to add");
                        scan.nextLine();
                        String task1 = scan.nextLine();
                        list.alphabeticalOrder(task1);
                        System.out.println("Please choose an action by typing [0-5]");
                        firstNum = scan.nextInt();
                        break;
                    case 2:
                        System.out.println("Please enter the task to remove");
                        scan.nextLine();
                        String task2 = scan.nextLine();
                        list.removeList(task2);
                        System.out.println("Please choose an action by typing [0-5]");
                        firstNum = scan.nextInt();
                        break;
                    case 3:
                        System.out.println("Please enter the index for replace");
                        scan.nextLine();
                        int indexDel = scan.nextInt();
                        scan.nextLine();
                        System.out.println("Please enter the value which you want ot set");
                        scan.nextLine();
                        String task3 = scan.nextLine();
                        list.setList(indexDel, task3);
                        System.out.println("Please choose an action by typing [0-5]");
                        firstNum = scan.nextInt();
                        break;
                    case 4:
                        System.out.println("Please input index which you want");
                        scan.nextLine();
                        int indexGet = scan.nextInt();
                        list.getList(indexGet);
                        System.out.println("Please choose an action by typing [0-5]");
                        firstNum = scan.nextInt();
                        break;
                    case 5:
                        System.out.println("Printing out ToList elements");
                        list.printList();
                        System.out.println("Please choose an action by typing [0-5]");
                        firstNum = scan.nextInt();
                        break;
                    case 0:
                        System.out.println("Close app...");
                        scan.nextLine();
                        System.out.println("Goodbye!");
                        continueLoop = false;
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("ERROR");
        }
    }
}
