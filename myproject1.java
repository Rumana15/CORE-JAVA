import javax.swing.*;

import java.awt.*;

import javax.swing.border.BevelBorder;
import javax.swing.border.Border;

import javax.swing.border.MatteBorder;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



class create_frame{
    static JFrame f1= new JFrame("MY JAVA PROJECT");



    private create_frame()
    {

    }
    public static JFrame getframe()
    {
        return f1;
    }

}






interface Acl1{

}

class demo1 implements Acl1
{

    Checkbox checkBox1,checkBox2;
    Label label;

    JFrame f1= create_frame.getframe();


    demo1(int a,int b)

    {

        f1.setSize(6000,2095);

        f1.setVisible(true);
        f1.setLayout(null);
       

        JLabel l1= new JLabel("XYZ COLLEGE OF ENGINEERING");
        JLabel l2= new JLabel("Student Information form");
        l1.setLayout(new BorderLayout());

        l1.setHorizontalAlignment(JLabel.CENTER);
        l1.setVerticalAlignment(JLabel.CENTER);
        l1.setFont(new Font("Ariel",Font.PLAIN,16));

        l1.setSize(300,20);
        l1.setLocation(500,5);


        l2.setFont(new Font("Ariel",Font.PLAIN,15));
        l2.setHorizontalAlignment(JLabel.CENTER);
        l2.setVerticalAlignment(JLabel.CENTER);

        l2.setSize(400,20);
        l2.setLocation(440,50);





        JLabel l3= new JLabel("Name Of The Student:");
        l3.setFont(new Font("Ariel",Font.PLAIN,12));
        l3.setHorizontalAlignment(JLabel.CENTER);
        l3.setVerticalAlignment(JLabel.CENTER);
        l3.setSize(150,26);
        l3.setLocation(30,100);


        Border SoftBevelLowered = BorderFactory.createSoftBevelBorder(BevelBorder.RAISED);
        l3.setBorder(SoftBevelLowered);

        JTextField Tf1= new JTextField();
        Tf1.setSize(100,18);
        Tf1.setHorizontalAlignment(JTextField.CENTER);
        Tf1.setLocation(215,105);



        JLabel l20= new JLabel("Gender:");
        l20.setFont(new Font("Ariel",Font.PLAIN,12));
        l20.setHorizontalAlignment(JLabel.CENTER);
        l20.setVerticalAlignment(JLabel.CENTER);
        l20.setSize(60,26);
        l20.setLocation(340,97);
        l20.setBorder(BorderFactory.createSoftBevelBorder(BevelBorder.RAISED));




        JLabel l4= new JLabel("Department:");
        l4.setFont(new Font("Ariel",Font.PLAIN,13));
        l4.setHorizontalAlignment(JLabel.CENTER);
        l4.setVerticalAlignment(JLabel.CENTER);

        l4.setSize(150,26);
        l4.setLocation(30,130);
        l4.setBorder(BorderFactory.createSoftBevelBorder(BevelBorder.RAISED));

        Choice c1= new Choice();
        c1.setBounds(100,100,75,75);
        c1.setLocation(210,134);


        c1.add("CSE");
        c1.add("IT");
        c1.add("ECE");
        c1.add("EEE");
        c1.add("MECHT");
        c1.add("MECH");
        c1.add("CIVIL");
        c1.add("AI & DS");
        c1.add("EIE");
        c1.add("CE");
        c1.add("BME");
        c1.add("CSBS");

        JLabel l14= new JLabel("Slot:");
        l14.setFont(new Font("Ariel",Font.PLAIN,13));
        l14.setHorizontalAlignment(JLabel.CENTER);
        l14.setVerticalAlignment(JLabel.CENTER);

        l14.setSize(40,26);
        l14.setLocation(290,130);
        l14.setBorder(BorderFactory.createSoftBevelBorder(BevelBorder.RAISED));

        Choice c2= new Choice();
        c2.setBounds(100,100,75,75);
        c2.setLocation(350,134);


        c2.add("A");
        c2.add("B");

        JLabel l21= new JLabel("Year:");
        l21.setFont(new Font("Ariel",Font.PLAIN,13));
        l21.setHorizontalAlignment(JLabel.CENTER);
        l21.setVerticalAlignment(JLabel.CENTER);

        l21.setSize(40,26);
        l21.setLocation(440,130);
        l21.setBorder(BorderFactory.createSoftBevelBorder(BevelBorder.RAISED));

        Choice c3= new Choice();
        c3.setBounds(100,100,75,75);
        c3.setLocation(490,134);


        c3.add("I");
        c3.add("II");
        c3.add("III");
        c3.add("IV");

        ButtonGroup bg= new ButtonGroup();

        JRadioButton rb1 = new JRadioButton("Male");
        JRadioButton rb2 = new JRadioButton("Female");
        bg.add(rb1);
        bg.add(rb2);

        rb1.setBounds(75,50,80,30);
        rb1.setLocation(410,96);
        rb1.setSelected(true);
        rb2.setBounds(75,50,80,30);
        rb2.setLocation(490,96);
        rb2.setSelected(false);
        f1.add(rb1);
        f1.add(rb2);
        f1.setSize(1000,1000);
        f1.setLayout(null);

        f1.show();




        JLabel l5= new JLabel("Date Of Birth:");
        l5.setFont(new Font("Ariel",Font.PLAIN,13));
        l5.setHorizontalAlignment(JLabel.CENTER);
        l5.setVerticalAlignment(JLabel.CENTER);

        l5.setSize(150,26);
        l5.setLocation(30,160);
        l5.setBorder(BorderFactory.createSoftBevelBorder(BevelBorder.RAISED));

        String[] option1 = { "A","B","C","D","E" };
        JComboBox box1 = new JComboBox(option1);
        box1.setLocation(260,164);
        String[] option2 = {"1","2","3","4","5"};
        JComboBox box2 = new JComboBox(option2);
        box2.setLocation(342,164);
        Panel panel1 = new Panel();
        panel1.add(box1);
        Panel panel2 = new Panel();
        panel2.add(box2);
        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, panel1, panel2);
        f1.getContentPane().add(splitPane);

