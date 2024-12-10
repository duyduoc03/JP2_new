import java.io.File;
import java.io.IOException;

public class Thaotacfile {
    public static void main(String[] args) {
        File file = new File("D:\\jp2\\example.txt");
        System.out.println("Duong dan file: " + file.getPath());

        //Kiem tra xem file co ton tai khong?
        if (file.exists()) {
            System.out.println("File co ton tai");
        } else {
            System.out.println("File khong ton tai");
        }

        //Tao file moi
        File createFile = new File("D:\\jp2\\example1.txt");
        try {
            if (createFile.createNewFile()) {
                System.out.println("Tao file thanh cong");
            } else {
                System.out.println("Tao file khong thanh cong");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //Xoa file
        if (createFile.delete()) {
            System.out.println("Xoa file thanh cong");
        } else {
            System.out.println("Xoa file khong thanh cong");
        }


        //Tao folder moi
        File folder = new File("D:\\jp2\\folder");
        if (folder.mkdir()) {
            System.out.println("Tao thu muc thanh cong");
        } else {
            System.out.println("Tao thu muc khong thanh cong");
        }
    }
}
