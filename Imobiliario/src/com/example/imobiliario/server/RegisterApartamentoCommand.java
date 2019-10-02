package com.example.imobiliario.server;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.example.imobiliario.shared.ApartamentoModel;

public class RegisterApartamentoCommand {
	
	public static Boolean registerCasa(Connection conn, ApartamentoModel apartamento) {
		
		StringBuilder str = new StringBuilder();
		str.append("INSERT INTO Casa");
		str.append("(`ID_Casa`,");
		str.append("`N_Quartos`,");
		str.append("`N_Suite`,");
		str.append("`N_SalaDeEstar`,");
		str.append("`N_Vagas`) ");
		str.append("`Area`,");
		str.append("`Descricao`) ");
		str.append("`Andar`,");
		str.append("`Portaria24`) ");
		str.append("`ValorCondominio`,");
		str.append("`PossuiArmario`) ");
		str.append("VALUES ('" + apartamento.getCasaId() + "',");
		str.append("'" + apartamento.getnQuartos() + "',");
		str.append("'" + apartamento.getnSuites() + "',");
		str.append("'" + apartamento.getnSalaDeEstar()+ "',");
		str.append("'" + apartamento.getnVagas() + "')");
		str.append("'" + apartamento.getArea() + "',");
		str.append("'" + apartamento.getDescricao() + "')");
		str.append("'" + apartamento.getAndar()+ "',");
		str.append("'" + apartamento.getPortaria24()+ "')");
		str.append("'" + apartamento.getValorCondominio() + "',");
		str.append("'" + apartamento.getPossuiArmario() + "')");
		
		String sql = str.toString();
		System.out.println("RegisterCarSaleCommand SQL: " + sql);
		Statement stmt;
		int numberOfAffectedRows = 0;
		
		try {
			stmt = conn.createStatement();
			numberOfAffectedRows = stmt.executeUpdate(sql);
			
			if (numberOfAffectedRows > 0) {
				System.out.println("Apartamento registrada com sucesso na tabela Apartamento!!!");
				return new Boolean(true);
			} else {
				System.out.println("Nao foi possivel salvar na tabela Apartamento!!!");
				return new Boolean(false);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return new Boolean(true);
	}
}
