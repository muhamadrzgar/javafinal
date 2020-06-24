package oopexample3;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.EmptyBorder;

public class OopExample3 extends JFrame {

    private JPanel contentPane;
    private JTextField fnamtext;
    private JTextField lnametext;
    private JComboBox address;
    JRadioButton option1 = new JRadioButton("Male");
    JRadioButton option2 = new JRadioButton("Female");
    JCheckBox check1 = new JCheckBox();

 
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    OopExample3 frame = new OopExample3();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

 
    public OopExample3() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 659, 500);
        contentPane = new JPanel();
        contentPane.setBackground(Color.PINK);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("Student Registaration Form");
        lblNewLabel.setBackground(Color.LIGHT_GRAY);
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setBounds(190, 22, 262, 20);
        contentPane.add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("First Name");
        lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
        lblNewLabel_1.setBounds(135, 73, 87, 20);
        contentPane.add(lblNewLabel_1);

        JLabel lblLastName = new JLabel("Last Name");
        lblLastName.setFont(new Font("Tahoma", Font.BOLD, 13));
        lblLastName.setBounds(135, 111, 87, 20);
        contentPane.add(lblLastName);

        JLabel lblAddess = new JLabel("Addess");
        lblAddess.setFont(new Font("Tahoma", Font.BOLD, 13));
        lblAddess.setBounds(135, 149, 87, 20);
        contentPane.add(lblAddess);

        JLabel lblMobileno = new JLabel("Gender");
        lblMobileno.setFont(new Font("Tahoma", Font.BOLD, 13));
        lblMobileno.setBounds(135, 190, 87, 20);
        contentPane.add(lblMobileno);

        fnamtext = new JTextField();
        fnamtext.setBounds(258, 74, 211, 27);
        contentPane.add(fnamtext);
        fnamtext.setColumns(10);

        lnametext = new JTextField();
        lnametext.setBounds(258, 112, 211, 27);
        contentPane.add(lnametext);
        lnametext.setColumns(10);

        address = new JComboBox();
        address.addItem("-Select your city-");
        address.addItem("Sulaymaniyah");
        address.addItem("Erbil");
        address.addItem("Dhouk");
        address.addItem("Helebje");
        address.addItem("Kirkuk");

        address.setBounds(258, 150, 211, 27);
        contentPane.add(address);

        option1.setBounds(258, 191, 211, 27);
        contentPane.add(option1);

        option2.setBounds(258, 221, 290, 27);
        contentPane.add(option2);

        check1.setText("I agree to the Terms and Conditions");
        check1.setFont(new Font("Tahoma", Font.BOLD, 13));
        check1.setBounds(258, 271, 211, 25);
        contentPane.add(check1);

        JButton submitbutton = new JButton("Submit");

        submitbutton.setFont(new Font("Batang", Font.BOLD, 18));
        submitbutton.setBounds(141, 389, 132, 38);
        contentPane.add(submitbutton);

    }
}
