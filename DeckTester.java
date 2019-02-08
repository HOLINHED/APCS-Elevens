/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		
		String[] ranks = {"A", "B", "C"};
		String[] suits = {"Giraffes", "Lions"};
		int[] values = {2, 1, 6};

		Deck test = new Deck(ranks, suits, values);

		System.out.println(test);

		System.out.println("DEAL: "  + test.deal());

		System.out.println(test);

		String[] ranks2 = {"ace","king", "queen", "jack", "10", "9", "8", "7", "6", "5", "4", "3", "2"};
		String[] suits2 = {"spades", "hearts", "diamonds", "clubs"};
		int[] values2 = {11,10,10,10,9,8,7,6,5,4,3,2,1};

		Deck test2 = new Deck(ranks2, suits2, values2);

		System.out.println(test2);

		System.out.println("DEAL: " + test2.deal());

		System.out.println(test2);

		System.out.println("DEAL: " + test2.deal());

		System.out.println(test2);
	}
}
