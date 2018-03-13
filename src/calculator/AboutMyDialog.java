package calculator;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class AboutMyDialog extends JDialog implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	JButton btn;

	public AboutMyDialog(JFrame  parent, String title, boolean modal) {
		super(parent,title,modal);
		setBackground(Color.BLACK);
		
		JPanel pnl = new JPanel(new FlowLayout(FlowLayout.CENTER));
		
		StringBuffer text = new StringBuffer();
		text.append("       Calculator Information:\n\n");
		text.append("Developer: PARVES, S.M. NAZMUS SAKIB\n");
		text.append("Version: Spring2014-2015\n");
		text.append("Serial ID: 13-24470-2\n");
		text.append("Year: 2015");
		
		JTextArea jtAreaAbout = new JTextArea(7, 28);
		jtAreaAbout.setText(text.toString());
		jtAreaAbout.setFont(new Font("Arial Black", 1, 12));
		jtAreaAbout.setEditable(false);
		

		pnl.add(jtAreaAbout);
		pnl.setBackground(Color.green);
		getContentPane().add(pnl, BorderLayout.CENTER);
		
		JPanel pnl2 = new JPanel(new FlowLayout(FlowLayout.CENTER));
		btn = new JButton(" OK ");
		btn.addActionListener(this);
		
		pnl2.add(btn);
		getContentPane().add(pnl2, BorderLayout.SOUTH);

		setLocation(400, 200);
		//setLocationRelativeTo(null);
		setResizable(false);
		
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e)
			{
				Window aboutDialog = e.getWindow();
				aboutDialog.dispose();
			}
		}
	);
		pack();


	}

	

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btn)	{
			this.dispose();
		}
	}
		
	}


