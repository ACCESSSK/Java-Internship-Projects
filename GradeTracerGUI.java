import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import java.util.ArrayList;


class GradeInfo implements ActionListener
{
    public JFrame fobj;
    public JLabel Heading;
    public JLabel Name;
    public JLabel RollNo;
    public JTextField NField,RField;
    public JLabel English,Science,Maths,History,Hindi;
    public JTextField S1,S2,S3,S4,S5;
    public JButton Calculate,Reset,Exit,OK;
    public JLabel Namelabel,Rolllabel,Displaylabel;
    public JTextArea Displayarea;
    public JLabel  Stats,Average,Minimum,Maximum,Total,Grade;
    
    public GradeInfo(String title, int width, int height)
    {
        fobj = new JFrame();
        fobj.getContentPane().setBackground(new Color(200,220,240));

        //Heading
        Heading  = new JLabel("GRADE TRACER APPLICATION",SwingConstants.CENTER);
        Heading.setForeground(Color.YELLOW);
        Heading.setOpaque(true);
        Heading.setBackground(new Color(128,0, 0));
        Heading.setBounds(0,0,495,50);
        Heading.setFont(new Font("verdana",Font.BOLD,20));

        //Unique ID's
        Name = new JLabel("Name :");
        Name.setBounds(70,40,70,70);
        Name.setFont(new Font("Arial",Font.BOLD,16));
        Name.setForeground(Color.BLACK);

        RollNo = new JLabel("Roll No :");
        RollNo.setBounds(250, 40, 70, 70);
        RollNo.setFont(new Font("Arial",Font.BOLD,16));
        RollNo.setForeground(Color.BLACK);

        //t
        NField = new JTextField();
        NField.setBounds(130, 60, 100, 30);

        RField = new JTextField();
        RField.setBounds(320, 60, 50, 30);
        
        //Name Of subjects
        English = new JLabel("English  :");
        English.setBounds(130,85,100,70);
        English.setFont(new Font("Arial",Font.BOLD,16));
        English.setForeground(Color.BLACK);

        Science = new JLabel("Science  :");
        Science.setBounds(130,135,100,70);
        Science.setFont(new Font("Arial",Font.BOLD,16));
        Science.setForeground(Color.BLACK);

        Maths = new JLabel("Maths  :");
        Maths.setBounds(130,185,100,70);
        Maths.setFont(new Font("Arial",Font.BOLD,16));
        Maths.setForeground(Color.BLACK);

        History = new JLabel("History  :");
        History.setBounds(130,235,100,70);
        History.setFont(new Font("Arial",Font.BOLD,16));
        History.setForeground(Color.BLACK);

         Hindi = new JLabel("Hindi  :");
        Hindi.setBounds(130,285,100,70);
        Hindi.setFont(new Font("Arial",Font.BOLD,16));
        Hindi.setForeground(Color.BLACK);


        // TextFields
        S1 = new JTextField();
        S1.setBounds(260,110,50,30);
        S1.setEnabled(false);

        S2 = new JTextField();
        S2.setBounds(260,160,50,30);
        S2.setEnabled(false);
        S3 = new JTextField();
        S3.setBounds(260,210,50,30);
        S3.setEnabled(false);

        S4 = new JTextField();
        S4.setBounds(260,260,50,30);
        S4.setEnabled(false);

        S5 = new JTextField();
        S5.setBounds(260,310,50,30);
        S5.setEnabled(false);
        
        //Buttons
        OK = new JButton("OK");
        OK.setBounds(380,60,70,30);

        Calculate = new JButton("Calculate");
        Calculate.setBounds(90, 350, 100, 30);

        Reset = new JButton("Reset");
        Reset.setBounds(250,350,100,30);

        Exit = new JButton("Exit");
        Exit.setBounds(400,510,70,30);
        
        //Display Area
        Stats = new JLabel("");
        Stats.setBounds(10, 390, 500, 30);
        Stats.setFont(new Font("Verdana",Font.BOLD,16));

        Namelabel = new JLabel("");
        Namelabel.setBounds(70, 410, 250, 30);
        Namelabel.setFont(new Font("verdana",Font.BOLD,12));
    
        Rolllabel = new JLabel("");
        Rolllabel.setBounds(250, 410, 250, 30);
        Rolllabel.setFont(new Font("Verdana",Font.BOLD,12));


        Average = new JLabel("");
        Average.setBounds(70, 430, 250, 30);
        Average.setFont(new Font("verdana",Font.BOLD,12));

        Minimum = new JLabel("");
        Minimum.setBounds(70, 450, 250, 30);
        Minimum.setFont(new Font("verdana",Font.BOLD,12));

        Maximum = new JLabel("");
        Maximum.setBounds(70, 470, 250, 30);
        Maximum.setFont(new Font("Verdana",Font.BOLD,12));

        Total = new JLabel("");
        Total.setBounds(250, 430, 250, 30);
        Total.setFont(new Font("verdana",Font.BOLD,12));

        Grade = new JLabel("");
        Grade.setBounds(250, 450, 250, 30);
        Grade.setFont(new Font("verdana",Font.BOLD,12));

        Displaylabel = new JLabel("");
        Displaylabel.setBounds(30, 505, 400, 30);
        Displaylabel.setFont(new Font("verdana",Font.BOLD,13));

       
        //Heading
        fobj.add(Heading,BorderLayout.NORTH);
        //Adding Info
        fobj.add(Name);
        fobj.add(RollNo);
        fobj.add(NField);
        fobj.add(RField);
        fobj.add(OK);
        //Adding Subject Names
        fobj.add(English);
        fobj.add(Science);
        fobj.add(Maths);
        fobj.add(History);
        fobj.add(Hindi);

        //Adding Textfields
        fobj.add(S1);
        fobj.add(S2);
        fobj.add(S3);
        fobj.add(S4);
        fobj.add(S5);

        //Adding buttons
        fobj.add(Calculate);
        fobj.add(Reset);
        fobj.add(Exit);

        //Display Lables
        fobj.add(Stats);
        fobj.add(Namelabel);
        fobj.add(Rolllabel);
        fobj.add(Displaylabel);
        fobj.add(Average);
        fobj.add(Minimum);
        fobj.add(Maximum);
        fobj.add(Total);
        fobj.add(Grade);
        
        //Window layout
        fobj.setLayout(null);

        fobj.setTitle(title);
        fobj.setSize(width,height);
        fobj.setVisible(true);
        fobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Actions
        OK.addActionListener(this);
        Calculate.addActionListener(this);
        Reset.addActionListener(this);
        Exit.addActionListener(this);
    }

