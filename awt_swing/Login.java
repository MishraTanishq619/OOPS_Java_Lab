import java.awt.*;
import java.awt.event.*;

// implements ActionListener 
class LoginFrame extends Frame {
    TextField Uname;
    TextField Pword;
    Button B1;
    String status;
    Font f1 = new Font("arial", Font.BOLD, 35);

    LoginFrame() {
        this.setTitle("Login Frame");
        this.setBackground(Color.green);
        this.setSize(500, 800);
        this.setLayout(null); // remember this to set specefically
        this.setVisible(true);

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                // TODO Auto-generated method stub
                super.windowClosing(e);
                System.exit(0);
            }
        });

        Label l1 = new Label("UserName :");
        l1.setFont(f1);
        Uname = new TextField(20);

        Label l2 = new Label("Password :");
        l2.setFont(f1);
        Pword = new TextField(20);
        Pword.setEchoChar('*');

        B1 = new Button("Login");
        B1.setBackground(Color.RED);

        this.add(l1);
        this.add(Uname);
        this.add(l2);
        this.add(Pword);
        this.add(B1);
        l1.setBounds(50, 100, 300, 40);
        l2.setBounds(50, 350, 300, 40);
        Uname.setBounds(350, 100, 100, 40);
        Pword.setBounds(350, 350, 100, 40);
        B1.setBounds(350, 200, 100, 40);

        B1.addActionListener(e -> { // implements ActionListener
            String u = Uname.getText();
            String p = Pword.getText();
            System.out.println(u + "   " + p);
            if (u.equals("tanishq") && p.equals("mishra")) {
                status = "SUCCESS";
            } else {
                status = "FAILED";
            }
            repaint();
        });
    }

    // public void actionPerformed(ActionEvent e) {

    // String u = Uname.getText();
    // String p = Pword.getText();
    // System.out.println(u + " " + p);
    // if (u.equals("tanishq") && p.equals("mishra")) {
    // status = "SUCCESS";
    // } else {
    // status = "FAILED";
    // }
    // repaint();
    // };

    @Override
    public void paint(Graphics g) {
        // TODO Auto-generated method stub
        super.paint(g);
        g.setFont(f1);
        g.drawString("Status is : " + status, 100, 600);
    }

}

public class Login {
    public static void main(String[] args) {
        LoginFrame lf1 = new LoginFrame();

    }
}
