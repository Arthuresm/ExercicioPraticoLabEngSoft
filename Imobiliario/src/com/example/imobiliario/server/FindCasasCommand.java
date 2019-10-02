package com.example.imobiliario.server;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.example.imobiliario.shared.CasaModel;
import com.example.imobiliario.shared.SerialList;



public class FindCasasCommand {
	
	private static SerialList<CasaModel> casasLst = new SerialList<CasaModel>();
	
	public static SerialList<CasaModel> getCasasFromDatabase(Connection conn,Integer casaId) {
		
		String sql = "SELECT ID_Casa,Descricao FROM Casa";		
		System.out.println("FindCarBrandsCommand SQL: " + sql);
		
		Statement stmt;
		ResultSet rs;
		String descricao;
		CasaModel casa;
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			if (rs != null) {
				while (rs.next()) {
					casaId = rs.getInt(1);
					descricao = rs.getString(2);
					casa = new CasaModel();
					casa.setCasaId(casaId);
					casa.setDescricao(descricao);
					
					casasLst.add(casa);	
				}
			} else {
				System.out.println("Nao foi possivel consultar a tabela car_brands!!!");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return casasLst;
	}
}
