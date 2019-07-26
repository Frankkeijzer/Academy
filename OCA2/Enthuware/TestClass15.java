package oefeningen.OCA2.Enthuware;


//For what command line arguments will the following program print true?
class TestClass15{
  
    public static void main(String[] args){
//        Integer i = Integer.parseInt(args[0]);
//        Integer j = i;
    	int i = 0;
    	int j= i;
        i--;
        i++;
        System.out.println(""+i + j);
        System.out.println((i==j));
        
    }
}
