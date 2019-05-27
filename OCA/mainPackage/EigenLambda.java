package oefeningen.OCA.mainPackage;

public class EigenLambda {
	public static void main(String[] args) {
		Dag zaterdag = new Dag(21);
		zaterdag.WatIsHetWeer(null);
		
	}
}

class Dag{
	int temperatuur;
	
	Dag(int temperatuur){
		this.temperatuur = temperatuur;
	}
	 boolean WatIsHetWeer(Conditie<Dag> conditie) {
		   return conditie.test(this);
		 }

}

class MooiWeer implements Conditie<Dag>{
	public boolean test(Dag dag){
		return dag.temperatuur > 20;
	}
	
}


@FunctionalInterface
interface Conditie<R>{
	public abstract boolean test(R r);
}