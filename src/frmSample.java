import javax.swing.*;
import java.io.*;
import java.awt.*;
import java.text.*;

class frmSample extends  JFrame
{
	JLabel lbOS1, lbOS2, lbOSTitle, lbRamTitle, lbRam, lbMotherBoard1, lbMotherBoard2, lbMotherBoardTitle, lbCPU,
	lbCPUTitle, lbDiskDriveTitle, lbDiskDrive1, lbDiskDrive2, lbGraphicsTitle, lbGraphics1, lbGraphics2,
	lbOptialDriveTitle, lbOptialDrive, lbAudioTitle, lbAudio1, lbAudio2;

	frmSample()
	{
		setSize(410,720);
		setLocation(550,10);
		setTitle("System Analyser");
		setLayout(null);
		setResizable(false);

		setIconImage(Toolkit.getDefaultToolkit().getImage("F:\\Final Year 2020-21\\Mega Project(Final Year)\\Icons\\Icon.png"));

		lbOSTitle = new JLabel("Operating System");
		lbOSTitle.setBounds(20,20,450,25);
		add(lbOSTitle);
		lbOSTitle.setFont(new Font("Aerial", Font.BOLD, 13));
		lbOSTitle.setForeground(Color.RED);
		lbOSTitle.setIcon(new ImageIcon("E:\\eclipse_project\\System Analyser\\Icons\\windows.png"));

		lbOS1 = new JLabel();
		lbOS1.setBounds(60,50,450,20);
		add(lbOS1);

		lbOS2 = new JLabel();
		lbOS2.setBounds(60,80,450,20);
		add(lbOS2);

		lbCPUTitle = new JLabel("CPU");
		lbCPUTitle.setBounds(20,110,450,25);
		add(lbCPUTitle);
		lbCPUTitle.setFont(new Font("Aerial", Font.BOLD, 13));
		lbCPUTitle.setForeground(Color.RED);
		lbCPUTitle.setIcon(new ImageIcon("E:\\eclipse_project\\System Analyser\\Icons\\cpu.png"));

		lbCPU = new JLabel();
		lbCPU.setBounds(60,140,450,20);
		add(lbCPU);

		lbRamTitle = new JLabel("Ram");
		lbRamTitle.setBounds(20,170,450,25);
		add(lbRamTitle);
		lbRamTitle.setFont(new Font("Aerial", Font.BOLD, 13));
		lbRamTitle.setForeground(Color.RED);
		lbRamTitle.setIcon(new ImageIcon("E:\\eclipse_project\\System Analyser\\Icons\\ram.png"));

		lbRam = new JLabel();
		lbRam.setBounds(60,200,500,20);
		add(lbRam);

		lbMotherBoardTitle = new JLabel("Motherboard");
		lbMotherBoardTitle.setBounds(20,230,450,25);
		add(lbMotherBoardTitle);
		lbMotherBoardTitle.setFont(new Font("Aerial", Font.BOLD, 13));
		lbMotherBoardTitle.setForeground(Color.RED);
		lbMotherBoardTitle.setIcon(new ImageIcon("E:\\eclipse_project\\System Analyser\\Icons\\motherboard.png"));

		lbMotherBoard1 = new JLabel();
		lbMotherBoard1.setBounds(60,260,450,20);
		add(lbMotherBoard1);

		lbMotherBoard2 = new JLabel();
		lbMotherBoard2.setBounds(60,290,450,20);
		add(lbMotherBoard2);

		lbGraphicsTitle = new JLabel("Graphics");
		lbGraphicsTitle.setBounds(20,320,450,25);
		add(lbGraphicsTitle);
		lbGraphicsTitle.setFont(new Font("Aerial", Font.BOLD, 13));
		lbGraphicsTitle.setForeground(Color.RED);
		lbGraphicsTitle.setIcon(new ImageIcon("E:\\eclipse_project\\System Analyser\\Icons\\graphics-card.png"));

		lbGraphics1 = new JLabel();
		lbGraphics1.setBounds(60,350,450,20);
		add(lbGraphics1);

		lbGraphics2 = new JLabel();
		lbGraphics2.setBounds(110,380,450,20);
		add(lbGraphics2);

		lbDiskDriveTitle = new JLabel("Storage");
		lbDiskDriveTitle.setBounds(20,410,450,25);
		add(lbDiskDriveTitle);
		lbDiskDriveTitle.setFont(new Font("Aerial", Font.BOLD, 13));
		lbDiskDriveTitle.setForeground(Color.RED);
		lbDiskDriveTitle.setIcon(new ImageIcon("E:\\eclipse_project\\System Analyser\\Icons\\harddisk.png"));

		lbDiskDrive1 = new JLabel();
		lbDiskDrive1.setBounds(60,440,450,20);
		add(lbDiskDrive1);

		lbDiskDrive2 = new JLabel();
		lbDiskDrive2.setBounds(60,470,500,20);
		add(lbDiskDrive2);

		lbOptialDriveTitle = new JLabel("Optical Drive");
		lbOptialDriveTitle.setBounds(20,500,450,25);
		add(lbOptialDriveTitle);
		lbOptialDriveTitle.setFont(new Font("Aerial", Font.BOLD, 13));
		lbOptialDriveTitle.setForeground(Color.RED);
		lbOptialDriveTitle.setIcon(new ImageIcon("E:\\eclipse_project\\System Analyser\\Icons\\cd.png"));

		lbOptialDrive = new JLabel();
		lbOptialDrive.setBounds(60,530,450,20);
		add(lbOptialDrive);

		lbAudioTitle = new JLabel("Audio");
		lbAudioTitle.setBounds(20,560,450,25);
		add(lbAudioTitle);
		lbAudioTitle.setFont(new Font("Aerial", Font.BOLD, 13));
		lbAudioTitle.setForeground(Color.RED);
		lbAudioTitle.setIcon(new ImageIcon("E:\\eclipse_project\\System Analyser\\Icons\\volume.png"));

		lbAudio1 = new JLabel();
		lbAudio1.setBounds(60,590,450,20);
		add(lbAudio1);

		lbAudio2 = new JLabel("Audio2");
		lbAudio2.setBounds(121,620,450,20);
		add(lbAudio2);

		try
		{
			//MOTHERBOARD
			Process p = Runtime.getRuntime().exec("wmic baseboard get manufacturer");
			BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));

