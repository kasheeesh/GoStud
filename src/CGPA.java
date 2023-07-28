import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.awt.*;

public class CGPA extends JPanel
{


    static JFrame f = new JFrame("CGPA Calculator");



    static JTextField creditprevious = new JTextField();
    static JTextField cgpaprevious = new JTextField();
    static JTextField creditpresent = new JTextField();
    static JTextField gpapresent = new JTextField();

    MaskFormatter format;


    static JFormattedTextField cgpatotal;
    static JTextField credittotal = new JTextField();



    static JButton cal = new JButton("Calculate");
    static JButton reset = new JButton("Reset");
    static JButton back = new JButton("Back");


    public CGPA(){


        setLayout(null);


        creditprevious.setBounds(200,50,200,50);
        creditprevious.setHorizontalAlignment(SwingConstants.CENTER);
        creditprevious.setBorder(BorderFactory.createTitledBorder(""));
        creditprevious.setFont(new Font("Dialog", Font.BOLD, 20));
        add(creditprevious);

        cgpaprevious.setBounds(450,50,200,50);
        cgpaprevious.setHorizontalAlignment(SwingConstants.CENTER);
        cgpaprevious.setBorder(BorderFactory.createTitledBorder(""));
        cgpaprevious.setFont(new Font("Dialog", Font.BOLD, 20));
        add(cgpaprevious);

        creditpresent.setBounds(700,50,200,50);
        creditpresent.setHorizontalAlignment(SwingConstants.CENTER);
        creditpresent.setBorder(BorderFactory.createTitledBorder(""));
        creditpresent.setFont(new Font("Dialog", Font.BOLD, 20));
        add(creditpresent);


        gpapresent.setBounds(950,50,200,50);
        gpapresent.setHorizontalAlignment(SwingConstants.CENTER);
        gpapresent.setBorder(BorderFactory.createTitledBorder(""));
        gpapresent.setFont(new Font("Dialog", Font.BOLD, 20));
        add(gpapresent);



        credittotal.setBounds(450,200,200,150);
        credittotal.setHorizontalAlignment(SwingConstants.CENTER);
        credittotal.setFont(new Font("Dialog", Font.BOLD, 40));
        credittotal.setBorder(BorderFactory.createTitledBorder("Total Credit Unit"));
        credittotal.setBackground(new Color(30,195,245));
        credittotal.setForeground(Color.white);
        add(credittotal);


        try{

            format = new MaskFormatter("#.##");


        }
        catch(Exception ignored){}


        cgpatotal = new JFormattedTextField(format);

        cgpatotal.setBounds(700,200,200,150);
        cgpatotal.setHorizontalAlignment(SwingConstants.CENTER);
        cgpatotal.setFont(new Font("Dialog", Font.BOLD, 40));
        cgpatotal.setBorder(BorderFactory.createTitledBorder("Total CGPA"));
        cgpatotal.setBackground(new Color(30,195,245));
        cgpatotal.setForeground(Color.white);
        add(cgpatotal);




        cal.setBounds(300,430,200,100);
        add(cal);

        cal.addActionListener(e -> {


            float crprevious = Float.parseFloat(creditprevious.getText());
            float cgprevious = Float.parseFloat(cgpaprevious.getText());
            float crpresent = Float.parseFloat(creditpresent.getText());
            float gpresent = Float.parseFloat(gpapresent.getText());


            float prevquality = crprevious * cgprevious;
            float presquality = crpresent * gpresent;
            float totalquality = prevquality + presquality;

            float totalcredit = crprevious + crpresent;

            float finalcgpa = totalquality/totalcredit;



            credittotal.setText(totalcredit + "");

            cgpatotal.setText(finalcgpa + "");




        });


        reset.setBounds(550,430,200,100);
        add(reset);


        back.setBounds(800,430,200,100);
        add(back);

        back.addActionListener(e -> {


            f.setVisible(false);
            new Menu2();

        });



        setBackground(Color.white);
        setBounds(0,0,f.getWidth(), f.getHeight());


        f.add(this);

        f.setSize(1350,750);

        f.setVisible(true);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);



    }



    public void paintComponent(Graphics g){

        super.paintComponent(g);

        g.setFont(new Font("Calibri", Font.BOLD, 20));

        g.drawString("Previous total credit Unit", 220,140);
        g.drawString("Previous CGPA", 500,140);
        g.drawString("Credit unit Present semester", 715,140);
        g.drawString("Present GPA", 1000,140);


    }




    public static void main(String[] g){



        try{
            for(javax.swing.UIManager.LookAndFeelInfo info: javax.swing.UIManager.getInstalledLookAndFeels()){


                if("Nimbus".equals(info.getName())){


                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;


                }



            }
        }
        catch(Exception ignored){}





        new CGPA();

    }

}
