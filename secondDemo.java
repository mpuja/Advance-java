package swingExample;
import javax.swing.JFrame;
import javax.swing.JButton;
public class secondDemo extends JFrame {
   JFrame f;
   secondDemo(){
	   
   
   JButton b= new JButton("click me");
   b.setBounds(40,90,100,50);
   add(b);
   setLayout(null);
   setVisible(true);
   setSize(400,400);
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new secondDemo();
		
   }
	}


