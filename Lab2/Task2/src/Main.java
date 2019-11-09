
public class Main {
    public static void main(String[] args) {
        Queue queue1 = new Queue();
        Queue queue2 = new Queue(4);

        queue1.push(8);
        queue1.push(6);
        queue1.push(4);
        queue1.push(2);
        queue1.push(0);
        queue1.push(-2);

        int number = queue1.pop();

        System.out.println("Popped number: " + number);
        System.out.println(queue1.isEmpty());
        System.out.println(queue1.isFull());

        System.out.println();

        queue2.push(5);
        queue2.push(10);
        queue2.push(16);
        queue2.push(-7);
        queue2.push(1);

        number = queue2.pop();
        System.out.println("Popped number: " + number);

        System.out.println(queue2.isEmpty());
        System.out.println(queue2.isFull());
    }
}
