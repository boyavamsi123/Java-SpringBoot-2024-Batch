import java.util.ArrayList;

public class ArrayListOne {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(101);
        al.add("Rahul");
        al.add(45000.45);
        al.add("wayanad");
        System.out.println(al);
        for (int i = 0; i < al.size()-1; i++) {
            System.out.println(al.get(i));
        }
    }
}
