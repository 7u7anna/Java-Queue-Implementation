public class Queue {

    int front;
    int last;
    int counter=0;
    int size=5;
    int queue[]=new int[size];
    public void enqueue(int data)
    {
        if(counter==0)
        {
            front=data;
        }
        while(counter==size)
        {
            expandQ();
            front=queue[0];
            size*=2;
        }
        queue[counter]=data;
        counter++;
    }
    public void dequeue()
    {
        while(counter<=size/2)
        {
            shrinkQ();
            size/=2;
        }
        int newQueue[]=new int[size];
        for(int i=0;i<counter-1;i++)
        {
            newQueue[i]=queue[i+1];
        }
        counter--;
        queue=newQueue;
    }
    public void shrinkQ()
    {
        size/=2;
        int shrinkedQueue[]=new int[size];
        for(int i=0;i<counter;i++)
        {
            shrinkedQueue[i]=queue[i];
        }
        queue=shrinkedQueue;
    }
    public void expandQ()
    {
        size*=2;
        int expandedQueue[]=new int[size];
        for(int i=0;i<counter;i++)
        {
            expandedQueue[i]=queue[i];
        }
        queue=expandedQueue;
    }
    public boolean isFull()
    {
        if(counter==size)
        {
            System.out.println("Queue is full, adding new element will cause it to expand size");
            return true;
        }
        else
        {
            System.out.println("Queue has some space, elements can be added without need to expand it");
            return false;
        }
    }
    public void show()
    {
        for(int i=0;i<counter;i++)
        {
            System.out.print(queue[i] + " ");
        }
        int remaining=queue.length-counter;
        for(int i=0;i<remaining;i++)
        {
            System.out.print(0 + " ");
        }
    }
}
