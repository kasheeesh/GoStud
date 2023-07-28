import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ResumeGenerator extends JFrame implements ActionListener {
    private JTextField nameField, emailField, phoneField,jobField;
    private JComboBox<String> experienceComboBox, educationComboBox;
    private JCheckBox javaCheckbox, pythonCheckbox, csharpCheckbox, cplusCheckbox, javascriptCheckbox;

     JButton generateButton;

    public ResumeGenerator() {
        setTitle("Resume Generator");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.anchor = GridBagConstraints.WEST;
        constraints.insets = new Insets(10, 10, 10, 10);

        constraints.gridx = 0;
        constraints.gridy = 0;
        panel.add(new JLabel("Name"), constraints);

        constraints.gridx = 1;
        nameField = new JTextField(20);
        panel.add(nameField, constraints);

        constraints.gridx = 0;
        constraints.gridy = 1;
        panel.add(new JLabel("Email"), constraints);

        constraints.gridx = 1;
        emailField = new JTextField(20);
        panel.add(emailField, constraints);

        constraints.gridx = 0;
        constraints.gridy = 2;
        panel.add(new JLabel("Phone"), constraints);

        constraints.gridx = 1;
        phoneField = new JTextField(20);
        panel.add(phoneField, constraints);

        constraints.gridx = 0;
        constraints.gridy = 3;
        panel.add(new JLabel("JOb or Currently Working as:"), constraints);

        constraints.gridx = 1;
        jobField = new JTextField(20);
        panel.add(jobField, constraints);

        constraints.gridx = 0;
        constraints.gridy = 4;
        panel.add(new JLabel("Experience"), constraints);

        constraints.gridx = 1;
        String[] experienceLevels = {"Entry Level", "Mid Level", "Senior Level"};
        experienceComboBox = new JComboBox<>(experienceLevels);
        panel.add(experienceComboBox, constraints);

        constraints.gridx = 0;
        constraints.gridy = 5;
        panel.add(new JLabel("Education"), constraints);

        constraints.gridx = 1;
        String[] educationLevels = {"High School", "Bachelor's Degree", "Master's Degree", "PhD"};
        educationComboBox = new JComboBox<>(educationLevels);
        panel.add(educationComboBox, constraints);

        constraints.gridx = 0;
        constraints.gridy = 6;
        panel.add(new JLabel("Programming Languages"), constraints);

        constraints.gridx = 1;
        javaCheckbox = new JCheckBox("Java");
        panel.add(javaCheckbox, constraints);

        constraints.gridx = 2;
        pythonCheckbox = new JCheckBox("Python");
        panel.add(pythonCheckbox, constraints);

        constraints.gridx = 3;
        csharpCheckbox = new JCheckBox("C#");
        panel.add(csharpCheckbox, constraints);

        constraints.gridx = 4;
        cplusCheckbox = new JCheckBox("C++");
        panel.add(cplusCheckbox, constraints);

        constraints.gridx = 5;
        javascriptCheckbox = new JCheckBox("JavaScript");
        panel.add(javascriptCheckbox, constraints);

        constraints.gridx = 0;
        constraints.gridy = 7;
        generateButton = new JButton("Generate Resume");
        generateButton.addActionListener(this);
        panel.add(generateButton, constraints);

        getContentPane().add(panel);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Generate Resume")) {
            if (e.getSource() == generateButton) {
                String name = nameField.getText();
                String email = emailField.getText();
                String phone = phoneField.getText();
                String education = (String) educationComboBox.getSelectedItem();
                String experience = (String) experienceComboBox.getSelectedItem();
                String job= jobField.getText();
                String resume ="\nPersonal Details"+ "\nName: " + name + "\nEmail: " + email + "\nPhone: " + phone +"\nCurrently Working as:"+job+"\nI am an Experienced and Self motivated"+job+"and I aim to bring forth valuable industry experience and passion for the same. Results proven"+"\nwith a track record I have collaboratively worked with team members to achieve goals. "+"\nLevel of Education and experience"+"\nEducation: " + education + "\nExperience: " + experience +"\nI have coding experience in a lot of languages and i have worked on my skills for quite some time.";                JTextArea textArea = new JTextArea(resume);
                textArea.setEditable(false);
                JScrollPane scrollPane = new JScrollPane(textArea);
                scrollPane.setPreferredSize(new Dimension(800, 500));
                JOptionPane.showMessageDialog(this, scrollPane, "Resume Preview", JOptionPane.PLAIN_MESSAGE);
            }
        }
    }

    public static void main(String[] args) {
        new ResumeGenerator();
    }
}
