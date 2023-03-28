import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        student s1 = new student("mark", "012524525", 3.1);
        student s2 = new student("kareem", "01259565", 2.0);
        professor p1 = new professor("ahmed", "56262556", 8);
        professor p2 = new professor("mohamed", "566220", 16);
        ArrayList<person> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(p1);
        list.add(p2);
        int i;
        for (i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getvactiondays());
            if (list.get(i) instanceof student) {
                ((student) list.get(i)).showgeneralgrade();
            }
            if (list.get(i) instanceof professor) {
                ((professor) list.get(i)).showacademicposition();
            }
        }
    }
}