public class Main {

    public static void main(String[] args) {


		Box boxie1 = new Box();
		System.out.println("\nBox1 info:");
		boxie1.getinfo();

	 Box boxie2 = new Box(10);
        System.out.println("\nBox2 info:");
	 boxie2.getinfo();

		Box boxie3 = new Box(8,29,56);
		System.out.println("\nBox3 info:");
		boxie3.getinfo();


    }
}


