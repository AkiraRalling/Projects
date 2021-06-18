package JavaHard.Collections.ComparableInterface;

import java.util.Comparator;

public class SortByYear implements Comparator<Player> {

    @Override
    public int compare(Player player1, Player player2) {
        if(player1.getLevel() < player2.getLevel()) {
            return -1;
        } else if ((player1.getLevel() > player2.getLevel())) {
            return +1;
        } else {
            return 0;
        }
    }
}
