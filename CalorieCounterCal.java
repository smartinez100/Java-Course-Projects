import javax.swing.*;
import java.awt.*;

public class CalorieCounterCal {
    // Variables for the display labels and current input
    private static JLabel cookieDisplay;
    private static JLabel calorieDisplay;
    private static String currentInput = "";

    public static void main(String[] args) {
        // Create the main window
        JFrame window = new JFrame("Calorie Counter");
        window.setSize(400, 400);
        window.setDefaultCloseOperation(window.EXIT_ON_CLOSE);
        window.setLayout(new BorderLayout());
        window.setLocationRelativeTo(null);

        // Create the text display panel
        JPanel text = new JPanel();
        text.setLayout(new GridLayout(2, 1));
        cookieDisplay = new JLabel("0 Cookies", SwingConstants.CENTER);
        calorieDisplay = new JLabel("0 Calories", SwingConstants.CENTER);
        text.add(cookieDisplay);
        text.add(calorieDisplay);
        text.setPreferredSize(new Dimension(window.getWidth(), 100));

        // Create the button panel
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 3));

        // Add digit buttons 0-9
        for (int i = 0; i < 10; i++) {
            addNumberButton(panel, Integer.toString(i));
        }

        // Add action buttons
        addButton(panel, "Clear");
        addButton(panel, "Backspace");
        addButton(panel, "Enter");

        // Add the text and button panels to the main window
        window.add(text, BorderLayout.NORTH);
        window.add(panel, BorderLayout.CENTER);

        // Make the window visible
        window.setVisible(true);
    }

    private static void addNumberButton(JPanel panel, String number) {
        JButton button = new JButton(number);

        // Logic for number buttons
        button.addActionListener(e -> {
            currentInput += number;
            updateDisplay();
        });
        panel.add(button);
    }

    private static void addButton(JPanel panel, String label) {
        JButton button = new JButton(label);
        panel.add(button);

        // main logic for Action buttons
        button.addActionListener(e -> {
            switch (label) {
                case "Clear":
                    currentInput = "";
                    updateDisplay();
                    break;
                case "Backspace":
                    if (!currentInput.isEmpty()) {
                        currentInput = currentInput.substring(0, currentInput.length() - 1);
                        updateDisplay();
                    }
                    break;
                case "Enter":
                    // ternary operator for shorthand if:else but gives an integer regradless if
                    // there is a value or not
                    int cookies = currentInput.isEmpty() ? 0 : Integer.parseInt(currentInput);
                    int calories = cookies * 75;
                    calorieDisplay.setText(calories + " Calories");
                    break;
            }
        });
    }

    // Update the display labels
    private static void updateDisplay() {
        if (currentInput.isEmpty()) {
            cookieDisplay.setText("0 Cookies");
            calorieDisplay.setText("0 Calories");
        } else {
            cookieDisplay.setText(currentInput + " Cookies");
        }
    }
}
