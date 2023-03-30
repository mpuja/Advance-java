package swingExample;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.*;
public class firstDemo {
	public static void main(String []args)
	{
		JFrame f= new JFrame("example");
		JButton b= new JButton("click");
		b.setBounds (40,90,85,20);
		
		f.add(b);
		f.setLayout(null);
		f.setVisible(true);
		f.setSize(400,400);
	}

}