        f1.add(box1);
        f1.add(box2);

        JLabel l6= new JLabel("Father's Name:");
        l6.setFont(new Font("Ariel",Font.PLAIN,13));
        l6.setHorizontalAlignment(JLabel.CENTER);
        l6.setVerticalAlignment(JLabel.CENTER);

        l6.setSize(150,26);
        l6.setLocation(30,210);
        l6.setBorder(BorderFactory.createSoftBevelBorder(BevelBorder.RAISED));

        JTextField Tf2= new JTextField();
        Tf2.setSize(100,18);
        Tf2.setHorizontalAlignment(JTextField.CENTER);
        Tf2.setLocation(215,215);

        JLabel l7= new JLabel("Father's Occupation:");
        l7.setFont(new Font("Ariel",Font.PLAIN,13));
        l7.setHorizontalAlignment(JLabel.CENTER);
        l7.setVerticalAlignment(JLabel.CENTER);

        l7.setSize(150,26);
        l7.setLocation(330,210);
        l7.setBorder(BorderFactory.createSoftBevelBorder(BevelBorder.RAISED));

        JTextField Tf3= new JTextField();
        Tf3.setSize(100,18);
        Tf3.setHorizontalAlignment(JTextField.CENTER);
        Tf3.setLocation(510,215);

        JLabel l8= new JLabel("Mother's Name:");
        l8.setFont(new Font("Ariel",Font.PLAIN,13));
        l8.setHorizontalAlignment(JLabel.CENTER);
        l8.setVerticalAlignment(JLabel.CENTER);

        l8.setSize(150,26);
        l8.setLocation(30,250);
        l8.setBorder(BorderFactory.createSoftBevelBorder(BevelBorder.RAISED));

