package JavaHard.WriteInFile;

import java.util.*;

public class TreeMapRunner {
    public static void main(String[] args) {
        NavigableMap<AvgGrades, Set<PersonGrade>> avg = createAvg();
        showInfo(avg);
    }

    public static void showInfo(Map<AvgGrades, Set<PersonGrade>> grade) {
        Set<AvgGrades> avg = grade.keySet();
        for (AvgGrades a : avg) {
            System.out.println(a);
        }
    }

    public static NavigableMap<AvgGrades, Set<PersonGrade>> createAvg() {

        Set<PersonGrade> alexGrade = new HashSet<>();
        alexGrade.add(new PersonGrade(70, "Подтягивания"));
        alexGrade.add(new PersonGrade(50, "Бег с препятствиями"));
        alexGrade.add(new PersonGrade(63, "Отжимания"));

        Set<PersonGrade> leoGrade = new HashSet<>();
        leoGrade.add(new PersonGrade(30, "Подтягивания"));
        leoGrade.add(new PersonGrade(100, "Бег с препятствиями"));
        leoGrade.add(new PersonGrade(69, "Отжимания"));

        Set<PersonGrade> johnGrade = new HashSet<>();
        johnGrade.add(new PersonGrade(40, "Подтягивания"));
        johnGrade.add(new PersonGrade(80, "Бег с препятствиями"));
        johnGrade.add(new PersonGrade(73, "Отжимания"));

        NavigableMap<AvgGrades, Set<PersonGrade>> map = new TreeMap<>();
        map.put(new AvgGrades(avg(alexGrade), "Alex"), alexGrade);
        map.put(new AvgGrades(avg(leoGrade), "Leo"), leoGrade);
        map.put(new AvgGrades(avg(johnGrade), "John"), johnGrade);

        return map;
    }

    public static float avg(Set<PersonGrade> persGr) {
        float sum = 0f;
        for (PersonGrade pg : persGr) {
            sum += pg.getGrade();
        }
        return sum / persGr.size();
    }
}
