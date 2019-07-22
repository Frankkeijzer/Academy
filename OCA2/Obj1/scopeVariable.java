// uijoi jijioj
package oefeningen.OCA2.Obj1;

public class scopeVariable {
	public static void main(String[] args) {
		scopeVariable var = new scopeVariable();
		var.komtin=5;
//		scopeVariable.komtin1;
		scopeVariable.komtin1=1;
		
		scopeVariable var1, var5, var9 = new scopeVariable(), var35;
		
		/*{String a = "Hallo
				"
				+ "";
		}*/
		{
			String a = "Doei";
			System.out.println(a);
		}
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
//		System.out.println(i);
		int j=1;
		if(j<2) {
			System.out.println("hallo");
			j++;
		}
		else {
			System.out.println("bla");
		}
		System.out.println(j);
		
		
		String q = "Frank";
		for (int i=0; i< 2;i++) {
			System.out.println(q);
		}
		q = "Keijzer";
		System.out.println(q);
		
		
		
		
		int a, b, c, d, e= 1;
		int aa=2, bb,cc;
		bb=9;
		cc=0;
		System.out.println(aa+bb+cc);
		int aaa = 2, bbb = 3, ccc = 5, ddd, eee =9;
		System.out.println(aaa+bbb+ccc);
//		int z=10, y =4, String x= "hallo";
		
		
	}
	
	void methodetest(int komtin) {
//		int komtin;
		
	}
	int komtin;
	static int komtin1 = 2;
}

class bla{
	// deze klasse mag niet public zijn, daar mag er maar 1 van de de file staan 
	//	en die klasse is ook de naamgever voor de file
	public static void main(String[] args) {
		
	}
}