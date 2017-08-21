package Queues;

import Queues.IntQueue;

/**
 * Created by mathenge on 21/08/2017.
 */
public class MainQ {
    public static void main(String[] args){
//        IntQueue q = new IntQueue();
//        q.enqueue(3);
//        q.enqueue(7);
//        q.enqueue(8);
//        q.enqueue(9);
//
//        System.out.println(q.dequeue());
//        System.out.println(q.dequeue());
//        System.out.println(q.dequeue());


        PersonQueue personqueue = new PersonQueue();
        personqueue.enqueue(new Person("Jordan", "23"));
        personqueue.enqueue(new Person("Jamar", "56"));
        personqueue.showAll();
    }
}
