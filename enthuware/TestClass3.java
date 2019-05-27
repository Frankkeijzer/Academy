package oefeningen.enthuware;


//What will the following code print?
public class TestClass3{
        int x = 5;
        int getX(){ return x; }

        public static void main(String args[]) throws Exception{
            TestClass3 tc = new TestClass3();
            tc.looper();
            System.out.println(tc.x);
        }
        
        public void looper(){
            int x = 0;
            while( (x = getX()) != 0 ){
                for(int m = 10; m>=0; m--){
                    x = m;
                }
            }
            
       }     
}