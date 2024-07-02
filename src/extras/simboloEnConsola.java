package extras;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public class simboloEnConsola {
    
    public static void main(String[] args) throws UnsupportedEncodingException {
        
        Charset utf8Charset = Charset.forName("UTF-8");
        
	PrintStream out = new PrintStream(System.out, true, utf8Charset.name());

        char piSymbol = '\u03C0';
        out.println("El símbolo de pi es: " + piSymbol);

    }
    
}
