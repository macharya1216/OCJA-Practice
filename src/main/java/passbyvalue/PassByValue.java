package passbyvalue;

public class PassByValue {

    public static void main(final String[] args){
        StringBuilder name = new StringBuilder("Diana");
        speak(name);
        new PassByValue().printMyName();
        glide(1,1);
    }

    private  void printMyName() {
    return ;
    }

    public static void speak(StringBuilder s){
        StringBuilder newS = new StringBuilder(s);
        newS.append("Webby");
    }

    public static void glide(long l,long l1){
        System.out.println("entered Long");
    }
}
