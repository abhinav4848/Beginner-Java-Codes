import javax.swing.JOptionPane;
public class TechnoJava
{
    public static void main(String args[])
    {
        String firstNo, secondNo;
        int no1, no2, sum;
        firstNo=JOptionPane.showInputDialog("First Number.");
        secondNo=JOptionPane.showInputDialog("Second Number");
        no1=Integer.parseInt(firstNo);
        no2=Integer.parseInt(secondNo);
        sum=no1 + no2;
        JOptionPane.showMessageDialog(null, "The sum is: "+sum, "Results", JOptionPane.PLAIN_MESSAGE);
        System.exit(0);
    }
}