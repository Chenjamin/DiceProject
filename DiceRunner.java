import java.util.ArrayList;

public class DiceRunner{

	public static void main(String [] args){

		//Test 1

		Dice dice1 = new Dice();
		Dice dice2 = new Dice();
		int rolls = 0;

		System.out.println(dice1.getValue() + ", " + dice2.getValue());
		for(int i = 0; (dice1.getValue() != dice2.getValue()) || (dice1.getValue() != 1); rolls++){
			dice1.roll();
			dice2.roll();
			System.out.println(dice1.getValue() + ", " + dice2.getValue());
		}
		if(rolls != 1) System.out.println("Snake eyes took " + rolls + " rolls");
		if(rolls == 1) System.out.println("Snake eyes took 1 roll");




		//Test 2
		DiceHolder cup=new DiceHolder();

		ArrayList<Dice> list = new ArrayList<>();
		int test = 0;

		for(int i = 0; i<Integer.MAX_VALUE; i++){
			list.add(new Dice((int)(Math.random()*17 +4)));
			test = cup.addDie(list.remove(0));
			System.out.println(test);
			System.out.println(cup);
			if(test == -1) break;
		}
		System.out.println();
		System.out.println("After shake:");


		cup.shake();

		System.out.println(cup);

	}

}