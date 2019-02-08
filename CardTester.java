/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {

		Card testOne = new Card("A", "Giraffes", 2);
		Card testTwo = new Card("A", "Giraffes", 2);
		Card testThree = new Card("C", "Lions", 6);

		System.out.println(testOne);
		System.out.println(testTwo);
		System.out.println(testThree);

		System.out.println();

		System.out.println("testOne suit : " + testOne.suit());
		System.out.println("testTwo suit : " + testTwo.suit());
		System.out.println("testThree suit : " + testThree.suit());

		System.out.println();

		System.out.println("testOne rank : " + testOne.rank());
		System.out.println("testTwo rank : " + testTwo.rank());
		System.out.println("testThree rank : " + testThree.rank());

		System.out.println();

		System.out.println("testOne point value : " + testOne.pointValue());
		System.out.println("testTwo point value : " + testTwo.pointValue());
		System.out.println("testThree point value : " + testThree.pointValue());

		System.out.println();

		System.out.println("testOne vs testTwo : " + testOne.matches(testTwo));
		System.out.println("testOne vs testThree : " + testOne.matches(testThree));
		System.out.println("testTwo vs testOne : " + testTwo.matches(testOne));
		System.out.println("testTwo vs testThree : " + testTwo.matches(testThree));
		System.out.println("testThree vs testOne : " + testThree.matches(testOne));
		System.out.println("testThree vs testTwo : " + testThree.matches(testTwo));

	}
}