        JTextField Tf4= new JTextField();
        Tf4.setSize(100,18);
        Tf4.setHorizontalAlignment(JTextField.CENTER);
        Tf4.setLocation(215,255);



        JLabel l9= new JLabel("Mother's Occupation:");
        l9.setFont(new Font("Ariel",Font.PLAIN,13));
        l9.setHorizontalAlignment(JLabel.CENTER);
        l9.setVerticalAlignment(JLabel.CENTER);

        l9.setSize(150,26);
        l9.setLocation(330,249);
        l9.setBorder(BorderFactory.createSoftBevelBorder(BevelBorder.RAISED));

        JTextField Tf5= new JTextField();
        Tf5.setSize(100,18);
        Tf5.setHorizontalAlignment(JTextField.CENTER);
        Tf5.setLocation(510,255);

        JLabel l10= new JLabel("Nationality:");
        l10.setFont(new Font("Ariel",Font.PLAIN,13));
        l10.setHorizontalAlignment(JLabel.CENTER);
        l10.setVerticalAlignment(JLabel.CENTER);

        l10.setSize(150,26);
        l10.setLocation(30,280);
        l10.setBorder(BorderFactory.createSoftBevelBorder(BevelBorder.RAISED));

        JTextField Tf6= new JTextField();
        Tf6.setSize(100,18);
        Tf6.setHorizontalAlignment(JTextField.CENTER);
        Tf6.setLocation(215,284);


        JLabel l11= new JLabel("Mobile No:");
        l11.setFont(new Font("Ariel",Font.PLAIN,13));
        l11.setHorizontalAlignment(JLabel.CENTER);
        l11.setVerticalAlignment(JLabel.CENTER);

        l11.setSize(150,26);
        l11.setLocation(30,310);
        l11.setBorder(BorderFactory.createSoftBevelBorder(BevelBorder.RAISED));


        JTextField Tf7= new JTextField();
        Tf7.setSize(100,18);
        Tf7.setHorizontalAlignment(JTextField.CENTER);
        Tf7.setLocation(215,315);


        JLabel l12= new JLabel("SSLC Score:");
        l12.setFont(new Font("Ariel",Font.PLAIN,13));
        l12.setHorizontalAlignment(JLabel.CENTER);
        l12.setVerticalAlignment(JLabel.CENTER);

        l12.setSize(150,26);
        l12.setLocation(30,340);
        l12.setBorder(BorderFactory.createSoftBevelBorder(BevelBorder.RAISED));

        JTextField Tf8= new JTextField();
        Tf8.setSize(100,18);
        Tf8.setHorizontalAlignment(JTextField.CENTER);
        Tf8.setLocation(215,344);


        JLabel l13= new JLabel("HSE Score:");
        l13.setFont(new Font("Ariel",Font.PLAIN,13));
        l13.setHorizontalAlignment(JLabel.CENTER);
        l13.setVerticalAlignment(JLabel.CENTER);

        l13.setSize(150,26);
        l13.setLocation(30,370);
        l13.setBorder(BorderFactory.createSoftBevelBorder(BevelBorder.RAISED));

        JTextField Tf9= new JTextField();
        Tf9.setSize(100,18);
        Tf9.setHorizontalAlignment(JTextField.CENTER);
        Tf9.setLocation(215,374);


        JLabel l15= new JLabel("Cut Off Marks:");
        l15.setFont(new Font("Ariel",Font.PLAIN,13));
        l15.setHorizontalAlignment(JLabel.CENTER);
        l15.setVerticalAlignment(JLabel.CENTER);

        l15.setSize(150,26);
        l15.setLocation(30,400);
        l15.setBorder(BorderFactory.createSoftBevelBorder(BevelBorder.RAISED));

        JTextField Tf10= new JTextField();
        Tf10.setSize(100,18);
        Tf10.setHorizontalAlignment(JTextField.CENTER);
        Tf10.setLocation(215,403);

        JLabel l16= new JLabel("Residential Address:");
        l16.setFont(new Font("Ariel",Font.PLAIN,13));
        l16.setHorizontalAlignment(JLabel.CENTER);
        l16.setVerticalAlignment(JLabel.CENTER);

