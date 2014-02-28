import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.IOException;

public final class InputReader {
    private static BufferedReader br  = null;
    private static String         EOL = "\n";

    public static InputStream getStream() throws EOFException {
        if (br == null) {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        String input     = "";
        String line      = null;
        int    endlAdded = 0;
        try {
            while (true) {
                // line is read and returned without termination character(s)
                line = br.readLine();
                // add line termination (Unix style '\n' by default)
                input     += line + EOL;   
                endlAdded += EOL.length();
                if (line == null) {
                    throw new EOFException("EndOfFile");
                } else if (line.length() == 0 && input.length() > endlAdded) {
                    byte[] byteArray = 
                    input.substring(0, input.length() - EOL.length()).getBytes();
                    return new ByteArrayInputStream(byteArray);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
