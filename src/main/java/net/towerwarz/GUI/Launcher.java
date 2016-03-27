package net.towerwarz.GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;

public class Launcher{

	/**
	 * Launch the launcher.
	 */
	public static void startLauncher() {
		System.out.println("Starting Launcher");
		JFrame jframe = new JFrame("TowerWarZ");
		jframe.setVisible(true);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.setSize(600, 600);
		jframe.setVisible(true);
		
	}

	

}
