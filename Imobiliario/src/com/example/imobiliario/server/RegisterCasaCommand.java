package com.example.imobiliario.server;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.example.imobiliario.shared.CasaModel;

public class RegisterCasaCommand {
	
	public static Boolean registerCasa(Connection conn, CasaModel casa) {
		
		StringBuilder str = new StringBuilder();
		str.append("INSERT INTO Casa");
		str.append("(`ID_Casa`,");
		str.append("`N_Quartos`,");
		str.append("`N_Suite`,");
		str.append("`N_SalaDeEstar`,");
		str.append("`N_Vagas`) ");
		str.append("`Area`,");
		str.append("`Descricao`) ");
		str.append("VALUES ('" + casa.getCasaId() + "',");
		str.append("'" + casa.getnQuartos() + "',");
		str.append("'" + casa.getnSuites() + "',");
		str.append("'" + casa.getnSalaDeEstar()+ "',");
		str.append("'" + casa.getnVagas() + "')");
		str.append("'" + casa.getArea() + "',");
		str.append("'" + casa.getDescricao() + "')");
		
		String sql = str.toString();
		System.out.println("RegisterCarSaleCommand SQL: " + sql);
		Statement stmt;
		int numberOfAffectedRows = 0;
		
		try {
			stmt = conn.createStatement();
			numberOfAffectedRows = stmt.executeUpdate(sql);
			
			if (numberOfAffectedRows > 0) {
				System.out.println("Casa registrada com sucesso na tabela casa!!!");
				return new Boolean(true);
			} else {
				System.out.println("Nao foi possivel salvar na tabela casa!!!");
				return new Boolean(false);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return new Boolean(true);
	}
}
