/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {

		// rank, suit, pointvalue
		Card testOne = new Card("A", "Giraffes", 2);
		Card testTwo = new Card("A", "Giraffes", 2);
		Card testThree = new Card("C", "Lions", 6);
		
		assert testOne.suit().equals("Giraffes") : "Card doesn't return correct suit!";
		assert testOne.suit().equals(testTwo.suit()) : "Identical suits dont' match!";
		assert testOne.suit().equals(testThree.suit()) == false : "Different suits match!";
		
		assert testOne.rank().equals("A") : "Card doesn't return correct rank!";
		assert testOne.rank().equals(testTwo.rank()) : "Identical ranks dont' match!";
		assert testOne.rank().equals(testThree.rank()) == false : "Different ranks match!";
		
		assert testOne.pointValue() == 2 : "Card doesn't return correct pointvalue!";
		assert testOne.pointValue() == testTwo.pointValue() : "Identical pointvalues dont' match!";
		assert testOne.pointValue() != testThree.pointValue() : "Different pointvalues match!";

		assert testOne.toString().equals("A of Giraffes (point value = 2)") : "Card doesn't return corrent .toString() !";
		assert testOne.matches(testOne) : "Cards don't match themselves!";
		assert testOne.matches(testTwo) : "Identical cards don't match!";
		assert testOne.matches(testThree) == false : "Different cards match!";
		
		System.out.println("ALL TESTS PASSING");

	}
}
