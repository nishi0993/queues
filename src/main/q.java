package main;

import java.util.Arrays;

 class queue_ds {
    int[] q;
    int size,total,front,rear;
     queue_ds()
    {
        size=10;
        total=0;
        front=0;
        rear=0;
        q=new int[size];
    }
    boolean isFull()
    { boolean re=false;
        if(front==q.length-1 &&rear==q.length-1)
            re=true;
        return re;
    }
    void enqueue(int value)
    { if(!isFull())
        q[rear]=value;
        rear++;
    }
    boolean isEmpty()
    {
        boolean r=false;
        if(rear==0 && front==0)
            r=true;
        return r;
    }
    int dequeue()
    {int value=0;
        if(!isEmpty())

            q[front]=0;
            front++;

        return value;
    }

    public static void main(String[] args) {
        queue_ds q1=new queue_ds();
        for (int i = 0; i < 10; i++) {
            q1.enqueue(2+i);
        }
        for (int i = 0; i < q1.q.length; i++) {


            System.out.println(q1.q[i]);
        }
        System.out.println("**********");
     q1.dequeue();
        q1.dequeue();
        q1.dequeue();
        for (int i = 0; i < q1.q.length; i++) {


            System.out.println(q1.q[i]);
        }
        System.out.println("front is: "+q1.front+" and rear is : "+q1.rear);
     }
}
