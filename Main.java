import java.util.LinkedList;

class Main {
    public static void main(String[] args){
        LinkedList<String> list=new LinkedList<String>();
        list.offer("a");
        list.offer("b");
        list.offer("c");
        list.offer("d");
        list.offer("f");
        System.out.println(list);
        list.add(4,"e");
        System.out.println(list);


    }
}