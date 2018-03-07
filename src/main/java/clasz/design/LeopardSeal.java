package clasz.design;

 interface HasTail {
     public int getTailLength();
    default  void myWay(){

    }
 }

abstract class HarborSeal implements HasTail{
     public int getTailLength(){
         return 0;
     }
    HarborSeal(){
         super();
    }
     public static void main(String[] args){
         System.out.println("oye");
     }
}



