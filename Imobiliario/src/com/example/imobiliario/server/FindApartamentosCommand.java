package com.example.imobiliario.server;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.example.imobiliario.shared.ApartamentoModel;
import com.example.imobiliario.shared.SerialList;



public class FindApartamentosCommand {
	
	private static SerialList<ApartamentoModel> apartamentosLst = new SerialList<ApartamentoModel>();
	
	public static SerialList<ApartamentoModel> getCasasFromDatabase(Connection conn) {
		
		String sql = "SELECT ID_Apartamento,Descricao FROM Apartamento";		
		System.out.println("FindCarBrandsCommand SQL: " + sql);
		
		Statement stmt;
		ResultSet rs;
		Integer apartamentoId;
		String descricao;
		ApartamentoModel apartamento;
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			if (rs != null) {
				while (rs.next()) {
					apartamentoId = rs.getInt(1);
					descricao = rs.getString(2);
					apartamento = new ApartamentoModel();
					apartamento.setCasaId(apartamentoId);
					apartamento.setDescricao(descricao);
					
					apartamentosLst.add(apartamento);	
				}
			} else {
				System.out.println("Nao foi possivel consultar a tabela Apartamento!!!");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return apartamentosLst;
	}
}
