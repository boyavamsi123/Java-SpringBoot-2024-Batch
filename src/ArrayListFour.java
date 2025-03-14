import java.util.ArrayList;

public class ArrayListFour {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        ArrayList<Integer> eids = new ArrayList<Integer>();
        ArrayList<String> enames = new ArrayList<String>();
        enames.add("Rahul");
        enames.add("sonia");
        enames.add("priyanka");
        enames.add("modi");
        enames.add("vijay");
        enames.add("kamal");
        for (String ename : enames) {
            System.out.println(ename);
        }
        System.out.println(enames.isEmpty());
        System.out.println(enames.contains("kamal"));
    }
}
