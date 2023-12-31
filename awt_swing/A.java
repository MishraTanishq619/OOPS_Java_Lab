import java.awt.*;
import java.awt.event.*;

// //1

// // class WindowListenerInt implements WindowListener {

// class WindowListenerInt extends WindowAdapter {
// public void windowClosing(WindowEvent we) {
// System.out.println("Window Closing");
// System.exit(0);
// }
// }

// // 2

class MouseListnerCls implements MouseListener {
    @Override
    public void mouseClicked(MouseEvent e) {
        // TODO Auto-generated method stub
        System.out.println("mouseClicked at " + e.getX() + " , " + e.getY());

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub
        System.out.println("mouseEntered");

    }

    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub
        System.out.println("mouseExited");

    }

    @Override
    public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub
        System.out.println("mousePressed");

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub
        System.out.println("mouseReleased");

    }
}

// // 3

class KeyListenerCls implements KeyListener {
    @Override
    public void keyPressed(KeyEvent e) {
        // TODO Auto-generated method stub
        System.out.println("keyPressed :" + e.getKeyChar());
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub
        System.out.println("keyReleased.");
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub
        System.out.println("keyTyped.");

    }
}
// class MyFrame2 extends MouseAdapter {
// }

class MyFrame extends Frame {
    MyFrame(String s, Color c) {
        this.setTitle(s);
        this.setVisible(true);
        this.setSize(1000, 800);
        this.setBackground(c);
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.out.println("Window Closing");
                System.exit(0);
            }

        });

        this.addMouseListener(new MouseListnerCls());
        this.addKeyListener(new KeyListenerCls());
    }

    public void paint(Graphics g) {
        Font font = new Font("arial", Font.BOLD + Font.ITALIC, 100);
        this.setForeground(Color.black);
        g.setFont(font);
        g.drawString("Tanishq Mishra", 100, 500);
    }
}

public class A {
    public static void main(String[] args) {
        // Frame f1 = new Frame("Avengers");
        // f1.setVisible(true);
        // f1.setSize(400, 200);

        MyFrame mf1 = new MyFrame("Title", Color.red);
    }
}
