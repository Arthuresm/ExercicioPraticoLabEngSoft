package com.example.imobiliario.server;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.example.imobiliario.shared.ApartamentoModel;
import com.example.imobiliario.shared.SerialList;

public class FindApartamentosModelCommand {
	
	private static SerialList<ApartamentoModel> modelsLst = new SerialList<ApartamentoModel>();
	
	public static SerialList<ApartamentoModel> getCarModelsFromDatabase(Connection conn, Integer apartamentoId) {
		
		StringBuilder str = new StringBuilder();
		
		str.append("SELECT c.ID_Casa, c.Area, c.N_Quartos , c.N_SalaDeEstar, c.Descricao ");
		str.append("FROM Casa c ");
		
		String sql = str.toString();
		System.out.println("FindCarModelsCommand SQL: " + sql);
		Statement stmt;
		ResultSet rs;
		
		Float area;
		Integer nQuartos;
		Integer nSalaDeEstar;
		String modelDescription;
		ApartamentoModel apartamentoModel;
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			if (rs != null) {
				while (rs.next()) {
					
					// get values from database
					apartamentoId = rs.getInt(1);
					area = rs.getFloat(2);
					nQuartos = rs.getInt(3);
					nSalaDeEstar = rs.getInt(4);
					modelDescription = rs.getString(5);
					
					apartamentoModel = new ApartamentoModel();
					apartamentoModel.setCasaId(apartamentoId);
					apartamentoModel.setArea(area);
					apartamentoModel.setnQuartos(nQuartos);
					apartamentoModel.setnSalaDeEstar(nSalaDeEstar);
					apartamentoModel.setDescricao(modelDescription);
					
					modelsLst.add(apartamentoModel);	
				}
			} else {
				System.out.println("Nao foi possivel consultar a tabela Apartamento!!!");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return modelsLst;
	}
}
