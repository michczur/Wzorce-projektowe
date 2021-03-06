package grcy.sda.io.serializacja;

import java.io.*;

public class SerializationDemo {
    public static void main(String[] args) {
        SerialPerson serialPerson = new SerialPerson(2, "Jan", "Nowak", 33);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("SerializedPerson");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(serialPerson);

            objectOutputStream.close();
            fileOutputStream.close();
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
