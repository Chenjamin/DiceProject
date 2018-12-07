public class DiceRunner{

	public static void main(String [] args){

		//Test 1

		Dice dice1 = new Dice();
		Dice dice2 = new Dice();
		DiceHolder cup=new DiceHolder();
		int rolls = 0;

		System.out.println(dice1.getValue() + ", " + dice2.getValue());
		for(int i = 0; (dice1.getValue() != dice2.getValue()) || (dice1.getValue() != 1); rolls++){
			dice1.roll();
			dice2.roll();
			System.out.println(dice1.getValue() + ", " + dice2.getValue());
		}
		if(rolls != 1) System.out.println("Snake eyes took " + rolls + " rolls");
		if(rolls == 1) System.out.println("Snake eyes took 1 roll");

		System.out.println(cup.addDie(dice1));
		System.out.println(cup.addDie(dice2));
		System.out.println(cup.addDie(dice1));
		System.out.println(cup.addDie(dice1));
		System.out.println(cup);


		//Test 2


	}

}