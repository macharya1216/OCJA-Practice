package ocja.practice.lambdas;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

interface Secrets{
    String magic(double d);
}
public class Secret {

    @Test
    public void testBasicSecrets(){
        String myMethodSecret = "baby";
        Secrets secrets = (e-> {String g = "dawg"; return g+myMethodSecret;});
        assertEquals(secrets.magic(0),"dawgbaby");
    }

}