        l16.setSize(150,26);
        l16.setLocation(30,430);
        l16.setBorder(BorderFactory.createSoftBevelBorder(BevelBorder.RAISED));

        JTextField Tf11= new JTextField();
        Tf11.setSize(100,18);
        Tf11.setHorizontalAlignment(JTextField.CENTER);
        Tf11.setLocation(215,435);

        JLabel l17= new JLabel("Year of Passing 12th:");
        l17.setFont(new Font("Ariel",Font.PLAIN,13));
        l17.setHorizontalAlignment(JLabel.CENTER);
        l17.setVerticalAlignment(JLabel.CENTER);

        l17.setSize(150,26);
        l17.setLocation(30,463);
        l17.setBorder(BorderFactory.createSoftBevelBorder(BevelBorder.RAISED));

        JTextField Tf12= new JTextField();
        Tf12.setSize(100,18);
        Tf12.setHorizontalAlignment(JTextField.CENTER);
        Tf12.setLocation(215,467);

        JLabel l18= new JLabel("Email ID:");
        l18.setFont(new Font("Ariel",Font.PLAIN,13));
        l18.setHorizontalAlignment(JLabel.CENTER);
        l18.setVerticalAlignment(JLabel.CENTER);

        l18.setSize(150,26);
        l18.setLocation(30,500);
        l18.setBorder(BorderFactory.createSoftBevelBorder(BevelBorder.RAISED));


        JTextField Tf13= new JTextField();
        Tf13.setSize(300,18);
        Tf13.setHorizontalAlignment(JTextField.CENTER);
        Tf13.setLocation(215,505);




        JLabel l22= new JLabel("DD");
        l22.setFont(new Font("Ariel",Font.PLAIN,13));
        l22.setHorizontalAlignment(JLabel.CENTER);
        l22.setVerticalAlignment(JLabel.CENTER);

        l22.setSize(25,24);
        l22.setLocation(209,162);
        l22.setBorder(BorderFactory.createSoftBevelBorder(BevelBorder.RAISED));

        JTextField tf200= new JTextField();
        tf200.setSize(30,18);
        tf200.setHorizontalAlignment(JTextField.CENTER);
        tf200.setLocation(245,166);
        f1.add(tf200);


        JLabel l23= new JLabel("MM");
        l23.setFont(new Font("Ariel",Font.PLAIN,13));
        l23.setHorizontalAlignment(JLabel.CENTER);
        l23.setVerticalAlignment(JLabel.CENTER);

        JTextField tf201= new JTextField();
        tf201.setSize(38,18);
        tf201.setHorizontalAlignment(JTextField.CENTER);
        tf201.setLocation(342,166);
        f1.add(tf201);

        l23.setSize(35,24);
        l23.setLocation(300,162);
        l23.setBorder(BorderFactory.createSoftBevelBorder(BevelBorder.RAISED));


        JLabel l24= new JLabel("YYYY");
        l24.setFont(new Font("Ariel",Font.PLAIN,13));
        l24.setHorizontalAlignment(JLabel.CENTER);
        l24.setVerticalAlignment(JLabel.CENTER);

        l24.setSize(50,24);
        l24.setLocation(400,162);
        l24.setBorder(BorderFactory.createSoftBevelBorder(BevelBorder.RAISED));

        JTextField tf202= new JTextField();
        tf202.setSize(45,18);
        tf202.setHorizontalAlignment(JTextField.CENTER);
        tf202.setLocation(460,166);
        f1.add(tf202);



