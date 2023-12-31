import javax.swing.*;
import java.awt.*;

class TextField extends JTextField {
    TextField() {
        this.setColumns(20);
    }
}

class BtnPanel extends JPanel {
    BtnPanel() {
        this.setLayout(new FlowLayout());
        this.add(new JButton("Add"));
        this.add(new JButton("Edit"));
        this.add(new JButton("Search"));
        this.add(new JButton("Delete"));
    }
}

class Panel extends JPanel {
    Panel(String label) {
        this.setLayout(new FlowLayout());
        this.add(new JLabel(label + " :"));
        this.add(new TextField());
    }
}

class Frame extends JFrame {
    Frame() {
        this.setLayout(new FlowLayout());
        this.setSize(400, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Student Information");
        // Panel sidPanel = new Panel("StudentId");
        this.add(new Panel("StudentId"));
        this.add(new Panel("FirstName"));
        this.add(new Panel("LastName"));
        this.add(new Panel("Course"));
        this.add(new Panel("Year"));
        this.add(new BtnPanel());
        // this.pack();
        this.setVisible(true); // at last.

    }
}

public class Main_Sw_01 {
    public static void main(String[] args) throws Exception {
        Frame f1 = new Frame();
    }
}
