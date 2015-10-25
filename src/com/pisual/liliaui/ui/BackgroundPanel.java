package com.pisual.liliaui.ui;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JPanel;

public class BackgroundPanel extends JPanel {
	Image im;
	public BackgroundPanel(Image im)
	{
	this.im=im;
	this.setBounds(0, 0, 1280, 720);
	this.setOpaque(false);
	this.setLayout(new BorderLayout());
	}
	public void paintComponent(Graphics g)
	{
	super.paintComponents(g);
	g.drawImage(im,0,0,this.getWidth(),this.getHeight(),this);

	}
}
