package ocja.practice.access_modifiers.whiz_practice.a;

/*
Following example demonstrates the package private access modifier
current class A , B and C are in the same package,
and B extends A , and hence all three lines below compile
without any issue, now if you move B to package b, then
B.j line will not compile because class B loses access
to variable j in class A. Then if you move Class C
to package c, then all three lines will not compile
because class C is now in a different package than
A and hence will lose access to variable x and j of
class j. */

public class C {
    public static void main(String[] args){

        A ab = new B();
         System.out.println(ab.x);
         System.out.println(B.j);
         System.out.println(ab.j);


    }
}
