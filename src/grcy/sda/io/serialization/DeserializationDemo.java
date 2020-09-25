package grcy.sda.io.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationDemo {

    public static void main(String[] args) {
        SerialPerson person = null;

        try {
            FileInputStream fileInputStream = new FileInputStream("SerializedPerson");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            person = (SerialPerson) objectInputStream.readObject();

            System.out.println(person);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
