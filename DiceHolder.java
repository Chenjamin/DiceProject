import java.util.ArrayList;

public class DiceHolder{

	Dice die=new Dice();
	private ArrayList<Dice> holder=new ArrayList<>();

	public DiceHolder(){
	}
	public int addDie(Dice nueva){

		if(holder.size()<6){
			holder.add(nueva);

			return 1;
		}

		else{
			return -1;
		}

	}

	public void shake(){

		for(int i=0;i<holder.size();i++){
			holder.get(i).roll();
		}

	}
		public String toString(){
			System.out.println(holder);

			return "";
		}

}
