package protectedaccess.pond.swan;

import protectedaccess.pond.shore.Bird;

public class Swan extends Bird {

    public int numOfEggs;
    public void swim(){
        floatInWater();
        System.out.println(text);

    }

    public void helpOtherSwanSwim(){
        Swan other = new Swan();
        other.floatInWater();
        System.out.println(other.text);
    }

    public void helpOtherBirdsSwim(){
        Bird other = new Bird();
        // other.floatOnWater(); // DOES NOT COMPILE
        //System.out.println(other.text);// DOES NOT COMPILE
    }

}
