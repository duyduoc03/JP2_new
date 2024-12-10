import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Docfile {
    public static void main(String[] args) {
//FileInputStream
//BufferedInputStream
//ObjectInputStream

        File file = new File("D:\\jp2\\example.txt");
        try {
            FileInputStream input = new FileInputStream(file);

            //byte
            //Doc 1 byte du lieu
            int data = input.read();
            System.out.println(data);

            //Doc tat ca byte du lieu
//            while (data > -1) {
//                System.out.println(data);
//                data = input.read();
//            }

            //Doc du lieu theo mang byte
            byte buff[] = new byte[1024];
            int length = input.read(buff);
            while (length > 0) {
                String str = new String(buff, 0, length);
                System.out.println(str);
                length = input.read(buff);
            }

            //Dong file
            input.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
