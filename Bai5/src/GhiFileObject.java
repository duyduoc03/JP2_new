import java.io.*;

public class GhiFileObject {
    public static void main(String[] args) {
        Person person = new Person("Duoc", 21);
        File file = new File("D:\\jp2\\person.dat");
        try {
            FileOutputStream output1 = new FileOutputStream(file);
            ObjectOutputStream output2 = new ObjectOutputStream(output1);
            output2.writeObject(person);
            System.out.println("Ghi file thanh cong");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
