
package ocja.practice.methods_and_encapsulation.statics;

/*This example demonstrates how static imports work,
static imports are only for static methods
        and they have import static * syntax.

        Notice below line 17 does not compile even though
static Arrays.* and Arrays.asList are imported statically
        that's because java is looking for the import of the
        Arrays class which is not there because static import are for
        importing satic members*/

//import java.util.Arrays;
import static java.util.Arrays.asList;

public class StaticImport {

public static void main(String[] args){
//    Arrays.asList(""); // !! DOES NOT COMPILE
    asList("");
}
}
