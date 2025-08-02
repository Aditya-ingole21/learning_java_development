

import java.io.*;
        import java.util.Date;

class TestLog1 {

    public static void main(String[] args) {
        int a = 0;

        int b = 0;
        try {
            a = Integer.parseInt(args [0]);
            b = Integer.parseInt(args [1]);
            System.out.println(a / b);
        } catch (Exception e) {
            System.out.println("some errors = " + e);


            try {
                Date d = new Date();
                String dated = d.toString();
                FileOutputStream fos = new FileOutputStream("mylog1.txt", true);
                String ex = e.toString();
                ex = ex + date;
                byte[] exbytes = ex.getBytes();
                fos.write(exbytes);
                fos.close();
            } catch (Exception e) {
                System.out.println("Logging error: " + e);
            }
        }
    }
}