        JButton b1 = new JButton("Next");
        b1.setBounds(300,300,80,25);
        b1.setLocation(1100,550);
        b1.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e){

                b1.setLocation(1100,550);
                if(Tf1.getText().isEmpty()|| Tf2.getText().isEmpty() || Tf3.getText().isEmpty() || Tf4.getText().isEmpty() || Tf5.getText().isEmpty() || Tf6.getText().isEmpty() || Tf7.getText().isEmpty() || Tf8.getText().isEmpty() || Tf9.getText().isEmpty() || Tf10.getText().isEmpty() || Tf11.getText().isEmpty() || Tf12.getText().isEmpty() || Tf13.getText().isEmpty() || tf200.getText().isEmpty() ||  tf201.getText().isEmpty() ||  tf202.getText().isEmpty())
                {
                    JOptionPane.showMessageDialog(null, "Please enter text in the required field.", "Error", JOptionPane.ERROR_MESSAGE);


                }

                else{

                    JFrame f2= new JFrame("FRAME 2");
                    f2.setSize(4096,2095);
                    f2.setLayout(null);
                    f2.show();
                    ImageIcon myimage4 = new ImageIcon("C:\\Users\\ruman\\OneDrive\\Documents\\JAVA\\rum9.jpg");
                    JLabel myLabel = new JLabel(myimage4);
                    myLabel.setLayout(new FlowLayout());


                    f2.setContentPane(myLabel);
                    f2.setVisible(true);

                    f2.setLayout(null);
                    f2.show();

                    JLabel l35= new JLabel("Upload your Photo:");
                    l35.setFont(new Font("Ariel",Font.PLAIN,13));
                    l35.setHorizontalAlignment(JLabel.CENTER);
                    l35.setVerticalAlignment(JLabel.CENTER);



                    l35.setSize(200,24);
                    l35.setLocation(250,92);
                    l35.setBorder(BorderFactory.createSoftBevelBorder(BevelBorder.RAISED));
                    l35.setLayout(null);
                    f2.show();



                    JButton b66= new JButton("Click here to upload");
                    b66.setBounds(300,300,180,28);
                    b66.setLocation(750,90);
                    f2.add(b66);
                    b66.setLayout(null);
                    f2.show();

                    JLabel l79= new JLabel("(Image Format: .jpeg/.jpg/.png)");
                    l79.setFont(new Font("Ariel",Font.PLAIN,13));
                    l79.setHorizontalAlignment(JLabel.CENTER);
                    l79.setVerticalAlignment(JLabel.CENTER);

                    l79.setSize(550,24);
                    l79.setLocation(570,120);
                    f2.add(l79);
                    l79.setLayout(null);
                    f2.show();


                    JLabel l78= new JLabel("(Not more than 2MB)");
                    l78.setFont(new Font("Ariel",Font.PLAIN,13));
                    l78.setHorizontalAlignment(JLabel.CENTER);
                    l78.setVerticalAlignment(JLabel.CENTER);

                    l78.setSize(550,24);
                    l78.setLocation(550,150);
                    f2.add(l78);
                    l78.setLayout(null);
                    f2.show();


                    JLabel l36= new JLabel("In few sentences write why do you want to become a student of our college:");
                    l36.setFont(new Font("Ariel",Font.PLAIN,13));
                    l35.setHorizontalAlignment(JLabel.CENTER);
                    l36.setVerticalAlignment(JLabel.CENTER);

                    l36.setSize(550,24);
                    l36.setLocation(209,250);

                    l36.setLayout(null);
                    f2.show();

                    JLabel l77= new JLabel("(Not more than 100 words)");
                    l77.setFont(new Font("Ariel",Font.PLAIN,13));
                    l77.setHorizontalAlignment(JLabel.CENTER);
                    l77.setVerticalAlignment(JLabel.CENTER);

                    l77.setSize(550,24);
                    l77.setLocation(209,270);
                    f2.add(l77);
                    l77.setLayout(null);
                    f2.show();

                    JTextArea ta33= new JTextArea();
                    ta33.setFont(new Font("Sans-serif",Font.PLAIN,13));
                    ta33.setBounds(100,30,320,150);
                    ta33.setLocation(700,250);

                    ta33.setLayout(null);
                    f2.show();

                    JCheckBox cb21= new JCheckBox("I Accept all the terms and conditions");
                    cb21.setBounds(150,100,253,50);
                    cb21.setLocation(350,410);
                    cb21.setLayout(null);
                    f2.show();

                    JButton b22= new JButton("SUBMIT");
                    b22.setBounds(300,300,80,25);
                    b22.setLocation(850,550);
                    f2.add(l35);
                    f2.add(l36);
                    f2.add(ta33);
                    f2.add(cb21);
                    f2.add(b22);



                    b22.addActionListener(new ActionListener() {

                        public void actionPerformed(ActionEvent e)
                        {

                            if(!ta33.getText().isEmpty() && cb21.isSelected())
                            {

                                if (e.getSource() == b22)
                                {


                                    JOptionPane.showMessageDialog(null, "Submission Successful",
                                            "INFORMATION",
                                            JOptionPane.INFORMATION_MESSAGE);
                                }



                            }}} );
                }}});




        JButton b2 = new JButton("Show Result");

        b2.setLocation(1050,106);
        b2.setSize(150,15);
        b2.setLayout(null);

        f1.add(b2);
        JTextArea ta1= new JTextArea("For Day scholar:\n Semester Fee:Rs.20,000-/-\n Development fee:Rs.5,000-/-\n Internet Fee:Rs.1,000-/-\n Lab Contigencies: Rs.1,000-/-\n Placement training fee: Rs.1500-/-");
        ta1.setFont(new Font("Sans-serif",Font.PLAIN,13));
        ta1.setVisible(false);
        ta1.setBounds(100,30,220,150);
        ta1.setLocation(720,150);
        ta1.setEditable(false);
        ta1.setLayout(null);


        JTextArea ta2= new JTextArea("For Hosteller:\n Semester Fee:Rs.20,000-/-\n Hostel Accomondation: Rs.50,000-/-\n Mess Fee:Rs.30,000-/-\n Development fee:Rs.5,000-/-\n Internet Fee:Rs.1,000-/-\n Lab Contigencies: Rs.1,000-/-\n Placement training fee: Rs.1500-/-");
        ta2.setFont(new Font("Sans-serif",Font.PLAIN,13));

        ta2.setLocation(950,150);
        ta2.setSize(220,150);
        ta2.setVisible(false);
        ta2.setEditable(false);
        ta2.setLayout(null);
        f1.add(ta1);
        f1.add(ta2);
        b2.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e)
            {

                ta1.setVisible(true);
                ta2.setVisible(true);



            }
        });


        JLabel l25= new JLabel("Scholarships:(Choose the eligibility)");
        l25.setFont(new Font("Ariel",Font.PLAIN,13));
        l25.setHorizontalAlignment(JLabel.CENTER);
        l25.setVerticalAlignment(JLabel.CENTER);

        l25.setSize(250,24);
        l25.setLocation(720,400);
        l25.setBorder(BorderFactory.createSoftBevelBorder(BevelBorder.RAISED));
        f1.add(l25);





        Choice c4= new Choice();
        c4.setBounds(100,100,200,75);
        c4.setLocation(1000,400);
        c4.add("Pragathi (for female)");
        c4.add("Vidyadhan Scholarship");
        c4.add("Merit Scholarship");
        c4.add("HGI Alumni Scholarship");
        c4.add("TN Govt Ist Grad. Scholarship");
        c4.add("Post Metric Scholarship");
        c4.add("Differently abled");


        JLabel l26= new JLabel("Suggestions for the betterment of the institution:");
        l26.setFont(new Font("Ariel",Font.PLAIN,13));
        l26.setHorizontalAlignment(JLabel.CENTER);
        l26.setVerticalAlignment(JLabel.CENTER);

        l26.setSize(300,24);
        l26.setLocation(670,450);
        l26.setBorder(BorderFactory.createSoftBevelBorder(BevelBorder.RAISED));
        f1.add(l26);

        JTextArea ta6= new JTextArea();
        ta6.setFont(new Font("Sans-serif",Font.PLAIN,13));
        ta6.setBounds(100,30,220,70);
        ta6.setLocation(1010,450);
        f1.add(ta6);



       



        f1.add(l1);
        f1.add(l2);
        f1.add(l3);
        f1.add(l4);
        f1.add(l5);
        f1.add(l6);
        f1.add(l7);
        f1.add(l8);
        f1.add(l9);
        f1.add(l10);
        f1.add(l11);
        f1.add(c1);
        f1.add(c2);
        f1.add(c3);
        f1.add(c4);
        f1.add(l12);
        f1.add(l13);
        f1.add(l14);
        f1.add(l15);
        f1.add(l16);
        f1.add(l17);
        f1.add(l18);

        f1.add(l20);
        f1.add(l21);
        f1.add(l22);
        f1.add(l23);
        f1.add(l24);

        f1.add(b1);


        f1.add(Tf1);
        f1.add(Tf2);
        f1.add(Tf3);
        f1.add(Tf4);
        f1.add(Tf5);
        f1.add(Tf6);
        f1.add(Tf7);
        f1.add(Tf8);
        f1.add(Tf9);
        f1.add(Tf10);
        f1.add(Tf11);
        f1.add(Tf12);
        f1.add(Tf13);



        f1.setLayout(null);
    }




















    demo1(String S)

    {
        ButtonGroup bg= new ButtonGroup();

        JRadioButton rb1 = new JRadioButton("Male");
        JRadioButton rb2 = new JRadioButton("Female");
        bg.add(rb1);
        bg.add(rb2);

        rb1.setBounds(75,50,80,30);
        rb1.setLocation(410,96);
        rb1.setSelected(true);
        rb2.setBounds(75,50,80,30);
        rb2.setLocation(490,96);
        rb2.setSelected(false);
        f1.add(rb1);
        f1.add(rb2);
        f1.setSize(1000,1000);
        f1.setLayout(null);

        f1.show();

    }



    demo1(boolean p, boolean q)
    {

        JCheckBox cb1= new JCheckBox("The above information are true to my knowledge");
        cb1.setBounds(150,100,50,50);
        cb1.setLocation(70,700);
        cb1.setSelected(true);
        f1.add(cb1);
        f1.show();
        f1.setLayout(null);
    }



    demo1(double c,double d)

    {
        ButtonGroup bg7= new ButtonGroup();
        JRadioButton rb00= new JRadioButton("DayScholar");
        rb00.setBounds(150,100,150,50);
        rb00.setLocation(750,87);
        bg7.add(rb00);
        f1.add(rb00);
        f1.show();
        f1.setLayout(null);



        JRadioButton rb01= new JRadioButton ("Hosteller");
        rb01.setBounds(150,100,150,50);
        rb01.setLocation(900,87);
        bg7.add(rb01);
        f1.add(rb01);
        f1.show();
        f1.setLayout(null);




    }

}














