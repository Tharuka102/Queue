import java.util.LinkedList;
import java.util.Queue;

public class LinkedQueue {
    public static void main(String[] args) {
        Queue<Integer> number = new LinkedList<>();
        //offer - data insert , enqueue(concept)
        number.offer(234);
        number.offer(345);
        number.offer(213);
        System.out.println("Enqueue :-  "+ number);
        // poll - data remove dequeue(concept)
        System.out.println("Dequeue :-  "+ number.poll() );
        System.out.println("Update Queue :- "+ number);
    }



}
