package com.inicio.init;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

public class Init extends JFrame
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		try
		{
			for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels())
			{
				if ("Nimbus".equals(info.getName()))
				{
					UIManager.setLookAndFeel(info.getClassName());
//					javax.swing.plaf.nimbus.NimbusLookAndFeel
					break;
				}
			}
		} catch (Exception e)
		{
			// If Nimbus is not available, you can set the GUI to another look
			// and feel.
		}

		
		
	}

}
