package swingExample;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class calculate extends JFrame implements ActionListener
{
	 JButton b1,b2,b3,b4;
	  JLabel l1,l2,l3;
	  JTextField t1,t2;
    calculate()
    {
    	l1=new JLabel("first num:");
        l2=new JLabel("second num:");
        l3=new JLabel("result:");
        
        t1=new JTextField(10);
        t2= new JTextField(10);
      
        b1=new JButton("add");
        b2=new JButton("sub");
        b3=new JButton("divide");
        b4=new JButton("multiply");
         
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(l3);
        
       setLayout(new FlowLayout());
  	  setVisible(true);
  	  setSize(200,200);
         
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    new calculate();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		try{
		// TODO Auto-generated method stub
//		int num1,num2,result;
//		num1=Integer.parseInt(t1.getText());
//		num2=Integer.parseInt(t2.getText());
		
		float num1,num2,result;
		num1=Float.parseFloat(t1.getText());
		num2=Float.parseFloat(t2.getText());
		
		if(e.getSource()==b1)
		{
			result=num1+num2;
			l3.setText(result+"");
		
		}
		
		else if(e.getSource()==b2)
		{
			result=num1-num2;
			l3.setText(result+"");
		
		}
		else if(e.getSource()==b3)
		{
			result=num1/num2;
			l3.setText(result+"");
		
		}
		else if(e.getSource()==b4)
		{
			result=num1*num2;
			l3.setText(result+"");
		
		}
		else
			if(e.getSource()==b4)
			{
				result=num1/num2;
				l3.setText(result+"");
			}
				
		} catch (Exception e2) {
			// TODO: handle exception
			System.out.println(e2.getMessage());
		}
		
	}
      
}
