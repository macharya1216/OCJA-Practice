package ocja.practice.methods_and_encapsulation.statics;

public class GeneralConcepts {

/*
     1) static final constants need initialization before they are used,
    They can be initialized inside a static block or at the point of
    creation
*/
    private static final int number;
    private final int number1;

     static {
        number =2;
          // GeneralConcepts.number =2;  you cant refer to the static variable in the static block with the class name
     }

     /*A static final constant cannot be initialized inside a constructor*/
    private GeneralConcepts(){
       //  GeneralConcepts.number = 1; !! COMPILE ERROR
         number1 = GeneralConcepts.number;
     }
    /*
    A class level non static variable does not need to be initialized,
    if not initialized it will take the default value */
     private static int nonFinalNumber;

     public static void main(String[] args){

         GeneralConcepts g1 = new GeneralConcepts();
         GeneralConcepts g2 = new GeneralConcepts();
         GeneralConcepts g3 = new GeneralConcepts();
         GeneralConcepts g4 = null;

         /*Cannot reassign a final static variable once it has been initialized */
        // g1.number1 = 1; !! Compile ERROR

        GeneralConcepts.nonFinalNumber = 1;
        g2.nonFinalNumber++;
        g3.nonFinalNumber++;

        /*
        Notice GeneralConcepts g4 reference is null,
                 but even then g4.nonFinalNumber, actually
                 produces the right behaviour and does not
                 cause a null pointer exception*/

        System.out.println(g4.nonFinalNumber);

      }
}
