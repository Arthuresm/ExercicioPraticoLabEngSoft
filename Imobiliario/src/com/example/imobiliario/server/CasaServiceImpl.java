package com.example.imobiliario.server;

import java.sql.Connection;
import java.sql.SQLException;

import com.example.imobiliario.shared.CasaModel;
import com.example.imobiliario.shared.SerialList;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

/**
 * The server-side implementation of the RPC service.
 */
@SuppressWarnings("serial")
public class CasaServiceImpl extends RemoteServiceServlet implements CasaService {
	
	public Boolean register(CasaModel casa) {
		Boolean response = null;
		try {
			Connection conn = DatabaseConnection.getDBConnection();
			response = RegisterCasaCommand.registerCasa(conn, casa);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return response;
	}
	
	public SerialList<CasaModel> findCasaBrands(Integer casaId) {
		SerialList<CasaModel> casasLst = null;	
		try {
			Connection conn = DatabaseConnection.getDBConnection();
			casasLst = FindCasasCommand.getCasasFromDatabase(conn, casaId);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		return casasLst;
	}
	
}
