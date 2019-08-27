package controle.scrum;

import java.util.List;

public class Release {

	private Long codigo;
	
	private Long codigoProjeto;

	private List<Sprint> lstSprints;

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public List<Sprint> getLstSprints() {
		return lstSprints;
	}

	public void setLstSprints(List<Sprint> lstSprints) {
		this.lstSprints = lstSprints;
	}

	public Long getCodigoProjeto() {
		return codigoProjeto;
	}

	public void setCodigoProjeto(Long codigoProjeto) {
		this.codigoProjeto = codigoProjeto;
	}

}
