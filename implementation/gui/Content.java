package gui;

import javax.swing.*;
import java.awt.*;

public class Content extends JPanel {
    int x = 0;
    int y = 0;
    public Content() {
        System.out.println("Ich bin der content");
        setSize(1024, 768);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.green);
        g.fillRect(0, 0, 1024, 768);
        g.setColor(Color.BLACK);
        g.drawString("Ich bin der Content", x, y);
        x++;
        y++;
    }
}
