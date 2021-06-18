package JavaHard.Collections.OthersClasses;

import java.util.*;

public class ToList {
    LinkedList<String> list = new LinkedList<>();



    public void addList(String text) {
        list.add(text);
        System.out.println("You add text '"+text+"' with index #" + list.indexOf(text));
    }

    public void removeList(String remove) {
        list.remove(remove);
        System.out.println("Remove text is " + remove);
    }

    public void setList(int num, String text) {
        list.set(num,text);
        System.out.println("You are set element with index #" + num + " and text with - " + text);
    }

    public void getList(int num) {
        System.out.println("Your element is " + list.get(num));
    }

    public void printList() {
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()) {
            System.out.println("Elements: " + iterator.next());
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
