import java.awt.event.*;
import javax.swing.*;
public class MultiFrameTest extends JFrame 
{ 
    int x = 0; int y = 0; 
    public MultiFrameTest()
    { 
        super("multiFrame test");
        setSize(600,600);
        JPanel mainPanel = new JPanel();
        setContentPane(mainPanel);
        JButton addFrameBtn = new JButton("Hi Man, Click to add a new Frame.");
        addFrameBtn.addActionListener(new ActionListener()
        { 
            public void actionPerformed(ActionEvent e)
            {
                addFrame(x,y);
            }
        }
        );
        mainPanel.add(addFrameBtn);
        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent we)
            {
                System.exit(0);
            }
        }
        );
        setVisible(true);
    }
    public void addFrame(int a, int b)
    {
        JFrame frame = new JFrame("Frame "+a);
        frame.setSize(300,300);
        frame.setLocation( b* 10, b * 10);
        x++;
        y +=10;
        frame.setVisible(true);
    }
    public static void main(String[] args)
    {
        new MultiFrameTest();
    }
}