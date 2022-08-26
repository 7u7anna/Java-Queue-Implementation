public class QueueRunner {

    public static void main(String[] args)
    {
        Queue q=new Queue();
        q.enqueue(7);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(4);
        q.enqueue(3);
        q.enqueue(3);

        q.show();
        q.isFull();
    }
}
