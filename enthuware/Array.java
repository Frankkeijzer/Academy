package oefeningen.enthuware;

public class Array {
	public static void main(String[] args) {

//Which of the following code fragments will successfully initialize a two-dimensional array of chars named cA with a size such that cA[2][3] refers to a valid element?
//
//1.
//  char[][] cA = {  { 'a', 'b', 'c' },  { 'a', 'b', 'c' }   };
//2.
		
  char cA[][] = new char[3][];
  for (int i=0; i<cA.length; i++) 
	  cA[i] = new char[4];

  int intA[][] = new int[4][];
 // intA[0][0] = 1;
  //intA[1] = (int[]) new Object();
  intA[0] = new int[200];
  intA[3] = new int[2];
  
  int[][][] d3 = new int[1][1][];
  d3[0][0] = new int[] {1,2};

  intA[0][0] = 1;
  
  String[] StrArr = new String[1];
  System.out.println(StrArr[0]);
  
//3.
//  char cA[][] = { new char[ ]{ 'a', 'b', 'c' }  ,   new char[ ]{ 'a', 'b', 'c' }  };
//4
//  char cA[3][2] = new char[][] {  { 'a', 'b', 'c' },   { 'a', 'b', 'c' }   };
//5.
//  char[][] cA = { "1234", "1234",  "1234"  };

	}
}
