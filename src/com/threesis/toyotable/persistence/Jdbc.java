package com.threesis.toyotable.persistence;

import java.awt.Component;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class Jdbc {
	public static Jdbc BD = new Jdbc();
	public static Connection conn = null;
	public static Statement stmt = null;
	public static ResultSet rs = null;

	@SuppressWarnings("deprecation")
	public static Connection getConexao() {
		Connection conn = null;
		String url = "jdbc:informix-sqli://10.11.71.2:1528/sisdia:INFORMIXSERVER=ol_standard;user=informix;password=thamay87";

		try {
			Class.forName("com.informix.jdbc.IfxDriver");
			System.out.println("Conexao OK");
		} catch (Exception arg6) {
			JOptionPane.showMessageDialog((Component) null, "Erro de inicialização.", "Erro", 0,
					new ImageIcon("/view/imagens/toyota2.png"));
		}

		try {
			conn = DriverManager.getConnection(url);
		} catch (SQLException arg5) {
			JOptionPane pane = new JOptionPane("Falha de conexão com o Banco de Dados.");
			JDialog dialog = pane.createDialog((String) null);
			dialog.setModal(true);
			Timer timer = new Timer(10000, (ActionListener) dialog);
			timer.start();
			dialog.show();
			timer.stop();
		}

		return conn;
	}

	public static Connection getConexao2() {
		Connection conn = null;
		String url = "jdbc:informix-sqli://10.11.70.1:1528/sisdia:INFORMIXSERVER=ol_standard;user=informix;password=thamay87";

		try {
			Class.forName("com.informix.jdbc.IfxDriver");
			System.out.println("Conexao OK");
		} catch (Exception arg3) {
			JOptionPane.showMessageDialog((Component) null, "Erro de inicialização.", "Erro", 0,
					new ImageIcon("/view/imagens/toyota2.png"));
		}

		try {
			conn = DriverManager.getConnection(url);
		} catch (SQLException arg2) {
			getConexao2();
		}

		return conn;
	}

	public static Jdbc getBD() {
		return BD;
	}

	public static void setBD(Jdbc bD) {
		BD = bD;
	}
}