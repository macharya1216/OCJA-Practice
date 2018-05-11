package ocja.practice.access_modifiers;

/*This class demonstrates the fundamental of access modifiers
The print method in class Ab and Sub are private
so the reference ab in class Whiz cannot access this
private method*/

class Ab {
    private final void print(){
        System.out.print("class Ab");
    }
}

class Sub extends Ab {

    private void print(){
        System.out.print("class Sub");
    }

}

class Whiz {

    public static void main(String[] args){
        Ab ab = new Sub();
        //ab.print(); //
    }
}