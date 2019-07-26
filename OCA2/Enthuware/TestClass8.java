package oefeningen.OCA2.Enthuware;


//Consider the following code appearing in the same file:
class Data1 {
    private int x = 0, y = 0;
    public Data1(int x, int y){
        this.x = x; this.y = y;
    }
    void getData() {
    	System.out.println(this.x + " : "+ this.y);
    }
}
public class TestClass8 {
    public static void main(String[] args) throws Exception {
        Data1 d = new Data1(1, 1);
        d.getData();
        //add code here
        
    }
}
//Which of the following options when applied individually will change the Data object 
//currently referred to by the variable d to contain 2, 2 as values for its data fields?
