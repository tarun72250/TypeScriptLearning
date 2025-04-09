package coreJavaPractise;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class A_05_DeserializationExample {

	public static void main(String[] args) 
	{
        try (FileInputStream fileIn = new FileInputStream("C://Users//Tarun//Desktop//Java Eclipse Folder Path//FIle Input Output Demo//A_03_DemoSerilization.txt");
             ObjectInputStream objIn = new ObjectInputStream(fileIn)) {

        	A_03_PersonSerilization person = (A_03_PersonSerilization) objIn.readObject(); // Deserialize the object
            System.out.println("Deserialization done!");
            System.out.println("Person details: " + person);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
