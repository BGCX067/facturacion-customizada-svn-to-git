package com.inicio.init;

import java.util.ArrayList;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;

public class FactoryMenu
{

	public static void crearMenuSimple(JMenuBar menuBar, String nombreMenu, ArrayList<String> opcionesMenu)
	{
		JMenu menu = new JMenu(nombreMenu);

		for (int i = 0; i < opcionesMenu.size(); i++)
		{
			if (i!=0)
			{
				menu.add(new JSeparator(SwingConstants.HORIZONTAL));
			}
			menu.add(new JMenuItem(opcionesMenu.get(i))); 
		}

		menuBar.add(menu);
	}

}
