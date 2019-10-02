package com.example.imobiliario.shared;

import java.io.Serializable;

public class CasaModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer casaId;
	private Integer nQuartos;
	private Integer nSuites;
	private Integer nSalaDeEstar;
	private Integer nVagas;
	private String descricao;
	private Float area;
	
	public CasaModel() {}	

	




	public CasaModel(Integer casaId, Integer nQuartos, Integer nSuites, Integer nSalaDeEstar, Integer nVagas,
			String descricao, Float area) {
		super();
		this.casaId = casaId;
		this.nQuartos = nQuartos;
		this.nSuites = nSuites;
		this.nSalaDeEstar = nSalaDeEstar;
		this.nVagas = nVagas;
		this.descricao = descricao;
		this.area = area;
	}






	public String getDescricao() {
		return descricao;
	}






	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}






	public Integer getCasaId() {
		return casaId;
	}




	public void setCasaId(Integer casaId) {
		this.casaId = casaId;
	}




	public Integer getnQuartos() {
		return nQuartos;
	}




	public void setnQuartos(Integer nQuartos) {
		this.nQuartos = nQuartos;
	}




	public Integer getnSuites() {
		return nSuites;
	}




	public void setnSuites(Integer nSuites) {
		this.nSuites = nSuites;
	}




	public Integer getnSalaDeEstar() {
		return nSalaDeEstar;
	}




	public void setnSalaDeEstar(Integer nSalaDeEstar) {
		this.nSalaDeEstar = nSalaDeEstar;
	}




	public Integer getnVagas() {
		return nVagas;
	}




	public void setnVagas(Integer nVagas) {
		this.nVagas = nVagas;
	}




	public Float getArea() {
		return area;
	}




	public void setArea(Float area) {
		this.area = area;
	}




	public static long getSerialversionuid() {
		return serialVersionUID;
	}




	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((area == null) ? 0 : area.hashCode());
		result = prime * result + ((nQuartos == null) ? 0 : nQuartos.hashCode());
		result = prime * result + ((nSalaDeEstar == null) ? 0 : nSalaDeEstar.hashCode());
		result = prime * result + ((nSuites == null) ? 0 : nSuites.hashCode());
		result = prime * result + ((nVagas == null) ? 0 : nVagas.hashCode());
		result = prime * result + ((casaId == null) ? 0 : casaId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CasaModel other = (CasaModel) obj;
		if (area == null) {
			if (other.area != null)
				return false;
		} else if (!area.equals(other.area))
			return false;
		if (nVagas == null) {
			if (other.nVagas != null)
				return false;
		} else if (!nVagas.equals(other.nVagas))
			return false;
		if (casaId == null) {
			if (other.casaId != null)
				return false;
		} else if (!casaId.equals(other.casaId))
			return false;
		if (nQuartos == null) {
			if (other.nQuartos != null)
				return false;
		} else if (!nQuartos.equals(other.nQuartos))
			return false;
		if (nSalaDeEstar == null) {
			if (other.nSalaDeEstar != null)
				return false;
		} else if (!nSalaDeEstar.equals(other.nSalaDeEstar))
			return false;
		if (nQuartos == null) {
			if (other.nQuartos != null)
				return false;
		} else if (!nQuartos.equals(other.nQuartos))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CasaModel [casaId=" + casaId + ", nQuartos=" + nQuartos + ", nSalaDeEstar=" + nSalaDeEstar
				+ ", modelDescription=" + nSuites + "Area" + area + "Vagas" + nVagas +"]";
	}
}
