public class Main {


    public static void main(String[] args) {


        Box b1 = new Box();
        System.out.println("\nBox1 info:");
        b1.printinfo();

        Box b2 = new Box(3);
        System.out.println("\nBox2 info:");
        b2.printinfo();

        Box b3 = new Box(2, 3, 4);
        System.out.println("\nBox3 info:");
        b3.printinfo();

        System.out.println("Surface = " +b3.surface());

        System.out.println("Volune = " + b3.volume());
    }

}
