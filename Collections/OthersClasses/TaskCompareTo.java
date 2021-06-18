package JavaHard.Collections.OthersClasses;

public class TaskCompareTo implements Comparable<TaskCompareTo> {

    private String name;
    private Integer age;

    public TaskCompareTo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(TaskCompareTo o) {

        int result = this.name.compareToIgnoreCase(o.name);
        
        if(result == 0) {
            result = this.age.compareTo(o.age);
        }
        return result;
    }

    @Override
    public String toString() {
        return "TaskCompareTo{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
