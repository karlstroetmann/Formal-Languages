import java.io.*;

public class MyReader {
    public static InputStream getStream() {
        String all = "";
        int lastChar       = 0;
        int secondLastChar = 0;
        try {
            while (true) {
                while (System.in.available() == 0) {}
                while (System.in.available() > 0) {
                    lastChar       = secondLastChar;
                    secondLastChar = System.in.read();
                    all += Character.toString((char) secondLastChar);
                    if (lastChar == '\n' && secondLastChar == '\n') {
                    	byte[] byteArray = all.getBytes("ISO-8859-1");
                        return new ByteArrayInputStream(byteArray);
                    }
                }
            }
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
