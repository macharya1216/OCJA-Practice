package overloaded;

public class ChooseWisely {

    public int choose(int choice){
        return 5;
    }
    public int choose(short choice){
        return 2;
    }

    public static void main(String [] path){
        byte b1 = 1;
        byte b2 = 2;
        //System.out.print(new ChooseWisely().choose((byte)(2+1)));
        System.out.print(new ChooseWisely().choose((byte)(b1+b2)));
    }
}
