package clasz.design;

 class Math {

     public static final double secret = 2;
     public  static double getSecret(){ return secret;};
     public double getAncestorSecret(){return getSecret();}
 }

class ComplexMath extends Math{
    public static final double secret = 6;
    public static  double getSecret(){ return secret;};
    public double getParentSecret(){return getSecret();}

 }
 class InfiniteMath extends ComplexMath{

     public static final double secret = 8;
     public static  double getSecret(){ return secret;}
     public static void main(String[] numbers){
         ComplexMath math = new InfiniteMath();
         System.out.println(math.getAncestorSecret());
         System.out.println(math.getParentSecret());
         System.out.println(math.secret);
     }

}
