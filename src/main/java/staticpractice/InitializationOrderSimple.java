package staticpractice;

class InitializationOrderSimple {

    private String name = "Torchie";
    {
        System.out.println(name);
    }

    private static int COUNT ;

    static
    {
        System.out.println(COUNT);
    }
    static {
        COUNT += 10;
        System.out.println(COUNT);
    }

    public InitializationOrderSimple(){
        System.out.println("constructor");
    }

}




