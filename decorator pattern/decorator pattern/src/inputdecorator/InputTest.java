package inputdecorator;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputTest {

    public static void main( String[] args ) {
        int c;
        String temp = " I know the Decorator Pattern therefore I RULE !";
        try {
            InputStream in =
                    new LowerCaseInputStream(
                            new BufferedInputStream(
                                    new ByteArrayInputStream( temp.getBytes() ) ) );
            while ( ( c = in.read() ) >= 0 ) {
                System.out.print( ( char ) c );
            }
        }
        catch ( IOException e ) {
            e.printStackTrace();
        }
    }

}
