import utilities.Vector2D;

import javax.swing.*;
import java.awt.*;

public class Main {

    private static JFrame frame = new JFrame("Test");
    private static Content content = new Content();

    public static void main(String[] args) {
        // new Lines();

        /* Test */
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(1024, 768));
        frame.setResizable(false);
        frame.getContentPane().add(content);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}

class Content extends JPanel {

    Vector2D loc = new Vector2D(150, 150);
    int width = 300;
    int height = 300;

    Vector2D top = new Vector2D(0.5*width-5, -5);
    Vector2D leftBottom = new Vector2D(-5, height-5);
    Vector2D rightBottom = new Vector2D(width-5, height-5);
    public Content() {
        super();
        setSize(1024, 768);
        top = top.addAndCreate(loc);
        leftBottom = leftBottom.addAndCreate(loc);
        rightBottom = rightBottom.addAndCreate(loc);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        g.drawRect(150, 150, 300, 300);
        g.fillOval((int)top.getX(), (int)top.getY(), 10, 10);
        g.fillOval((int)leftBottom.getX(), (int)leftBottom.getY(), 10, 10);
        g.fillOval((int)rightBottom.getX(), (int)rightBottom.getY(), 10, 10);
        g.drawString("pos top: " + top.toString(), 10, 15);
        g.drawString("pos leftBottom: " + leftBottom.toString(), 10, 30);
        g.drawString("pos rightBottom: " + rightBottom.toString(), 10, 45);

        g.drawLine((int)leftBottom.getX()+5, (int)leftBottom.getY()+5, (int)top.getX()+5, (int)top.getY()+5);
        g.drawLine((int)top.getX()+5, (int)top.getY()+5, (int)rightBottom.getX()+5, (int)rightBottom.getY()+5);
        g.setColor(Color.RED);
        g.drawLine((int)leftBottom.getX()+5, (int)leftBottom.getY()+5, (int)rightBottom.getX()+5, (int)rightBottom.getY()+5);
    }


}