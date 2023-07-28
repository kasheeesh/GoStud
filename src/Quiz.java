import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Quiz extends JFrame {
    private JLabel questionLabel;
    private JRadioButton choice1, choice2, choice3, choice4;
    private JButton submitButton;
    private int currentQuestion;
    private int score;

    private String[] questions = {
            "What is the capital of France?",
            "What is the largest mammal?",
            "What is the highest mountain in the world?",
            "Who is the founder of Microsoft?",
            "What is the most spoken language in the world?"
    };

    private String[][] choices = {
            {"New York", "London", "Paris", "Tokyo"},
            {"Elephant", "Giraffe", "Whale", "Hippopotamus"},
            {"Mount Everest", "K2", "Kilimanjaro", "Denali"},
            {"Steve Jobs", "Bill Gates", "Mark Zuckerberg", "Elon Musk"},
            {"Mandarin", "Spanish", "English", "Hindi"}
    };

    private int[] answers = {2, 3, 1, 2, 1}; // index of correct answer for each question

    public Quiz() {
        super("Quiz");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 600);
        setLayout(new BorderLayout());

        questionLabel = new JLabel(questions[0]);
        add(questionLabel, BorderLayout.NORTH);

        JPanel choicesPanel = new JPanel(new GridLayout(4, 1));
        choice1 = new JRadioButton(choices[0][0]);
        choice2 = new JRadioButton(choices[0][1]);
        choice3 = new JRadioButton(choices[0][2]);
        choice4 = new JRadioButton(choices[0][3]);
        choicesPanel.add(choice1);
        choicesPanel.add(choice2);
        choicesPanel.add(choice3);
        choicesPanel.add(choice4);
        ButtonGroup group = new ButtonGroup();
        group.add(choice1);
        group.add(choice2);
        group.add(choice3);
        group.add(choice4);
        add(choicesPanel, BorderLayout.CENTER);

        submitButton = new JButton("Submit");
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int selectedAnswer = -1;
                if (choice1.isSelected()) {
                    selectedAnswer = 0;
                } else if (choice2.isSelected()) {
                    selectedAnswer = 1;
                } else if (choice3.isSelected()) {
                    selectedAnswer = 2;
                } else if (choice4.isSelected()) {
                    selectedAnswer = 3;
                }
                if (selectedAnswer == -1) {
                    JOptionPane.showMessageDialog(null, "Please select an answer.");
                } else {
                    if (selectedAnswer == answers[currentQuestion]) {
                        score++;
                    }
                    currentQuestion++;
                    if (currentQuestion == questions.length) {
                        JOptionPane.showMessageDialog(null, "Quiz complete. Score: " + score);
                        System.exit(0);
                    } else {
                        questionLabel.setText(questions[currentQuestion]);
                        choice1.setText(choices[currentQuestion][0]);
                        choice2.setText(choices[currentQuestion][1]);
                        choice3.setText(choices[currentQuestion][2]);
                        choice4.setText(choices[currentQuestion][3]);
                        group.clearSelection();
                    }
                }
            }
        });
        add(submitButton, BorderLayout.SOUTH);

        setVisible(true);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        new Quiz();
    }
}
