
public class weekTwoLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 0;
		String breakLn = "___________";
		
		System.out.println("Every even number from 0-100:");
		System.out.println(" ");
		
		while (x<=100) {
			System.out.println(x);
			x++;
			x++;}
		
		System.out.println(" ");
		System.out.println(breakLn);
	
		
		System.out.println("Every third number going backwards from 100");
		System.out.println(" ");
		
		while (x>0) {
			x--;
			x--;
			System.out.println(x);
			x--;
			}
		
		System.out.println(" ");
		System.out.println(breakLn);
		
		
		System.out.println("A counter that counts 1-100");
		System.out.println(" ");
		for (int i = 0; i<=100; i++) {
			if (i % 1 == 0)
				System.out.println(i);
		}
	
		System.out.println("Every number from 0-100 but if divisible by three it says hello and divisible by 5 says world");
		System.out.println(" ");
		for (int z = 0; z<=100; z++) {
			if (z % 1 == 0)
				System.out.println(z);
			if (z % 3 == 0)
				System.out.println("Hello");
			if (z % 5 == 0)
				System.out.println("World");
		}
		
		System.out.println(breakLn);
	}
}

