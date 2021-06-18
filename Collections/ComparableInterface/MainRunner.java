package JavaHard.Collections.ComparableInterface;

import java.util.*;

public class MainRunner {
    public static void main(String[] args) {

        Player player1 = new Player(30, "Alex", "Mage");
        Player player2 = new Player(10, "Leo", "Warrior");
        Player player3 = new Player(21, "John", "Healthier");
        Player player4 = new Player(30, "Sam", "Paladin");
        Player player5 = new Player(30, "Paul", "Tank");


        List<Player> players = new ArrayList<>();
        players.add(player1);
        players.add(player2);
        players.add(player3);
        players.add(player4);
        players.add(player5);

        System.out.println("Before sorting");

        for (Player player : players) {
            System.out.println(player);
        }

        System.out.println("\nAfter sorting");

        Collections.sort(players,new SortByType());

        for (Player player : players) {
            System.out.println(player);
        }

        IteratorExamaple it = new IteratorExamaple();
        it.addList("Wext");
        it.addList("Shmex");
        it.addList("Autist");
        it.addList("Text");

        it.showList();

    }

    public static class IteratorExamaple {
        List<String> list = new ArrayList<>();

        public void addList(String text) {
            list.add(text);
            alphabeticalOrder(text);
        }

        public void showList() {
            Iterator<String> iterator = list.iterator();
            while (iterator.hasNext()) {
                System.out.println("Text: " + iterator.next());
            }
        }

        public boolean alphabeticalOrder(String text) {
            ListIterator<String> listIterator = list.listIterator();
            while (listIterator.hasNext()) {
                int i = listIterator.next().compareTo(text);
                if (i == 0) {
                    System.out.println("This text is already exists");
                    return true;
                } else if (i > 0) {
                    String previous = listIterator.previous();
                    listIterator.add(text);
                    return true;
                }
            }
            list.add(text);
            return true;
        }
    }
}
