package ocja.practice.methods_and_encapsulation.Overloading;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


/*In this example, the overload method only accepts
primitive integer, but in the test, primitive
character is passed, which get's upcasted to
an int  and a Wrapper character is passed
which gets unboxed to a primitive character
and then upcasted to an int.

Now what happens if we add one more method that accepts Object ?
 - The wrapper character uses the Object method while the
 primitive character still uses the primitiveInt method

What happens if we comment out the overload method that accepts
primitiveInt ?
   - The primitive X character is autoboxed to wrapper class Character
   and the overloaded method of the Object is used.

What happens if we comment out the overloaded method of Object and primitiveInt
and use an overloaded method of Integer ?
    - both calls primitive X and wrapper X would not compile because primitive
    X can be upcasted to Object but then it cant be casted to Integer.
    - Wrapper Character can be casted to Object but cant be casted to Integer .

What happens if we add one more overload method with wrapperCharacter,
    - the primitive X still chooses to stick with the overloaded method of primitiveInt
    looks like for java it is easier to upgrade to a higher primitive type then to upcast
    to the wrapper object
    - the wrapper Character which is already an Object type gets to use the overloaded method
    that accepts the wrapper Character

*/

public class CharacterOverloadToPrimitiveInt {

   public String overload(int primitiveInt){
        return "primitiveInt";
    }

    public String overload(Object object){
        return "object";
    }

    public String overload(Integer wrapperInt){
        return "wrapperInt";
    }

    public String overload(Character wrapperCharacter){
        return "wrapperCharacter";
    }


    @Test
    public void characterOverloadTest(){

        assertEquals(new CharacterOverloadToPrimitiveInt().overload('X'),"primitiveInt");
        assertEquals(new CharacterOverloadToPrimitiveInt().overload(Character.valueOf('X')),"primitiveInt");

    }
}
