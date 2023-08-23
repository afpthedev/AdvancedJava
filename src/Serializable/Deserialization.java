package Serializable;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserialization {
    public static void main(String[] args) {
        try{
            //Creating stream to read the object
            ObjectInputStream in=new ObjectInputStream(new FileInputStream("<Absolute Path Your  File >"));
            Student s=(Student)in.readObject();
            //printing the data of the serialized object
            System.out.println(s.getName()+" "+s.getAge());
            //closing the stream
            in.close();
        }catch(Exception e){System.out.println(e);}
    }
}

