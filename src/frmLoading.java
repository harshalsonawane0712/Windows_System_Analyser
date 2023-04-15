import javax.swing.*;
import javax.swing.plaf.basic.BasicInternalFrameUI;

import java.awt.event.*;
import java.awt.*;

class frmLoading extends JFrame implements ActionListener{
	JProgressBar bar;
	Timer timer;
	int i=0;
	JLabel lbLoading;

	frmLoading() throws InterruptedException
	{
		setTitle("Loading");
		setSize(410,720);
		setResizable(false);
		setLocation(550,10);
		setLayout(null);
		
		setIconImage(Toolkit.getDefaultToolkit().getImage("F:\\Final Year 2020-21\\Mega Project(Final Year)\\Icons\\Icon.png"));

		bar = new JProgressBar(0,20);
		add(bar);
		bar.setBounds(25,310,345,20);
		bar.setStringPainted(true);
		bar.setForeground(Color.orange);
		bar.setBackground(Color.white);

		timer = new Timer(100,this);
		timer.setRepeats(true);
		timer.start();

		lbLoading = new JLabel("Loading");
		add(lbLoading);
		lbLoading.setBounds(550,360,200,50);
		lbLoading.setFont(new Font("Aerial", Font.BOLD, 20));
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource().equals(timer))
		{
			i++;
			bar.setValue(i);
			if(i == 5)
				lbLoading.setText("Loading . .");
			else if(i == 10)
				lbLoading.setText("Loading . . . . .");
			else if(i == 15)
				lbLoading.setText("Loading . . . . . . .");
			else if(i == 20)
				lbLoading.setText("Loading . . . . . . . . .");

			if(i == 24)
			{
				frmSample obj = new frmSample();
				obj.show();
				this.dispose();
			}
		}
	}
}
