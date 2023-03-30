package swingExample;
import javax.swing.*;
import javax.swing.JFrame;
import java.awt.event.*;
import java.awt.*;

public class loginexample extends JFrame {
	JButton b1,b2;
	JLabel l1,l2,l3,l4,l5;
	JTextField t1,t2,t3;
	JRadioButton m1,m2;
	   
	 loginexample()
	 {    
           b1=new JButton("Registration form");
          l2=new JLabel("Name"); 
          l3=new JLabel("Email"); 
          l4=new JLabel("Phone no"); 
          l5=new JLabel("Gender"); 
          
          t1=new JTextField(15);
          t2=new JTextField(15);
          t3=new JTextField(15);
          
          JRadioButton j1 =new JRadioButton("Male");
          JRadioButton j2=new JRadioButton("female");
          j1.setBounds(10,5,5,10);
          j2.setBounds(10,4,8,15);
          b2=new JButton("signup");

          add(l1);
          add(t1);
          
          add(l2);
          add(t2);
          
          add(l3);
          add(t3);
          
          add(l4);
          add(l5);
          
          
          setLayout(new FlowLayout());
          setVisible(true);
          setSize(200,200);
          }
          public static void main(String []args)
          {
        	  new loginexample();
          }
}
   


