import java.util.ArrayList;

public class ArrayListThree {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        ArrayList<Integer> eids = new ArrayList<>();
        ArrayList<String> enames = new ArrayList<>();
        enames.add("Rahul");
        enames.add("sonia");
        enames.add("Priyanka");
        enames.add("Modi");
        enames.add("Vijay");
        enames.add("kamal");
        for (String ename : enames) {
            System.out.println(ename);
        }
    }
}
