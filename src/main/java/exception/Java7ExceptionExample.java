package exception;




public class Java7ExceptionExample {

    static class FirstException extends Exception { }
    static class SecondException extends Exception { }

    public void rethrowException(String exceptionName)  throws FirstException, SecondException ,Exception {
        try {
            if (exceptionName.equals("First")) {
                throw new FirstException();
            } else {
                throw new SecondException();
            }
        } catch (Exception e) {
            e = new RuntimeException();
            throw e;
        }
    }
}
