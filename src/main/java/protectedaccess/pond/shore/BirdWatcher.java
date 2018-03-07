package protectedaccess.pond.shore;
import static java.util.Arrays.*;
public class BirdWatcher {

    public void watchBird(){

        Bird bird = new Bird();
        bird.floatInWater();
        System.out.println(bird.text);
    }

}
