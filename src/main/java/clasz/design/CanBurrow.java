package clasz.design;

interface CanBurrow {

    int MINIMUM_DEPTH =2;
    int getMaximumDepth();
    static int getSize(){
        return 0;
    }
}


 final class FieldMouse implements  CanBurrow{
     public int getMaximumDepth(){
        return 10;
    }
    int getSize(){
        return CanBurrow.getSize();
    }
}
