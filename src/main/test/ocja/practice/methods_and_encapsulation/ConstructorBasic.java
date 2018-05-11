package ocja.practice.methods_and_encapsulation;

public class ConstructorBasic {

    ConstructorBasic(long number){ }
}

class ConstructorComplexity extends ConstructorBasic {

ConstructorComplexity(){
        super(1);
    }

    ConstructorComplexity(int num){
        this();
    }
    ConstructorComplexity(String str){
        super(1);
    }
}
