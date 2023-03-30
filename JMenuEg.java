package swingExample;
import javax.swing.*;
import java.awt.*;
import javax.swing.JFrame;
public class JMenuEg extends JFrame {
		 JFrame f;
	     JMenuItem i1,i2,i3,i4,i5;
	      JMenu menu,submenu;
	      
	       JMenuEg(){
	    	   f= new JFrame( "Menu Example");
	    	 JMenuBar mb= new JMenuBar();
	    	 menu=new JMenu("menu");
	    	  submenu=new JMenu("submenu");
	    	  i1=new JMenuItem("item1");
	    	  i2=new JMenuItem("item2");
	    	  i3=new JMenuItem("item3");
	    	  i4=new JMenuItem("item4");
	    	  i5=new JMenuItem("item5");
	    	  menu.add(i1);
	    	  menu.add(i2);
	    	  menu.add(i3);
	    	  submenu.add(i4);
	    	  submenu.add(i5);
	    	  menu.add(submenu);
	    	  mb.add(menu);
	    	  
	    	  setJMenuBar(mb);
	    	  setSize(400,400);
	    	  setLayout(null);
	    	  setVisible(true);
	    	  
	    
			
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	      new JMenuEg();
		}

	}


