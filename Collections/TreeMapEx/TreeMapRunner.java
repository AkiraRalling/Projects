package JavaHard.Collections.TreeMapEx;

import java.util.*;

public class TreeMapRunner {
    public static void main(String[] args) {
        NavigableMap<AvgStudentGrade, Set<SubjectGrade>> grades = createGrades();
        showInfo(grades, false);
        AvgStudentGrade avgStudentGrade = grades.ceilingKey(new AvgStudentGrade("", 68));
        SortedMap<AvgStudentGrade, Set<SubjectGrade>> scoreStudents = grades.tailMap(avgStudentGrade);
        System.out.println("---------------------------------------------\n");
        showInfo(scoreStudents,true);
        AvgStudentGrade lowerContender = grades.lowerKey(avgStudentGrade);
        System.out.println("---------------------------------------------\n");
        System.out.println(lowerContender);
        System.out.println("---------------------------------------------");
        System.out.println("Higher grades student");
        AvgStudentGrade higher = grades.higherKey(avgStudentGrade);
        System.out.println(higher);

    }

    public static NavigableMap<AvgStudentGrade, Set<SubjectGrade>> createGrades() {
        Set<SubjectGrade> alexGrades = new HashSet<>();
        alexGrades.add(new SubjectGrade(72, "Math"));
        alexGrades.add(new SubjectGrade(93, "Gymnastics"));
        alexGrades.add(new SubjectGrade(37, "Russian"));

        Set<SubjectGrade> leoGrades = new HashSet<>();
        leoGrades.add(new SubjectGrade(95, "Math"));
        leoGrades.add(new SubjectGrade(30, "Gymnastics"));
        leoGrades.add(new SubjectGrade(55, "Russian"));

        Set<SubjectGrade> marianaGrades = new HashSet<>();
        marianaGrades.add(new SubjectGrade(22, "Math"));
        marianaGrades.add(new SubjectGrade(100, "Gymnastics"));
        marianaGrades.add(new SubjectGrade(87, "Russian"));

        Set<SubjectGrade> artemGrades = new HashSet<>();
        artemGrades.add(new SubjectGrade(100, "Math"));
        artemGrades.add(new SubjectGrade(90, "Gymnastics"));
        artemGrades.add(new SubjectGrade(89, "Russian"));

        NavigableMap<AvgStudentGrade, Set<SubjectGrade>> navigableMap = new TreeMap<>();
        navigableMap.put(new AvgStudentGrade("Alex", calcAvg(alexGrades)), alexGrades);
        navigableMap.put(new AvgStudentGrade("Leo", calcAvg(leoGrades)), leoGrades);
        navigableMap.put(new AvgStudentGrade("Mariana", calcAvg(marianaGrades)), marianaGrades);
        navigableMap.put(new AvgStudentGrade("Artem", calcAvg(artemGrades)), artemGrades);



        return navigableMap;
    }

    public static float calcAvg(Set<SubjectGrade> sbjgrd) {
        float sum = 0f;
        for (SubjectGrade sb : sbjgrd) {
            sum += sb.getGrades();
        }
        return sum / sbjgrd.size();
    }

    public static void showInfo(Map<AvgStudentGrade, Set<SubjectGrade>> grades, boolean printValue) {
        Set<AvgStudentGrade> set = grades.keySet();
        for (AvgStudentGrade st : set) {
            System.out.println(st);
            if (printValue) {
                System.out.println(grades.get(st));
            }
        }
    }
}
