import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Caller {
    public static void main(String[] args){
        Xyz obj=new Xyz();
    }
}

class Xyz extends JFrame {

    public Xyz() {


        Container d = getContentPane();
        d.setLayout(new BoxLayout(d, BoxLayout.Y_AXIS));
        d.setBackground(new Color(218, 234, 241)); // set background color
        setTitle("GO STUD");
        JLabel title = new JLabel("GO STUD");
        title.setForeground(new Color(10, 77, 104)); // set text color
        title.setFont(new Font("Arial", Font.BOLD, 40)); // set font style and size
        title.setAlignmentX(Component.CENTER_ALIGNMENT);
        d.add(Box.createVerticalStrut(30));
        d.add(title);
        d.add(Box.createVerticalStrut(30));

        JButton b = new JButton("ID Card Generator");
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new MyFrame();
            }
        });
        b.setAlignmentX(Component.CENTER_ALIGNMENT);
        b.setFont(new Font("Arial", Font.BOLD, 16));
        b.setBackground(new Color(232, 160, 191));
        b.setForeground(Color.WHITE);
        d.add(b);
        d.add(Box.createVerticalStrut(10));

        JButton c = new JButton("CGPA Calculator");
        c.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new CGPA();
            }
        });
        c.setAlignmentX(Component.CENTER_ALIGNMENT);
        c.setFont(new Font("Arial", Font.BOLD, 16));
        c.setBackground(new Color(201, 44, 109));
        c.setForeground(Color.WHITE);

        d.add(c);
        d.add(Box.createVerticalStrut(10));

        JButton f = new JButton("Resume Generator");
        f.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new ResumeGenerator();
            }
        });
        f.setAlignmentX(Component.CENTER_ALIGNMENT);
        f.setFont(new Font("Arial", Font.BOLD, 16));
        f.setBackground(new Color(232, 160, 191));
        f.setForeground(Color.WHITE);

        d.add(f);
        d.add(Box.createVerticalStrut(10));

        JButton g = new JButton("Take a Quiz!");
        g.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Quiz();
            }
        });
        g.setAlignmentX(Component.CENTER_ALIGNMENT);
        g.setFont(new Font("Arial", Font.BOLD, 16));
        g.setBackground(new Color(201, 44, 109));
        g.setForeground(Color.WHITE);
        d.add(g);
        d.add(Box.createVerticalStrut(10));

        JButton openEmagButton = new JButton("Open E-magazine");
        EmagListener emagListener = new EmagListener();
        openEmagButton.addActionListener(emagListener);
        openEmagButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        openEmagButton.setFont(new Font("Arial", Font.BOLD, 16));
        openEmagButton.setBackground(new Color(232, 160, 191));
        openEmagButton.setForeground(Color.WHITE);
        d.add(openEmagButton);
        d.add(Box.createVerticalStrut(10));


        ImageIcon imageIcon = new ImageIcon("C:/Users/kashi/Downloads/imgproj1.png");
        JLabel imageLabel = new JLabel(imageIcon);
        d.add(imageLabel);
        imageLabel.setAlignmentX(Component.CENTER_ALIGNMENT);




        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 1200);
        setLocationRelativeTo(null);
        setVisible(true);

    }
}
