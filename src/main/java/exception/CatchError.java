package exception;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.IOException;
import java.sql.SQLException;

public class CatchError {


public static Exception E() {

    return new Exception();
}

public static void main(String[] args) {


       // throw new IOException();

}

    private static void callIOExceptionGenerator() throws IOException  {
    try {
        throw new IOException();
    }catch(IOException e){
        throw e;
    }
    }

}
