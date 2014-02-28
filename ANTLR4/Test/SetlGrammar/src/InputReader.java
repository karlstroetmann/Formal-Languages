import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public final class InputReader {
    private static BufferedReader br  = null;
    private static String         EOL = "\n";

    /**
     * Reads from system in and returns an input stream
     *
     * Reads from System.in until
     * (a) input is non-empty (e.g. includes characters other than EOL)
     * and
     * (b) user accepted input with an extra empty line
     * 
     * Returned stream does _not_ include the extra empty line.
     * 
     * By default EOL sequences read from System.in are replaced by
     * Unix style EOL ('\n'). This can be controlled by useNativeEOL().
     *
     * @return input from System.in, wrapped in new InputStream
     */
    public static InputStream getStream() {
        if (br == null) {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        String input     = "";
        String line      = null;
        int    endlAdded = 0;
        try {
            while (true) {
                // line is read and returned without termination character(s)
                line   = br.readLine();
                // add line termination (Unix style '\n' by default)
                input += line + EOL;   endlAdded += EOL.length();
                if (line.length() == 0 && input.length() > endlAdded) {
                    byte[] byteArray = input.substring(0, input.length() - EOL.length()).getBytes();
                    return new ByteArrayInputStream(byteArray);
                }
            }
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * (re-)sets EOL sequence of read stream to native or Unix EOL
     *
     * (re-)sets EOL sequence of streams subsequently read by
     * getStream() to the EOL sequence native to the executing platform
     * or to Unix style '\n' EOL sequence
     *
     * @param useNativeEOL if true uses native EOL, Unix EOL otherwise
     */
    public static void useNativeEOL(boolean useNativeEOL) {
        if (useNativeEOL) {
            EOL = System.getProperty("line.separator");
        } else {
            EOL = "\n";
        }
    }
}
