import java.util.LinkedList;

public class LinkedLst2 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.addFirst("a");
        list.addFirst("is");
        list.addFirst("this");
        list.add("linkedList");
        list.addLast("list");
        list.addFirst("now");
        list.forEach(value->{
            System.out.print(value+" -> ");
        });
        System.out.println("null");
        System.out.println("List Size: "+list.size());
        list.removeFirst();
        list.removeLast();
        for(int i=0;i< list.size();i++){
            System.out.print(list.get(i)+" -> ");
        }
        System.out.println("null");
        System.out.println("List Size: "+list.size());

        list.remove(3);
        System.out.println(list);



    }
}
