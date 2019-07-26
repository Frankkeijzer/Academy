package oefeningen.OCA2.Obj7;

public class MainVoorInterface implements MijnInterface2, MijnInterface3 {
	String variabele;
	
	public static void main(String[] args) {
		MijnInterface2.methode3MijnInt2();
		
		MainVoorInterface m = new MainVoorInterface();
		m.methode2MijnInt2();
		MijnInterface2 m2 = new MainVoorInterface();
		bererekenen b = new bererekenen();
		b.statischeIntMethode();
		b.roepen();
	}

	@Override
	public void methodeMijnInt2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dezelfde() {
		// TODO Auto-generated method stub
		MijnInterface2.super.dezelfde();
	}

	@Override
	public int methodeUitrekenen() {
		// TODO Auto-generated method stub
		return 0;
	}

}
