package oefeningen.OCA2.Enthuware;


//What will be the output of the following class:
public class TestClass7{
  public void testRefs(String str, StringBuilder sb){
    str = str + sb.toString();
    sb.append(str);
    str = null;
    sb = null;
  }
  public static void main(String[] args){
    String s = "aaa";
    StringBuilder sb = new StringBuilder("bbb");
    new TestClass7().testRefs(s, sb);
    System.out.println("s="+s+" sb="+sb);
  }
}