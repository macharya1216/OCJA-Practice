package ocja.practice.class_design.method_overriding_rules;

import java.io.IOException;

/*This example shows the basic method overriding
rules between a parent class and a subclass
these are the rules that it demonstrates

If the subclass is overriding the method
of a parent class
1) The access modifier should be the same or
greater than the access modifier in the parent method
2) The return type should be the same or covariant of the
return type of the parent
3) If the child class throws an Exception, it should be the same or a subtype of the exception that is
        thrown in the parent method. The child method can throw a runtime exception if the parent
        has not thrown an exception. Or the Child method is completely free to ignore the exception that is
        thrown by the parent
4) If the parent method is static (hidden) the child
method should also have the method as static
5) The child class must have the same signature as the method in the parent
*/
public class Rodent {
        protected static Integer chew() throws IOException{
            System.out.println("Rodent is chewing");
            return 1;
    }


}
 class Beaver extends Rodent{
    public static Integer chew() throws RuntimeException{
        System.out.println("Beaver is chewing on wood");
        return 2;
    }
}