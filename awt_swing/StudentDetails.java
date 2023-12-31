import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class StudentDetailsFrame {
    Frame frame = new Frame();
    TextField sid = new TextField(20);
    TextField sname = new TextField(20);
    TextField squal = new TextField(20);
    TextArea sadd = new TextArea(5, 20);

    Checkbox cb1 = new Checkbox();
    Checkbox cb2 = new Checkbox();
    Checkbox cb3 = new Checkbox();

    CheckboxGroup cbg1 = new CheckboxGroup();
    Checkbox radio1 = new Checkbox();
    Checkbox radio2 = new Checkbox();

    Button B1 = new Button("Registration");

    List l1 = new List(4, true);
    Choice ch1 = new Choice();

    Font f1 = new Font("arial", Font.BOLD, 15);

    String listdata = "";
    String choicedata = "";

    StudentDetailsFrame() {
        this.frame.setTitle("Student Details");
        this.frame.setBackground(Color.green);
        this.frame.setSize(700, 600);
        this.frame.setVisible(true);
        this.frame.setFont(f1);
        this.frame.setLayout(new FlowLayout());

        this.frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                // TODO Auto-generated method stub
                super.windowClosing(e);
                System.exit(0);
            }
        });

        this.frame.add(new Label("Student ID : "));
        this.frame.add(sid);
        this.sid.setBounds(100, 100, 200, 100);

        this.frame.add(new Label("Student Name : "));
        this.frame.add(sname);
        this.frame.add(new Label());
        this.frame.add(new Label("Student Qualifications : "));
        this.frame.add(squal);
        this.frame.add(new Label("Student Address : "));
        this.frame.add(sadd);
        this.frame.add(B1);

        cb1.setLabel("BCA");
        cb2.setLabel("MCA");
        cb3.setLabel("PHD");

        this.frame.add(cb1);
        this.frame.add(cb2);
        this.frame.add(cb3);

        radio1.setCheckboxGroup(cbg1);
        radio1.setLabel("Male");
        radio1.setState(false);
        radio2.setCheckboxGroup(cbg1);
        radio2.setLabel("Female");
        radio2.setState(true);

        this.frame.add(radio1);
        this.frame.add(radio2);

        B1.setBackground(Color.red);
        B1.addActionListener(e -> {
            System.out.println("Clicked.");
        });

        l1.add("One");
        l1.add("Two");
        l1.add("Three");
        l1.add("Four");
        l1.add("Five");
        l1.add("Six");

        l1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                // TODO Auto-generated method stub
                String[] items = l1.getSelectedItems();
                listdata = "";

                for (String i : items) {
                    listdata = listdata + " , " + i;
                }

                choicedata = ch1.getSelectedItem();
            }
        });

        ch1.add("Cpp");
        ch1.add("Python");
        ch1.add("Java");

        ch1.addItemListener(e -> {
            choicedata = ch1.getSelectedItem();
            this.frame.repaint();
        });

        this.frame.add(l1);
        this.frame.add(ch1);

    }

    // error to paint component frame

    public void paint(Graphics g) {
        // TODO Auto-generated method stub

        g.drawString("List is : " + listdata, 100, 100);
        g.drawString("Choice is : " + listdata, 100, 200);

    }
}

public class StudentDetails {
    public static void main(String[] args) {
        StudentDetailsFrame sdf1 = new StudentDetailsFrame();

    }
}
