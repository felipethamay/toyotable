package com.threesis.toyotable.view;

import com.threesis.toyotable.model.Quadro;
import com.threesis.toyotable.persistence.Persistencia;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.LayoutManager;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

public class TelaPrincipal extends JFrame {
	private static final long serialVersionUID = 1L;
	TelaPrincipal inicio;
	int cont = 0;

	JPanel panel1 = new JPanel();
	JLabel lblHora = new JLabel("");
	JLabel lblDia = new JLabel("");

	JPanel panel2 = new JPanel();
	JLabel lblHora2 = new JLabel("");
	JLabel lblDia2 = new JLabel("");

	JPanel panel3 = new JPanel();
	JLabel lblHora3 = new JLabel("");
	JLabel lblDia3 = new JLabel("");
	JButton btnSair3 = new JButton("Sair");
	JButton btnProximo3 = new JButton("Proximo");
	JLabel lblImagePrincipal3 = new JLabel("");

	JPanel panel4 = new JPanel();
	JLabel lblHora4 = new JLabel("");
	JLabel lblDia4 = new JLabel("");
	JButton btnSair4 = new JButton("Sair");
	JButton btnProximo4 = new JButton("Proximo");
	JLabel lblImagePrincipal4 = new JLabel("");

	JPanel panel5 = new JPanel();
	JLabel lblHora5 = new JLabel("");
	JLabel lblDia5 = new JLabel("");
	JButton btnSair5 = new JButton("Sair");
	JButton btnProximo5 = new JButton("Proximo");
	JLabel lblImagePrincipal5 = new JLabel("");

	JPanel panel6 = new JPanel();
	JLabel lblHora6 = new JLabel("");
	JLabel lblDia6 = new JLabel("");
	JButton btnSair6 = new JButton("Sair");
	JButton btnProximo6 = new JButton("Proximo");
	JLabel lblImagePrincipal6 = new JLabel("");

	JLabel lblSegunda800 = new JLabel("");
	JLabel lblSegunda900 = new JLabel("");
	JLabel lblSegunda1000 = new JLabel("");
	JLabel lblSegunda1100 = new JLabel("");
	JLabel lblSegunda1200 = new JLabel("");
	JLabel lblSegunda1300 = new JLabel("");
	JLabel lblSegunda1400 = new JLabel("");
	JLabel lblSegunda1500 = new JLabel("");
	JLabel lblSegunda1600 = new JLabel("");
	JLabel lblSegunda1700 = new JLabel("");
	JLabel lblTerca800 = new JLabel("");
	JLabel lblTerca900 = new JLabel("");
	JLabel lblTerca1000 = new JLabel("");
	JLabel lblTerca1100 = new JLabel("");
	JLabel lblTerca1200 = new JLabel("");
	JLabel lblTerca1300 = new JLabel("");
	JLabel lblTerca1400 = new JLabel("");
	JLabel lblTerca1500 = new JLabel("");
	JLabel lblTerca1600 = new JLabel("");
	JLabel lblTerca1700 = new JLabel("");
	JLabel lblQuarta800 = new JLabel("");
	JLabel lblQuarta900 = new JLabel("");
	JLabel lblQuarta1000 = new JLabel("");
	JLabel lblQuarta1100 = new JLabel("");
	JLabel lblQuarta1200 = new JLabel("");
	JLabel lblQuarta1300 = new JLabel("");
	JLabel lblQuarta1400 = new JLabel("");
	JLabel lblQuarta1500 = new JLabel("");
	JLabel lblQuarta1600 = new JLabel("");
	JLabel lblQuarta1700 = new JLabel("");
	JLabel lblQuinta800 = new JLabel("");
	JLabel lblQuinta1300 = new JLabel("");
	JLabel lblQuinta1400 = new JLabel("");
	JLabel lblQuinta1500 = new JLabel("");
	JLabel lblQuinta1600 = new JLabel("");
	JLabel lblQuinta1700 = new JLabel("");
	JLabel lblSexta1300 = new JLabel("");
	JLabel lblSexta1400 = new JLabel("");
	JLabel lblSexta1500 = new JLabel("");
	JLabel lblSexta1600 = new JLabel("");
	JLabel lblSexta1700 = new JLabel("");
	JLabel lblSabado1300 = new JLabel("");
	JLabel lblSabado1400 = new JLabel("");
	JLabel lblSabado1500 = new JLabel("");
	JLabel lblSabado1600 = new JLabel("");
	JLabel lblSabado1700 = new JLabel("");
	JLabel lblQuinta900 = new JLabel("");
	JLabel lblQuinta1000 = new JLabel("");
	JLabel lblQuinta1100 = new JLabel("");
	JLabel lblQuinta1200 = new JLabel("");
	JLabel lblSexta800 = new JLabel("");
	JLabel lblSexta900 = new JLabel("");
	JLabel lblSexta1000 = new JLabel("");
	JLabel lblSexta1100 = new JLabel("");
	JLabel lblSexta1200 = new JLabel("");
	JLabel lblSabado800 = new JLabel("");
	JLabel lblSabado900 = new JLabel("");
	JLabel lblSabado1000 = new JLabel("");
	JLabel lblSabado1100 = new JLabel("");
	JLabel lblSabado1200 = new JLabel("");
	JLabel lblSegunda1800 = new JLabel("");
	JLabel lblSegunda1900 = new JLabel("");
	JLabel lblSegunda2000 = new JLabel("");
	JLabel lblSegunda2100 = new JLabel("");
	JLabel lblSegunda2200 = new JLabel("");
	JLabel lblTerca1800 = new JLabel("");
	JLabel lblTerca1900 = new JLabel("");
	JLabel lblTerca2000 = new JLabel("");
	JLabel lblTerca2100 = new JLabel("");
	JLabel lblTerca2200 = new JLabel("");
	JLabel lblQuarta1800 = new JLabel("");
	JLabel lblQuarta1900 = new JLabel("");
	JLabel lblQuarta2000 = new JLabel("");
	JLabel lblQuarta2100 = new JLabel("");
	JLabel lblQuarta2200 = new JLabel("");
	JLabel lblQuinta1800 = new JLabel("");
	JLabel lblQuinta1900 = new JLabel("");
	JLabel lblQuinta2000 = new JLabel("");
	JLabel lblQuinta2100 = new JLabel("");
	JLabel lblQuinta2200 = new JLabel("");
	JLabel lblSexta1800 = new JLabel("");
	JLabel lblSexta1900 = new JLabel("");
	JLabel lblSexta2000 = new JLabel("");
	JLabel lblSexta2100 = new JLabel("");
	JLabel lblSexta2200 = new JLabel("");
	JLabel lblSabado1800 = new JLabel("");
	JLabel lblSabado1900 = new JLabel("");
	JLabel lblSabado2000 = new JLabel("");
	JLabel lblSabado2100 = new JLabel("");
	JLabel lblSabado2200 = new JLabel("");
	JLabel lbSegundaPanel1 = new JLabel("");
	JLabel lbTercaPanel1 = new JLabel("");
	JLabel lbQuartaPanel1 = new JLabel("");
	JLabel lbQuintaPanel1 = new JLabel("");
	JLabel lbSextaPanel1 = new JLabel("");
	JLabel lbSabadoPanel1 = new JLabel("");
	JLabel lbSegundaPanel2 = new JLabel("");
	JLabel lbTercaPanel2 = new JLabel("");
	JLabel lbQuartaPanel2 = new JLabel("");
	JLabel lbQuintaPanel2 = new JLabel("");
	JLabel lbSextaPanel2 = new JLabel("");
	JLabel lbSabadoPanel2 = new JLabel("");
	JLabel lbSegundaPanel3 = new JLabel("");
	JLabel lbTercaPanel3 = new JLabel("");
	JLabel lbQuartaPanel3 = new JLabel("");
	JLabel lbQuintaPanel3 = new JLabel("");
	JLabel lbSextaPanel3 = new JLabel("");
	JLabel lbSabadoPanel3 = new JLabel("");
	JLabel lbDomingoPanel1 = new JLabel("");
	JLabel lblDomingo800 = new JLabel("");
	JLabel lblDomingo900 = new JLabel("");
	JLabel lblDomingo1000 = new JLabel("");
	JLabel lblDomingo1100 = new JLabel("");
	JLabel lblDomingo1200 = new JLabel("");
	JLabel lbDomingoPanel2 = new JLabel("");
	JLabel lbDomingoPanel3 = new JLabel("");
	JLabel lblDomingo1300 = new JLabel("");
	JLabel lblDomingo1400 = new JLabel("");
	JLabel lblDomingo1500 = new JLabel("");
	JLabel lblDomingo1600 = new JLabel("");
	JLabel lblDomingo1700 = new JLabel("");
	JLabel lblDomingo1800 = new JLabel("");
	JLabel lblDomingo1900 = new JLabel("");
	JLabel lblDomingo2000 = new JLabel("");
	JLabel lblDomingo2100 = new JLabel("");
	JLabel lblDomingo2200 = new JLabel("");
	JLabel lbSegundaPanel4 = new JLabel("");
	JLabel lbTercaPanel4 = new JLabel("");
	JLabel lbQuartaPanel4 = new JLabel("");
	JLabel lbQuintaPanel4 = new JLabel("");
	JLabel lbSextaPanel4 = new JLabel("");
	JLabel lbSabadoPanel4 = new JLabel("");
	JLabel lbDomingoPanel4 = new JLabel("");
	JLabel lbSegundaPanel5 = new JLabel("");
	JLabel lbTercaPanel5 = new JLabel("");
	JLabel lbQuartaPanel5 = new JLabel("");
	JLabel lbQuintaPanel5 = new JLabel("");
	JLabel lbSextaPanel5 = new JLabel("");
	JLabel lbSabadoPanel5 = new JLabel("");
	JLabel lbDomingoPanel5 = new JLabel("");
	JLabel lbSegundaPanel6 = new JLabel("");
	JLabel lbTercaPanel6 = new JLabel("");
	JLabel lbQuartaPanel6 = new JLabel("");
	JLabel lbQuintaPanel6 = new JLabel("");
	JLabel lbSextaPanel6 = new JLabel("");
	JLabel lbSabadoPanel6 = new JLabel("");
	JLabel lbDomingoPanel6 = new JLabel("");
	JLabel lblSegunda830 = new JLabel("");
	JLabel lblSegunda930 = new JLabel("");
	JLabel lblSegunda1030 = new JLabel("");
	JLabel lblSegunda1130 = new JLabel("");
	JLabel lblSegunda1230 = new JLabel("");
	JLabel lblSegunda1330 = new JLabel("");
	JLabel lblSegunda1430 = new JLabel("");
	JLabel lblSegunda1530 = new JLabel("");
	JLabel lblSegunda1630 = new JLabel("");
	JLabel lblSegunda1730 = new JLabel("");
	JLabel lblSegunda1830 = new JLabel("");
	JLabel lblSegunda1930 = new JLabel("");
	JLabel lblSegunda2030 = new JLabel("");
	JLabel lblSegunda2130 = new JLabel("");
	JLabel lblSegunda2230 = new JLabel("");
	JLabel lblSegunda2300 = new JLabel("");
	JLabel lblTerca830 = new JLabel("");
	JLabel lblTerca930 = new JLabel("");
	JLabel lblTerca1030 = new JLabel("");
	JLabel lblTerca1130 = new JLabel("");
	JLabel lblTerca1230 = new JLabel("");
	JLabel lblTerca1330 = new JLabel("");
	JLabel lblTerca1430 = new JLabel("");
	JLabel lblTerca1530 = new JLabel("");
	JLabel lblTerca1630 = new JLabel("");
	JLabel lblTerca1730 = new JLabel("");
	JLabel lblTerca1830 = new JLabel("");
	JLabel lblTerca1930 = new JLabel("");
	JLabel lblTerca2030 = new JLabel("");
	JLabel lblTerca2130 = new JLabel("");
	JLabel lblTerca2230 = new JLabel("");
	JLabel lblTerca2300 = new JLabel("");
	JLabel lblQuarta830 = new JLabel("");
	JLabel lblQuarta930 = new JLabel("");
	JLabel lblQuarta1030 = new JLabel("");
	JLabel lblQuarta1130 = new JLabel("");
	JLabel lblQuarta1230 = new JLabel("");
	JLabel lblQuarta1330 = new JLabel("");
	JLabel lblQuarta1430 = new JLabel("");
	JLabel lblQuarta1530 = new JLabel("");
	JLabel lblQuarta1630 = new JLabel("");
	JLabel lblQuarta1730 = new JLabel("");
	JLabel lblQuarta1830 = new JLabel("");
	JLabel lblQuarta1930 = new JLabel("");
	JLabel lblQuarta2030 = new JLabel("");
	JLabel lblQuarta2130 = new JLabel("");
	JLabel lblQuarta2230 = new JLabel("");
	JLabel lblQuarta2300 = new JLabel("");
	JLabel lblQuinta830 = new JLabel("");
	JLabel lblQuinta930 = new JLabel("");
	JLabel lblQuinta1030 = new JLabel("");
	JLabel lblQuinta1130 = new JLabel("");
	JLabel lblQuinta1230 = new JLabel("");
	JLabel lblQuinta1330 = new JLabel("");
	JLabel lblQuinta1430 = new JLabel("");
	JLabel lblQuinta1530 = new JLabel("");
	JLabel lblQuinta1630 = new JLabel("");
	JLabel lblQuinta1730 = new JLabel("");
	JLabel lblQuinta1830 = new JLabel("");
	JLabel lblQuinta1930 = new JLabel("");
	JLabel lblQuinta2030 = new JLabel("");
	JLabel lblQuinta2130 = new JLabel("");
	JLabel lblQuinta2230 = new JLabel("");
	JLabel lblQuinta2300 = new JLabel("");
	JLabel lblSexta830 = new JLabel("");
	JLabel lblSexta930 = new JLabel("");
	JLabel lblSexta1030 = new JLabel("");
	JLabel lblSexta1130 = new JLabel("");
	JLabel lblSexta1230 = new JLabel("");
	JLabel lblSexta1330 = new JLabel("");
	JLabel lblSexta1430 = new JLabel("");
	JLabel lblSexta1530 = new JLabel("");
	JLabel lblSexta1630 = new JLabel("");
	JLabel lblSexta1730 = new JLabel("");
	JLabel lblSexta1830 = new JLabel("");
	JLabel lblSexta1930 = new JLabel("");
	JLabel lblSexta2030 = new JLabel("");
	JLabel lblSexta2130 = new JLabel("");
	JLabel lblSexta2230 = new JLabel("");
	JLabel lblSexta2300 = new JLabel("");
	JLabel lblSabado830 = new JLabel("");
	JLabel lblSabado930 = new JLabel("");
	JLabel lblSabado1030 = new JLabel("");
	JLabel lblSabado1130 = new JLabel("");
	JLabel lblSabado1230 = new JLabel("");
	JLabel lblSabado1330 = new JLabel("");
	JLabel lblSabado1430 = new JLabel("");
	JLabel lblSabado1530 = new JLabel("");
	JLabel lblSabado1630 = new JLabel("");
	JLabel lblSabado1730 = new JLabel("");
	JLabel lblSabado1830 = new JLabel("");
	JLabel lblSabado1930 = new JLabel("");
	JLabel lblSabado2030 = new JLabel("");
	JLabel lblSabado2130 = new JLabel("");
	JLabel lblSabado2230 = new JLabel("");
	JLabel lblSabado2300 = new JLabel("");
	JLabel lblDomingo830 = new JLabel("");
	JLabel lblDomingo930 = new JLabel("");
	JLabel lblDomingo1030 = new JLabel("");
	JLabel lblDomingo1130 = new JLabel("");
	JLabel lblDomingo1230 = new JLabel("");
	JLabel lblDomingo1330 = new JLabel("");
	JLabel lblDomingo1430 = new JLabel("");
	JLabel lblDomingo1530 = new JLabel("");
	JLabel lblDomingo1630 = new JLabel("");
	JLabel lblDomingo1730 = new JLabel("");
	JLabel lblDomingo1830 = new JLabel("");
	JLabel lblDomingo1930 = new JLabel("");
	JLabel lblDomingo2030 = new JLabel("");
	JLabel lblDomingo2130 = new JLabel("");
	JLabel lblDomingo2230 = new JLabel("");
	JLabel lblDomingo2300 = new JLabel("");

	public TelaPrincipal() {
		this.setDefaultCloseOperation(3);
		this.setTitle("TOYOTABLE - Quadro de Entregas");
		this.setBounds(200, 200, 1920, 1080);
		this.setIconImage(
				Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("/view/imagens/toyota.png")));
		this.dispose();
		this.setLocationRelativeTo((Component) null);
		this.getContentPane().setLayout((LayoutManager) null);

		this.preencheQuadro();
		this.atualizaLabels();

		this.geraTitulosPanel1();
		this.geraTitulosPanel2();
		this.geraTitulosPanel3();
		this.geraTitulosPanel4();
		this.geraTitulosPanel5();
		this.geraTitulosPanel6();

		this.panel1.setBounds(0, 0, 1920, 1080);
		this.getContentPane().add(this.panel1);
		this.panel1.setLayout((LayoutManager) null);

		this.panel2.setBounds(0, 0, 1920, 1080);
		this.getContentPane().add(this.panel2);
		this.panel2.setLayout((LayoutManager) null);

