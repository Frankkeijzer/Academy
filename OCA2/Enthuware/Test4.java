package oefeningen.OCA2.Enthuware;


//What will the following program print?
class Test4{
	public static void main(String args[]){
		int var = 20, i=0;
		do{
			while(true){
				if( i++ > var) break;
			}
		} while (i < var--) ;
		
		System.out.println(var);
	}
}