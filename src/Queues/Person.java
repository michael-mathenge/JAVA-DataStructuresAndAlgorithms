package Queues;

/**
 * Created by mathenge on 21/08/2017.
 */
public class Person {
    private String name;
    private String rollNo;

    public Person(String name, String rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", rollNo='" + rollNo + '\'' +
                '}';
    }
}
