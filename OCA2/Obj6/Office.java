package oefeningen.OCA2.Obj6;

public class Office {
	 Office(){
		System.out.println("hallo");
		return;
	}
	
	public static void main(String[] args) {
		Emp emp = null;
		System.out.println(emp.bankVault);
		System.out.println(emp.getBankVaultValue());
		
		Office o = new Office();
	//	int a = o.Office();
		// System.out.println(a);
		
	}
}
class Emp{
	String name;
	static int bankVault;
	static int getBankVaultValue() {
		return bankVault;
	}
}
