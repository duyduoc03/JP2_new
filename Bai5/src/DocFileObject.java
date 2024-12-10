import java.io.*;

public class DocFileObject {
    public static void main(String[] args) {
        try {
            FileInputStream input1 = new FileInputStream("D:\\jp2\\person.dat");
            ObjectInputStream input2 = new ObjectInputStream(input1);
            Person person = (Person) input2.readObject();
            System.out.println("Du lieu doc duoc la: " + person);
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
