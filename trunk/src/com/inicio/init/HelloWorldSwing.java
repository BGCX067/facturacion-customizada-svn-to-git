package com.inicio.init;

/*
 * HelloWorldSwing.java requires no other files.
 */
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Rectangle;
import java.util.ArrayList;

import javax.swing.Box;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class HelloWorldSwing
{
	private static final JPanel panel = new JPanel();
	private static JTextField textField;

	/**
	 * Create the GUI and show it. For thread safety, this method should be
	 * invoked from the event-dispatching thread.
	 * @throws UnsupportedLookAndFeelException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 * @throws ClassNotFoundException 
	 */
	private static void createAndShowGUI() throws Exception
	{
		UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		
		// Create and set up the window.
		JFrame frame = new JFrame("Facturacion 1.0");
		frame.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		frame.setBounds(new Rectangle(0, 0, 1000, 500));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(true);
		frame.getContentPane().setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		
		ArrayList<String> opciones = new ArrayList<String>();
		opciones.add("Nueva Factura");
		opciones.add("Abrir Factura");
		opciones.add("Buscar Factura");
		FactoryMenu.crearMenuSimple(menuBar, "Facturas", opciones);
		
//		menuBar.add(Box.createVerticalStrut(10));
		menuBar.add(Box.createHorizontalStrut(2));
		
		ArrayList<String> opciones2 = new ArrayList<String>();
		opciones2.add("Nuevo Cliente");
		opciones2.add("Abrir Cliente");
		opciones2.add("Buscar Cliente");
		FactoryMenu.crearMenuSimple(menuBar, "Clientes", opciones2);

		menuBar.setBounds(0, 0, frame.getWidth(), 30);
		frame.getContentPane().add(menuBar);
		
		frame.getContentPane().addComponentListener(new ComponentAdapter() {
			@Override
			public void componentResized(ComponentEvent e) {
				Component cMenuBar = e.getComponent().getComponentAt(0, 0);
				cMenuBar.setSize(e.getComponent().getWidth(), cMenuBar.getHeight());
			}
		});

		frame.setVisible(true);
	}

//	private static void crearMenuClientes()
//	{
//		
//	}
//
//	private static void crearMenuFacturas()
//	{
//		// TODO Auto-generated method stub
//		
//	}

	public static void main(String[] args)
	{
		// Schedule a job for the event-dispatching thread:
		// creating and showing this application's GUI.
		javax.swing.SwingUtilities.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					createAndShowGUI();
				} catch (Exception e)
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
	}
}
