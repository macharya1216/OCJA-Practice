package exception;

class NoMoreCarrotsException extends RuntimeException{}
public class TryCatchExample {




     /*{
        int [] countsOfMoose = new int[3];
        int num = countsOfMoose[-1];
    }*/

     public void bad() {
             eatCarrot();

     }
     public void good () throws NoMoreCarrotsException{
         try {
             eatCarrot();
         }catch(Exception e){

         }
     }

     private static void eatCarrot()throws NoMoreCarrotsException {}

    public static void main(String[] args){
        new TryCatchExample();
      try {
          try {
              throw new RuntimeException();
          } catch (RuntimeException e) {
              throw new NullPointerException();
          } finally {
             try {
                 throw new ArrayIndexOutOfBoundsException();
             }catch(Exception e){

             }
          }
         } catch(Exception e){
            System.out.println(e);
          }
    }
}
