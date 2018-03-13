package calculator;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.KeyStroke;

public class MyCalculator extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,off,eq,sum,sub,div,multi,cl,back,dec,sin,cos,tan,log;
	JTextField t;
	JMenu jmenumode,jmenusetup,jmenuhelp;
	JMenuItem about,exit,sim,comlx,deg,rad,nrml;
	
	int n,i;
	int n1,n2;
	int answer=0;
	//int INPUT_MODE = 0;
	//int displayMode;
	//JLabel jlbOutput;
	//boolean clearOnNextDigit;
	
public MyCalculator(String title) {
	
}

public MyCalculator(){
	this.setLayout(null);
	
	Font font = new Font("Times New Roman", 1, 14);
	
	this.jmenumode = new JMenu("MODE");
	this.jmenumode.setFont(font);
	this.jmenumode.setMnemonic(KeyEvent.VK_M);
	
	this.sim = new JMenuItem("Simple");
	this.sim.setFont(font);
	this.jmenumode.add(sim);
	
	this.comlx = new JMenuItem("Complex");
	this.comlx.setFont(font);
	this.jmenumode.add(comlx);
	
	this.jmenusetup = new JMenu("SETUP");
	this.jmenusetup.setFont(font);
	this.jmenusetup.setMnemonic(KeyEvent.VK_S);
	
	this.deg = new JMenuItem("Degree");
	this.deg.setFont(font);
	this.jmenusetup.add(deg);
	
	this.rad = new JMenuItem("Radian");
	this.rad.setFont(font);
	this.jmenusetup.add(rad);
	
	this.nrml = new JMenuItem("Normal");
	this.nrml.setFont(font);
	this.jmenusetup.add(nrml);
	
	
	
	this.jmenuhelp = new JMenu("HELP");
	this.jmenuhelp.setFont(font);
	this.jmenuhelp.setMnemonic(KeyEvent.VK_H);
	
	this.about = new JMenuItem("About");
	this.about.setFont(font);
	this.jmenuhelp.add(about);
	
	this.exit = new JMenuItem("Exit");
	this.exit.setFont(font);
	this.exit.setAccelerator(KeyStroke.getKeyStroke( KeyEvent.VK_X,ActionEvent.CTRL_MASK));
	this.jmenuhelp.add(exit);
	
	JMenuBar bar = new JMenuBar();
	   bar.add(jmenumode);
	   bar.add(jmenusetup);
	   bar.add(jmenuhelp);
	   setJMenuBar(bar);
	
	
	
	this.b0=new JButton(" 0 ");
	this.b1=new JButton(" 1 ");
	this.b2=new JButton(" 2 ");
	this.b3=new JButton(" 3 ");
	this.b4=new JButton(" 4 ");
	this.b5=new JButton(" 5 ");
	this.b6=new JButton(" 6 ");
	this.b7=new JButton(" 7 ");
	this.b8=new JButton(" 8 ");
	this.b9=new JButton(" 9 ");
	this.off=new JButton("OFF");
	this.sum=new JButton("+");
	this.sub=new JButton("-");
	this.multi=new JButton("*");
	this.div=new JButton("/");
	this.eq=new JButton("=");
	this.cl=new JButton("AC");
	this.back=new JButton("Clear");
	this.dec=new JButton(".");
	this.sin=new JButton("sin");
	this.cos=new JButton("cos");
	this.tan=new JButton("tan");
	this.log=new JButton("log");
	
	this.t=new JTextField(40);
	
	this.b0.setBounds(10, 220, 50 ,40);
	this.b1.setBounds(60, 220, 50, 40);
	this.b2.setBounds(110, 220, 50, 40);
	this.b3.setBounds(10, 170, 50, 40);
	this.b4.setBounds(60, 170, 50, 40);
	this.b5.setBounds(110, 170, 50, 40);
	this.b6.setBounds(10, 120, 50, 40);
	this.b7.setBounds(60, 120, 50, 40);
	this.b8.setBounds(110, 120, 50, 40);
	this.b9.setBounds(160, 120, 50, 40);
	this.off.setBounds(140, 70, 70, 40);
	this.sum.setBounds(220, 220, 50, 40);
	this.sub.setBounds(220, 170, 50, 40);
	this.multi.setBounds(220, 120, 50, 40);
	this.div.setBounds(220, 70, 50, 40);
	this.eq.setBounds(160, 220, 55, 40);
	this.cl.setBounds(10, 70, 55, 40);
	this.back.setBounds(65, 70, 75, 40);
	this.dec.setBounds(160, 170, 50, 40);
	this.sin.setBounds(10, 270, 55, 40);
	this.cos.setBounds(65, 270, 55, 40);
	this.tan.setBounds(120, 270, 55, 40);
	this.log.setBounds(175, 270, 55, 40);
	
    this.t.setBounds(20,10,250,50);
    
    
	this.add(b0);
	this.add(b1);
	this.add(b2);
	this.add(b3);
	this.add(b4);
	this.add(b5);
	this.add(b6);
	this.add(b7);
	this.add(b8);
	this.add(b9);
	this.add(off);
	this.add(sum);
	this.add(multi);
	this.add(sub);
	this.add(div);
	this.add(eq);
	this.add(cl);
	this.add(back);
	this.add(t);
	this.add(dec);
	this.add(sin);
	this.add(cos);
	this.add(tan);
	this.add(log);

    this.t.setForeground(Color.red);
    
    this.back.setForeground(Color.MAGENTA);
    this.cl.setForeground(Color.MAGENTA);
    this.multi.setForeground(Color.CYAN);
    this.sub.setForeground(Color.CYAN);
    this.div.setForeground(Color.CYAN);
    this.sum.setForeground(Color.CYAN);
    this.eq.setForeground(Color.PINK);
    this.off.setForeground(Color.RED);
    this.dec.setForeground(Color.BLUE);
    this.sin.setForeground(Color.GREEN);
    this.cos.setForeground(Color.GREEN);
    this.log.setForeground(Color.GREEN);
    this.tan.setForeground(Color.GREEN);
    
  
    this.t.setFont(font);
    this.sum.setFont(font);
    this.sub.setFont(font);
    this.div.setFont(font);
    this.multi.setFont(font);
    this.dec.setFont(font);
    this.off.setFont(font);
    this.eq.setFont(font);
    this. back.setFont(font);
    this.cl.setFont(font);
    this.sin.setFont(font);
    this.cos.setFont(font);
    this.log.setFont(font);
    this.tan.setFont(font);
    
    
   	b0.addActionListener(this);
	b1.addActionListener(this);
	b2.addActionListener(this);
	b3.addActionListener(this);
	b4.addActionListener(this);
	b5.addActionListener(this);
	b6.addActionListener(this);
	b7.addActionListener(this);
	b8.addActionListener(this);
	b9.addActionListener(this);
    off.addActionListener(this);
	sum.addActionListener(this);
	multi.addActionListener(this);
	div.addActionListener(this);
	sub.addActionListener(this);
	eq.addActionListener(this);
	cl.addActionListener(this);
	back.addActionListener(this);
	dec.addActionListener(this);
	sin.addActionListener(this);
	cos.addActionListener(this);
	tan.addActionListener(this);
	log.addActionListener(this);
	about.addActionListener(this);
	exit.addActionListener(this);
	sim.addActionListener(this);
	comlx.addActionListener(this);
	deg.addActionListener(this);
	rad.addActionListener(this);
	nrml.addActionListener(this);
	

	addWindowListener(new WindowAdapter() {

		public void windowClosed(WindowEvent e)
		{
			System.exit(0);
		}
	}
);
  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

}

	

	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == sim){
			JOptionPane.showMessageDialog(null, "Simple Mode Activated.");
		}
		if(ae.getSource() == comlx){
			JOptionPane.showMessageDialog(null, "Sorry...! It's not Workong now,Try Later.");
		}
		if(ae.getSource() == deg){
			JOptionPane.showConfirmDialog(null, "Are You Activate Degree Mode ?");
		}
		
		if(ae.getSource() == rad){
			JOptionPane.showMessageDialog(null, "Sorry...! It's not Working now,Try Later.");
		}
		if(ae.getSource() == nrml){
			JOptionPane.showConfirmDialog(null, "Are You Activate Normal Mode ?");
		}
		
		if(ae.getSource() == about){
			JDialog aboutdialog = new AboutMyDialog(this,"About JAVA Calculator",true);
			aboutdialog.setVisible(true);
		      }else if(ae.getSource() == exit){
			System.exit(0);
		}  
		
		if(ae.getSource() == off)
		{
		System.exit(0);
		}

		if(ae.getSource() == sum) // while pressing plus
		{

		n1=Integer.parseInt(t.getText());
		i=1; // this expression is for equals
		t.setText("0");

		}

		if(ae.getSource() == sub) // while pressing minus
		{

		n1=Integer.parseInt(t.getText());
		i=2;
		t.setText("0");

		}

		if(ae.getSource() == multi) // while pressing multiplication
		{

		n1=Integer.parseInt(t.getText());
		i=3;
		t.setText("0");

		}

		if(ae.getSource() == div) // while pressing division
		{

		n1=Integer.parseInt(t.getText());
		i=4;
		t.setText("0");

		}
		if(ae.getSource() == cl) // while pressing all clear
		{

		//n1=Integer.parseInt(t.getText());
		//i=4;
		t.setText("0");

		}

		if (ae.getSource() == back) // for back space
		{
		//if (!(t.getText().equals("0") && t.getText().length() > 1)

		t.setText(t.getText().substring(0,t.getText().length()-1));

		}
		
		
		if (ae.getActionCommand().equals("sin"))
         {
             //t.setText("" + Math.sin(Double.valueOf(displayText).doubleValue()));
             
         }else
         if (ae.getActionCommand().equals("cos"))
         {
            // t.setText("" + Math.cos(Double.valueOf(displayText).doubleValue()));
             
         }
         else
         if (ae.getActionCommand().equals("log"))
         {
             //t.setText("" + Math.log(Double.valueOf(displayText).doubleValue()));
             
         }
		
      
		if(ae.getSource() == dec) // for pointer
		{
			t.setText(".");
			/*displayMode = INPUT_MODE;

			if (clearOnNextDigit)
				setDisplayString("");

			String inputString = getDisplayString();
		
			// If the input string already contains a decimal point, don't
			//  do anything to it.
			if (inputString.indexOf(".") < 0)
				setDisplayString(new String(inputString + "."));*/
		}



		if(ae.getSource() == b0)
		{
		if(t.getText().equals("0"))
		t.setText("0");
		else
		t.setText(t.getText() +"0");
		}

		if(ae.getSource() == b1)
		{
		if(t.getText().equals("0"))
		t.setText("1");
		else
		t.setText(t.getText() +"1");
		}

		if(ae.getSource() == b2)
		{
		if(t.getText().equals("0"))
		t.setText("2");
		else
		t.setText(t.getText() +"2");
		}


		if(ae.getSource() == b3)
		{
		if(t.getText().equals("0"))
		t.setText("3");
		else
		t.setText(t.getText() +"3");
		}

		if(ae.getSource() == b4)
		{
		if(t.getText().equals("0"))
		t.setText("4");
		else
		t.setText(t.getText() +"4");
		}

		if(ae.getSource() == b5)
		{
		if(t.getText().equals("0"))
		t.setText("5");
		else
		t.setText(t.getText() +"5");
		} 

		if(ae.getSource() == b6)
		{
		if(t.getText().equals("0"))
		t.setText("6");
		else
		t.setText(t.getText() +"6");
		}

		if(ae.getSource() == b7)
		{
		if(t.getText().equals("0"))
		t.setText("7");
		else
		t.setText(t.getText() +"7");
		}

		if(ae.getSource() == b8)
		{
		if(t.getText().equals("0"))
		t.setText("8");
		else
		t.setText(t.getText() +"8");
		}

		if(ae.getSource() == b9)
		{
		if(t.getText().equals("0"))
		t.setText("9");
		else
		t.setText(t.getText() +"9");
		}
		//System.out.println(t.getText());

		if(ae.getSource() == eq) //while pressing equals
		{
		n2=Integer.parseInt(t.getText());
		




		switch(i)
		{
		case 1:
		{

		answer=n1+n2;
		t.setText(Integer.toString(answer)); 
		n1=0;
		n2=0;
		}
		break;

		case 2:
		{

		answer=n1-n2;
		t.setText(Integer.toString(answer));
		n1=0;
		n2=0;

		}
		break;

		case 3:
		{

		answer=n1*n2;
		t.setText(Integer.toString(answer));
		n1=0;
		n2=0;

		}
		break;

		case 4:
		{

		answer=n1/n2;
		t.setText(Integer.toString(answer));
		n1=0;
		n2=0;

		}
		break;

		}
		System.out.println(t.getText());


	}



		
  }

	/*private void setDisplayString(String s) {
		jlbOutput.setText(s);
		
	      }
	private String getDisplayString() {
		return jlbOutput.getText();
	    }*/

}
