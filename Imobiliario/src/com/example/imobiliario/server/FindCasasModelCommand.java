package com.example.imobiliario.server;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.example.imobiliario.shared.CasaModel;
import com.example.imobiliario.shared.SerialList;

public class FindCasasModelCommand {
	
	private static SerialList<CasaModel> modelsLst = new SerialList<CasaModel>();
	
	public static SerialList<CasaModel> getCarModelsFromDatabase(Connection conn) {
		
		StringBuilder str = new StringBuilder();
		
		str.append("SELECT c.ID_Casa, c.Area, c.N_Quartos , c.N_SalaDeEstar, c.Descricao ");
		str.append("FROM Casa c ");
		
		String sql = str.toString();
		System.out.println("FindCarModelsCommand SQL: " + sql);
		Statement stmt;
		ResultSet rs;
		
		Integer casaId;
		Float area;
		Integer nQuartos;
		Integer nSalaDeEstar;
		String modelDescription;
		CasaModel casaModel;
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			if (rs != null) {
				while (rs.next()) {
					
					// get values from database
					casaId = rs.getInt(1);
					area = rs.getFloat(2);
					nQuartos = rs.getInt(3);
					nSalaDeEstar = rs.getInt(4);
					modelDescription = rs.getString(5);
					
					casaModel = new CasaModel();
					casaModel.setCasaId(casaId);
					casaModel.setArea(area);
					casaModel.setnQuartos(nQuartos);
					casaModel.setnSalaDeEstar(nSalaDeEstar);
					casaModel.setDescricao(modelDescription);
					
					modelsLst.add(casaModel);	
				}
			} else {
				System.out.println("Nao foi possivel consultar a tabela Casa!!!");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return modelsLst;
	}
}
