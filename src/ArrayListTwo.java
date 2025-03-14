import java.util.ArrayList;

public class ArrayListTwo {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        ArrayList<Integer> eids = new ArrayList<Integer>();
        ArrayList<String> enames = new ArrayList<String>();

        System.out.println(al);
        al.add(101);
        al.add(102);
        al.add(103);
        al.add(104);
        System.out.println(eids);
        int i=0;
        while (i<=eids.size()-1){
            System.out.println(enames.get(i));
            i++;
        }

    }
}
