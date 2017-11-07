public class Dice {
	public static void main(String[] args) {
		int dice = (int)(Math.random() * 6 + 1);
		int dice2 = (int)(Math.random() * 6 + 1);
			System.out.println("dice1:"+ dice + " " + "dice2:" + dice2);
			System.out.println("sum:" + (dice + dice2));
		
	}
}