    public void actionPerformed(ActionEvent act1)
    {
        String N1 = NField.getText();
        int Rn = Integer.parseInt(RField.getText());

        //OK Button Action
        if (act1.getSource() == OK) 
        {   
            S1.setEnabled(true);
            S2.setEnabled(true);                                        
            S3.setEnabled(true);
            S4.setEnabled(true);
            S5.setEnabled(true);
        }
        //Calculat Button Action
        if (act1.getSource() == Calculate) 
        {
            try
            {
                ArrayList<Integer> Marks = new ArrayList<>();   
                Marks.add(Integer.parseInt(S1.getText()));
                Marks.add(Integer.parseInt(S2.getText()));
                Marks.add(Integer.parseInt(S3.getText()));
                Marks.add(Integer.parseInt(S4.getText()));
                Marks.add(Integer.parseInt(S5.getText()));

                int sum = 0;
                int min = Marks.get(0);
                int max = Marks.get(0);
                for(int total :Marks)
                {
                    sum += total;
                    if (total < min) 
                    {   
                        min = total;
                    }
                    if (total > max) 
                    {
                        max = total;
                    }
                }

                double Avg = sum / (double)Marks.size();
                String grd;
                if(Avg > 90 && Avg <= 100)
                {
                    grd = "'O' Grade.";  
                }
                else if (Avg >= 80 && Avg < 90) 
                {
                    grd = "'A' Grade.";    
                }
                else if (Avg >= 70 && Avg < 80) 
                {
                    grd = "'B' Grade.";  
                }
                else if (Avg >= 60 && Avg <70) 
                {
                    grd = "'C' Grade.";  
                }
                else if (Avg > 35 && Avg <= 59) 
                {
                    grd = "'D' Grade.";  
                }
                else
                {
                    grd = "Fail...";  
                }

                Stats.setText("-------------------------Result-------------------------");
                Namelabel.setText("Name: " +N1);
                Rolllabel.setText("RollNo: "+Rn);


                Average.setText("Average is: "+String.format("%.2f",Avg));
                Minimum.setText("Minimum is: "+min);
                Maximum.setText("Maximum is: "+max);
                Total.setText("Total: "+sum+"/500");
                Grade.setText("Grade: "+grd);
                Displaylabel.setText(""+N1+" is Scored "+sum+" Marks And Achieved "+grd+"");
                if (Avg < 35) 
                { 
                    Displaylabel.setText(""+N1+" is Failed This Exam. Better Luck Next Time!");
                    
                }

            }
            catch(NumberFormatException e)
            {
                JOptionPane.showMessageDialog(fobj,"Please Enter Valid Marks In All Subject Fields!");
            }

        }
        //Reset Button Action
        if (act1.getSource() == Reset) 
        {
            NField.setText(null);
            RField.setText(null);
            S1.setText(null);
            S2.setText(null);
            S3.setText(null);
            S4.setText(null);
            S5.setText(null);

            Stats.setText(null);
            Namelabel.setText(null);
            Rolllabel.setText(null);
            Displaylabel.setText(null);
            Average.setText(null);
            Minimum.setText(null);
            Maximum.setText(null);
            Total.setText(null);
            Grade.setText(null);

        }
        //Exit Button Action
        if (act1.getSource() == Exit) 
        {
            System.exit(0);
        }
            

    }
}

//Main Function
class GradeTracerGUI 
{
    public static void main(String a[]) 
    {
        GradeInfo gobj = new GradeInfo("Student Grade Tracer.",500,600);

    }
    
}
