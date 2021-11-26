package RockPIleCounting;

public class RockPileCounting {

	public static void main(String[] args) {
		int x = 14;
		String opening = "There are ";
		String closing = " rocks left";
			while (x > -1) {
				System.out.println(opening + x + closing);
				x--;
		}
			if (x == -1) {
				System.out.println("all done");
			}
			else {
				System.out.println("not done");
			}
	}

}
