package clasz.design;

class InsufficientDataException extends Exception{}
public class Reptile {

    protected double getHeight() throws InsufficientDataException{
        return 2;
    }

    public double getHeight(int height) throws InsufficientDataException{
        return height;
    }
    protected int getLength(){
        return 10;
    }

    protected int getSkinTone(){
        return 0;
    }
}

