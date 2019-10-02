package com.example.imobiliario.shared;

import java.io.Serializable;

public class ApartamentoModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer apartamentoId;
	private Integer nQuartos;
	private Integer nSuites;
	private Integer nSalaDeEstar;
	private Integer nVagas;
	private Integer nSalaJantar;
	private Integer andar;
	private Boolean possuiArmario;
	private Boolean portaria24;
	private String descricao;
	private Float valorCondominio;
	private Float area;
	
	public ApartamentoModel() {}	
	

	



	public ApartamentoModel(Integer apartamentoId, Integer nQuartos, Integer nSuites, Integer nSalaDeEstar,
			Integer nVagas, Integer nSalaJantar, Integer andar, Boolean possuiArmario, Boolean portaria24,
			String descricao, Float valorCondominio, Float area) {
		super();
		this.apartamentoId = apartamentoId;
		this.nQuartos = nQuartos;
		this.nSuites = nSuites;
		this.nSalaDeEstar = nSalaDeEstar;
		this.nVagas = nVagas;
		this.nSalaJantar = nSalaJantar;
		this.andar = andar;
		this.possuiArmario = possuiArmario;
		this.portaria24 = portaria24;
		this.descricao = descricao;
		this.valorCondominio = valorCondominio;
		this.area = area;
	}






	public Integer getApartamentoId() {
		return apartamentoId;
	}






	public void setApartamentoId(Integer apartamentoId) {
		this.apartamentoId = apartamentoId;
	}






	public String getDescricao() {
		return descricao;
	}






	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}






	public Integer getAndar() {
		return andar;
	}



	public void setAndar(Integer andar) {
		this.andar = andar;
	}

	public Integer getnSalaJantar() {
		return nSalaJantar;
	}






	public void setnSalaJantar(Integer nSalaJantar) {
		this.nSalaJantar = nSalaJantar;
	}






	public Boolean getPossuiArmario() {
		return possuiArmario;
	}






	public void setPossuiArmario(Boolean possuiArmario) {
		this.possuiArmario = possuiArmario;
	}






	public Boolean getPortaria24() {
		return portaria24;
	}






	public void setPortaria24(Boolean portaria24) {
		this.portaria24 = portaria24;
	}






	public Float getValorCondominio() {
		return valorCondominio;
	}






	public void setValorCondominio(Float valorCondominio) {
		this.valorCondominio = valorCondominio;
	}






	public Integer getCasaId() {
		return apartamentoId;
	}




	public void setCasaId(Integer casaId) {
		this.apartamentoId = casaId;
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
		result = prime * result + ((apartamentoId == null) ? 0 : apartamentoId.hashCode());
		result = prime * result + ((valorCondominio == null) ? 0 : valorCondominio.hashCode());
		result = prime * result + ((nSalaJantar == null) ? 0 : nSalaJantar.hashCode());
		result = prime * result + ((portaria24 == null) ? 0 : portaria24.hashCode());
		result = prime * result + ((possuiArmario == null) ? 0 : possuiArmario.hashCode());
		result = prime * result + ((andar == null) ? 0 : andar.hashCode());
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
		ApartamentoModel other = (ApartamentoModel) obj;
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
		if (apartamentoId == null) {
			if (other.apartamentoId != null)
				return false;
		} else if (!apartamentoId.equals(other.apartamentoId))
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
		if (valorCondominio == null) {
			if (other.valorCondominio != null)
				return false;
		} else if (!valorCondominio.equals(other.valorCondominio))
			if (andar == null) {
				if (other.andar != null)
					return false;
			} else if (!andar.equals(other.andar))
				return false;
			if (nSalaJantar == null) {
				if (other.nSalaJantar != null)
					return false;
			} else if (!nSalaJantar.equals(other.nSalaJantar))
				return false;
			if (possuiArmario == null) {
				if (other.possuiArmario != null)
					return false;
			} else if (!possuiArmario.equals(other.possuiArmario))
				return false;
			if (portaria24 == null) {
				if (other.portaria24 != null)
					return false;
			} else if (!portaria24.equals(other.portaria24))	
			return false;
			if (possuiArmario == null) {
				if (other.possuiArmario != null)
					return false;
			} else if (!possuiArmario.equals(other.possuiArmario))	
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ApartamentoModel [apartamentoId=" + apartamentoId + ", nQuartos=" + nQuartos + ", nSalaDeEstar=" + nSalaDeEstar
				+ ", modelDescription=" + nSuites + "Area" + area + "Vagas" + nVagas + "Andar" + andar + "Sala Jantar" + 
				nSalaJantar + " Portaria 24" + portaria24 + " Possui Armario" + possuiArmario + " Valor Condominio" + valorCondominio + "]";
	}
}
