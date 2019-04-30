package oefeningen.week2;

public class overerving3 {
	public static void main(String[] args) {
	person p1 = new person();
	p1.name = "Frank";
	
	employee e1 = new employee();
	//e1.
	}
}

class person {
	public String name;
	protected String telNr;
	
	String getName() {
		return name;
	}
	
	void setname() {
		
	}
}

class employee extends person {
	void foo() {
	}
	
}