			int i = 1;
			StringBuilder sb1 = new StringBuilder();
			while(true)
			{
				String line = br.readLine();
				if(line == null)
					break;

				if(i == 1)
				{
					sb1.append(line.trim() + "  :  ");
				}
				if(i == 3)
				{
					sb1.append(line.trim());
				}

				i++;
			}
			lbMotherBoard1.setText(sb1.toString());

			p = Runtime.getRuntime().exec("wmic baseboard get product");
			br = new BufferedReader(new InputStreamReader(p.getInputStream()));

			i = 1;
			StringBuilder sb13 = new StringBuilder();
			while(true)
			{
				String line = br.readLine();
				if(line == null)
					break;

				if(i == 1)
				{
					sb13.append(line.trim() + "           :  ");
				}
				if(i == 3)
				{
					sb13.append(line.trim());
				}

				i++;
			}
			lbMotherBoard2.setText(sb13.toString());


			//CPU
			p = Runtime.getRuntime().exec("wmic cpu get name");
			br = new BufferedReader(new InputStreamReader(p.getInputStream()));

			i = 1;
			StringBuilder sb2 = new StringBuilder();
			while(true)
			{
				String line = br.readLine();
				if(line == null)
					break;

				if(i == 1)
				{
					sb2.append(line.trim() + "  :  ");
				}
				if(i == 3)
				{
					sb2.append(line.trim());
				}

				i++;
			}
			lbCPU.setText(sb2.toString());

			//DISK DRIVE
			p = Runtime.getRuntime().exec("wmic diskdrive get model");
			br = new BufferedReader(new InputStreamReader(p.getInputStream()));

			i = 1;
			StringBuilder sb3 = new StringBuilder();
			while(true)
			{
				String line = br.readLine();
				if(line == null)
					break;

				if(i == 1)
				{
					sb3.append(line.trim() + "  :  ");
				}
				if(i == 3)
				{
					sb3.append(line.trim());
				}

				i++;
			}
			lbDiskDrive1.setText(sb3.toString());

			p = Runtime.getRuntime().exec("wmic diskdrive get size");
			br = new BufferedReader(new InputStreamReader(p.getInputStream()));

