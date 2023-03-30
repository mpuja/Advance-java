package swingExample;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.*;

public class form  extends JFrame
{
	
  JButton b;
  JLabel L1,L2;
  JTextField t1,t2;
  form()
{
	  L1=new JLabel("Name:");
	  L2=new JLabel("Faculty:");
	  
	  t1=new JTextField(10);
	  t2=new JTextField(10);
	  
	  
	  b=new JButton("Login");
	  add(L1);
	  add(t1);
	  
	  add(L2);
	  add(t2);
	  
	  add(b);
	  
	  
	  setLayout(new FlowLayout());
	  setVisible(true);
	  setSize(200,200);
}
	public static void main (String []args)
	{
	new form();	
	}

}
