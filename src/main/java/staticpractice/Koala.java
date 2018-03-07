package staticpractice;

public class Koala {

    public static int count = 0;

    public  String weight;

    public static void main (String[] args){
        System.out.println(count);
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Koala{" +
                "weight='" + weight + '\'' +
                '}';
    }
}
