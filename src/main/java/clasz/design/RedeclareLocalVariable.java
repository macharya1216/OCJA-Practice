package clasz.design;
class Stoney{}
class Ropey{}
public class RedeclareLocalVariable {

    private static int yesterday = 1;
    static int tomorrow ;
    private Stoney stoney;
    public static void main(String[] args){
        RedeclareLocalVariable rlv = new RedeclareLocalVariable();
        int today = 20;
        int tomorrow ;
        Stoney stoney;
        System.out.println(today+rlv.yesterday+rlv.tomorrow);
    }
}
