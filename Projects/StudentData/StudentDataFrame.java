
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class StudentDataFrame extends Frame {
    Label SidLabel = new Label("Student Id : ");
    Label FNLabel = new Label("First Name : ");
    Label LNLabel = new Label("Last Name : ");
    Label CourseLabel = new Label("Course : ");
    Label YearLabel = new Label("Year : ");

    TextField SidTextField = new TextField();
    TextField FNTextField = new TextField();
    TextField LNTextField = new TextField();
    TextField CourseTextField = new TextField();
    TextField YearTextField = new TextField();

    Button AddBtn = new Button("Add");

    Font f1 = new Font("arial", Font.CENTER_BASELINE, 25);

    StudentDataFrame() {
        this.setBackground(new Color(239, 239, 239));
        this.setSize(800, 500);
        this.setTitle("Student_Information");
        this.setVisible(true);
        this.setLayout(null);

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                // TODO Auto-generated method stub
                super.windowClosing(e);
                System.exit(0);
            }
        });

        this.add(SidLabel);
        SidLabel.setFont(f1);
        SidLabel.setBounds(50, 50, 200, 30);
        this.add(FNLabel);
        FNLabel.setFont(f1);
        FNLabel.setBounds(50, 100, 200, 30);
        this.add(LNLabel);
        LNLabel.setFont(f1);
        LNLabel.setBounds(50, 150, 200, 30);
        this.add(CourseLabel);
        CourseLabel.setFont(f1);
        CourseLabel.setBounds(50, 200, 200, 30);
        this.add(YearLabel);
        YearLabel.setFont(f1);
        YearLabel.setBounds(50, 250, 200, 30);

        this.add(SidTextField);
        SidTextField.setFont(f1);
        this.add(FNTextField);
        FNTextField.setFont(f1);
        this.add(LNTextField);
        LNTextField.setFont(f1);
        this.add(CourseTextField);
        CourseTextField.setFont(f1);
        this.add(YearTextField);
        YearTextField.setFont(f1);

        SidTextField.setBounds(260, 50, 400, 30);
        FNTextField.setBounds(260, 100, 400, 30);
        LNTextField.setBounds(260, 150, 400, 30);
        CourseTextField.setBounds(260, 200, 400, 30);
        YearTextField.setBounds(260, 250, 400, 30);

        AddBtn.addActionListener(e -> {

            String SidText = SidTextField.getText();
            String FNText = FNTextField.getText();
            String LNText = LNTextField.getText();
            String CourseText = CourseTextField.getText();
            String YearText = YearTextField.getText();

            if (SidText.equals("") ||
                    FNText.equals("") ||
                    LNText.equals("") ||
                    CourseText.equals("") ||
                    YearText.equals("")) {
                System.out.println("failed");
            } else {
                System.out.println("Passed");

            }
        });

        this.add(AddBtn);
        AddBtn.setFont(f1);
        AddBtn.setBounds(300, 300, 100, 60);

    }

}
