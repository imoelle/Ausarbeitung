package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lines extends JFrame {
    private Dimension dimension;
    private Content content;
    private JFrame window;
    private Timer timer = new Timer((1 / 60), new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            content.repaint();
        }
    });
    public Lines() {
        this.content = new Content();
        this.dimension = new Dimension(content.getWidth(), content.getHeight());
        this.window = createWindow(content);
    }

    private JFrame createWindow(Content content) {
        JFrame window = new JFrame("Semesterbegleitende Ausarbeitung: Designpatterns der OOP - Aufgabe 4");

        window.setDefaultCloseOperation(EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setPreferredSize(dimension);
        window.setResizable(false);
        window.getContentPane().add(content);
        window.pack();
        window.setLocationRelativeTo(null);
        window.setVisible(true);

        return window;
    }

}