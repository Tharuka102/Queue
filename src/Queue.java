public class Queue {
    int size = 5;
    int items[] = new int[size];
    int front;
    int rear;

    Queue() {
        front = -1;
        rear = -1;

    }

    boolean isFull() {
        if (front == 0 && rear ==size -1) {
            return true;
        }
        return false;
    }


    boolean isEmpty() {
        if (front == -1)
            return true;
        else
            return false;
    }

    void enqueue(int element) {
        if (isFull()) {
            System.out.println("Queue id Full");
        } else {
            if (front == -1) {
                front = 0;
            }
            rear++;
            items[rear] = element;
            System.out.println("Inserd Elements :- " + element);

        }
    }

    int dequeue() {
        int element;
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return (-1);
        } else
         {
            element = items[front];
            if (front >= rear) {
                front = -1;
                rear = -1;
            } else {
                front++;
            }
            System.out.println("Deleted :-" + element);
            return (element);

         }

    }

    void process() {
        if (isEmpty()) {
            System.out.println("Empty Queue!");
        } else {
            System.out.println("Front index :-" + front);
            System.out.println("items :-");
            for (int i = front; i <= rear; i++)
                System.out.println(items[i] + " ");
            System.out.println("Rear index " + rear);
        }
    }



    public static void main(String[] args) {
     Queue q = new Queue();
      q.dequeue();
     for (int i = 1; i < 6; i++){
       q.enqueue(i);
     }
      q.enqueue(6 );
      q.process();
      q.dequeue();
      q.process();

    }
}