public class myproject1
{




    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("MY JAVA PROJECT");
            frame.setSize(4096, 2095);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


            ImageIcon myimage = new ImageIcon("C:\\Users\\ruman\\OneDrive\\Documents\\JAVA\\rum7.jpg");


            JLabel myLabel = new JLabel(myimage);
            myLabel.setLayout(new FlowLayout());


            frame.setContentPane(myLabel);

            frame.setVisible(true);

            frame.setLayout(null);
            frame.show();

            JLabel l300= new JLabel("Welcome!");
            l300.setFont(new Font("SERIF",Font.BOLD,40));
            l300.setHorizontalAlignment(JLabel.CENTER);
            l300.setVerticalAlignment(JLabel.CENTER);
    
            l300.setSize(200,40);
            l300.setLocation(550,130);
            l300.setBorder(BorderFactory.createSoftBevelBorder(BevelBorder.RAISED));
             frame.add(l300);
             frame.setLayout(null);
            frame.show();

            Panel p1= new Panel(new GridLayout(5,1));
            p1.setBounds(500,190,300,250);
            p1.setBackground(Color.WHITE);
            frame.add(p1);
            //p1.setBorder(BorderFactory.createEmptyBorder(100, 100, 100, 100));


            Panel p2= new Panel();
            //

            p2.setBounds(500,190,250,100);
            p2.setBackground(Color.WHITE);
            Panel p3 = new Panel(new GridLayout(2,4,20,10));
            //

