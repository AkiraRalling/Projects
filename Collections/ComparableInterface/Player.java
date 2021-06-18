package JavaHard.Collections.ComparableInterface;

public class Player  {

    private int level;
    private String name;
    private String type;

    public Player(int level, String name, String type) {
        this.level = level;
        this.name = name;
        this.type = type;
    }

    public int getLevel() {
        return level;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Player{" +
                "level=" + level +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    /*@Override*/
   /* public int compareTo(Player player) {

        if (this.level < player.getLevel()) {
            return -1;
        } else if (this.level > player.getLevel()) {
            return +1;
        } else if (this.level == player.getLevel()) {
            return this.name.compareTo(player.getName());
        } else {
            return 0;
        }
    }*/
}
