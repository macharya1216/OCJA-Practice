package exception;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Backup {

    public void performBackup(){
        try{
            int count =0;
            throw new IOException("");
        }catch(Exception e){

            try{
                throw new FileNotFoundException();
            }catch(FileNotFoundException ex){

            }
        }
    }
}
