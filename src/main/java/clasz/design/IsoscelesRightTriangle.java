package clasz.design;

abstract class Triangle{
    abstract String getDescription();
}

class RightTriangle extends Triangle {
    protected String getDescription(){
        return "rt";
    }
}

public class IsoscelesRightTriangle extends RightTriangle {

    public String getDescription(){
        return "irt";
    }

    public static void main (String[] edges){
        final Triangle shape = new IsoscelesRightTriangle();
        System.out.println(shape.getDescription());
    }

}
