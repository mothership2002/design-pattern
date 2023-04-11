package observerpattern.swing;

import javax.swing.*;
import java.awt.*;

public class SwingObserverExample {

    JFrame jFrame;

    public static void main( String[] args ) {
        SwingObserverExample example = new SwingObserverExample();
        example.go();
    }

    public void go() {
        jFrame = new JFrame();
        JButton button = new JButton( "Should I do it?" );

        String angel = saidToMe( new String( "천사" ) );
        String devil = saidToMe( new String( "악마" ) );

        button.addActionListener( e -> System.out.println( angel ) );
        button.addActionListener( e -> System.out.println( devil ) );

        jFrame.getContentPane().add( BorderLayout.CENTER, button );

        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.getContentPane().add(BorderLayout.CENTER, button);
        jFrame.setSize(300,300);
        jFrame.setVisible(true);

    }

    private static String saidToMe( String object ) {
        StringBuffer buffer = new StringBuffer();

        buffer.append( "대충 " );
        buffer.append( object );
        buffer.append( "가 하는 말" );

        return buffer.toString();
    }

}