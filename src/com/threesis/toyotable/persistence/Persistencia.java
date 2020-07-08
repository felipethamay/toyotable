package com.threesis.toyotable.persistence;

import com.threesis.toyotable.model.Quadro;
import com.threesis.toyotable.persistence.Jdbc;
import java.io.Reader;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Persistencia {
	public static Jdbc BD = new Jdbc();
	public static Connection conn = null;
	public static Statement stm;
	public static ResultSet rs;

	public static List<Quadro> listQuadro() {
		ArrayList<Quadro> quadro = new ArrayList<Quadro>();

		try {
			conn = Jdbc.getConexao();
			stm = conn.createStatement();
			rs = stm.executeQuery(
					"select cxpdvend.nronegocio, cipessoa.nomepessoa, cxpdvend.id_agente, cxcadast.descrmaqvei, "
							+ "cxcores.descrcor, cxpdvend.chassis, cxpdvend.dtprevista, cxpdvend.hrprevista, cxcadast.novousado "
							+ "from cxpdvend, cxcadast, cipessoa, cxcores "
							+ "where cxpdvend.chassis = cxcadast.chassis " + "and cipessoa.cgccpf = cxcadast.cgccpf "
							+ "and cxcadast.cgccpf != 0 " + "and cxcores.codigocor = cxcadast.corexterna "
							+ "and month (dtprevista) = month (current) " + "and year (dtprevista) = year (current)");

			while (rs.next()) {
				Quadro e = new Quadro(0, (String) null, (String) null, (String) null, (String) null, (String) null,
						(String) null, (Date) null, (Date) null, (Reader) null);
				String pedido = rs.getString("nronegocio");
				e.setPedido(pedido);
				String cliente = rs.getString("nomepessoa");
				e.setCliente(cliente);
				String consultor = rs.getString("id_agente");
				e.setConsultor(consultor);
				String veiculo = rs.getString("descrmaqvei");
				e.setVeiculo(veiculo);
				String cor = rs.getString("descrcor");
				e.setCor(cor);
				String chassis = rs.getString("chassis");
				e.setChassis(chassis);
				java.sql.Date dataEntrega = rs.getDate("dtprevista");
				e.setDataEntrega(dataEntrega);
				java.sql.Date horaEntrega = rs.getDate("hrprevista");
				e.setHoraEntrega(horaEntrega);
				Reader novousado = rs.getCharacterStream("novousado");
				e.setNovousado(novousado);
				quadro.add(e);
			}
		} catch (SQLException arg10) {
			arg10.printStackTrace();
		}

		return quadro;
	}

	/*
	 * public static List<Quadro> listQuadro2() { ArrayList<Quadro> quadro = new
	 * ArrayList<Quadro>();
	 * 
	 * try { conn = Jdbc.getConexao2(); stm = conn.createStatement(); rs =
	 * stm.executeQuery(
	 * "select cxpdvend.nronegocio, cipessoa.nomepessoa, cxpdvend.id_agente, cxcadast.descrmaqvei, cxcores.descrcor, cxpdvend.chassis, cxpdvend.dtprevista, cxpdvend.hrprevista, cxcadast.novousado from cxpdvend, cxcadast, cipessoa, cxcores where cxpdvend.chassis = cxcadast.chassis and cipessoa.cgccpf = cxcadast.cgccpf and cxcadast.cgccpf != 0 and cxcores.codigocor = cxcadast.corexterna and  month (dtprevista) = month (current) and year (dtprevista) = year (current)"
	 * );
	 * 
	 * while (rs.next()) { Quadro e = new Quadro(0, (String) null, (String) null,
	 * (String) null, (String) null, (String) null, (String) null, (Date) null,
	 * (Date) null, (Reader) null); String pedido = rs.getString("nronegocio");
	 * e.setPedido(pedido); String cliente = rs.getString("nomepessoa");
	 * e.setCliente(cliente); String consultor = rs.getString("id_agente");
	 * e.setConsultor(consultor); String veiculo = rs.getString("descrmaqvei");
	 * e.setVeiculo(veiculo); String cor = rs.getString("descrcor"); e.setCor(cor);
	 * String chassis = rs.getString("chassis"); e.setChassis(chassis);
	 * java.sql.Date dataEntrega = rs.getDate("dtprevista");
	 * e.setDataEntrega(dataEntrega); java.sql.Date horaEntrega =
	 * rs.getDate("hrprevista"); e.setHoraEntrega(horaEntrega); Reader novousado =
	 * rs.getCharacterStream("novousado"); e.setNovousado(novousado); quadro.add(e);
	 * } } catch (SQLException arg10) { arg10.printStackTrace(); }
	 * 
	 * return quadro; }
	 */

	public static Jdbc getBD() {
		return BD;
	}

	public static void setBD(Jdbc bD) {
		BD = bD;
	}
}