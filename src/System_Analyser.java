import javax.swing.UIManager;

class System_Analyser
{
	public static void main(String HPS[]) throws InterruptedException
	{
		try
		{
            //here you can put the selected theme class name in JTattoo
            UIManager.setLookAndFeel("com.jtattoo.plaf.texture.TextureLookAndFeel");
 
        }
		catch(Exception ex){}
		
		frmLoading obj = new frmLoading();
		obj.show();
		obj.setDefaultCloseOperation(3);
	}
}