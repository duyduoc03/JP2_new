import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ghifile {
    public static void main(String[] args) {
        File file = new File("D:\\jp2\\test.txt");
        try {
            FileOutputStream output = new FileOutputStream(file, false); //true la ghi de, false la viet lai

            //Ghi 1 byte du lieu
            output.write(65);
            System.out.println("Ghi file thanh cong");

            //Ghi 1 mang du lieu
            String text =  "Hello World";
            byte buff[] = text.getBytes();
            output.write(buff, 0, buff.length);
            System.out.println("Ghi mang du lieu file thanh cong");

            //Dong ket noi
            output.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
