package coreJavaPractise;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class A_04_SerializationExample {
    public static void main(String[] args) {
    	A_03_PersonSerilization person = new A_03_PersonSerilization("Alice", 25);

        try (ObjectOutputStream objOut = new ObjectOutputStream(new FileOutputStream("C://Users//Tarun//Desktop//Java Eclipse Folder Path//FIle Input Output Demo//A_03_DemoSerilization.txt"))) {

            objOut.writeObject(person); // Serialize the object
            System.out.println("Serialization done!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
