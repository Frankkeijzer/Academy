package oefeningen.OCA2.Enthuware;


//What will the following code print?
public class TestClass10{
        int x = 5;
        int getX(){ return x; }

        public static void main(String args[]) throws Exception{
            TestClass10 tc = new TestClass10();
            tc.looper();
            System.out.println(tc.x);
        }
        
        public void looper(){
            int x = 0;
//            System.out.println(getX());
            while( (x = getX()) != 0 ){
                for(int m = 10; m>=0; m--){
                    x = m;
                }
            }
            
       }     
}
