import java.io.*;

public class DocGhibuffered {
    public static void main(String[] args) {
        //Doc du lieu
        String filePath = "D:\\jp2\\example.txt";
        BufferedInputStream input;
        try {
            input = new BufferedInputStream(new FileInputStream(filePath));
            int data;
            while((data = input.read()) != -1){
                System.out.print((char)data);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        String filePath1 = "D:\\jp2\\example_result.txt";

        //Ghi du lieu
        try {
            BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream(filePath));
            String text = "abc xyz";
            output.write(text.getBytes());
            output.flush();
            System.out.println("Du lieu duoc ghi thanh cong");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
