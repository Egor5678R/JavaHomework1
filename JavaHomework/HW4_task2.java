import java.util.LinkedList;

public class HW4_task2 {

    public static void main(String[] args) {

        int[] list = {4,23, 21, 43, 1, 45,3, 22, 11, 566, 34, 64, 0};

        LinkedList<Integer> linkedList = new LinkedList<>();
        for (Integer temp : list) {
            linkedList.add(temp);
        }

        System.out.println(linkedList);
        enqueue(linkedList, 100);
        System.out.println(linkedList);
        System.out.println(dequeue(linkedList));
        System.out.println(linkedList);
        System.out.println(first(linkedList));
    }

    static void enqueue(LinkedList<Integer> list, int number) {
        list.addLast(number);
    }

    static int dequeue(LinkedList<Integer> list) {
        int number = 0;
        number = list.get(0);
        list.remove(0);
        return number;
    }

    static int first(LinkedList<Integer> list) {
        int number = 0;
        number = list.get(0);
        return number;
    }
}