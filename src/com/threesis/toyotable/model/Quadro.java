package com.threesis.toyotable.model;

import java.io.Reader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class Quadro {
	private int box;
	private String pedido;
	private String cliente;
	private String consultor;
	private String veiculo;
	private String cor;
	private String chassis;
	private Date horaEntrega;
	private Date dataEntrega;

	public Quadro(int box, String pedido, String cliente, String consultor, String veiculo, String cor, String chassis,
			Date dataEntrega, Date horaEntrega, Reader novousado) {
		this.box = box;
		this.pedido = pedido;
		this.cliente = cliente;
		this.consultor = consultor;
		this.veiculo = veiculo;
		this.cor = cor;
		this.chassis = chassis;
		this.setDataEntrega(dataEntrega);
		this.horaEntrega = horaEntrega;
	}

	public Quadro() {
	}

	public int getBox() {
		return this.box;
	}

	public void setBox(int box) {
		this.box = box;
	}

	public String getPedido() {
		if (this.pedido.equals("0") && this.getConsultor().equals("AMANDA MEDEIROS")) {
			return "VENDA DIRETA";
		} else if (this.pedido.equals("0")) {
			return "SEMINOVOS";
		} else {
			return this.pedido;
		}
	}

	public void setPedido(String pedido) {
		this.pedido = pedido;
	}

	public String getCliente() {
		return this.cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public String getConsultor() {
		return this.getConsultor();
	}

	public void setConsultor(String consultor) {
		this.consultor = consultor;
	}

	public String getVeiculo() {
		if (this.veiculo == null) {
			return "-";
		} else {
			String veic = "";
			String descVeiculo = this.veiculo;

			for (int i = 0; i < 5; ++i) {
				veic = veic + descVeiculo.substring(0, descVeiculo.indexOf(" ")) + " ";
				descVeiculo = descVeiculo.substring(descVeiculo.indexOf(" ") + 1, descVeiculo.length());
			}

			return veic;
		}
	}

	public void setVeiculo(String veiculo) {
		this.veiculo = veiculo;
	}

	public String getChassis() {
		return this.chassis == null ? "-" : this.chassis;
	}

	public void setChassis(String chassis) {
		this.chassis = chassis;
	}

	public String getCor() {
		return this.cor == null ? "-" : this.cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Date getHoraEntrega() {
		return this.horaEntrega;
	}

	public void setHoraEntrega(Date horaEntrega) {
		this.horaEntrega = horaEntrega;
	}

	public Date getDataEntrega() {
		return this.dataEntrega;
	}

	public void setDataEntrega(Date dataEntrega) {
		this.dataEntrega = dataEntrega;
	}

	public Reader getNovousado() {
		return null;
	}

	public void setNovousado(Reader novousado) {
	}

	public String toString() {
		String result = "<html><body>    FICHA: " + this.getPedido() + " <br />" + "    " + "CLIENTE: "
				+ this.getCliente().substring(0, this.getCliente().indexOf(" ")) + " <br />" + "    " + "CONSULTOR: "
				+ this.getConsultor() + " <br />" + "    " + "VEÍCULO: "
				+ this.getVeiculo().substring(0, this.getVeiculo().indexOf(" ")) + " <br />" + "    " + "COR: "
				+ this.getCor() + " <br />" + "    " + "CHASSIS: " + this.getChassis() + "</body>" + "</html>";
		return result;
	}

	public boolean verificaDia(String dia) {
		SimpleDateFormat data_formato = new SimpleDateFormat("EEEE");
		boolean result;
		if (data_formato.format(this.dataEntrega).toString().equalsIgnoreCase(dia)) {
			result = true;
		} else {
			result = false;
		}

		return result;
	}

	public boolean verificaHora(String hora) {
		SimpleDateFormat data_formato = new SimpleDateFormat("HH:mm");
		boolean result;
		if (data_formato.format(this.horaEntrega).toString().equalsIgnoreCase(hora)) {
			result = true;
		} else {
			result = false;
		}

		return result;
	}

	public int intervalo() {
		GregorianCalendar startTime = new GregorianCalendar();
		GregorianCalendar endTime = new GregorianCalendar();
		GregorianCalendar curTime = new GregorianCalendar();
		GregorianCalendar baseTime = new GregorianCalendar();
		startTime.setTime(new Date());
		endTime.setTime(this.dataEntrega);
		byte dif_multiplier1;
		if ((new Date()).compareTo(this.dataEntrega) < 0) {
			baseTime.setTime(this.dataEntrega);
			curTime.setTime(new Date());
			dif_multiplier1 = 1;
		} else {
			baseTime.setTime(new Date());
			curTime.setTime(this.dataEntrega);
			dif_multiplier1 = -1;
		}

		byte result_years = 0;
		int result_months = 0;
		byte result_days = 0;

		while (curTime.get(1) < baseTime.get(1) || curTime.get(2) < baseTime.get(2)) {
			int max_day = curTime.getActualMaximum(5);
			result_months += max_day;
			curTime.add(2, 1);
		}

		result_months *= dif_multiplier1;
		int result_days1 = result_days + (endTime.get(5) - startTime.get(5));
		return result_years + result_months + result_days1;
	}

	public boolean isEmpty(String string) {
		return false;
	}
}