            p3.setBounds(500,190,250,100);
            p3.setBackground(Color.WHITE);

            Panel p4= new Panel(new GridLayout(2,1));
            //
            p3.setBounds(500,190,250,100);
            p4.setBackground(Color.WHITE);
            
            Panel p5= new Panel(new GridLayout(1,1,30,30));
            p3.setBounds(500,190,250,100);
            p5.setBackground(Color.WHITE);

            JTextField user_tb= new JTextField();
            user_tb.setSize(100,100);
         //   String userValue1 = user_tb.getText();

            JTextField pass_tb= new JTextField();
            pass_tb.setSize(100,100);
          //  String userValue2 = pass_tb.getText();

            JLabel l90= new JLabel("LOGIN PAGE");
            l90.setFont(new Font("Sans-serif",Font.BOLD,20));
            l90.setHorizontalAlignment(JLabel.CENTER);
            l90.setVerticalAlignment(JLabel.CENTER);

            l90.setSize(200,300);
            l90.setLocation(500,250);
            l90.setVisible(true);

            l90.setLayout(null);

            JLabel l91= new JLabel("Dont have an account?");
            l91.setFont(new Font("Ariel",Font.BOLD,10));
            l91.setHorizontalAlignment(JLabel.CENTER);
            l91.setVerticalAlignment(JLabel.CENTER);


