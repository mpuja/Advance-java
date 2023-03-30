package swingExample;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseListener;
public class MouseEvent extends JFrame implements MouseListener {
     JLabel l;
     
     MouseEvent(){
    	 addMouseListener(this);
    	 l=new JLabel();
    	 l.setBounds(20,20,80,50);
    	 setVisible(true);
    	 setSize(400,500);
    	 add(l);
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  new MouseEvent();
	}

	@Override
	public void mouseClicked(java.awt.event.MouseEvent arg0) {
		// TODO Auto-generated method stub
		l.setText("MouseClicked");
	}

	@Override
	public void mouseEntered(java.awt.event.MouseEvent arg0) {
		// TODO Auto-generated method stub
		l.setText("MouseEntered");
		
	}

	@Override
	public void mouseExited(java.awt.event.MouseEvent arg0) {
		// TODO Auto-generated method stub
		l.setText("MouseExited");
	}

	@Override
	public void mousePressed(java.awt.event.MouseEvent arg0) {
		// TODO Auto-generated method stub
		l.setText("MousePressed");
		
	}

	@Override
	public void mouseReleased(java.awt.event.MouseEvent arg0) {
		// TODO Auto-generated method stub
		l.setText("MouseReleased");
		
	}

}
