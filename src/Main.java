import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList activities = new ArrayList();
        activities.add("Basketball");
        activities.add("Driving");
        activities.add("Soccer");
        activities.add("Bowling");
        student student = new student("Shoaib", "imran",200528971,activities);
        System.out.println(student.getName());
        System.out.println(student.getlastName());
        System.out.println(student.getActivity());
        System.out.println(student.getID());

    }
}