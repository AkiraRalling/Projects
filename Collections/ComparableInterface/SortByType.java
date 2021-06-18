package JavaHard.Collections.ComparableInterface;

import java.util.Comparator;

public class SortByType implements Comparator<Player> {


    @Override
    public int compare(Player player1, Player player2) {

        return player1.getType().compareTo(player2.getType());

        }
    }