			i = 1;
			StringBuilder sb4 = new StringBuilder();
			while(true)
			{
				String line = br.readLine();
				if(line == null)
					break;

				if(i == 1)
				{
					sb4.append(line.trim() + "     :  ");
				}
				if(i == 3)
				{
					sb4.append(line.trim());
				}

				i++;
			}
			String tempSizeHD[] = sb4.toString().split(":");
			NumberFormat f = NumberFormat.getNumberInstance();
			f.setMaximumFractionDigits(2);
			lbDiskDrive2.setText(sb4.toString() + " Bytes (" + f.format(Double.parseDouble(tempSizeHD[1])/(1024*1024*1024)) + " GB)");

			//GRAPHICS
			p = Runtime.getRuntime().exec("wmic path win32_VideoController get name");
			br = new BufferedReader(new InputStreamReader(p.getInputStream()));

			i = 1;
			StringBuilder sb5 = new StringBuilder();
			StringBuilder sb6 = new StringBuilder();
			while(true)
			{
				String line = br.readLine();
				if(line == null)
					break;

				if(i == 1)
				{
					sb5.append(line.trim() + "  :  ");
				}
				if(i == 3)
				{
					sb5.append(line.trim());
				}
				if(i == 5)
				{
					sb6.append(line.trim());
				}
				i++;
			}
			lbGraphics1.setText(sb5.toString());
			lbGraphics2.setText(sb6.toString());

			//OPERATING SYSTEM
			p = Runtime.getRuntime().exec("wmic os get caption");
			br = new BufferedReader(new InputStreamReader(p.getInputStream()));

			i = 1;
			StringBuilder sb7 = new StringBuilder();
			while(true)
			{
				String line = br.readLine();
				if(line == null)
					break;

				if(i == 1)
				{
					sb7.append(line.trim() + "                   :  ");
				}
				if(i == 3)
				{
					sb7.append(line.trim());
				}

				i++;
			}
			lbOS1.setText(sb7.toString());

			p = Runtime.getRuntime().exec("wmic os get osarchitecture");
			br = new BufferedReader(new InputStreamReader(p.getInputStream()));

			i = 1;
			StringBuilder sb8 = new StringBuilder();
			while(true)
			{
				String line = br.readLine();
				if(line == null)
					break;

				if(i == 1)
				{
					sb8.append(line.trim() + "     :  ");
				}
				if(i == 3)
				{
					sb8.append(line.trim());
				}

				i++;
												}
			lbOS2.setText(sb8.toString());

			//RAM
			p = Runtime.getRuntime().exec("wmic memorychip get capacity");
			br = new BufferedReader(new InputStreamReader(p.getInputStream()));

			i = 1;
			StringBuilder sb9 = new StringBuilder();
			while(true)
			{
				String line = br.readLine();
				if(line == null)
					break;

				if(i == 1)
				{
					sb9.append(line.trim() + "  :  ");
				}
				if(i == 3)
				{
					sb9.append(line.trim());
				}

				i++;
			}
			String tempSizeRam[] = sb9.toString().split(":");
			lbRam.setText(sb9.toString() + " Bytes (" + f.format(Double.parseDouble(tempSizeRam[1])/(1024*1024*1024)) + " GB)");

			//OPTICAL DRIVE
			p = Runtime.getRuntime().exec("wmic cdrom get name");
			br = new BufferedReader(new InputStreamReader(p.getInputStream()));

			i = 1;
			StringBuilder sb10 = new StringBuilder();
			while(true)
			{
				String line = br.readLine();
				if(line == null)
					break;

				if(i == 1)
				{
					sb10.append(line.trim() + "  :  ");
				}
				if(i == 3)
				{
					sb10.append(line.trim());
				}

				i++;
			}
			lbOptialDrive.setText(sb10.toString());

			//AUDIO
			p = Runtime.getRuntime().exec("wmic sounddev get caption");
			br = new BufferedReader(new InputStreamReader(p.getInputStream()));

			i = 1;
			StringBuilder sb11 = new StringBuilder();
			StringBuilder sb12 = new StringBuilder();
			while(true)
			{
				String line = br.readLine();
				if(line == null)
					break;

				if(i == 1)
				{
					sb11.append(line.trim() + "  :  ");
				}
				if(i == 3)
				{
					sb11.append(line.trim());
				}
				if(i == 5)
				{
					sb12.append(line.trim());
					lbAudio2.setText(sb12.toString());
				}

				i++;
			}
			lbAudio1.setText(sb11.toString());

		}
		catch(Exception ex)
		{

		}
	}
}