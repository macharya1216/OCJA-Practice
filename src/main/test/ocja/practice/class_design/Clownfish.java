package ocja.practice.class_design;

/*This is a trick question that was a part
of the OCJA exam preperation. On a high
level this looks like a test for Method
Overriding for classes but it's actually
testing for the rule "checked exceptions
should be  handled by the caller" line 25*/
class BubbleException extends Exception{}
class Fish{
    Fish getFish() throws BubbleException{
        throw new RuntimeException("fish");
    }
}
public final class Clownfish extends Fish {

    public final Clownfish getFish(){
        throw new RuntimeException("clown");
    }
    /*
    If you remove the "throws BubbleException" from the main method
            then the code does not compile, that's because Fish has
    method getFish() which throws a checked exception which needs
        to be caught in the main*/
    public static void main(String[] bubbles) throws BubbleException{
        final Fish f = new Clownfish();
        f.getFish();
        System.out.println("swim!");
    }

}
