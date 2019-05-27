package oefeningen.enthuware.eigenCode;

public class StaticMethode {
	static StaticMethode ref;
	String[] arguments;
	
	public static void main(String args[]){
		ref = new StaticMethode();
		ref.func(args);
		//ref = new StaticMethode();
		//ref.func(args);

	}
	
	public void func(String[] args){
		ref.arguments = args;
		}
	
}
