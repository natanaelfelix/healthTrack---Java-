package br.health.objet;

/**
 * Classe para cria��o do objeto para adi��o de controle de peso
 * @author Echodevs
 * @version 1.0
 */
public class Peso {
	/**
	 * Propriedade para constru��o do objeto de peso;
	 */
	private int cdPeso;
	private String dtVlpeso;
	private String obsPeso;
	private int cdUser;
	
	public Peso(int cdPeso, String dtVlpeso, String obsPeso, int cdUser) {
		this.cdPeso = cdPeso;
		this.dtVlpeso = dtVlpeso;
		this.obsPeso = obsPeso;
		this.cdUser = cdUser;
	}
	
	public Peso( String dtVlpeso, String obsPeso ) {
		this.dtVlpeso = dtVlpeso;
		this.obsPeso = obsPeso;
	}


	public int getCdPeso() {
		return cdPeso;
	}

	public void setCdPeso(int cdPeso) {
		this.cdPeso = cdPeso;
	}

	public String getDtVlpeso() {
		return dtVlpeso;
	}

	public void setDtVlpeso(String dtVlpeso) {
		this.dtVlpeso = dtVlpeso;
	}

	public String getObsPeso() {
		return obsPeso;
	}

	public void setObsPeso(String obsPeso) {
		this.obsPeso = obsPeso;
	}

	public int getCdUser() {
		return cdUser;
	}

	public void setCdUser(int cdUser) {
		this.cdUser = cdUser;
	}

	@Override
	public String toString() {
		return " [cdPeso=" + cdPeso + ", DtVlpeso=" + dtVlpeso + ", obsPeso=" + obsPeso + ", cdUser=" + cdUser
				+ "]";
	}
}
