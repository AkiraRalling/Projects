package JavaHard.WriteInFile2;

import JavaHard.WriteInFile.AvgGrades;

import java.util.HashSet;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapRunner {
    public static void main(String[] args) {
        NavigableMap<AvgGrades, Set<StudentGrade>> map = createMap();
        showMap(map,true);
    }

    public static void showMap(NavigableMap<AvgGrades, Set<StudentGrade>> map, boolean showDisc) {
        Set<AvgGrades> avg = map.keySet();
        for(AvgGrades value: avg) {
            System.out.println(value);
            if(showDisc) {
                System.out.println(map.get(value));
            }
        }
    }
    public static NavigableMap<AvgGrades, Set<StudentGrade>> createMap() {

        Set<StudentGrade> alexGrade = new HashSet<>();
        alexGrade.add(new StudentGrade(50,"Math"));
        alexGrade.add(new StudentGrade(70,"English"));
        alexGrade.add(new StudentGrade(55,"Physics"));

        Set<StudentGrade> leoGrade = new HashSet<>();
        leoGrade.add(new StudentGrade(20,"Math"));
        leoGrade.add(new StudentGrade(100,"English"));
        leoGrade.add(new StudentGrade(45,"Physics"));

        Set<StudentGrade> sashGrade = new HashSet<>();
        sashGrade.add(new StudentGrade(70,"Math"));
        sashGrade.add(new StudentGrade(20,"English"));
        sashGrade.add(new StudentGrade(35,"Physics"));

        NavigableMap<AvgGrades,Set<StudentGrade>> map = new TreeMap<>();
        map.put(new AvgGrades(calcAvg(alexGrade), "Alex"),alexGrade);
        map.put(new AvgGrades(calcAvg(leoGrade), "Leo"),leoGrade);
        map.put(new AvgGrades(calcAvg(sashGrade), "Sasha"),sashGrade);

        return map;
    }

    public static float calcAvg(Set <StudentGrade> avg) {
        float sum = 0f;
        for(StudentGrade grade: avg) {
            sum+= grade.getGrade();
        }
        return sum / avg.size();
    }
}
