package oefeningen.OCA2.Enthuware;


//What will the following code print when compiled and run?
class Test2{
    public static void main(String args[]){
        int c = 0;
        System.out.println("K  J");
        A: for(int i = 0; i < 2; i++){
            B: for(int j = 0; j < 3; j++){
                C: for(int k = 0; k < 3; k++){
                    System.out.print(k + "  ");
                    System.out.println(j);
                	c++;
                	System.out.println("---------c:--------- "+ c);
                    if(k>j) break;
                }
            }
        }
        System.out.println(c);
    }
}