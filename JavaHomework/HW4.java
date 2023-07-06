import java.util.LinkedList;

public class HW4 {
    public static void main(String[] args){
        LinkedList<String> list1 = new LinkedList<>();
        list1.add("a");
        list1.add("b");
        list1.add("c");
        list1.add("d");
        list1.add("e");
        list1.add("f");
        list1.add("123456");
        list1.add("Hello world");

        LinkedList<String> revers = task1(list1);
        System.out.println(revers);

    }
    static LinkedList<String> task1(LinkedList<String> list){
        LinkedList<String> revers = new LinkedList<>();
        for ( int i = list.size() - 1; i >= 0;i--) {
            revers.add(list.get(i));
        }
        return revers;
    }


}
