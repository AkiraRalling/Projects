package JavaHard.Collections.StackQueue;

import java.util.*;

public class QueueRunner {
    public static void main(String[] args) {
        musicalInstruments();
    }

    private static void musicalInstruments() {

        /*List<MusicalInstruments> list = new LinkedList<>();
        list.add(new MusicalInstruments(2000,"Piano","Yamaha"));
        list.add(new MusicalInstruments(1200,"Guitar","Fender"));
        list.add(new MusicalInstruments(4100,"Royal","Roland"));
        list.add(new MusicalInstruments(3500,"Drums","Tama"));*/

        Queue<MusicalInstruments>queue = new PriorityQueue<>();
        queue.offer(new MusicalInstruments(2000,"Piano","Yamaha"));
        queue.offer(new MusicalInstruments(1200,"Guitar","Fender"));
        queue.offer(new MusicalInstruments(4100,"Royal","Roland"));
        queue.offer(new MusicalInstruments(3500,"Drums","Tama"));
        queue.offer(new MusicalInstruments(3500,"Saxophone","Casio"));

        Iterator<MusicalInstruments> iterator = queue.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("\nOffer last");

        Deque<MusicalInstruments> deque = new ArrayDeque<>(queue);
        deque.offerFirst(new MusicalInstruments(7000,"Electric guitar","Gibson"));
        deque.offerLast(new MusicalInstruments(500,"flute","NULL"));

        for(MusicalInstruments mus : deque) {
            System.out.println(mus);
        }


    }
}
