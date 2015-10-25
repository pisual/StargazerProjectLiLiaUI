package com.pisual.liliaui.ui;

import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JScrollPane;



public class LiliaUIStart {
	public LiliaUIStart() {
		try {
		      LiliaForm form = new LiliaForm("StargazerProjectLiLiaUI");
		      form.setIconImage(Toolkit.getDefaultToolkit().getImage(System.getProperty("user.dir") + "/pisualcells" + "/ui/"+ "ban.png"));
		      
			  ConsoleTextArea consoleTextArea = new ConsoleTextArea();
		      
		      JScrollPane jScrollPane  = new JScrollPane(consoleTextArea);
		      jScrollPane.setOpaque(false);
		      jScrollPane.getViewport().setOpaque(false);
		      
			  BackgroundPanel backgroundPanel = new BackgroundPanel((new ImageIcon(System.getProperty("user.dir") + "/pisualcells/ui/"+ "LiliaUI.png")).getImage());
			  backgroundPanel.add(jScrollPane);
			  
			  form.add(backgroundPanel);
			  form.setVisible(true);
		      
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
	public static void main(String[] args) {
		LiliaUIStart liliaUIStart = new LiliaUIStart();
		System.out.println("StargazerProjectLiLiaUI Has Start Success");
	}
}