            l91.setLocation(600,300);


            JButton button = new JButton("Sign up");
            button.setBounds(300,300,10,10);
            button.setLocation(500,600);

            button.setLayout(null);

            JButton b100= new JButton("NEXT");
            b100.setBounds(300,300,100,28);
            b100.setLocation(800,500);

            b100.addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent e){


            if( user_tb.getText().equals("java1@gmail.com") && pass_tb.getText().equals("java1"))
            {
                frame.dispose();

                new demo1(4,6);
                

                demo1 d3= new demo1 ("Java is a vast programming language");
               demo1 d4= new demo1(false,true);
                 demo1 d5 = new demo1(8.9988,5.6086);


                       
            }}});

            b100.setLayout(null);
            b100.setBackground(Color.PINK);
            frame.add(b100);
            String userValue1 = user_tb.getText();
            String userValue2 = pass_tb.getText();






            JLabel l100= new JLabel("Login ID");
            l100.setFont(new Font("Sans-serif",Font.BOLD,12));
            l100.setHorizontalAlignment(JLabel.CENTER);
            l100.setVerticalAlignment(JLabel.CENTER);

            l100.setSize(250,100);
            l100.setLocation(100,350);

            l100.setBorder(new MatteBorder(1, 1, 1, 1, Color.black));

            JTextField t100= new JTextField();
            t100.setSize(100,100);

            JTextField t101= new JTextField();
            t101.setSize(100,100);


            JLabel l101= new JLabel("Password");
            l101.setFont(new Font("Sans-serif",Font.BOLD,12));
            l101.setHorizontalAlignment(JLabel.CENTER);
            l101.setVerticalAlignment(JLabel.CENTER);

            l101.setSize(200,200);
            l101.setLocation(100,380);

            l101.setBorder(new MatteBorder(1, 1, 1, 1, Color.black));

            JCheckBox cb200 =new JCheckBox("Remember Password");
            cb200.setBounds(150,100,100,20);
            cb200.setLocation(70,700);
            cb200.setSelected(true);
             frame.add(cb200);
            frame.show();
            frame.setLayout(null);

            p3.add(l100);
            p4.add(l91);
            p2.add(l90);
            p3.add(l101);
            p1.add(p2);
            p1.add(p3);
            p5.add(button);
            p5.add(cb200);
            p1.add(p4);
            
            p1.add(p5);


            p3.add(user_tb);
            p3.add(pass_tb);



        });





     
    }
}
