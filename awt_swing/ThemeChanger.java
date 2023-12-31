import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class MyFrame extends Frame implements ActionListener {
    Button b1, b2, b3;

    MyFrame() {
        this.setVisible(true);
        this.setBackground(Color.GRAY);
        this.setSize(600, 400);
        this.setTitle("ThemeChanger");
        this.addWindowListener(new WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent e) {
                // TODO Auto-generated method stub
                super.windowClosing(e);
                System.exit(0);

            }
        });

        this.setLayout(new FlowLayout());

        b1 = new Button();
        b1.setLabel("RED");
        b2 = new Button();
        b2.setLabel("GREEN");
        b3 = new Button();
        b3.setLabel("BLUE");

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);

        b1.setBackground(Color.RED);
        b2.setBackground(Color.GREEN);
        b3.setBackground(Color.BLUE);

        this.add(b1);
        this.add(b2);
        this.add(b3);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String btn_label = e.getActionCommand();
        System.out.println(btn_label);

        // if (btn_label.equals("RED")) {
        // this.setBackground(Color.red);
        // }

        switch (btn_label) {
            case "RED":
                this.setBackground(Color.RED);
                break;
            case "BLUE":
                this.setBackground(Color.BLUE);
                break;
            case "GREEN":
                this.setBackground(Color.GREEN);
                break;

            default:
                this.setBackground(Color.GRAY);
                break;
        }
    }

}

public class ThemeChanger {
    public static void main(String[] args) {
        MyFrame f1 = new MyFrame();
    }
}
