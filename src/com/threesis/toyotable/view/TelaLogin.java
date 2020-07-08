package com.threesis.toyotable.view;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JWindow;
import javax.swing.Timer;

public class TelaLogin extends JWindow {
	public static final long serialVersionUID = 1L;
	public int duration;
	public JProgressBar progressBar = new JProgressBar();
	public Timer timer = null;

	public static void main(String[] args) {
		TelaLogin splash = new TelaLogin(10000);
		splash.showSplash();
	}

	public TelaLogin(int d) {
		this.duration = d;
	}

	public void initialize() {
		JPanel content = (JPanel) this.getContentPane();
		short width = 600;
		short height = 526;
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int x = (screen.width - width) / 2;
		int y = (screen.height - height) / 2;
		this.setBounds(x, y, width, height);
		JLabel label = new JLabel(new ImageIcon(TelaLogin.class.getResource("toyotable.jpg")));
		content.add(label, "Center");
		this.setVisible(true);
		this.progressBar.setBounds(0, 425, 600, 16);
		content.add(this.progressBar);
		timer = new Timer(98, new java.awt.event.ActionListener() {
			private int step = 0;

			public void actionPerformed(java.awt.event.ActionEvent e) {
				step += 1;
				progressBar.setValue(step);
				if (step == 120) {
					dispose();
				}
			}
		});
		timer.start();
		try {
			Thread.sleep(duration);
		} catch (Exception localException) {
		}
		setVisible(false);
	}

	public void showSplash() {
		this.initialize();
		TelaPrincipal tp = new TelaPrincipal();
		tp.ShowTelaPrincipal();
	}
}