public class Test {
    public static void main(String args[]){
    Logger A=Logger.getinstance();
    Logger B=Logger.getinstance();
    System.out.println(A.hashCode());
    System.out.println(B.hashCode());
    System.out.println("A.val="+A.val+" B.val="+ B.val);
    A.val=20;
    System.out.println("A.val="+A.val+" B.val="+ B.val);
    
    }
}
