import Queues.IntQueue;
import Queues.PersonQueue;
import Stacks.Person;
import Stacks.PersonStack;

/**
 * Created by mathenge on 20/08/2017.
 */
public class Main {
    public static void main(String[] args){
//        IntStack intStacks = new IntStack();
//        if (!intStacks.isFull()){
//            intStacks.push(2);
//            intStacks.push(8);
//            intStacks.push(3);
//            intStacks.push(8);
//            intStacks.push(5);
//            intStacks.push(9);
//        }
//
//        System.out.println(intStacks.pop());
//        System.out.println(intStacks.pop());

        Person person1 = new Person("Mathenge", "7");
        Person person2 = new Person("Sylvia", "77");

        PersonStack stack = new PersonStack();
        stack.push(person1);
        stack.push(person2);

        System.out.println(stack.pop().toString());
        System.out.println(stack.pop().toString());

        IntQueue q = new IntQueue();
        q.enqueue(3);
        q.enqueue(7);
        q.enqueue(8);
        q.enqueue(9);

        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
    }

    public static PersonQueue main(int i){
        PersonQueue personqueue = new PersonQueue();
        personqueue.enqueue(new Queues.Person("Jordan", "23"));
        personqueue.enqueue(new Queues.Person("Jamar", "56"));
        personqueue.showAll();

        return personqueue;
    }
}
