package ocja.practice.class_design.abstract_class;

import ocja.practice.access_modifiers.whiz_practice.a.A;
import ocja.practice.class_design.inteface.B;

 abstract class BasicAbstractPrinciples  {

   protected static  abstract class Inner{} // inner static private abstract classes are allowed
    //final abstract class Inner{} // but final is still not allowed
}

/*
!! Compile error : OUTER ABSTRACT CLASS CANNOT BE PRIVATE
private abstract class BasicAbstractPrinciples {}
*/
/*
!! Compile error : OUTER ABSTRACT CLASS CANNOT BE PROTECTED
protected abstract class BasicAbstractPrinciples {}
*/

/*
!! Compile error : OUTER ABSTRACT CLASS CANNOT BE FINAL
final abstract class BasicAbstractPrinciples {}
*/
/*
!! Compile error : OUTER ABSTRACT CLASS CANNOT BE STATIC
final abstract class BasicAbstractPrinciples {}
*/