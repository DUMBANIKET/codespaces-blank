import java.util.LinkedList;
import java.util.Scanner;

class Linkedlist{
public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    int val;
    int ch=input.nextInt();
    LinkedList<Integer> list=new LinkedList<Integer>();

    System.out.println("^^Press 1 to insert first \n ^^press 2 to insert last \n ^^press 3 to delete first \n ^^press 4 to delete last \n ^^press 5 to add \n ^^press 6 to delete \n ^^press 7 to view all in the linked list");
    switch (ch) {
        case 1:
        System.out.println("enter the value");
        val=input.nextInt();
        list.addFirst(val);
            
            break;
        case 2:
        System.out.println("enter the value");
        val=input.nextInt();
        list.addLast(val);
            
            break;
        
        case 3:
        System.out.println("removed the first element");
        list.removeFirst();
        break;

        case 4:
        System.out.println("removed the last element");
        list.removeLast();
        break;

        case 5:
        System.out.println("enter the value");
        val=input.nextInt();
        list.add(val);

        break;


        case 6:
        System.out.println("enter the value");
        val=input.nextInt();
        list.remove(val);
        break;
        
        case 7:
        System.out.println(list);
        break;
        default:
        System.out.println("you messed up on something");
            break;
    }    
}




}