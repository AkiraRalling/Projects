package JavaHard.Collections.StackQueue;

import java.util.Stack;

public class Runner {
    public static void main(String[] args) {
        passengerProcessing();
    }

    public static void passengerProcessing() {
        Stack<Passenger> stack = new Stack<>();
        Passenger passenger = new Passenger("Katrin","Whore");
        stack.add(new Passenger("Alex","Killer"));
        stack.add(new Passenger("Sam","Master Kung-fu"));
        stack.add(new Passenger("Paul","Butcher"));
        stack.add(passenger);
        stack.add(new Passenger("Shaun","Programmer"));
        stack.add(new Passenger("Leo","Thief"));

        System.out.println("SEARCHING: " + stack.search(passenger) + "\n");
        System.out.println(stack.peek() + "\n");

        while (!stack.isEmpty()) {
            System.out.println("POP: \n" +stack.pop());
        }
    }
}
