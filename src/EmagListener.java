import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

// Action listener for the e-magazine button
public class EmagListener implements ActionListener {

    public static void main(String[] args) {
        JFrame frame = new JFrame("E-magazine Button");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a button with the label "E-magazine"
        JButton emagButton = new JButton("E-magazine");

        // Add an action listener to the button
        emagButton.addActionListener(new EmagListener());


        frame.getContentPane().add(emagButton, BorderLayout.CENTER);

        // Set the size of the frame and make it visible
        frame.setSize(300, 100);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        // Redirect the user to the website
        try {
            Desktop.getDesktop().browse(new URI("http://www.bennett.edu.in"));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
