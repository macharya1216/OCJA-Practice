package protectedaccess.pond.shore;

import protectedaccess.pond.swan.Swan;

public class SwanBird extends Bird {
    public void swim(){
        floatInWater();
        System.out.println(text);

    }

    public void helpOtherSwanSwim(){
        SwanBird other = new SwanBird();
        other.floatInWater();
        System.out.println(other.text);
    }

    public void helpOtherBirdsSwim(){
        Bird other = new Bird();
         other.floatInWater();
        System.out.println(other.text);
    }

}

