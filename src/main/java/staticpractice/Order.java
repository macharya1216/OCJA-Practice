package staticpractice;

public class Order {

static String result = "";
    {
        result += "c";
    }

    static {
        result += "u";
    }

    {
        result += "r";
    }


    public static void main (String[] args){
        System.out.print(Order.result + " ");
        System.out.print(Order.result + " ");
        new Order();
        new Order();
        System.out.print(Order.result + " ");
    }

}
