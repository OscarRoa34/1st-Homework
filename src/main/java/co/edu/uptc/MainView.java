package co.edu.uptc;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JWindow;

public class MainView extends JFrame {
    private JWindow buttonWindow;
    private JButton centerButton;

    public MainView() {
        init();
    }

    private void init() {
        setVisible(true);
        setTitle("Boton centrao");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        centerButton = new JButton("Apostar mi casa");
        centerButton.setSize(150, 75);
        centerButton();
    }

    private void centerButton() {
        buttonWindow = new JWindow();
        buttonWindow.setSize(centerButton.getSize());
        buttonWindow.add(centerButton);
        buttonWindow.setVisible(true);
        buttonWindow.setLocationRelativeTo(null);
    }

}
