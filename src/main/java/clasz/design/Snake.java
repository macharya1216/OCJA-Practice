package clasz.design;

class Snake extends Reptile {

    public double getHeight(int height) throws InsufficientDataException{
        return height;
    }
    protected double getHeight() {
        return 2;
    }
    protected int getLength()   {
        return 10;
    }

    public static void main (String[] args){
        System.out.println("Running");
    }

    protected static int getSkinTone(int tone){
        return 0;
    }
}


