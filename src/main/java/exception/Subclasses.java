package exception;
class CanNotHopException extends Exception{}

class Hopper {
    public void hop() throws CanNotHopException{}
}

class Bunny extends Hopper{
    public void hop() {}
}

public class Subclasses {
}