		JButton btnSair2 = new JButton("Sair");
		btnSair2.setBackground(new Color(232, 227, 227));
		btnSair2.setBorderPainted(false);
		btnSair2.setFont(new Font("Calibri Light", 0, 14));
		btnSair2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		this.lblHora.setHorizontalAlignment(0);
		this.lblHora.setFont(new Font("Calibri Light", 0, 109));
		this.lblHora.setForeground(Color.WHITE);
		this.lblHora.setBounds(129, 90, 271, 88);
		this.panel2.add(this.lblHora);
		this.lblDia.setHorizontalAlignment(0);
		this.lblDia.setFont(new Font("Calibri Light", 0, 21));
		this.lblDia.setForeground(Color.WHITE);
		this.lblDia.setBounds(159, 177, 211, 34);
		this.panel2.add(this.lblDia);
		this.lbDomingoPanel2.setHorizontalAlignment(0);
		this.lbDomingoPanel2.setForeground(Color.WHITE);
		this.lbDomingoPanel2.setFont(new Font("Calibri Light", 0, 22));
		this.lbDomingoPanel2.setBounds(231, 232, 220, 60);
		this.panel2.add(this.lbDomingoPanel2);
		this.lbSegundaPanel2.setHorizontalAlignment(0);
		this.lbSegundaPanel2.setForeground(Color.WHITE);
		this.lbSegundaPanel2.setFont(new Font("Calibri Light", 0, 22));
		this.lbSegundaPanel2.setBounds(458, 232, 220, 60);
		this.panel2.add(this.lbSegundaPanel2);
		this.lbTercaPanel2.setHorizontalAlignment(0);
		this.lbTercaPanel2.setForeground(Color.WHITE);
		this.lbTercaPanel2.setFont(new Font("Calibri Light", 0, 22));
		this.lbTercaPanel2.setBounds(687, 232, 220, 60);
		this.panel2.add(this.lbTercaPanel2);
		this.lbQuartaPanel2.setHorizontalAlignment(0);
		this.lbQuartaPanel2.setForeground(Color.WHITE);
		this.lbQuartaPanel2.setFont(new Font("Calibri Light", 0, 22));
		this.lbQuartaPanel2.setBounds(915, 232, 220, 60);
		this.panel2.add(this.lbQuartaPanel2);
		this.lbQuintaPanel2.setHorizontalAlignment(0);
		this.lbQuintaPanel2.setForeground(Color.WHITE);
		this.lbQuintaPanel2.setFont(new Font("Calibri Light", 0, 22));
		this.lbQuintaPanel2.setBounds(1143, 232, 220, 60);
		this.panel2.add(this.lbQuintaPanel2);
		this.lbSextaPanel2.setHorizontalAlignment(0);
		this.lbSextaPanel2.setForeground(Color.WHITE);
		this.lbSextaPanel2.setFont(new Font("Calibri Light", 0, 22));
		this.lbSextaPanel2.setBounds(1371, 232, 220, 60);
		this.panel2.add(this.lbSextaPanel2);
		this.lbSabadoPanel2.setHorizontalAlignment(0);
		this.lbSabadoPanel2.setForeground(Color.WHITE);
		this.lbSabadoPanel2.setFont(new Font("Calibri Light", 0, 22));
		this.lbSabadoPanel2.setBounds(1599, 232, 220, 60);
		this.panel2.add(this.lbSabadoPanel2);
		this.lblDomingo1030.setForeground(Color.WHITE);
		this.lblDomingo1030.setFont(new Font("Calibri Light", 0, 16));
		this.lblDomingo1030.setBounds(231, 301, 220, 129);
		this.panel2.add(this.lblDomingo1030);
		this.lblDomingo1100.setForeground(Color.WHITE);
		this.lblDomingo1100.setFont(new Font("Calibri Light", 0, 16));
		this.lblDomingo1100.setBounds(231, 440, 220, 129);
		this.panel2.add(this.lblDomingo1100);
		this.lblDomingo1130.setForeground(Color.WHITE);
		this.lblDomingo1130.setFont(new Font("Calibri Light", 0, 16));
		this.lblDomingo1130.setBounds(231, 580, 220, 129);
		this.panel2.add(this.lblDomingo1130);
		this.lblDomingo1200.setForeground(Color.WHITE);
		this.lblDomingo1200.setFont(new Font("Calibri Light", 0, 16));
		this.lblDomingo1200.setBounds(231, 718, 220, 129);
		this.panel2.add(this.lblDomingo1200);
		this.lblDomingo1230.setForeground(Color.WHITE);
		this.lblDomingo1230.setFont(new Font("Calibri Light", 0, 16));
		this.lblDomingo1230.setBounds(231, 857, 220, 129);
		this.panel2.add(this.lblDomingo1230);
		this.lblSegunda1030.setBounds(458, 301, 220, 129);
		this.panel2.add(this.lblSegunda1030);
		this.lblSegunda1030.setForeground(Color.WHITE);
		this.lblSegunda1030.setFont(new Font("Calibri Light", 0, 16));
		this.lblSegunda1100.setBounds(458, 440, 220, 129);
		this.panel2.add(this.lblSegunda1100);
		this.lblSegunda1100.setForeground(Color.WHITE);
		this.lblSegunda1100.setFont(new Font("Calibri Light", 0, 16));
		this.lblSegunda1130.setBounds(458, 579, 220, 129);
		this.panel2.add(this.lblSegunda1130);
		this.lblSegunda1130.setForeground(Color.WHITE);
		this.lblSegunda1130.setFont(new Font("Calibri Light", 0, 16));
		this.lblSegunda1200.setBounds(458, 718, 220, 129);
		this.panel2.add(this.lblSegunda1200);
		this.lblSegunda1200.setForeground(Color.WHITE);
		this.lblSegunda1200.setFont(new Font("Calibri Light", 0, 16));
		this.lblSegunda1230.setBounds(458, 857, 220, 129);
		this.panel2.add(this.lblSegunda1230);
		this.lblSegunda1230.setForeground(Color.WHITE);
		this.lblSegunda1230.setFont(new Font("Calibri Light", 0, 16));
		this.lblTerca1030.setBounds(687, 301, 220, 129);
		this.panel2.add(this.lblTerca1030);
		this.lblTerca1030.setForeground(Color.WHITE);
		this.lblTerca1030.setFont(new Font("Calibri Light", 0, 16));
		this.lblTerca1100.setBounds(687, 440, 220, 129);
		this.panel2.add(this.lblTerca1100);
		this.lblTerca1100.setForeground(Color.WHITE);
		this.lblTerca1100.setFont(new Font("Calibri Light", 0, 16));
		this.lblTerca1130.setBounds(687, 580, 220, 129);
		this.panel2.add(this.lblTerca1130);
		this.lblTerca1130.setForeground(Color.WHITE);
		this.lblTerca1130.setFont(new Font("Calibri Light", 0, 16));
		this.lblTerca1200.setBounds(687, 719, 220, 129);
		this.panel2.add(this.lblTerca1200);
		this.lblTerca1200.setForeground(Color.WHITE);
		this.lblTerca1200.setFont(new Font("Calibri Light", 0, 16));
		this.lblTerca1230.setBounds(687, 858, 220, 129);
		this.panel2.add(this.lblTerca1230);
		this.lblTerca1230.setForeground(Color.WHITE);
		this.lblTerca1230.setFont(new Font("Calibri Light", 0, 16));
		this.lblQuarta1030.setBounds(915, 301, 220, 129);
		this.panel2.add(this.lblQuarta1030);
		this.lblQuarta1030.setForeground(Color.WHITE);
		this.lblQuarta1030.setFont(new Font("Calibri Light", 0, 16));
		this.lblQuarta1100.setBounds(915, 440, 220, 129);
		this.panel2.add(this.lblQuarta1100);
		this.lblQuarta1100.setForeground(Color.WHITE);
		this.lblQuarta1100.setFont(new Font("Calibri Light", 0, 16));
		this.lblQuarta1130.setBounds(915, 580, 220, 129);
		this.panel2.add(this.lblQuarta1130);
		this.lblQuarta1130.setForeground(Color.WHITE);
		this.lblQuarta1130.setFont(new Font("Calibri Light", 0, 16));
		this.lblQuarta1200.setBounds(915, 719, 220, 129);
		this.panel2.add(this.lblQuarta1200);
		this.lblQuarta1200.setForeground(Color.WHITE);
		this.lblQuarta1200.setFont(new Font("Calibri Light", 0, 16));
		this.lblQuarta1230.setBounds(915, 858, 220, 129);
		this.panel2.add(this.lblQuarta1230);
		this.lblQuarta1230.setForeground(Color.WHITE);
		this.lblQuarta1230.setFont(new Font("Calibri Light", 0, 16));
		this.lblQuinta1030.setBounds(1143, 301, 220, 129);
		this.panel2.add(this.lblQuinta1030);
		this.lblQuinta1030.setForeground(Color.WHITE);
		this.lblQuinta1030.setFont(new Font("Calibri Light", 0, 16));
		this.lblQuinta1100.setBounds(1143, 440, 220, 129);
		this.panel2.add(this.lblQuinta1100);
		this.lblQuinta1100.setForeground(Color.WHITE);
		this.lblQuinta1100.setFont(new Font("Calibri Light", 0, 16));
		this.lblQuinta1130.setBounds(1143, 580, 220, 129);
		this.panel2.add(this.lblQuinta1130);
		this.lblQuinta1130.setForeground(Color.WHITE);
		this.lblQuinta1130.setFont(new Font("Calibri Light", 0, 16));
		this.lblQuinta1200.setBounds(1143, 719, 220, 129);
		this.panel2.add(this.lblQuinta1200);
		this.lblQuinta1200.setForeground(Color.WHITE);
		this.lblQuinta1200.setFont(new Font("Calibri Light", 0, 16));
		this.lblQuinta1230.setBounds(1143, 858, 220, 129);
		this.panel2.add(this.lblQuinta1230);
		this.lblQuinta1230.setForeground(Color.WHITE);
		this.lblQuinta1230.setFont(new Font("Calibri Light", 0, 16));
		this.lblSexta1030.setBounds(1371, 301, 220, 129);
		this.panel2.add(this.lblSexta1030);
		this.lblSexta1030.setForeground(Color.WHITE);
		this.lblSexta1030.setFont(new Font("Calibri Light", 0, 16));
		this.lblSexta1100.setBounds(1371, 440, 220, 129);
		this.panel2.add(this.lblSexta1100);
		this.lblSexta1100.setForeground(Color.WHITE);
		this.lblSexta1100.setFont(new Font("Calibri Light", 0, 16));
		this.lblSexta1130.setBounds(1371, 580, 220, 129);
		this.panel2.add(this.lblSexta1130);
		this.lblSexta1130.setForeground(Color.WHITE);
		this.lblSexta1130.setFont(new Font("Calibri Light", 0, 16));
		this.lblSexta1200.setBounds(1371, 719, 220, 129);
		this.panel2.add(this.lblSexta1200);
		this.lblSexta1200.setForeground(Color.WHITE);
		this.lblSexta1200.setFont(new Font("Calibri Light", 0, 16));
		this.lblSexta1230.setBounds(1371, 858, 220, 129);
		this.panel2.add(this.lblSexta1230);
		this.lblSexta1230.setForeground(Color.WHITE);
		this.lblSexta1230.setFont(new Font("Calibri Light", 0, 16));
		this.lblSabado1030.setBounds(1599, 301, 220, 129);
		this.panel2.add(this.lblSabado1030);
		this.lblSabado1030.setForeground(Color.WHITE);
		this.lblSabado1030.setFont(new Font("Calibri Light", 0, 16));
		this.lblSabado1100.setBounds(1599, 440, 220, 129);
		this.panel2.add(this.lblSabado1100);
		this.lblSabado1100.setForeground(Color.WHITE);
		this.lblSabado1100.setFont(new Font("Calibri Light", 0, 16));
		this.lblSabado1130.setBounds(1599, 580, 220, 129);
		this.panel2.add(this.lblSabado1130);
		this.lblSabado1130.setForeground(Color.WHITE);
		this.lblSabado1130.setFont(new Font("Calibri Light", 0, 16));
		this.lblSabado1200.setBounds(1599, 719, 220, 129);
		this.panel2.add(this.lblSabado1200);
		this.lblSabado1200.setForeground(Color.WHITE);
		this.lblSabado1200.setFont(new Font("Calibri Light", 0, 16));
		this.lblSabado1230.setBounds(1599, 858, 220, 129);
		this.panel2.add(this.lblSabado1230);
		this.lblSabado1230.setForeground(Color.WHITE);
		this.lblSabado1230.setFont(new Font("Calibri Light", 0, 16));
		btnSair2.setBounds(1560, 1023, 119, 23);
		this.panel2.add(btnSair2);
		JButton btnProximo2 = new JButton("Proximo");
		btnProximo2.setBackground(new Color(232, 227, 227));
		btnProximo2.setBorderPainted(false);
		btnProximo2.setFont(new Font("Calibri Light", 0, 14));
		btnProximo2.setBounds(1691, 1023, 119, 23);
		this.panel2.add(btnProximo2);
		JLabel lblImagePrincipal2 = new JLabel("");
		lblImagePrincipal2.setBounds(0, 0, 1920, 1080);
		lblImagePrincipal2
				.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/view/imagens/board-toyotable2.jpg")));
		this.panel2.add(lblImagePrincipal2);
		ActionListener tarefa = (new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AtualizadorHora();
				AtualizadorDia();
			}
		});
		Timer time = new Timer(1000, tarefa);
		time.start();
		JButton btnSair1 = new JButton("Sair");
		btnSair1.setBackground(new Color(232, 227, 227));
		btnSair1.setBorderPainted(false);
		btnSair1.setFont(new Font("Calibri Light", 0, 14));
		btnSair1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		this.lblHora2.setHorizontalAlignment(0);
		this.lblHora2.setForeground(Color.WHITE);
		this.lblHora2.setFont(new Font("Calibri Light", 0, 109));
		this.lblHora2.setBounds(129, 90, 271, 88);
		this.panel1.add(this.lblHora2);
		this.lblDia2.setHorizontalAlignment(0);
		this.lblDia2.setForeground(Color.WHITE);
		this.lblDia2.setFont(new Font("Calibri Light", 0, 21));
		this.lblDia2.setBounds(159, 177, 211, 34);

		this.panel1.add(this.lblDia2);
		this.lbDomingoPanel1.setHorizontalAlignment(0);
		this.lbDomingoPanel1.setForeground(Color.WHITE);
		this.lbDomingoPanel1.setFont(new Font("Calibri Light", 0, 22));
		this.lbDomingoPanel1.setBounds(231, 232, 220, 60);
		this.panel1.add(this.lbDomingoPanel1);
		this.lbSegundaPanel1.setHorizontalAlignment(0);
		this.lbSegundaPanel1.setForeground(Color.WHITE);
		this.lbSegundaPanel1.setFont(new Font("Calibri Light", 0, 22));
		this.lbSegundaPanel1.setBounds(458, 232, 220, 60);
		this.panel1.add(this.lbSegundaPanel1);
		this.lbTercaPanel1.setHorizontalAlignment(0);
		this.lbTercaPanel1.setForeground(Color.WHITE);
		this.lbTercaPanel1.setFont(new Font("Calibri Light", 0, 22));
		this.lbTercaPanel1.setBounds(687, 232, 220, 60);
		this.panel1.add(this.lbTercaPanel1);
		this.lbQuartaPanel1.setHorizontalAlignment(0);
		this.lbQuartaPanel1.setForeground(Color.WHITE);
		this.lbQuartaPanel1.setFont(new Font("Calibri Light", 0, 22));
		this.lbQuartaPanel1.setBounds(915, 232, 220, 60);
		this.panel1.add(this.lbQuartaPanel1);
		this.lbQuintaPanel1.setHorizontalAlignment(0);
		this.lbQuintaPanel1.setForeground(Color.WHITE);
		this.lbQuintaPanel1.setFont(new Font("Calibri Light", 0, 22));
		this.lbQuintaPanel1.setBounds(1143, 232, 220, 60);
		this.panel1.add(this.lbQuintaPanel1);
		this.lbSextaPanel1.setHorizontalAlignment(0);
		this.lbSextaPanel1.setForeground(Color.WHITE);
		this.lbSextaPanel1.setFont(new Font("Calibri Light", 0, 22));
		this.lbSextaPanel1.setBounds(1371, 232, 220, 60);
		this.panel1.add(this.lbSextaPanel1);
		this.lbSabadoPanel1.setHorizontalAlignment(0);
		this.lbSabadoPanel1.setForeground(Color.WHITE);
		this.lbSabadoPanel1.setFont(new Font("Calibri Light", 0, 22));
		this.lbSabadoPanel1.setBounds(1599, 232, 220, 60);
		this.panel1.add(this.lbSabadoPanel1);
		this.lblDomingo800.setForeground(Color.WHITE);
		this.lblDomingo800.setFont(new Font("Calibri Light", 0, 16));
		this.lblDomingo800.setBounds(231, 301, 220, 129);
		this.panel1.add(this.lblDomingo800);
		this.lblDomingo830.setForeground(Color.WHITE);
		this.lblDomingo830.setFont(new Font("Calibri Light", 0, 16));
		this.lblDomingo830.setBounds(231, 440, 220, 129);
		this.panel1.add(this.lblDomingo830);
		this.lblDomingo900.setForeground(Color.WHITE);
		this.lblDomingo900.setFont(new Font("Calibri Light", 0, 16));
		this.lblDomingo900.setBounds(231, 580, 220, 129);
		this.panel1.add(this.lblDomingo900);
		this.lblDomingo930.setForeground(Color.WHITE);
		this.lblDomingo930.setFont(new Font("Calibri Light", 0, 16));
		this.lblDomingo930.setBounds(231, 718, 220, 129);
		this.panel1.add(this.lblDomingo930);
		this.lblDomingo1000.setForeground(Color.WHITE);
		this.lblDomingo1000.setFont(new Font("Calibri Light", 0, 16));
		this.lblDomingo1000.setBounds(231, 857, 220, 129);
		this.panel1.add(this.lblDomingo1000);
		this.lblSegunda800.setForeground(Color.WHITE);
		this.lblSegunda800.setFont(new Font("Calibri Light", 0, 16));
		this.lblSegunda800.setBounds(458, 301, 220, 129);
		this.panel1.add(this.lblSegunda800);
		this.lblSegunda830.setForeground(Color.WHITE);
		this.lblSegunda830.setFont(new Font("Calibri Light", 0, 16));
		this.lblSegunda830.setBounds(458, 440, 220, 129);
		this.panel1.add(this.lblSegunda830);
		this.lblSegunda900.setForeground(Color.WHITE);
		this.lblSegunda900.setFont(new Font("Calibri Light", 0, 16));
		this.lblSegunda900.setBounds(458, 579, 220, 129);
		this.panel1.add(this.lblSegunda900);
		this.lblSegunda930.setForeground(Color.WHITE);
		this.lblSegunda930.setFont(new Font("Calibri Light", 0, 16));
		this.lblSegunda930.setBounds(458, 718, 220, 129);
		this.panel1.add(this.lblSegunda930);
		this.lblSegunda1000.setForeground(Color.WHITE);
		this.lblSegunda1000.setFont(new Font("Calibri Light", 0, 16));
		this.lblSegunda1000.setBounds(458, 857, 220, 129);
		this.panel1.add(this.lblSegunda1000);
		this.lblTerca800.setForeground(Color.WHITE);
		this.lblTerca800.setFont(new Font("Calibri Light", 0, 16));
		this.lblTerca800.setBounds(687, 301, 220, 129);
		this.panel1.add(this.lblTerca800);
		this.lblTerca830.setForeground(Color.WHITE);
		this.lblTerca830.setFont(new Font("Calibri Light", 0, 16));
		this.lblTerca830.setBounds(687, 440, 220, 129);
		this.panel1.add(this.lblTerca830);
		this.lblTerca900.setForeground(Color.WHITE);
		this.lblTerca900.setFont(new Font("Calibri Light", 0, 16));
		this.lblTerca900.setBounds(687, 580, 220, 129);
		this.panel1.add(this.lblTerca900);
		this.lblTerca930.setForeground(Color.WHITE);
		this.lblTerca930.setFont(new Font("Calibri Light", 0, 16));
		this.lblTerca930.setBounds(687, 719, 220, 129);
		this.panel1.add(this.lblTerca930);
		this.lblTerca1000.setForeground(Color.WHITE);
		this.lblTerca1000.setFont(new Font("Calibri Light", 0, 16));
		this.lblTerca1000.setBounds(687, 858, 220, 129);
		this.panel1.add(this.lblTerca1000);
		this.lblQuarta800.setForeground(Color.WHITE);
		this.lblQuarta800.setFont(new Font("Calibri Light", 0, 16));
		this.lblQuarta800.setBounds(915, 301, 220, 129);
		this.panel1.add(this.lblQuarta800);
		this.lblQuarta830.setForeground(Color.WHITE);
		this.lblQuarta830.setFont(new Font("Calibri Light", 0, 16));
		this.lblQuarta830.setBounds(915, 440, 220, 129);
		this.panel1.add(this.lblQuarta830);
		this.lblQuarta900.setForeground(Color.WHITE);
		this.lblQuarta900.setFont(new Font("Calibri Light", 0, 16));
		this.lblQuarta900.setBounds(915, 580, 220, 129);
		this.panel1.add(this.lblQuarta900);
		this.lblQuarta930.setForeground(Color.WHITE);
		this.lblQuarta930.setFont(new Font("Calibri Light", 0, 16));
		this.lblQuarta930.setBounds(915, 719, 220, 129);
		this.panel1.add(this.lblQuarta930);
		this.lblQuarta1000.setForeground(Color.WHITE);
		this.lblQuarta1000.setFont(new Font("Calibri Light", 0, 16));
		this.lblQuarta1000.setBounds(915, 858, 220, 129);
		this.panel1.add(this.lblQuarta1000);
		this.lblQuinta800.setForeground(Color.WHITE);
		this.lblQuinta800.setFont(new Font("Calibri Light", 0, 16));
		this.lblQuinta800.setBounds(1143, 301, 220, 129);
		this.panel1.add(this.lblQuinta800);
		this.lblQuinta830.setForeground(Color.WHITE);
		this.lblQuinta830.setFont(new Font("Calibri Light", 0, 16));
		this.lblQuinta830.setBounds(1143, 440, 220, 129);
		this.panel1.add(this.lblQuinta830);
		this.lblQuinta900.setForeground(Color.WHITE);
		this.lblQuinta900.setFont(new Font("Calibri Light", 0, 16));
		this.lblQuinta900.setBounds(1143, 580, 220, 129);
		this.panel1.add(this.lblQuinta900);
		this.lblQuinta930.setForeground(Color.WHITE);
		this.lblQuinta930.setFont(new Font("Calibri Light", 0, 16));
		this.lblQuinta930.setBounds(1143, 719, 220, 129);
		this.panel1.add(this.lblQuinta930);
		this.lblQuinta1000.setForeground(Color.WHITE);
		this.lblQuinta1000.setFont(new Font("Calibri Light", 0, 16));
		this.lblQuinta1000.setBounds(1143, 858, 220, 129);
		this.panel1.add(this.lblQuinta1000);
		this.lblSexta800.setForeground(Color.WHITE);
		this.lblSexta800.setFont(new Font("Calibri Light", 0, 16));
		this.lblSexta800.setBounds(1371, 301, 220, 129);
		this.panel1.add(this.lblSexta800);
		this.lblSexta830.setForeground(Color.WHITE);
		this.lblSexta830.setFont(new Font("Calibri Light", 0, 16));
		this.lblSexta830.setBounds(1371, 440, 220, 129);
		this.panel1.add(this.lblSexta830);
		this.lblSexta900.setForeground(Color.WHITE);
		this.lblSexta900.setFont(new Font("Calibri Light", 0, 16));
		this.lblSexta900.setBounds(1371, 580, 220, 129);
		this.panel1.add(this.lblSexta900);
		this.lblSexta930.setForeground(Color.WHITE);
		this.lblSexta930.setFont(new Font("Calibri Light", 0, 16));
		this.lblSexta930.setBounds(1371, 719, 220, 129);
		this.panel1.add(this.lblSexta930);
		this.lblSexta1000.setForeground(Color.WHITE);
		this.lblSexta1000.setFont(new Font("Calibri Light", 0, 16));
		this.lblSexta1000.setBounds(1371, 858, 220, 129);
		this.panel1.add(this.lblSexta1000);
		this.lblSabado800.setForeground(Color.WHITE);
		this.lblSabado800.setFont(new Font("Calibri Light", 0, 16));
		this.lblSabado800.setBounds(1599, 301, 220, 129);
		this.panel1.add(this.lblSabado800);
		this.lblSabado830.setForeground(Color.WHITE);
		this.lblSabado830.setFont(new Font("Calibri Light", 0, 16));
		this.lblSabado830.setBounds(1599, 440, 220, 129);
		this.panel1.add(this.lblSabado830);
		this.lblSabado900.setForeground(Color.WHITE);
		this.lblSabado900.setFont(new Font("Calibri Light", 0, 16));
		this.lblSabado900.setBounds(1599, 580, 220, 129);
		this.panel1.add(this.lblSabado900);
		this.lblSabado930.setForeground(Color.WHITE);
		this.lblSabado930.setFont(new Font("Calibri Light", 0, 16));
		this.lblSabado930.setBounds(1599, 719, 220, 129);
		this.panel1.add(this.lblSabado930);
		this.lblSabado1000.setForeground(Color.WHITE);
		this.lblSabado1000.setFont(new Font("Calibri Light", 0, 16));
		this.lblSabado1000.setBounds(1599, 858, 220, 129);
		this.panel1.add(this.lblSabado1000);
		btnSair1.setBounds(1560, 1023, 119, 23);
		this.panel1.add(btnSair1);
		JButton btnProximo1 = new JButton("Proximo");
		btnProximo1.setBackground(new Color(232, 227, 227));
		btnProximo1.setBorderPainted(false);
		btnProximo1.setFont(new Font("Calibri Light", 0, 14));
		btnProximo1.setBounds(1691, 1023, 119, 23);
		this.panel1.add(btnProximo1);
		JLabel lblImagePrincipal1 = new JLabel("");
		lblImagePrincipal1.setBounds(0, 0, 1920, 1080);
		lblImagePrincipal1
				.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/view/imagens/board-toyotable1.jpg")));

		this.panel1.add(lblImagePrincipal1);
		this.panel3.setLayout((LayoutManager) null);
		this.panel3.setBounds(0, 0, 1920, 1080);
		this.getContentPane().add(this.panel3);
		this.lblHora3.setHorizontalAlignment(0);
		this.lblHora3.setForeground(Color.WHITE);
		this.lblHora3.setFont(new Font("Calibri Light", 0, 109));
		this.lblHora3.setBounds(129, 90, 271, 88);
		this.panel3.add(this.lblHora3);
		this.lblDia3.setHorizontalAlignment(0);
		this.lblDia3.setForeground(Color.WHITE);
		this.lblDia3.setFont(new Font("Calibri Light", 0, 21));
		this.lblDia3.setBounds(159, 177, 211, 34);
		this.panel3.add(this.lblDia3);
		this.lbDomingoPanel3.setHorizontalAlignment(0);
		this.lbDomingoPanel3.setForeground(Color.WHITE);
		this.lbDomingoPanel3.setFont(new Font("Calibri Light", 0, 22));
		this.lbDomingoPanel3.setBounds(231, 232, 220, 60);
		this.panel3.add(this.lbDomingoPanel3);
		this.lbSegundaPanel3.setHorizontalAlignment(0);
		this.lbSegundaPanel3.setFont(new Font("Calibri Light", 0, 22));
		this.lbSegundaPanel3.setForeground(Color.WHITE);
		this.lbSegundaPanel3.setBounds(458, 232, 220, 60);
		this.panel3.add(this.lbSegundaPanel3);
		this.lbTercaPanel3.setHorizontalAlignment(0);
		this.lbTercaPanel3.setFont(new Font("Calibri Light", 0, 22));
		this.lbTercaPanel3.setForeground(Color.WHITE);
		this.lbTercaPanel3.setBounds(687, 232, 220, 60);
		this.panel3.add(this.lbTercaPanel3);
		this.lbQuartaPanel3.setHorizontalAlignment(0);
		this.lbQuartaPanel3.setFont(new Font("Calibri Light", 0, 22));
		this.lbQuartaPanel3.setForeground(Color.WHITE);
		this.lbQuartaPanel3.setBounds(915, 232, 220, 60);
		this.panel3.add(this.lbQuartaPanel3);
		this.lbQuintaPanel3.setHorizontalAlignment(0);
		this.lbQuintaPanel3.setFont(new Font("Calibri Light", 0, 22));
		this.lbQuintaPanel3.setForeground(Color.WHITE);
		this.lbQuintaPanel3.setBounds(1143, 232, 220, 60);
		this.panel3.add(this.lbQuintaPanel3);
		this.lbSextaPanel3.setHorizontalAlignment(0);
		this.lbSextaPanel3.setFont(new Font("Calibri Light", 0, 22));
		this.lbSextaPanel3.setForeground(Color.WHITE);
		this.lbSextaPanel3.setBounds(1371, 232, 220, 60);
		this.panel3.add(this.lbSextaPanel3);
		this.lbSabadoPanel3.setHorizontalAlignment(0);
		this.lbSabadoPanel3.setFont(new Font("Calibri Light", 0, 22));
		this.lbSabadoPanel3.setForeground(Color.WHITE);
		this.lbSabadoPanel3.setBounds(1599, 232, 220, 60);
		this.panel3.add(this.lbSabadoPanel3);
		this.lblDomingo1300.setForeground(Color.WHITE);
		this.lblDomingo1300.setFont(new Font("Calibri Light", 0, 16));
		this.lblDomingo1300.setBounds(231, 301, 220, 129);
		this.panel3.add(this.lblDomingo1300);
		this.lblDomingo1330.setForeground(Color.WHITE);
		this.lblDomingo1330.setFont(new Font("Calibri Light", 0, 16));
		this.lblDomingo1330.setBounds(231, 440, 220, 129);
		this.panel3.add(this.lblDomingo1330);
		this.lblDomingo1400.setForeground(Color.WHITE);
		this.lblDomingo1400.setFont(new Font("Calibri Light", 0, 16));
		this.lblDomingo1400.setBounds(231, 580, 220, 129);
		this.panel3.add(this.lblDomingo1400);
		this.lblDomingo1430.setForeground(Color.WHITE);
		this.lblDomingo1430.setFont(new Font("Calibri Light", 0, 16));
		this.lblDomingo1430.setBounds(231, 718, 220, 129);
		this.panel3.add(this.lblDomingo1430);
		this.lblDomingo1500.setForeground(Color.WHITE);
		this.lblDomingo1500.setFont(new Font("Calibri Light", 0, 16));
		this.lblDomingo1500.setBounds(231, 857, 220, 129);
		this.panel3.add(this.lblDomingo1500);
		this.lblSegunda1300.setForeground(Color.WHITE);
		this.lblSegunda1300.setFont(new Font("Calibri Light", 0, 16));
		this.lblSegunda1300.setBounds(458, 301, 220, 129);
		this.panel3.add(this.lblSegunda1300);
		this.lblSegunda1330.setForeground(Color.WHITE);
		this.lblSegunda1330.setFont(new Font("Calibri Light", 0, 16));
		this.lblSegunda1330.setBounds(458, 440, 220, 129);
		this.panel3.add(this.lblSegunda1330);
		this.lblSegunda1400.setForeground(Color.WHITE);
		this.lblSegunda1400.setFont(new Font("Calibri Light", 0, 16));
		this.lblSegunda1400.setBounds(458, 580, 220, 129);
		this.panel3.add(this.lblSegunda1400);
		this.lblSegunda1430.setForeground(Color.WHITE);
		this.lblSegunda1430.setFont(new Font("Calibri Light", 0, 16));
		this.lblSegunda1430.setBounds(458, 719, 220, 129);
		this.panel3.add(this.lblSegunda1430);
		this.lblSegunda1500.setForeground(Color.WHITE);
		this.lblSegunda1500.setFont(new Font("Calibri Light", 0, 16));
		this.lblSegunda1500.setBounds(458, 858, 220, 129);
		this.panel3.add(this.lblSegunda1500);
		this.lblTerca1300.setForeground(Color.WHITE);
		this.lblTerca1300.setFont(new Font("Calibri Light", 0, 16));
		this.lblTerca1300.setBounds(687, 301, 220, 129);
		this.panel3.add(this.lblTerca1300);
		this.lblTerca1330.setForeground(Color.WHITE);
		this.lblTerca1330.setFont(new Font("Calibri Light", 0, 16));
		this.lblTerca1330.setBounds(687, 440, 220, 129);
		this.panel3.add(this.lblTerca1330);
		this.lblTerca1400.setForeground(Color.WHITE);
		this.lblTerca1400.setFont(new Font("Calibri Light", 0, 16));
		this.lblTerca1400.setBounds(687, 580, 220, 129);
		this.panel3.add(this.lblTerca1400);
		this.lblTerca1430.setForeground(Color.WHITE);
		this.lblTerca1430.setFont(new Font("Calibri Light", 0, 16));
		this.lblTerca1430.setBounds(687, 719, 220, 129);
		this.panel3.add(this.lblTerca1430);
		this.lblTerca1500.setForeground(Color.WHITE);
		this.lblTerca1500.setFont(new Font("Calibri Light", 0, 16));
		this.lblTerca1500.setBounds(687, 858, 220, 129);
		this.panel3.add(this.lblTerca1500);
		this.lblQuarta1300.setForeground(Color.WHITE);
		this.lblQuarta1300.setFont(new Font("Calibri Light", 0, 16));
		this.lblQuarta1300.setBounds(915, 301, 220, 129);
		this.panel3.add(this.lblQuarta1300);
		this.lblQuarta1330.setForeground(Color.WHITE);
		this.lblQuarta1330.setFont(new Font("Calibri Light", 0, 16));
		this.lblQuarta1330.setBounds(915, 440, 220, 129);
		this.panel3.add(this.lblQuarta1330);
		this.lblQuarta1400.setForeground(Color.WHITE);
		this.lblQuarta1400.setFont(new Font("Calibri Light", 0, 16));
		this.lblQuarta1400.setBounds(915, 580, 220, 129);
		this.panel3.add(this.lblQuarta1400);
		this.lblQuarta1430.setForeground(Color.WHITE);
		this.lblQuarta1430.setFont(new Font("Calibri Light", 0, 16));
		this.lblQuarta1430.setBounds(915, 719, 220, 129);
		this.panel3.add(this.lblQuarta1430);
		this.lblQuarta1500.setForeground(Color.WHITE);
		this.lblQuarta1500.setFont(new Font("Calibri Light", 0, 16));
		this.lblQuarta1500.setBounds(915, 858, 220, 129);
		this.panel3.add(this.lblQuarta1500);
		this.lblQuinta1300.setForeground(Color.WHITE);
		this.lblQuinta1300.setFont(new Font("Calibri Light", 0, 16));
		this.lblQuinta1300.setBounds(1143, 301, 220, 129);
		this.panel3.add(this.lblQuinta1300);
		this.lblQuinta1330.setForeground(Color.WHITE);
		this.lblQuinta1330.setFont(new Font("Calibri Light", 0, 16));
		this.lblQuinta1330.setBounds(1143, 440, 220, 129);
		this.panel3.add(this.lblQuinta1330);
		this.lblQuinta1400.setForeground(Color.WHITE);
		this.lblQuinta1400.setFont(new Font("Calibri Light", 0, 16));
		this.lblQuinta1400.setBounds(1143, 580, 220, 129);
		this.panel3.add(this.lblQuinta1400);
		this.lblQuinta1430.setForeground(Color.WHITE);
		this.lblQuinta1430.setFont(new Font("Calibri Light", 0, 16));
		this.lblQuinta1430.setBounds(1143, 719, 220, 129);
		this.panel3.add(this.lblQuinta1430);
		this.lblQuinta1500.setForeground(Color.WHITE);
		this.lblQuinta1500.setFont(new Font("Calibri Light", 0, 16));
		this.lblQuinta1500.setBounds(1143, 858, 220, 129);
		this.panel3.add(this.lblQuinta1500);
		this.lblSexta1300.setForeground(Color.WHITE);
		this.lblSexta1300.setFont(new Font("Calibri Light", 0, 16));
		this.lblSexta1300.setBounds(1371, 301, 220, 129);
		this.panel3.add(this.lblSexta1300);
		this.lblSexta1330.setForeground(Color.WHITE);
		this.lblSexta1330.setFont(new Font("Calibri Light", 0, 16));
		this.lblSexta1330.setBounds(1371, 440, 220, 129);
		this.panel3.add(this.lblSexta1330);
		this.lblSexta1400.setForeground(Color.WHITE);
		this.lblSexta1400.setFont(new Font("Calibri Light", 0, 16));
		this.lblSexta1400.setBounds(1371, 580, 220, 129);
		this.panel3.add(this.lblSexta1400);
		this.lblSexta1430.setForeground(Color.WHITE);
		this.lblSexta1430.setFont(new Font("Calibri Light", 0, 16));
		this.lblSexta1430.setBounds(1371, 719, 220, 129);
		this.panel3.add(this.lblSexta1430);
		this.lblSexta1500.setForeground(Color.WHITE);
		this.lblSexta1500.setFont(new Font("Calibri Light", 0, 16));
		this.lblSexta1500.setBounds(1371, 858, 220, 129);
		this.panel3.add(this.lblSexta1500);
		this.lblSabado1300.setForeground(Color.WHITE);
		this.lblSabado1300.setFont(new Font("Calibri Light", 0, 16));
		this.lblSabado1300.setBounds(1599, 301, 220, 129);
		this.panel3.add(this.lblSabado1300);
		this.lblSabado1330.setForeground(Color.WHITE);
		this.lblSabado1330.setFont(new Font("Calibri Light", 0, 16));
		this.lblSabado1330.setBounds(1599, 440, 220, 129);
		this.panel3.add(this.lblSabado1330);
		this.lblSabado1400.setForeground(Color.WHITE);
		this.lblSabado1400.setFont(new Font("Calibri Light", 0, 16));
		this.lblSabado1400.setBounds(1599, 580, 220, 129);
		this.panel3.add(this.lblSabado1400);
		this.lblSabado1430.setForeground(Color.WHITE);
		this.lblSabado1430.setFont(new Font("Calibri Light", 0, 16));
		this.lblSabado1430.setBounds(1599, 719, 220, 129);
		this.panel3.add(this.lblSabado1430);
		this.lblSabado1500.setForeground(Color.WHITE);
		this.lblSabado1500.setFont(new Font("Calibri Light", 0, 16));
		this.lblSabado1500.setBounds(1599, 858, 220, 129);
		this.panel3.add(this.lblSabado1500);
		this.btnSair3.setFont(new Font("Calibri Light", 0, 14));
		this.btnSair3.setBorderPainted(false);
		this.btnSair3.setBackground(new Color(232, 227, 227));
		this.btnSair3.setBounds(1560, 1023, 119, 23);
		this.panel3.add(this.btnSair3);
		this.btnProximo3.setFont(new Font("Calibri Light", 0, 14));
		this.btnProximo3.setBorderPainted(false);
		this.btnProximo3.setBackground(new Color(232, 227, 227));
		this.btnProximo3.setBounds(1691, 1023, 119, 23);
		this.panel3.add(this.btnProximo3);
		this.lblImagePrincipal3.setBounds(0, 0, 1920, 1080);
		this.lblImagePrincipal3
				.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/view/imagens/board-toyotable3.jpg")));
		this.panel3.add(this.lblImagePrincipal3);

		this.panel4.setLayout((LayoutManager) null);
		this.panel4.setBounds(0, 0, 1920, 1080);
		this.getContentPane().add(this.panel3);
		this.lblHora4.setHorizontalAlignment(0);
		this.lblHora4.setForeground(Color.WHITE);
		this.lblHora4.setFont(new Font("Calibri Light", 0, 109));
		this.lblHora4.setBounds(129, 90, 271, 88);
		this.panel4.add(this.lblHora4);
		this.lblDia4.setHorizontalAlignment(0);
		this.lblDia4.setForeground(Color.WHITE);
		this.lblDia4.setFont(new Font("Calibri Light", 0, 21));
		this.lblDia4.setBounds(159, 177, 211, 34);
		this.panel4.add(this.lblDia4);
		this.lbDomingoPanel4.setHorizontalAlignment(0);
		this.lbDomingoPanel4.setForeground(Color.WHITE);
		this.lbDomingoPanel4.setFont(new Font("Calibri Light", 0, 22));
		this.lbDomingoPanel4.setBounds(231, 232, 220, 60);
		this.panel4.add(this.lbDomingoPanel4);
		this.lbSegundaPanel4.setHorizontalAlignment(0);
		this.lbSegundaPanel4.setFont(new Font("Calibri Light", 0, 22));
		this.lbSegundaPanel4.setForeground(Color.WHITE);
		this.lbSegundaPanel4.setBounds(458, 232, 220, 60);
		this.panel4.add(this.lbSegundaPanel4);
		this.lbTercaPanel4.setHorizontalAlignment(0);
		this.lbTercaPanel4.setFont(new Font("Calibri Light", 0, 22));
		this.lbTercaPanel4.setForeground(Color.WHITE);
		this.lbTercaPanel4.setBounds(687, 232, 220, 60);
		this.panel4.add(this.lbTercaPanel4);
		this.lbQuartaPanel4.setHorizontalAlignment(0);
		this.lbQuartaPanel4.setFont(new Font("Calibri Light", 0, 22));
		this.lbQuartaPanel4.setForeground(Color.WHITE);
		this.lbQuartaPanel4.setBounds(915, 232, 220, 60);
		this.panel4.add(this.lbQuartaPanel4);
		this.lbQuintaPanel4.setHorizontalAlignment(0);
		this.lbQuintaPanel4.setFont(new Font("Calibri Light", 0, 22));
		this.lbQuintaPanel4.setForeground(Color.WHITE);
		this.lbQuintaPanel4.setBounds(1143, 232, 220, 60);
		this.panel4.add(this.lbQuintaPanel4);
		this.lbSextaPanel4.setHorizontalAlignment(0);
		this.lbSextaPanel4.setFont(new Font("Calibri Light", 0, 22));
		this.lbSextaPanel4.setForeground(Color.WHITE);
		this.lbSextaPanel4.setBounds(1371, 232, 220, 60);
		this.panel4.add(this.lbSextaPanel4);
		this.lbSabadoPanel4.setHorizontalAlignment(0);
		this.lbSabadoPanel4.setFont(new Font("Calibri Light", 0, 22));
		this.lbSabadoPanel4.setForeground(Color.WHITE);
		this.lbSabadoPanel4.setBounds(1599, 232, 220, 60);
		this.panel4.add(this.lbSabadoPanel4);
		this.lblDomingo1530.setForeground(Color.WHITE);
		this.lblDomingo1530.setFont(new Font("Calibri Light", 0, 16));
		this.lblDomingo1530.setBounds(231, 301, 220, 129);
		this.panel4.add(this.lblDomingo1530);
		this.lblDomingo1600.setForeground(Color.WHITE);
		this.lblDomingo1600.setFont(new Font("Calibri Light", 0, 16));
		this.lblDomingo1600.setBounds(231, 440, 220, 129);
		this.panel4.add(this.lblDomingo1600);
		this.lblDomingo1630.setForeground(Color.WHITE);
		this.lblDomingo1630.setFont(new Font("Calibri Light", 0, 16));
		this.lblDomingo1630.setBounds(231, 580, 220, 129);
		this.panel4.add(this.lblDomingo1630);
		this.lblDomingo1700.setForeground(Color.WHITE);
		this.lblDomingo1700.setFont(new Font("Calibri Light", 0, 16));
		this.lblDomingo1700.setBounds(231, 718, 220, 129);
		this.panel4.add(this.lblDomingo1700);
		this.lblDomingo1730.setForeground(Color.WHITE);
		this.lblDomingo1730.setFont(new Font("Calibri Light", 0, 16));
		this.lblDomingo1730.setBounds(231, 857, 220, 129);
		this.panel4.add(this.lblDomingo1730);
		this.lblSegunda1530.setForeground(Color.WHITE);
		this.lblSegunda1530.setFont(new Font("Calibri Light", 0, 16));
		this.lblSegunda1530.setBounds(458, 301, 220, 129);
		this.panel4.add(this.lblSegunda1530);
		this.lblSegunda1600.setForeground(Color.WHITE);
		this.lblSegunda1600.setFont(new Font("Calibri Light", 0, 16));
		this.lblSegunda1600.setBounds(458, 440, 220, 129);
		this.panel4.add(this.lblSegunda1600);
		this.lblSegunda1630.setForeground(Color.WHITE);
		this.lblSegunda1630.setFont(new Font("Calibri Light", 0, 16));
		this.lblSegunda1630.setBounds(458, 580, 220, 129);
		this.panel4.add(this.lblSegunda1630);
		this.lblSegunda1700.setForeground(Color.WHITE);
		this.lblSegunda1700.setFont(new Font("Calibri Light", 0, 16));
		this.lblSegunda1700.setBounds(458, 719, 220, 129);
		this.panel4.add(this.lblSegunda1700);
		this.lblSegunda1730.setForeground(Color.WHITE);
		this.lblSegunda1730.setFont(new Font("Calibri Light", 0, 16));
		this.lblSegunda1730.setBounds(458, 858, 220, 129);
		this.panel4.add(this.lblSegunda1730);
		this.lblTerca1530.setForeground(Color.WHITE);
		this.lblTerca1530.setFont(new Font("Calibri Light", 0, 16));
		this.lblTerca1530.setBounds(687, 301, 220, 129);
		this.panel4.add(this.lblTerca1530);
		this.lblTerca1600.setForeground(Color.WHITE);
		this.lblTerca1600.setFont(new Font("Calibri Light", 0, 16));
		this.lblTerca1600.setBounds(687, 440, 220, 129);
		this.panel4.add(this.lblTerca1600);
		this.lblTerca1630.setForeground(Color.WHITE);
		this.lblTerca1630.setFont(new Font("Calibri Light", 0, 16));
		this.lblTerca1630.setBounds(687, 580, 220, 129);
		this.panel4.add(this.lblTerca1630);
		this.lblTerca1700.setForeground(Color.WHITE);
		this.lblTerca1700.setFont(new Font("Calibri Light", 0, 16));
		this.lblTerca1700.setBounds(687, 719, 220, 129);
		this.panel4.add(this.lblTerca1700);
		this.lblTerca1730.setForeground(Color.WHITE);
		this.lblTerca1730.setFont(new Font("Calibri Light", 0, 16));
		this.lblTerca1730.setBounds(687, 858, 220, 129);
		this.panel4.add(this.lblTerca1730);
		this.lblQuarta1530.setForeground(Color.WHITE);
		this.lblQuarta1530.setFont(new Font("Calibri Light", 0, 16));
		this.lblQuarta1530.setBounds(915, 301, 220, 129);
		this.panel4.add(this.lblQuarta1530);
		this.lblQuarta1600.setForeground(Color.WHITE);
		this.lblQuarta1600.setFont(new Font("Calibri Light", 0, 16));
		this.lblQuarta1600.setBounds(915, 440, 220, 129);
		this.panel4.add(this.lblQuarta1600);
		this.lblQuarta1630.setForeground(Color.WHITE);
		this.lblQuarta1630.setFont(new Font("Calibri Light", 0, 16));
		this.lblQuarta1630.setBounds(915, 580, 220, 129);
		this.panel4.add(this.lblQuarta1630);
		this.lblQuarta1700.setForeground(Color.WHITE);
		this.lblQuarta1700.setFont(new Font("Calibri Light", 0, 16));
		this.lblQuarta1700.setBounds(915, 719, 220, 129);
		this.panel4.add(this.lblQuarta1700);
		this.lblQuarta1730.setForeground(Color.WHITE);
		this.lblQuarta1730.setFont(new Font("Calibri Light", 0, 16));
		this.lblQuarta1730.setBounds(915, 858, 220, 129);
		this.panel4.add(this.lblQuarta1730);
		this.lblQuinta1530.setForeground(Color.WHITE);
		this.lblQuinta1530.setFont(new Font("Calibri Light", 0, 16));
		this.lblQuinta1530.setBounds(1143, 301, 220, 129);
		this.panel4.add(this.lblQuinta1530);
		this.lblQuinta1600.setForeground(Color.WHITE);
		this.lblQuinta1600.setFont(new Font("Calibri Light", 0, 16));
		this.lblQuinta1600.setBounds(1143, 440, 220, 129);
		this.panel4.add(this.lblQuinta1600);
		this.lblQuinta1630.setForeground(Color.WHITE);
		this.lblQuinta1630.setFont(new Font("Calibri Light", 0, 16));
		this.lblQuinta1630.setBounds(1143, 580, 220, 129);
		this.panel4.add(this.lblQuinta1630);
		this.lblQuinta1700.setForeground(Color.WHITE);
		this.lblQuinta1700.setFont(new Font("Calibri Light", 0, 16));
		this.lblQuinta1700.setBounds(1143, 719, 220, 129);
		this.panel4.add(this.lblQuinta1700);
		this.lblQuinta1730.setForeground(Color.WHITE);
		this.lblQuinta1730.setFont(new Font("Calibri Light", 0, 16));
		this.lblQuinta1730.setBounds(1143, 858, 220, 129);
		this.panel4.add(this.lblQuinta1730);
		this.lblSexta1530.setForeground(Color.WHITE);
		this.lblSexta1530.setFont(new Font("Calibri Light", 0, 16));
		this.lblSexta1530.setBounds(1371, 301, 220, 129);
		this.panel4.add(this.lblSexta1530);
		this.lblSexta1600.setForeground(Color.WHITE);
		this.lblSexta1600.setFont(new Font("Calibri Light", 0, 16));
		this.lblSexta1600.setBounds(1371, 440, 220, 129);
		this.panel4.add(this.lblSexta1600);
		this.lblSexta1630.setForeground(Color.WHITE);
		this.lblSexta1630.setFont(new Font("Calibri Light", 0, 16));
		this.lblSexta1630.setBounds(1371, 580, 220, 129);
		this.panel4.add(this.lblSexta1630);
		this.lblSexta1700.setForeground(Color.WHITE);
		this.lblSexta1700.setFont(new Font("Calibri Light", 0, 16));
		this.lblSexta1700.setBounds(1371, 719, 220, 129);
		this.panel4.add(this.lblSexta1700);
		this.lblSexta1730.setForeground(Color.WHITE);
		this.lblSexta1730.setFont(new Font("Calibri Light", 0, 16));
		this.lblSexta1730.setBounds(1371, 858, 220, 129);
		this.panel4.add(this.lblSexta1730);
		this.lblSabado1530.setForeground(Color.WHITE);
		this.lblSabado1530.setFont(new Font("Calibri Light", 0, 16));
		this.lblSabado1530.setBounds(1599, 301, 220, 129);
		this.panel4.add(this.lblSabado1530);
		this.lblSabado1600.setForeground(Color.WHITE);
		this.lblSabado1600.setFont(new Font("Calibri Light", 0, 16));
		this.lblSabado1600.setBounds(1599, 440, 220, 129);
		this.panel4.add(this.lblSabado1600);
		this.lblSabado1630.setForeground(Color.WHITE);
		this.lblSabado1630.setFont(new Font("Calibri Light", 0, 16));
		this.lblSabado1630.setBounds(1599, 580, 220, 129);
		this.panel4.add(this.lblSabado1630);
		this.lblSabado1700.setForeground(Color.WHITE);
		this.lblSabado1700.setFont(new Font("Calibri Light", 0, 16));
		this.lblSabado1700.setBounds(1599, 719, 220, 129);
		this.panel4.add(this.lblSabado1700);
		this.lblSabado1730.setForeground(Color.WHITE);
		this.lblSabado1730.setFont(new Font("Calibri Light", 0, 16));
		this.lblSabado1730.setBounds(1599, 858, 220, 129);
		this.panel4.add(this.lblSabado1730);
		this.btnSair4.setFont(new Font("Calibri Light", 0, 14));
		this.btnSair4.setBorderPainted(false);
		this.btnSair4.setBackground(new Color(232, 227, 227));
		this.btnSair4.setBounds(1560, 1023, 119, 23);
		this.panel4.add(this.btnSair4);
		this.btnProximo4.setFont(new Font("Calibri Light", 0, 14));
		this.btnProximo4.setBorderPainted(false);
		this.btnProximo4.setBackground(new Color(232, 227, 227));
		this.btnProximo4.setBounds(1691, 1023, 119, 23);
		this.panel4.add(this.btnProximo4);
		this.lblImagePrincipal4.setBounds(0, 0, 1920, 1080);
		this.lblImagePrincipal4
				.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/view/imagens/board-toyotable4.jpg")));
		this.panel4.add(this.lblImagePrincipal4);

		this.panel5.setLayout((LayoutManager) null);
		this.panel5.setBounds(0, 0, 1920, 1080);
		this.getContentPane().add(this.panel5);
		this.lblHora5.setHorizontalAlignment(0);
		this.lblHora5.setForeground(Color.WHITE);
		this.lblHora5.setFont(new Font("Calibri Light", 0, 109));
		this.lblHora5.setBounds(129, 90, 271, 88);
		this.panel5.add(this.lblHora5);
		this.lblDia5.setHorizontalAlignment(0);
		this.lblDia5.setForeground(Color.WHITE);
		this.lblDia5.setFont(new Font("Calibri Light", 0, 21));
		this.lblDia5.setBounds(159, 177, 211, 34);
		this.panel5.add(this.lblDia5);
		this.lbDomingoPanel5.setHorizontalAlignment(0);
		this.lbDomingoPanel5.setForeground(Color.WHITE);
		this.lbDomingoPanel5.setFont(new Font("Calibri Light", 0, 22));
		this.lbDomingoPanel5.setBounds(231, 232, 220, 60);
		this.panel5.add(this.lbDomingoPanel5);
		this.lbSegundaPanel5.setHorizontalAlignment(0);
		this.lbSegundaPanel5.setFont(new Font("Calibri Light", 0, 22));
		this.lbSegundaPanel5.setForeground(Color.WHITE);
		this.lbSegundaPanel5.setBounds(458, 232, 220, 60);
		this.panel5.add(this.lbSegundaPanel5);
		this.lbTercaPanel5.setHorizontalAlignment(0);
		this.lbTercaPanel5.setFont(new Font("Calibri Light", 0, 22));
		this.lbTercaPanel5.setForeground(Color.WHITE);
		this.lbTercaPanel5.setBounds(687, 232, 220, 60);
		this.panel5.add(this.lbTercaPanel5);
		this.lbQuartaPanel5.setHorizontalAlignment(0);
		this.lbQuartaPanel5.setFont(new Font("Calibri Light", 0, 22));
		this.lbQuartaPanel5.setForeground(Color.WHITE);
		this.lbQuartaPanel5.setBounds(915, 232, 220, 60);
		this.panel5.add(this.lbQuartaPanel5);
		this.lbQuintaPanel5.setHorizontalAlignment(0);
		this.lbQuintaPanel5.setFont(new Font("Calibri Light", 0, 22));
		this.lbQuintaPanel5.setForeground(Color.WHITE);
		this.lbQuintaPanel5.setBounds(1143, 232, 220, 60);
		this.panel5.add(this.lbQuintaPanel5);
		this.lbSextaPanel5.setHorizontalAlignment(0);
		this.lbSextaPanel5.setFont(new Font("Calibri Light", 0, 22));
		this.lbSextaPanel5.setForeground(Color.WHITE);
		this.lbSextaPanel5.setBounds(1371, 232, 220, 60);
		this.panel5.add(this.lbSextaPanel5);
		this.lbSabadoPanel5.setHorizontalAlignment(0);
		this.lbSabadoPanel5.setFont(new Font("Calibri Light", 0, 22));
		this.lbSabadoPanel5.setForeground(Color.WHITE);
		this.lbSabadoPanel5.setBounds(1599, 232, 220, 60);
		this.panel5.add(this.lbSabadoPanel5);
		this.lblDomingo1800.setForeground(Color.WHITE);
		this.lblDomingo1800.setFont(new Font("Calibri Light", 0, 16));
		this.lblDomingo1800.setBounds(231, 301, 220, 129);
		this.panel5.add(this.lblDomingo1800);
		this.lblDomingo1830.setForeground(Color.WHITE);
		this.lblDomingo1830.setFont(new Font("Calibri Light", 0, 16));
		this.lblDomingo1830.setBounds(231, 440, 220, 129);
		this.panel5.add(this.lblDomingo1830);
		this.lblDomingo1900.setForeground(Color.WHITE);
		this.lblDomingo1900.setFont(new Font("Calibri Light", 0, 16));
		this.lblDomingo1900.setBounds(231, 580, 220, 129);
		this.panel5.add(this.lblDomingo1900);
		this.lblDomingo1930.setForeground(Color.WHITE);
		this.lblDomingo1930.setFont(new Font("Calibri Light", 0, 16));
		this.lblDomingo1930.setBounds(231, 718, 220, 129);
		this.panel5.add(this.lblDomingo1930);
		this.lblDomingo2000.setForeground(Color.WHITE);
		this.lblDomingo2000.setFont(new Font("Calibri Light", 0, 16));
		this.lblDomingo2000.setBounds(231, 857, 220, 129);
		this.panel5.add(this.lblDomingo2000);
		this.lblSegunda1800.setForeground(Color.WHITE);
		this.lblSegunda1800.setFont(new Font("Calibri Light", 0, 16));
		this.lblSegunda1800.setBounds(458, 301, 220, 129);
		this.panel5.add(this.lblSegunda1800);
		this.lblSegunda1830.setForeground(Color.WHITE);
		this.lblSegunda1830.setFont(new Font("Calibri Light", 0, 16));
		this.lblSegunda1830.setBounds(458, 440, 220, 129);
		this.panel5.add(this.lblSegunda1830);
		this.lblSegunda1900.setForeground(Color.WHITE);
		this.lblSegunda1900.setFont(new Font("Calibri Light", 0, 16));
		this.lblSegunda1900.setBounds(458, 580, 220, 129);
		this.panel5.add(this.lblSegunda1900);
		this.lblSegunda1930.setForeground(Color.WHITE);
		this.lblSegunda1930.setFont(new Font("Calibri Light", 0, 16));
		this.lblSegunda1930.setBounds(458, 719, 220, 129);
		this.panel5.add(this.lblSegunda1930);
		this.lblSegunda2000.setForeground(Color.WHITE);
		this.lblSegunda2000.setFont(new Font("Calibri Light", 0, 16));
		this.lblSegunda2000.setBounds(458, 858, 220, 129);
		this.panel5.add(this.lblSegunda2000);
		this.lblTerca1800.setForeground(Color.WHITE);
		this.lblTerca1800.setFont(new Font("Calibri Light", 0, 16));
		this.lblTerca1800.setBounds(687, 301, 220, 129);
		this.panel5.add(this.lblTerca1800);
		this.lblTerca1830.setForeground(Color.WHITE);
		this.lblTerca1830.setFont(new Font("Calibri Light", 0, 16));
		this.lblTerca1830.setBounds(687, 440, 220, 129);
		this.panel5.add(this.lblTerca1830);
		this.lblTerca1900.setForeground(Color.WHITE);
		this.lblTerca1900.setFont(new Font("Calibri Light", 0, 16));
		this.lblTerca1900.setBounds(687, 580, 220, 129);
		this.panel5.add(this.lblTerca1900);
		this.lblTerca1930.setForeground(Color.WHITE);
		this.lblTerca1930.setFont(new Font("Calibri Light", 0, 16));
		this.lblTerca1930.setBounds(687, 719, 220, 129);
		this.panel5.add(this.lblTerca1930);
		this.lblTerca2000.setForeground(Color.WHITE);
		this.lblTerca2000.setFont(new Font("Calibri Light", 0, 16));
		this.lblTerca2000.setBounds(687, 858, 220, 129);
		this.panel5.add(this.lblTerca2000);
		this.lblQuarta1800.setForeground(Color.WHITE);
		this.lblQuarta1800.setFont(new Font("Calibri Light", 0, 16));
		this.lblQuarta1800.setBounds(915, 301, 220, 129);
		this.panel5.add(this.lblQuarta1800);
		this.lblQuarta1830.setForeground(Color.WHITE);
		this.lblQuarta1830.setFont(new Font("Calibri Light", 0, 16));
		this.lblQuarta1830.setBounds(915, 440, 220, 129);
		this.panel5.add(this.lblQuarta1830);
		this.lblQuarta1900.setForeground(Color.WHITE);
		this.lblQuarta1900.setFont(new Font("Calibri Light", 0, 16));
		this.lblQuarta1900.setBounds(915, 580, 220, 129);
		this.panel5.add(this.lblQuarta1900);
		this.lblQuarta1930.setForeground(Color.WHITE);
		this.lblQuarta1930.setFont(new Font("Calibri Light", 0, 16));
		this.lblQuarta1930.setBounds(915, 719, 220, 129);
		this.panel5.add(this.lblQuarta1930);
		this.lblQuarta2000.setForeground(Color.WHITE);
		this.lblQuarta2000.setFont(new Font("Calibri Light", 0, 16));
		this.lblQuarta2000.setBounds(915, 858, 220, 129);
		this.panel5.add(this.lblQuarta2000);
		this.lblQuinta1800.setForeground(Color.WHITE);
		this.lblQuinta1800.setFont(new Font("Calibri Light", 0, 16));
		this.lblQuinta1800.setBounds(1143, 301, 220, 129);
		this.panel5.add(this.lblQuinta1800);
		this.lblQuinta1830.setForeground(Color.WHITE);
		this.lblQuinta1830.setFont(new Font("Calibri Light", 0, 16));
		this.lblQuinta1830.setBounds(1143, 440, 220, 129);
		this.panel5.add(this.lblQuinta1830);
		this.lblQuinta1900.setForeground(Color.WHITE);
		this.lblQuinta1900.setFont(new Font("Calibri Light", 0, 16));
		this.lblQuinta1900.setBounds(1143, 580, 220, 129);
		this.panel5.add(this.lblQuinta1900);
		this.lblQuinta1930.setForeground(Color.WHITE);
		this.lblQuinta1930.setFont(new Font("Calibri Light", 0, 16));
		this.lblQuinta1930.setBounds(1143, 719, 220, 129);
		this.panel5.add(this.lblQuinta1930);
		this.lblQuinta2000.setForeground(Color.WHITE);
		this.lblQuinta2000.setFont(new Font("Calibri Light", 0, 16));
		this.lblQuinta2000.setBounds(1143, 858, 220, 129);
		this.panel5.add(this.lblQuinta2000);
		this.lblSexta1800.setForeground(Color.WHITE);
		this.lblSexta1800.setFont(new Font("Calibri Light", 0, 16));
		this.lblSexta1800.setBounds(1371, 301, 220, 129);
		this.panel5.add(this.lblSexta1800);
		this.lblSexta1830.setForeground(Color.WHITE);
		this.lblSexta1830.setFont(new Font("Calibri Light", 0, 16));
		this.lblSexta1830.setBounds(1371, 440, 220, 129);
		this.panel5.add(this.lblSexta1830);
		this.lblSexta1900.setForeground(Color.WHITE);
		this.lblSexta1900.setFont(new Font("Calibri Light", 0, 16));
		this.lblSexta1900.setBounds(1371, 580, 220, 129);
		this.panel5.add(this.lblSexta1900);
		this.lblSexta1930.setForeground(Color.WHITE);
		this.lblSexta1930.setFont(new Font("Calibri Light", 0, 16));
		this.lblSexta1930.setBounds(1371, 719, 220, 129);
		this.panel5.add(this.lblSexta1930);
		this.lblSexta2000.setForeground(Color.WHITE);
		this.lblSexta2000.setFont(new Font("Calibri Light", 0, 16));
		this.lblSexta2000.setBounds(1371, 858, 220, 129);
		this.panel5.add(this.lblSexta2000);
		this.lblSabado1800.setForeground(Color.WHITE);
		this.lblSabado1800.setFont(new Font("Calibri Light", 0, 16));
		this.lblSabado1800.setBounds(1599, 301, 220, 129);
		this.panel5.add(this.lblSabado1800);
		this.lblSabado1830.setForeground(Color.WHITE);
		this.lblSabado1830.setFont(new Font("Calibri Light", 0, 16));
		this.lblSabado1830.setBounds(1599, 440, 220, 129);
		this.panel5.add(this.lblSabado1830);
		this.lblSabado1900.setForeground(Color.WHITE);
		this.lblSabado1900.setFont(new Font("Calibri Light", 0, 16));
		this.lblSabado1900.setBounds(1599, 580, 220, 129);
		this.panel5.add(this.lblSabado1900);
		this.lblSabado1930.setForeground(Color.WHITE);
		this.lblSabado1930.setFont(new Font("Calibri Light", 0, 16));
		this.lblSabado1930.setBounds(1599, 719, 220, 129);
		this.panel5.add(this.lblSabado1930);
		this.lblSabado2000.setForeground(Color.WHITE);
		this.lblSabado2000.setFont(new Font("Calibri Light", 0, 16));
		this.lblSabado2000.setBounds(1599, 858, 220, 129);
		this.panel5.add(this.lblSabado2000);
		this.btnSair5.setFont(new Font("Calibri Light", 0, 14));
		this.btnSair5.setBorderPainted(false);
		this.btnSair5.setBackground(new Color(232, 227, 227));
		this.btnSair5.setBounds(1560, 1023, 119, 23);
		this.panel5.add(this.btnSair5);
		this.btnProximo5.setFont(new Font("Calibri Light", 0, 14));
		this.btnProximo5.setBorderPainted(false);
		this.btnProximo5.setBackground(new Color(232, 227, 227));
		this.btnProximo5.setBounds(1691, 1023, 119, 23);
		this.panel5.add(this.btnProximo5);
		this.lblImagePrincipal5.setBounds(0, 0, 1920, 1080);
		this.lblImagePrincipal5
				.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/view/imagens/board-toyotable5.jpg")));
		this.panel5.add(this.lblImagePrincipal5);

		this.panel6.setLayout((LayoutManager) null);
		this.panel6.setBounds(0, 0, 1920, 1080);
		this.getContentPane().add(this.panel6);
		this.lblHora6.setHorizontalAlignment(0);
		this.lblHora6.setForeground(Color.WHITE);
		this.lblHora6.setFont(new Font("Calibri Light", 0, 109));
		this.lblHora6.setBounds(129, 90, 271, 88);
		this.panel6.add(this.lblHora6);
		this.lblDia6.setHorizontalAlignment(0);
		this.lblDia6.setForeground(Color.WHITE);
		this.lblDia6.setFont(new Font("Calibri Light", 0, 21));
		this.lblDia6.setBounds(159, 177, 211, 34);
		this.panel6.add(this.lblDia6);
		this.lbDomingoPanel6.setHorizontalAlignment(0);
		this.lbDomingoPanel6.setForeground(Color.WHITE);
		this.lbDomingoPanel6.setFont(new Font("Calibri Light", 0, 22));
		this.lbDomingoPanel6.setBounds(231, 232, 220, 60);
		this.panel6.add(this.lbDomingoPanel6);
		this.lbSegundaPanel6.setHorizontalAlignment(0);
		this.lbSegundaPanel6.setFont(new Font("Calibri Light", 0, 22));
		this.lbSegundaPanel6.setForeground(Color.WHITE);
		this.lbSegundaPanel6.setBounds(458, 232, 220, 60);
		this.panel6.add(this.lbSegundaPanel6);
		this.lbTercaPanel6.setHorizontalAlignment(0);
		this.lbTercaPanel6.setFont(new Font("Calibri Light", 0, 22));
		this.lbTercaPanel6.setForeground(Color.WHITE);
		this.lbTercaPanel6.setBounds(687, 232, 220, 60);
		this.panel6.add(this.lbTercaPanel6);
		this.lbQuartaPanel6.setHorizontalAlignment(0);
		this.lbQuartaPanel6.setFont(new Font("Calibri Light", 0, 22));
		this.lbQuartaPanel6.setForeground(Color.WHITE);
		this.lbQuartaPanel6.setBounds(915, 232, 220, 60);
		this.panel6.add(this.lbQuartaPanel6);
		this.lbQuintaPanel6.setHorizontalAlignment(0);
		this.lbQuintaPanel6.setFont(new Font("Calibri Light", 0, 22));
		this.lbQuintaPanel6.setForeground(Color.WHITE);
		this.lbQuintaPanel6.setBounds(1143, 232, 220, 60);
		this.panel6.add(this.lbQuintaPanel6);
		this.lbSextaPanel6.setHorizontalAlignment(0);
		this.lbSextaPanel6.setFont(new Font("Calibri Light", 0, 22));
		this.lbSextaPanel6.setForeground(Color.WHITE);
		this.lbSextaPanel6.setBounds(1371, 232, 220, 60);
		this.panel6.add(this.lbSextaPanel6);
		this.lbSabadoPanel6.setHorizontalAlignment(0);
		this.lbSabadoPanel6.setFont(new Font("Calibri Light", 0, 22));
		this.lbSabadoPanel6.setForeground(Color.WHITE);
		this.lbSabadoPanel6.setBounds(1599, 232, 220, 60);
		this.panel6.add(this.lbSabadoPanel6);
		this.lblDomingo2030.setForeground(Color.WHITE);
		this.lblDomingo2030.setFont(new Font("Calibri Light", 0, 16));
		this.lblDomingo2030.setBounds(231, 301, 220, 129);
		this.panel6.add(this.lblDomingo2030);
		this.lblDomingo2100.setForeground(Color.WHITE);
		this.lblDomingo2100.setFont(new Font("Calibri Light", 0, 16));
		this.lblDomingo2100.setBounds(231, 440, 220, 129);
		this.panel6.add(this.lblDomingo2100);
		this.lblDomingo2130.setForeground(Color.WHITE);
		this.lblDomingo2130.setFont(new Font("Calibri Light", 0, 16));
		this.lblDomingo2130.setBounds(231, 580, 220, 129);
		this.panel6.add(this.lblDomingo2130);
		this.lblDomingo2200.setForeground(Color.WHITE);
		this.lblDomingo2200.setFont(new Font("Calibri Light", 0, 16));
		this.lblDomingo2200.setBounds(231, 718, 220, 129);
		this.panel6.add(this.lblDomingo2200);
		this.lblDomingo2230.setForeground(Color.WHITE);
		this.lblDomingo2230.setFont(new Font("Calibri Light", 0, 16));
		this.lblDomingo2230.setBounds(231, 857, 220, 129);
		this.panel6.add(this.lblDomingo2230);
		this.lblSegunda2030.setForeground(Color.WHITE);
		this.lblSegunda2030.setFont(new Font("Calibri Light", 0, 16));
		this.lblSegunda2030.setBounds(458, 301, 220, 129);
		this.panel6.add(this.lblSegunda2030);
		this.lblSegunda2100.setForeground(Color.WHITE);
		this.lblSegunda2100.setFont(new Font("Calibri Light", 0, 16));
		this.lblSegunda2100.setBounds(458, 440, 220, 129);
		this.panel6.add(this.lblSegunda2100);
		this.lblSegunda2130.setForeground(Color.WHITE);
		this.lblSegunda2130.setFont(new Font("Calibri Light", 0, 16));
		this.lblSegunda2130.setBounds(458, 580, 220, 129);
		this.panel6.add(this.lblSegunda2130);
		this.lblSegunda2200.setForeground(Color.WHITE);
		this.lblSegunda2200.setFont(new Font("Calibri Light", 0, 16));
		this.lblSegunda2200.setBounds(458, 719, 220, 129);
		this.panel6.add(this.lblSegunda2200);
		this.lblSegunda2230.setForeground(Color.WHITE);
		this.lblSegunda2230.setFont(new Font("Calibri Light", 0, 16));
		this.lblSegunda2230.setBounds(458, 858, 220, 129);
		this.panel6.add(this.lblSegunda2230);
		this.lblTerca2030.setForeground(Color.WHITE);
		this.lblTerca2030.setFont(new Font("Calibri Light", 0, 16));
		this.lblTerca2030.setBounds(687, 301, 220, 129);
		this.panel6.add(this.lblTerca2030);
		this.lblTerca2100.setForeground(Color.WHITE);
		this.lblTerca2100.setFont(new Font("Calibri Light", 0, 16));
		this.lblTerca2100.setBounds(687, 440, 220, 129);
		this.panel6.add(this.lblTerca2100);
		this.lblTerca2130.setForeground(Color.WHITE);
		this.lblTerca2130.setFont(new Font("Calibri Light", 0, 16));
		this.lblTerca2130.setBounds(687, 580, 220, 129);
		this.panel6.add(this.lblTerca2130);
		this.lblTerca2200.setForeground(Color.WHITE);
		this.lblTerca2200.setFont(new Font("Calibri Light", 0, 16));
		this.lblTerca2200.setBounds(687, 719, 220, 129);
		this.panel6.add(this.lblTerca2200);
		this.lblTerca2230.setForeground(Color.WHITE);
		this.lblTerca2230.setFont(new Font("Calibri Light", 0, 16));
		this.lblTerca2230.setBounds(687, 858, 220, 129);
		this.panel6.add(this.lblTerca2230);
		this.lblQuarta2030.setForeground(Color.WHITE);
		this.lblQuarta2030.setFont(new Font("Calibri Light", 0, 16));
		this.lblQuarta2030.setBounds(915, 301, 220, 129);
		this.panel6.add(this.lblQuarta2030);
		this.lblQuarta2100.setForeground(Color.WHITE);
		this.lblQuarta2100.setFont(new Font("Calibri Light", 0, 16));
		this.lblQuarta2100.setBounds(915, 440, 220, 129);
		this.panel6.add(this.lblQuarta2100);
		this.lblQuarta2130.setForeground(Color.WHITE);
		this.lblQuarta2130.setFont(new Font("Calibri Light", 0, 16));
		this.lblQuarta2130.setBounds(915, 580, 220, 129);
		this.panel6.add(this.lblQuarta2130);
		this.lblQuarta2200.setForeground(Color.WHITE);
		this.lblQuarta2200.setFont(new Font("Calibri Light", 0, 16));
		this.lblQuarta2200.setBounds(915, 719, 220, 129);
		this.panel6.add(this.lblQuarta2200);
		this.lblQuarta2230.setForeground(Color.WHITE);
		this.lblQuarta2230.setFont(new Font("Calibri Light", 0, 16));
		this.lblQuarta2230.setBounds(915, 858, 220, 129);
		this.panel6.add(this.lblQuarta2230);
		this.lblQuinta2030.setForeground(Color.WHITE);
		this.lblQuinta2030.setFont(new Font("Calibri Light", 0, 16));
		this.lblQuinta2030.setBounds(1143, 301, 220, 129);
		this.panel6.add(this.lblQuinta2030);
		this.lblQuinta2100.setForeground(Color.WHITE);
		this.lblQuinta2100.setFont(new Font("Calibri Light", 0, 16));
		this.lblQuinta2100.setBounds(1143, 440, 220, 129);
		this.panel6.add(this.lblQuinta2100);
		this.lblQuinta2130.setForeground(Color.WHITE);
		this.lblQuinta2130.setFont(new Font("Calibri Light", 0, 16));
		this.lblQuinta2130.setBounds(1143, 580, 220, 129);
		this.panel6.add(this.lblQuinta2130);
		this.lblQuinta2200.setForeground(Color.WHITE);
		this.lblQuinta2200.setFont(new Font("Calibri Light", 0, 16));
		this.lblQuinta2200.setBounds(1143, 719, 220, 129);
		this.panel6.add(this.lblQuinta2200);
		this.lblQuinta2230.setForeground(Color.WHITE);
		this.lblQuinta2230.setFont(new Font("Calibri Light", 0, 16));
		this.lblQuinta2230.setBounds(1143, 858, 220, 129);
		this.panel6.add(this.lblQuinta2230);
		this.lblSexta2030.setForeground(Color.WHITE);
		this.lblSexta2030.setFont(new Font("Calibri Light", 0, 16));
		this.lblSexta2030.setBounds(1371, 301, 220, 129);
		this.panel6.add(this.lblSexta2030);
		this.lblSexta2100.setForeground(Color.WHITE);
		this.lblSexta2100.setFont(new Font("Calibri Light", 0, 16));
		this.lblSexta2100.setBounds(1371, 440, 220, 129);
		this.panel6.add(this.lblSexta2100);
		this.lblSexta2130.setForeground(Color.WHITE);
		this.lblSexta2130.setFont(new Font("Calibri Light", 0, 16));
		this.lblSexta2130.setBounds(1371, 580, 220, 129);
		this.panel6.add(this.lblSexta2130);
		this.lblSexta2200.setForeground(Color.WHITE);
		this.lblSexta2200.setFont(new Font("Calibri Light", 0, 16));
		this.lblSexta2200.setBounds(1371, 719, 220, 129);
		this.panel6.add(this.lblSexta2200);
		this.lblSexta2230.setForeground(Color.WHITE);
		this.lblSexta2230.setFont(new Font("Calibri Light", 0, 16));
		this.lblSexta2230.setBounds(1371, 858, 220, 129);
		this.panel6.add(this.lblSexta2230);
		this.lblSabado2030.setForeground(Color.WHITE);
		this.lblSabado2030.setFont(new Font("Calibri Light", 0, 16));
		this.lblSabado2030.setBounds(1599, 301, 220, 129);
		this.panel6.add(this.lblSabado2030);
		this.lblSabado2100.setForeground(Color.WHITE);
		this.lblSabado2100.setFont(new Font("Calibri Light", 0, 16));
		this.lblSabado2100.setBounds(1599, 440, 220, 129);
		this.panel6.add(this.lblSabado2100);
		this.lblSabado2130.setForeground(Color.WHITE);
		this.lblSabado2130.setFont(new Font("Calibri Light", 0, 16));
		this.lblSabado2130.setBounds(1599, 580, 220, 129);
		this.panel6.add(this.lblSabado2130);
		this.lblSabado2200.setForeground(Color.WHITE);
		this.lblSabado2200.setFont(new Font("Calibri Light", 0, 16));
		this.lblSabado2200.setBounds(1599, 719, 220, 129);
		this.panel6.add(this.lblSabado2200);
		this.lblSabado2230.setForeground(Color.WHITE);
		this.lblSabado2230.setFont(new Font("Calibri Light", 0, 16));
		this.lblSabado2230.setBounds(1599, 858, 220, 129);
		this.panel6.add(this.lblSabado2230);
		this.btnSair6.setFont(new Font("Calibri Light", 0, 14));
		this.btnSair6.setBorderPainted(false);
		this.btnSair6.setBackground(new Color(232, 227, 227));
		this.btnSair6.setBounds(1560, 1023, 119, 23);
		this.panel6.add(this.btnSair6);
		this.btnProximo6.setFont(new Font("Calibri Light", 0, 14));
		this.btnProximo6.setBorderPainted(false);
		this.btnProximo6.setBackground(new Color(232, 227, 227));
		this.btnProximo6.setBounds(1691, 1023, 119, 23);
		this.panel6.add(this.btnProximo6);
		this.lblImagePrincipal6.setBounds(0, 0, 1920, 1080);
		this.lblImagePrincipal6
				.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/view/imagens/board-toyotable6.jpg")));
		this.panel6.add(this.lblImagePrincipal6);

		/**
		 * Método responsável pela troca manual e automática dos panel
		 */
		ActionListener actionListener = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JPanel panelTrocar = null;
				if (e.getSource() == btnProximo1) {
					panelTrocar = panel2;
				} else if (e.getSource() == btnProximo2) {
					panelTrocar = panel3;
				} else if (e.getSource() == btnProximo3) {
					panelTrocar = panel4;
				} else if (e.getSource() == btnProximo4) {
					panelTrocar = panel5;
				} else if (e.getSource() == btnProximo5) {
					panelTrocar = panel6;
				} else if (e.getSource() == btnProximo6) {
					panelTrocar = panel1;
				}
				getContentPane().removeAll();
				getContentPane().add(panelTrocar);
				revalidate();
				repaint();
			}
		};

		Timer timer = new Timer(15000, new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JPanel panels[] = { panel1, panel2, panel3, panel4, panel5, panel6 };
				JPanel panelTrocar = null;
				panelTrocar = panels[cont];
				cont++;
				if (cont == 6) {
					cont = 0;
				}
				getContentPane().removeAll();
				getContentPane().add(panelTrocar);
				revalidate();
				repaint();
			}
		});
		timer.start();
		btnProximo1.addActionListener(actionListener);
		btnProximo2.addActionListener(actionListener);
		btnProximo3.addActionListener(actionListener);
		btnProximo4.addActionListener(actionListener);
		btnProximo5.addActionListener(actionListener);
		btnProximo6.addActionListener(actionListener);
	}

	/**
	 * Método responsável por iniciar o quadro em tela cheia
	 */
	public void ShowTelaPrincipal() {
		TelaPrincipal frame = new TelaPrincipal();
		GraphicsDevice device = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
		if (device.isFullScreenSupported()) {
			frame.setUndecorated(true);
			device.setFullScreenWindow(frame);
		} else {
			System.err.println("Full screen not supported");
		}

	}

	/**
	 * Método responsável por atualizar a hora nos panel
	 */
	private void AtualizadorHora() {
		Date hora = new Date();
		SimpleDateFormat hora_formato = new SimpleDateFormat("HH:mm");
		this.lblHora.setText(hora_formato.format(hora));
		this.lblHora2.setText(hora_formato.format(hora));
		this.lblHora3.setText(hora_formato.format(hora));
		this.lblHora4.setText(hora_formato.format(hora));
		this.lblHora5.setText(hora_formato.format(hora));
		this.lblHora6.setText(hora_formato.format(hora));
	}

	/**
	 * Método responsável por atualizar o dia nos panel
	 */
	public void AtualizadorDia() {
		Date data = new Date();
		SimpleDateFormat data_formato = new SimpleDateFormat("EEEE, d MMM");
		this.lblDia.setText(data_formato.format(data));
		this.lblDia2.setText(data_formato.format(data));
		this.lblDia3.setText(data_formato.format(data));
		this.lblDia4.setText(data_formato.format(data));
		this.lblDia5.setText(data_formato.format(data));
		this.lblDia6.setText(data_formato.format(data));
	}

	/**
	 * Método responsável por atualizar os labels nos panel
	 */
	public void atualizaLabels() {
		ActionListener tarefa2 = (new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				preencheQuadro();
				revalidate();
				repaint();
			}
		});

		Timer time2 = new Timer(300000, tarefa2);
		time2.start();
	}

	/**
	 * Método responsável por gerar os nomes dos dias da semana no panel 1
	 */
	public void geraTitulosPanel1() {
		Calendar c = Calendar.getInstance();
		SimpleDateFormat df = new SimpleDateFormat("EEEE, d/MMM");
		switch (c.get(7)) {
		case 2:
			this.lbSegundaPanel1.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbTercaPanel1.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbQuartaPanel1.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbQuintaPanel1.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbSextaPanel1.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbSabadoPanel1.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbDomingoPanel1.setText(df.format(c.getTime()));
			c.add(7, 1);
			break;
		case 3:
			this.lbTercaPanel1.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbQuartaPanel1.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbQuintaPanel1.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbSextaPanel1.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbSabadoPanel1.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbDomingoPanel1.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbSegundaPanel1.setText(df.format(c.getTime()));
			c.add(7, 1);
			break;
		case 4:
			this.lbQuartaPanel1.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbQuintaPanel1.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbSextaPanel1.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbSabadoPanel1.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbDomingoPanel1.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbSegundaPanel1.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbTercaPanel1.setText(df.format(c.getTime()));
			c.add(7, 1);
			break;
		case 5:
			this.lbQuintaPanel1.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbSextaPanel1.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbSabadoPanel1.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbDomingoPanel1.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbSegundaPanel1.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbTercaPanel1.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbQuartaPanel1.setText(df.format(c.getTime()));
			c.add(7, 1);
			break;
		case 6:
			this.lbSextaPanel1.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbSabadoPanel1.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbDomingoPanel1.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbSegundaPanel1.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbTercaPanel1.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbQuartaPanel1.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbQuintaPanel1.setText(df.format(c.getTime()));
			c.add(7, 1);
			break;
		case 7:
			this.lbSabadoPanel1.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbDomingoPanel1.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbSegundaPanel1.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbTercaPanel1.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbQuartaPanel1.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbQuintaPanel1.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbSextaPanel1.setText(df.format(c.getTime()));
			c.add(7, 1);
			break;
		case 8:
			this.lbDomingoPanel1.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbSegundaPanel1.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbTercaPanel1.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbQuartaPanel1.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbQuintaPanel1.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbSextaPanel1.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbSabadoPanel1.setText(df.format(c.getTime()));
			c.add(7, 1);
			break;
		default:
			System.out.println("ERRO: Codigo inserido representa o Domingo ou é invalido");
		}

	}

	/**
	 * Método responsável por gerar os nomes dos dias da semana no panel 2
	 */
	public void geraTitulosPanel2() {
		Calendar c = Calendar.getInstance();
		SimpleDateFormat df = new SimpleDateFormat("EEEE, d/MMM");
		switch (c.get(7)) {
		case 2:
			this.lbSegundaPanel2.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbTercaPanel2.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbQuartaPanel2.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbQuintaPanel2.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbSextaPanel2.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbSabadoPanel2.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbDomingoPanel2.setText(df.format(c.getTime()));
			c.add(7, 1);
			break;
		case 3:
			this.lbTercaPanel2.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbQuartaPanel2.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbQuintaPanel2.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbSextaPanel2.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbSabadoPanel2.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbDomingoPanel2.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbSegundaPanel2.setText(df.format(c.getTime()));
			c.add(7, 1);
			break;
		case 4:
			this.lbQuartaPanel2.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbQuintaPanel2.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbSextaPanel2.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbSabadoPanel2.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbDomingoPanel2.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbSegundaPanel2.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbTercaPanel2.setText(df.format(c.getTime()));
			c.add(7, 1);
			break;
		case 5:
			this.lbQuintaPanel2.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbSextaPanel2.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbSabadoPanel2.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbDomingoPanel2.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbSegundaPanel2.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbTercaPanel2.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbQuartaPanel2.setText(df.format(c.getTime()));
			c.add(7, 1);
			break;
		case 6:
			this.lbSextaPanel2.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbSabadoPanel2.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbDomingoPanel2.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbSegundaPanel2.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbTercaPanel2.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbQuartaPanel2.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbQuintaPanel2.setText(df.format(c.getTime()));
			c.add(7, 1);
			break;
		case 7:
			this.lbSabadoPanel2.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbDomingoPanel2.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbSegundaPanel2.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbTercaPanel2.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbQuartaPanel2.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbQuintaPanel2.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbSextaPanel2.setText(df.format(c.getTime()));
			c.add(7, 1);
			break;
		case 8:
			this.lbDomingoPanel2.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbSegundaPanel2.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbTercaPanel2.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbQuartaPanel2.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbQuintaPanel2.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbSextaPanel2.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbSabadoPanel2.setText(df.format(c.getTime()));
			c.add(7, 1);
			break;
		default:
			System.out.println("ERRO: Codigo inserido representa o Domingo ou é invalido");
		}

	}

	/**
	 * Método responsável por gerar os nomes dos dias da semana no panel 3
	 */
	public void geraTitulosPanel3() {
		Calendar c = Calendar.getInstance();
		SimpleDateFormat df = new SimpleDateFormat("EEEE, d/MMM");
		switch (c.get(7)) {
		case 2:
			this.lbSegundaPanel3.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbTercaPanel3.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbQuartaPanel3.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbQuintaPanel3.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbSextaPanel3.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbSabadoPanel3.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbDomingoPanel3.setText(df.format(c.getTime()));
			c.add(7, 1);
			break;
		case 3:
			this.lbTercaPanel3.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbQuartaPanel3.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbQuintaPanel3.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbSextaPanel3.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbSabadoPanel3.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbDomingoPanel3.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbSegundaPanel3.setText(df.format(c.getTime()));
			c.add(7, 1);
			break;
		case 4:
			this.lbQuartaPanel3.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbQuintaPanel3.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbSextaPanel3.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbSabadoPanel3.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbDomingoPanel3.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbSegundaPanel3.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbTercaPanel3.setText(df.format(c.getTime()));
			c.add(7, 1);
			break;
		case 5:
			this.lbQuintaPanel3.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbSextaPanel3.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbSabadoPanel3.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbDomingoPanel3.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbSegundaPanel3.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbTercaPanel3.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbQuartaPanel3.setText(df.format(c.getTime()));
			c.add(7, 1);
			break;
		case 6:
			this.lbSextaPanel3.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbSabadoPanel3.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbDomingoPanel3.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbSegundaPanel3.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbTercaPanel3.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbQuartaPanel3.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbQuintaPanel3.setText(df.format(c.getTime()));
			c.add(7, 1);
			break;
		case 7:
			this.lbSabadoPanel3.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbDomingoPanel3.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbSegundaPanel3.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbTercaPanel3.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbQuartaPanel3.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbQuintaPanel3.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbSextaPanel3.setText(df.format(c.getTime()));
			c.add(7, 1);
			break;
		case 8:
			this.lbDomingoPanel3.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbSegundaPanel3.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbTercaPanel3.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbQuartaPanel3.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbQuintaPanel3.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbSextaPanel3.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbSabadoPanel3.setText(df.format(c.getTime()));
			c.add(7, 1);
			break;
		default:
			System.out.println("ERRO: Codigo inserido representa o Domingo ou é invalido");
		}

	}

	/**
	 * Método responsável por gerar os nomes dos dias da semana no panel 4
	 */
	public void geraTitulosPanel4() {
		Calendar c = Calendar.getInstance();
		SimpleDateFormat df = new SimpleDateFormat("EEEE, d/MMM");
		switch (c.get(7)) {
		case 2:
			this.lbSegundaPanel4.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbTercaPanel4.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbQuartaPanel4.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbQuintaPanel4.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbSextaPanel4.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbSabadoPanel4.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbDomingoPanel4.setText(df.format(c.getTime()));
			c.add(7, 1);
			break;
		case 3:
			this.lbTercaPanel4.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbQuartaPanel4.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbQuintaPanel4.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbSextaPanel4.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbSabadoPanel4.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbDomingoPanel4.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbSegundaPanel4.setText(df.format(c.getTime()));
			c.add(7, 1);
			break;
		case 4:
			this.lbQuartaPanel4.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbQuintaPanel4.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbSextaPanel4.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbSabadoPanel4.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbDomingoPanel4.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbSegundaPanel4.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbTercaPanel4.setText(df.format(c.getTime()));
			c.add(7, 1);
			break;
		case 5:
			this.lbQuintaPanel4.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbSextaPanel4.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbSabadoPanel4.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbDomingoPanel4.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbSegundaPanel4.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbTercaPanel4.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbQuartaPanel4.setText(df.format(c.getTime()));
			c.add(7, 1);
			break;
		case 6:
			this.lbSextaPanel4.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbSabadoPanel4.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbDomingoPanel4.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbSegundaPanel4.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbTercaPanel4.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbQuartaPanel4.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbQuintaPanel4.setText(df.format(c.getTime()));
			c.add(7, 1);
			break;
		case 7:
			this.lbSabadoPanel4.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbDomingoPanel4.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbSegundaPanel4.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbTercaPanel4.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbQuartaPanel4.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbQuintaPanel4.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbSextaPanel4.setText(df.format(c.getTime()));
			c.add(7, 1);
			break;
		case 8:
			this.lbDomingoPanel4.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbSegundaPanel4.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbTercaPanel4.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbQuartaPanel4.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbQuintaPanel4.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbSextaPanel4.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbSabadoPanel4.setText(df.format(c.getTime()));
			c.add(7, 1);
			break;
		default:
			System.out.println("ERRO: Codigo inserido representa o Domingo ou é invalido");
		}

	}

	/**
	 * Método responsável por gerar os nomes dos dias da semana no panel 5
	 */
	public void geraTitulosPanel5() {
		Calendar c = Calendar.getInstance();
		SimpleDateFormat df = new SimpleDateFormat("EEEE, d/MMM");
		switch (c.get(7)) {
		case 2:
			this.lbSegundaPanel5.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbTercaPanel5.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbQuartaPanel5.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbQuintaPanel5.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbSextaPanel5.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbSabadoPanel5.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbDomingoPanel5.setText(df.format(c.getTime()));
			c.add(7, 1);
			break;
		case 3:
			this.lbTercaPanel5.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbQuartaPanel5.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbQuintaPanel5.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbSextaPanel5.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbSabadoPanel5.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbDomingoPanel5.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbSegundaPanel5.setText(df.format(c.getTime()));
			c.add(7, 1);
			break;
		case 4:
			this.lbQuartaPanel5.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbQuintaPanel5.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbSextaPanel5.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbSabadoPanel5.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbDomingoPanel5.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbSegundaPanel5.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbTercaPanel5.setText(df.format(c.getTime()));
			c.add(7, 1);
			break;
		case 5:
			this.lbQuintaPanel5.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbSextaPanel5.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbSabadoPanel5.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbDomingoPanel5.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbSegundaPanel5.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbTercaPanel5.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbQuartaPanel5.setText(df.format(c.getTime()));
			c.add(7, 1);
			break;
		case 6:
			this.lbSextaPanel5.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbSabadoPanel5.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbDomingoPanel5.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbSegundaPanel5.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbTercaPanel5.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbQuartaPanel5.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbQuintaPanel5.setText(df.format(c.getTime()));
			c.add(7, 1);
			break;
		case 7:
			this.lbSabadoPanel5.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbDomingoPanel5.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbSegundaPanel5.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbTercaPanel5.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbQuartaPanel5.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbQuintaPanel5.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbSextaPanel5.setText(df.format(c.getTime()));
			c.add(7, 1);
			break;
		case 8:
			this.lbDomingoPanel5.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbSegundaPanel5.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbTercaPanel5.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbQuartaPanel5.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbQuintaPanel5.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbSextaPanel5.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbSabadoPanel5.setText(df.format(c.getTime()));
			c.add(7, 1);
			break;
		default:
			System.out.println("ERRO: Codigo inserido representa o Domingo ou é invalido");
		}

	}

	/**
	 * Método responsável por gerar os nomes dos dias da semana no panel 6
	 */
	public void geraTitulosPanel6() {
		Calendar c = Calendar.getInstance();
		SimpleDateFormat df = new SimpleDateFormat("EEEE, d/MMM");
		switch (c.get(7)) {
		case 2:
			this.lbSegundaPanel6.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbTercaPanel6.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbQuartaPanel6.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbQuintaPanel6.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbSextaPanel6.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbSabadoPanel6.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbDomingoPanel6.setText(df.format(c.getTime()));
			c.add(7, 1);
			break;
		case 3:
			this.lbTercaPanel6.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbQuartaPanel6.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbQuintaPanel6.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbSextaPanel6.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbSabadoPanel6.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbDomingoPanel6.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbSegundaPanel6.setText(df.format(c.getTime()));
			c.add(7, 1);
			break;
		case 4:
			this.lbQuartaPanel6.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbQuintaPanel6.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbSextaPanel6.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbSabadoPanel6.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbDomingoPanel6.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbSegundaPanel6.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbTercaPanel6.setText(df.format(c.getTime()));
			c.add(7, 1);
			break;
		case 5:
			this.lbQuintaPanel6.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbSextaPanel6.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbSabadoPanel6.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbDomingoPanel6.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbSegundaPanel6.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbTercaPanel6.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbQuartaPanel6.setText(df.format(c.getTime()));
			c.add(7, 1);
			break;
		case 6:
			this.lbSextaPanel6.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbSabadoPanel6.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbDomingoPanel6.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbSegundaPanel6.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbTercaPanel6.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbQuartaPanel6.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbQuintaPanel6.setText(df.format(c.getTime()));
			c.add(7, 1);
			break;
		case 7:
			this.lbSabadoPanel6.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbDomingoPanel6.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbSegundaPanel6.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbTercaPanel6.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbQuartaPanel6.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbQuintaPanel6.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbSextaPanel6.setText(df.format(c.getTime()));
			c.add(7, 1);
			break;
		case 8:
			this.lbDomingoPanel6.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbSegundaPanel6.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbTercaPanel6.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbQuartaPanel6.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbQuintaPanel6.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbSextaPanel6.setText(df.format(c.getTime()));
			c.add(7, 1);
			this.lbSabadoPanel6.setText(df.format(c.getTime()));
			c.add(7, 1);
			break;
		default:
			System.out.println("ERRO: Codigo inserido representa o Domingo ou é invalido");
		}

	}

	/**
	 * Método responsável por fazer a verificação no BD do dia e hora, para
	 * preencher os labels com os dados da entrega
	 */
	@SuppressWarnings("rawtypes")
	public void preencheQuadro() {
		List quadros = Persistencia.listQuadro();
		if (quadros.size() != 0) {
			Iterator arg2 = quadros.iterator();

			while (true) {
				while (arg2.hasNext()) {
					Quadro qt = (Quadro) arg2.next();
					if (qt.verificaHora("08:00") && qt.verificaDia("Segunda-feira") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblSegunda800.setText(qt.toString());
					} else if (qt.verificaHora("08:30") && qt.verificaDia("Segunda-feira") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblSegunda830.setText(qt.toString());
					} else if (qt.verificaHora("09:00") && qt.verificaDia("Segunda-feira") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblSegunda900.setText(qt.toString());
					} else if (qt.verificaHora("09:30") && qt.verificaDia("Segunda-feira") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblSegunda930.setText(qt.toString());
					} else if (qt.verificaHora("10:00") && qt.verificaDia("Segunda-feira") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblSegunda1000.setText(qt.toString());
					} else if (qt.verificaHora("10:30") && qt.verificaDia("Segunda-feira") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblSegunda1030.setText(qt.toString());
					} else if (qt.verificaHora("11:00") && qt.verificaDia("Segunda-feira") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblSegunda1100.setText(qt.toString());
					} else if (qt.verificaHora("11:30") && qt.verificaDia("Segunda-feira") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblSegunda1130.setText(qt.toString());
					} else if (qt.verificaHora("12:00") && qt.verificaDia("Segunda-feira") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblSegunda1200.setText(qt.toString());
					} else if (qt.verificaHora("12:30") && qt.verificaDia("Segunda-feira") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblSegunda1230.setText(qt.toString());
					} else if (qt.verificaHora("13:00") && qt.verificaDia("Segunda-feira") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblSegunda1300.setText(qt.toString());
					} else if (qt.verificaHora("13:30") && qt.verificaDia("Segunda-feira") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblSegunda1330.setText(qt.toString());
					} else if (qt.verificaHora("14:00") && qt.verificaDia("Segunda-feira") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblSegunda1400.setText(qt.toString());
					} else if (qt.verificaHora("14:30") && qt.verificaDia("Segunda-feira") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblSegunda1430.setText(qt.toString());
					} else if (qt.verificaHora("15:00") && qt.verificaDia("Segunda-feira") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblSegunda1500.setText(qt.toString());
					} else if (qt.verificaHora("15:30") && qt.verificaDia("Segunda-feira") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblSegunda1530.setText(qt.toString());
					} else if (qt.verificaHora("16:00") && qt.verificaDia("Segunda-feira") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblSegunda1600.setText(qt.toString());
					} else if (qt.verificaHora("16:30") && qt.verificaDia("Segunda-feira") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblSegunda1630.setText(qt.toString());
					} else if (qt.verificaHora("17:00") && qt.verificaDia("Segunda-feira") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblSegunda1700.setText(qt.toString());
					} else if (qt.verificaHora("17:30") && qt.verificaDia("Segunda-feira") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblSegunda1730.setText(qt.toString());
					} else if (qt.verificaHora("18:00") && qt.verificaDia("Segunda-feira") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblSegunda1800.setText(qt.toString());
					} else if (qt.verificaHora("18:30") && qt.verificaDia("Segunda-feira") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblSegunda1830.setText(qt.toString());
					} else if (qt.verificaHora("19:00") && qt.verificaDia("Segunda-feira") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblSegunda1900.setText(qt.toString());
					} else if (qt.verificaHora("19:30") && qt.verificaDia("Segunda-feira") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblSegunda1930.setText(qt.toString());
					} else if (qt.verificaHora("20:00") && qt.verificaDia("Segunda-feira") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblSegunda2000.setText(qt.toString());
					} else if (qt.verificaHora("20:30") && qt.verificaDia("Segunda-feira") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblSegunda2030.setText(qt.toString());
					} else if (qt.verificaHora("21:00") && qt.verificaDia("Segunda-feira") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblSegunda2100.setText(qt.toString());
					} else if (qt.verificaHora("21:30") && qt.verificaDia("Segunda-feira") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblSegunda2130.setText(qt.toString());
					} else if (qt.verificaHora("22:00") && qt.verificaDia("Segunda-feira") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblSegunda2200.setText(qt.toString());
					} else if (qt.verificaHora("22:30") && qt.verificaDia("Segunda-feira") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblSegunda2230.setText(qt.toString());
					} else if (qt.verificaHora("08:00") && qt.verificaDia("Terça-feira") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblTerca800.setText(qt.toString());
					} else if (qt.verificaHora("08:30") && qt.verificaDia("Terça-feira") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblTerca830.setText(qt.toString());
					} else if (qt.verificaHora("09:00") && qt.verificaDia("Terça-feira") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblTerca900.setText(qt.toString());
					} else if (qt.verificaHora("09:30") && qt.verificaDia("Terça-feira") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblTerca930.setText(qt.toString());
					} else if (qt.verificaHora("10:00") && qt.verificaDia("Terça-feira") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblTerca1000.setText(qt.toString());
					} else if (qt.verificaHora("10:30") && qt.verificaDia("Terça-feira") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblTerca1030.setText(qt.toString());
					} else if (qt.verificaHora("11:00") && qt.verificaDia("Terça-feira") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblTerca1100.setText(qt.toString());
					} else if (qt.verificaHora("11:30") && qt.verificaDia("Terça-feira") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblTerca1130.setText(qt.toString());
					} else if (qt.verificaHora("12:00") && qt.verificaDia("Terça-feira") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblTerca1200.setText(qt.toString());
					} else if (qt.verificaHora("12:30") && qt.verificaDia("Terça-feira") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblTerca1230.setText(qt.toString());
					} else if (qt.verificaHora("13:00") && qt.verificaDia("Terça-feira") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblTerca1300.setText(qt.toString());
					} else if (qt.verificaHora("13:30") && qt.verificaDia("Terça-feira") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblTerca1330.setText(qt.toString());
					} else if (qt.verificaHora("14:00") && qt.verificaDia("Terça-feira") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblTerca1400.setText(qt.toString());
					} else if (qt.verificaHora("14:30") && qt.verificaDia("Terça-feira") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblTerca1430.setText(qt.toString());
					} else if (qt.verificaHora("15:00") && qt.verificaDia("Terça-feira") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblTerca1500.setText(qt.toString());
					} else if (qt.verificaHora("15:30") && qt.verificaDia("Terça-feira") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblTerca1530.setText(qt.toString());
					} else if (qt.verificaHora("16:00") && qt.verificaDia("Terça-feira") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblTerca1600.setText(qt.toString());
					} else if (qt.verificaHora("16:30") && qt.verificaDia("Terça-feira") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblTerca1630.setText(qt.toString());
					} else if (qt.verificaHora("17:00") && qt.verificaDia("Terça-feira") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblTerca1700.setText(qt.toString());
					} else if (qt.verificaHora("17:30") && qt.verificaDia("Terça-feira") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblTerca1730.setText(qt.toString());
					} else if (qt.verificaHora("18:00") && qt.verificaDia("Terça-feira") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblTerca1800.setText(qt.toString());
					} else if (qt.verificaHora("18:30") && qt.verificaDia("Terça-feira") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblTerca1830.setText(qt.toString());
					} else if (qt.verificaHora("19:00") && qt.verificaDia("Terça-feira") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblTerca1900.setText(qt.toString());
					} else if (qt.verificaHora("19:30") && qt.verificaDia("Terça-feira") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblTerca1930.setText(qt.toString());
					} else if (qt.verificaHora("20:00") && qt.verificaDia("Terça-feira") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblTerca2000.setText(qt.toString());
					} else if (qt.verificaHora("20:30") && qt.verificaDia("Terça-feira") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblTerca2030.setText(qt.toString());
					} else if (qt.verificaHora("21:00") && qt.verificaDia("Terça-feira") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblTerca2100.setText(qt.toString());
					} else if (qt.verificaHora("21:30") && qt.verificaDia("Terça-feira") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblTerca2130.setText(qt.toString());
					} else if (qt.verificaHora("22:00") && qt.verificaDia("Terça-feira") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblTerca2200.setText(qt.toString());
					} else if (qt.verificaHora("22:30") && qt.verificaDia("Terça-feira") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblTerca2230.setText(qt.toString());
					} else if (qt.verificaHora("08:00") && qt.verificaDia("Quarta-feira") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblQuarta800.setText(qt.toString());
					} else if (qt.verificaHora("08:30") && qt.verificaDia("Quarta-feira") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblQuarta830.setText(qt.toString());
					} else if (qt.verificaHora("09:00") && qt.verificaDia("Quarta-feira") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblQuarta900.setText(qt.toString());
					} else if (qt.verificaHora("09:30") && qt.verificaDia("Quarta-feira") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblQuarta930.setText(qt.toString());
					} else if (qt.verificaHora("10:00") && qt.verificaDia("Quarta-feira") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblQuarta1000.setText(qt.toString());
					} else if (qt.verificaHora("10:30") && qt.verificaDia("Quarta-feira") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblQuarta1030.setText(qt.toString());
					} else if (qt.verificaHora("11:00") && qt.verificaDia("Quarta-feira") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblQuarta1100.setText(qt.toString());
					} else if (qt.verificaHora("11:30") && qt.verificaDia("Quarta-feira") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblQuarta1130.setText(qt.toString());
					} else if (qt.verificaHora("12:00") && qt.verificaDia("Quarta-feira") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblQuarta1200.setText(qt.toString());
					} else if (qt.verificaHora("12:30") && qt.verificaDia("Quarta-feira") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblQuarta1230.setText(qt.toString());
					} else if (qt.verificaHora("13:00") && qt.verificaDia("Quarta-feira") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblQuarta1300.setText(qt.toString());
					} else if (qt.verificaHora("13:30") && qt.verificaDia("Quarta-feira") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblQuarta1330.setText(qt.toString());
					} else if (qt.verificaHora("14:00") && qt.verificaDia("Quarta-feira") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblQuarta1400.setText(qt.toString());
					} else if (qt.verificaHora("14:30") && qt.verificaDia("Quarta-feira") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblQuarta1430.setText(qt.toString());
					} else if (qt.verificaHora("15:00") && qt.verificaDia("Quarta-feira") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblQuarta1500.setText(qt.toString());
					} else if (qt.verificaHora("15:30") && qt.verificaDia("Quarta-feira") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblQuarta1530.setText(qt.toString());
					} else if (qt.verificaHora("16:00") && qt.verificaDia("Quarta-feira") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblQuarta1600.setText(qt.toString());
					} else if (qt.verificaHora("16:30") && qt.verificaDia("Quarta-feira") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblQuarta1630.setText(qt.toString());
					} else if (qt.verificaHora("17:00") && qt.verificaDia("Quarta-feira") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblQuarta1700.setText(qt.toString());
					} else if (qt.verificaHora("17:30") && qt.verificaDia("Quarta-feira") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblQuarta1730.setText(qt.toString());
					} else if (qt.verificaHora("18:00") && qt.verificaDia("Quarta-feira") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblQuarta1800.setText(qt.toString());
					} else if (qt.verificaHora("18:30") && qt.verificaDia("Quarta-feira") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblQuarta1830.setText(qt.toString());
					} else if (qt.verificaHora("19:00") && qt.verificaDia("Quarta-feira") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblQuarta1900.setText(qt.toString());
					} else if (qt.verificaHora("19:30") && qt.verificaDia("Quarta-feira") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblQuarta1930.setText(qt.toString());
					} else if (qt.verificaHora("20:00") && qt.verificaDia("Quarta-feira") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblQuarta2000.setText(qt.toString());
					} else if (qt.verificaHora("20:30") && qt.verificaDia("Quarta-feira") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblQuarta2030.setText(qt.toString());
					} else if (qt.verificaHora("21:00") && qt.verificaDia("Quarta-feira") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblQuarta2100.setText(qt.toString());
					} else if (qt.verificaHora("21:30") && qt.verificaDia("Quarta-feira") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblQuarta2130.setText(qt.toString());
					} else if (qt.verificaHora("22:00") && qt.verificaDia("Quarta-feira") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblQuarta2200.setText(qt.toString());
					} else if (qt.verificaHora("22:30") && qt.verificaDia("Quarta-feira") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblQuarta2230.setText(qt.toString());
					} else if (qt.verificaHora("08:00") && qt.verificaDia("Quinta-feira") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblQuinta800.setText(qt.toString());
					} else if (qt.verificaHora("08:30") && qt.verificaDia("Quinta-feira") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblQuinta830.setText(qt.toString());
					} else if (qt.verificaHora("09:00") && qt.verificaDia("Quinta-feira") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblQuinta900.setText(qt.toString());
					} else if (qt.verificaHora("09:30") && qt.verificaDia("Quinta-feira") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblQuinta930.setText(qt.toString());
					} else if (qt.verificaHora("10:00") && qt.verificaDia("Quinta-feira") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblQuinta1000.setText(qt.toString());
					} else if (qt.verificaHora("10:30") && qt.verificaDia("Quinta-feira") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblQuinta1030.setText(qt.toString());
					} else if (qt.verificaHora("11:00") && qt.verificaDia("Quinta-feira") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblQuinta1100.setText(qt.toString());
					} else if (qt.verificaHora("11:30") && qt.verificaDia("Quinta-feira") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblQuinta1130.setText(qt.toString());
					} else if (qt.verificaHora("12:00") && qt.verificaDia("Quinta-feira") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblQuinta1200.setText(qt.toString());
					} else if (qt.verificaHora("12:30") && qt.verificaDia("Quinta-feira") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblQuinta1230.setText(qt.toString());
					} else if (qt.verificaHora("13:00") && qt.verificaDia("Quinta-feira") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblQuinta1300.setText(qt.toString());
					} else if (qt.verificaHora("13:30") && qt.verificaDia("Quinta-feira") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblQuinta1330.setText(qt.toString());
					} else if (qt.verificaHora("14:00") && qt.verificaDia("Quinta-feira") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblQuinta1400.setText(qt.toString());
					} else if (qt.verificaHora("14:30") && qt.verificaDia("Quinta-feira") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblQuinta1430.setText(qt.toString());
					} else if (qt.verificaHora("15:00") && qt.verificaDia("Quinta-feira") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblQuinta1500.setText(qt.toString());
					} else if (qt.verificaHora("15:30") && qt.verificaDia("Quinta-feira") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblQuinta1530.setText(qt.toString());
					} else if (qt.verificaHora("16:00") && qt.verificaDia("Quinta-feira") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblQuinta1600.setText(qt.toString());
					} else if (qt.verificaHora("16:30") && qt.verificaDia("Quinta-feira") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblQuinta1630.setText(qt.toString());
					} else if (qt.verificaHora("17:00") && qt.verificaDia("Quinta-feira") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblQuinta1700.setText(qt.toString());
					} else if (qt.verificaHora("17:30") && qt.verificaDia("Quinta-feira") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblQuinta1730.setText(qt.toString());
					} else if (qt.verificaHora("18:00") && qt.verificaDia("Quinta-feira") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblQuinta1800.setText(qt.toString());
					} else if (qt.verificaHora("18:30") && qt.verificaDia("Quinta-feira") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblQuinta1830.setText(qt.toString());
					} else if (qt.verificaHora("19:00") && qt.verificaDia("Quinta-feira") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblQuinta1900.setText(qt.toString());
					} else if (qt.verificaHora("19:30") && qt.verificaDia("Quinta-feira") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblQuinta1930.setText(qt.toString());
					} else if (qt.verificaHora("20:00") && qt.verificaDia("Quinta-feira") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblQuinta2000.setText(qt.toString());
					} else if (qt.verificaHora("20:30") && qt.verificaDia("Quinta-feira") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblQuinta2030.setText(qt.toString());
					} else if (qt.verificaHora("21:00") && qt.verificaDia("Quinta-feira") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblQuinta2100.setText(qt.toString());
					} else if (qt.verificaHora("21:30") && qt.verificaDia("Quinta-feira") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblQuinta2130.setText(qt.toString());
					} else if (qt.verificaHora("22:00") && qt.verificaDia("Quinta-feira") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblQuinta2200.setText(qt.toString());
					} else if (qt.verificaHora("22:30") && qt.verificaDia("Quinta-feira") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblQuinta2230.setText(qt.toString());
					} else if (qt.verificaHora("08:00") && qt.verificaDia("Sexta-feira") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblSexta800.setText(qt.toString());
					} else if (qt.verificaHora("08:30") && qt.verificaDia("Sexta-feira") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblSexta830.setText(qt.toString());
					} else if (qt.verificaHora("09:00") && qt.verificaDia("Sexta-feira") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblSexta900.setText(qt.toString());
					} else if (qt.verificaHora("09:30") && qt.verificaDia("Sexta-feira") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblSexta930.setText(qt.toString());
					} else if (qt.verificaHora("10:00") && qt.verificaDia("Sexta-feira") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblSexta1000.setText(qt.toString());
					} else if (qt.verificaHora("10:30") && qt.verificaDia("Sexta-feira") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblSexta1030.setText(qt.toString());
					} else if (qt.verificaHora("11:00") && qt.verificaDia("Sexta-feira") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblSexta1100.setText(qt.toString());
					} else if (qt.verificaHora("11:30") && qt.verificaDia("Sexta-feira") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblSexta1130.setText(qt.toString());
					} else if (qt.verificaHora("12:00") && qt.verificaDia("Sexta-feira") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblSexta1200.setText(qt.toString());
					} else if (qt.verificaHora("12:30") && qt.verificaDia("Sexta-feira") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblSexta1230.setText(qt.toString());
					} else if (qt.verificaHora("13:00") && qt.verificaDia("Sexta-feira") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblSexta1300.setText(qt.toString());
					} else if (qt.verificaHora("13:30") && qt.verificaDia("Sexta-feira") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblSexta1330.setText(qt.toString());
					} else if (qt.verificaHora("14:00") && qt.verificaDia("Sexta-feira") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblSexta1400.setText(qt.toString());
					} else if (qt.verificaHora("14:30") && qt.verificaDia("Sexta-feira") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblSexta1430.setText(qt.toString());
					} else if (qt.verificaHora("15:00") && qt.verificaDia("Sexta-feira") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblSexta1500.setText(qt.toString());
					} else if (qt.verificaHora("15:30") && qt.verificaDia("Sexta-feira") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblSexta1530.setText(qt.toString());
					} else if (qt.verificaHora("16:00") && qt.verificaDia("Sexta-feira") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblSexta1600.setText(qt.toString());
					} else if (qt.verificaHora("16:30") && qt.verificaDia("Sexta-feira") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblSexta1630.setText(qt.toString());
					} else if (qt.verificaHora("17:00") && qt.verificaDia("Sexta-feira") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblSexta1700.setText(qt.toString());
					} else if (qt.verificaHora("17:30") && qt.verificaDia("Sexta-feira") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblSexta1730.setText(qt.toString());
					} else if (qt.verificaHora("18:00") && qt.verificaDia("Sexta-feira") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblSexta1800.setText(qt.toString());
					} else if (qt.verificaHora("18:30") && qt.verificaDia("Sexta-feira") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblSexta1830.setText(qt.toString());
					} else if (qt.verificaHora("19:00") && qt.verificaDia("Sexta-feira") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblSexta1900.setText(qt.toString());
					} else if (qt.verificaHora("19:30") && qt.verificaDia("Sexta-feira") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblSexta1930.setText(qt.toString());
					} else if (qt.verificaHora("20:00") && qt.verificaDia("Sexta-feira") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblSexta2000.setText(qt.toString());
					} else if (qt.verificaHora("20:30") && qt.verificaDia("Sexta-feira") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblSexta2030.setText(qt.toString());
					} else if (qt.verificaHora("21:00") && qt.verificaDia("Sexta-feira") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblSexta2100.setText(qt.toString());
					} else if (qt.verificaHora("21:30") && qt.verificaDia("Sexta-feira") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblSexta2130.setText(qt.toString());
					} else if (qt.verificaHora("22:00") && qt.verificaDia("Sexta-feira") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblSexta2200.setText(qt.toString());
					} else if (qt.verificaHora("22:30") && qt.verificaDia("Sexta-feira") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblSexta2230.setText(qt.toString());
					} else if (qt.verificaHora("08:00") && qt.verificaDia("Sábado") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblSabado800.setText(qt.toString());
					} else if (qt.verificaHora("08:30") && qt.verificaDia("Sábado") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblSabado830.setText(qt.toString());
					} else if (qt.verificaHora("09:00") && qt.verificaDia("Sábado") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblSabado900.setText(qt.toString());
					} else if (qt.verificaHora("09:30") && qt.verificaDia("Sábado") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblSabado930.setText(qt.toString());
					} else if (qt.verificaHora("10:00") && qt.verificaDia("Sábado") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblSabado1000.setText(qt.toString());
					} else if (qt.verificaHora("10:30") && qt.verificaDia("Sábado") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblSabado1030.setText(qt.toString());
					} else if (qt.verificaHora("11:00") && qt.verificaDia("Sábado") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblSabado1100.setText(qt.toString());
					} else if (qt.verificaHora("11:30") && qt.verificaDia("Sábado") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblSabado1130.setText(qt.toString());
					} else if (qt.verificaHora("12:00") && qt.verificaDia("Sábado") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblSabado1200.setText(qt.toString());
					} else if (qt.verificaHora("12:30") && qt.verificaDia("Sábado") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblSabado1230.setText(qt.toString());
					} else if (qt.verificaHora("13:00") && qt.verificaDia("Sábado") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblSabado1300.setText(qt.toString());
					} else if (qt.verificaHora("13:30") && qt.verificaDia("Sábado") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblSabado1330.setText(qt.toString());
					} else if (qt.verificaHora("14:00") && qt.verificaDia("Sábado") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblSabado1400.setText(qt.toString());
					} else if (qt.verificaHora("14:30") && qt.verificaDia("Sábado") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblSabado1430.setText(qt.toString());
					} else if (qt.verificaHora("15:00") && qt.verificaDia("Sábado") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblSabado1500.setText(qt.toString());
					} else if (qt.verificaHora("15:30") && qt.verificaDia("Sábado") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblSabado1530.setText(qt.toString());
					} else if (qt.verificaHora("16:00") && qt.verificaDia("Sábado") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblSabado1600.setText(qt.toString());
					} else if (qt.verificaHora("16:30") && qt.verificaDia("Sábado") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblSabado1630.setText(qt.toString());
					} else if (qt.verificaHora("17:00") && qt.verificaDia("Sábado") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblSabado1700.setText(qt.toString());
					} else if (qt.verificaHora("17:30") && qt.verificaDia("Sábado") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblSabado1730.setText(qt.toString());
					} else if (qt.verificaHora("18:00") && qt.verificaDia("Sábado") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblSabado1800.setText(qt.toString());
					} else if (qt.verificaHora("18:30") && qt.verificaDia("Sábado") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblSabado1830.setText(qt.toString());
					} else if (qt.verificaHora("19:00") && qt.verificaDia("Sábado") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblSabado1900.setText(qt.toString());
					} else if (qt.verificaHora("19:30") && qt.verificaDia("Sábado") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblSabado1930.setText(qt.toString());
					} else if (qt.verificaHora("20:00") && qt.verificaDia("Sábado") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblSabado2000.setText(qt.toString());
					} else if (qt.verificaHora("20:30") && qt.verificaDia("Sábado") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblSabado2030.setText(qt.toString());
					} else if (qt.verificaHora("21:00") && qt.verificaDia("Sábado") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblSabado2100.setText(qt.toString());
					} else if (qt.verificaHora("21:30") && qt.verificaDia("Sábado") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblSabado2130.setText(qt.toString());
					} else if (qt.verificaHora("22:00") && qt.verificaDia("Sábado") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblSabado2200.setText(qt.toString());
					} else if (qt.verificaHora("22:30") && qt.verificaDia("Sábado") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblSabado2230.setText(qt.toString());
					} else if (qt.verificaHora("08:00") && qt.verificaDia("Domingo") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblDomingo800.setText(qt.toString());
					} else if (qt.verificaHora("08:30") && qt.verificaDia("Domingo") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblDomingo830.setText(qt.toString());
					} else if (qt.verificaHora("09:00") && qt.verificaDia("Domingo") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblDomingo900.setText(qt.toString());
					} else if (qt.verificaHora("09:30") && qt.verificaDia("Domingo") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblDomingo930.setText(qt.toString());
					} else if (qt.verificaHora("10:00") && qt.verificaDia("Domingo") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblDomingo1000.setText(qt.toString());
					} else if (qt.verificaHora("10:30") && qt.verificaDia("Domingo") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblDomingo1030.setText(qt.toString());
					} else if (qt.verificaHora("11:00") && qt.verificaDia("Domingo") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblDomingo1100.setText(qt.toString());
					} else if (qt.verificaHora("11:30") && qt.verificaDia("Domingo") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblDomingo1130.setText(qt.toString());
					} else if (qt.verificaHora("12:00") && qt.verificaDia("Domingo") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblDomingo1200.setText(qt.toString());
					} else if (qt.verificaHora("12:30") && qt.verificaDia("Domingo") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblDomingo1230.setText(qt.toString());
					} else if (qt.verificaHora("13:00") && qt.verificaDia("Domingo") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblDomingo1300.setText(qt.toString());
					} else if (qt.verificaHora("13:30") && qt.verificaDia("Domingo") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblDomingo1330.setText(qt.toString());
					} else if (qt.verificaHora("14:00") && qt.verificaDia("Domingo") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblDomingo1400.setText(qt.toString());
					} else if (qt.verificaHora("14:30") && qt.verificaDia("Domingo") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblDomingo1430.setText(qt.toString());
					} else if (qt.verificaHora("15:00") && qt.verificaDia("Domingo") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblDomingo1500.setText(qt.toString());
					} else if (qt.verificaHora("15:30") && qt.verificaDia("Domingo") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblDomingo1530.setText(qt.toString());
					} else if (qt.verificaHora("16:00") && qt.verificaDia("Domingo") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblDomingo1600.setText(qt.toString());
					} else if (qt.verificaHora("16:30") && qt.verificaDia("Domingo") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblDomingo1630.setText(qt.toString());
					} else if (qt.verificaHora("17:00") && qt.verificaDia("Domingo") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblDomingo1700.setText(qt.toString());
					} else if (qt.verificaHora("17:30") && qt.verificaDia("Domingo") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblDomingo1730.setText(qt.toString());
					} else if (qt.verificaHora("18:00") && qt.verificaDia("Domingo") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblDomingo1800.setText(qt.toString());
					} else if (qt.verificaHora("18:30") && qt.verificaDia("Domingo") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblDomingo1830.setText(qt.toString());
					} else if (qt.verificaHora("19:00") && qt.verificaDia("Domingo") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblDomingo1900.setText(qt.toString());
					} else if (qt.verificaHora("19:30") && qt.verificaDia("Domingo") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblDomingo1930.setText(qt.toString());
					} else if (qt.verificaHora("20:00") && qt.verificaDia("Domingo") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblDomingo2000.setText(qt.toString());
					} else if (qt.verificaHora("20:30") && qt.verificaDia("Domingo") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblDomingo2030.setText(qt.toString());
					} else if (qt.verificaHora("21:00") && qt.verificaDia("Domingo") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblDomingo2100.setText(qt.toString());
					} else if (qt.verificaHora("21:30") && qt.verificaDia("Domingo") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblDomingo2130.setText(qt.toString());
					} else if (qt.verificaHora("22:00") && qt.verificaDia("Domingo") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblDomingo2200.setText(qt.toString());
					} else if (qt.verificaHora("22:30") && qt.verificaDia("Domingo") && qt.intervalo() >= 0
							&& qt.intervalo() <= 6) {
						this.lblDomingo2230.setText(qt.toString());
					}
				}

				return;
			}

		}

	}

}
