package ocja.practice.statements_loops;

public class WhizExamsLoopsQ {

    static int x = 1;
    /*For loop with a continue in the middle might cause compile error*/
    public static void main(String args[]){

        int[][] nums = {{0}};
        for(int x[] : nums){
            System.out.println(x);
            continue;
            // System.out.println(x); !! COMPILE ERROR , Unlreachable code
        }
    }

}
