package clasz.design;

interface Sphere{
    default String getName(){
        return "unknown";
    }
}
/*abstract class Planet{
    abstract String getName();
}*/
public class Mars /*extends Planet*/ implements Sphere{

    public Mars(){
        super();
    }
  /*  public String getName(){
        return "Mars";
    }*/
    public static void main(final String[] args){
        System.out.println((new Mars()).getName());
    }
}
