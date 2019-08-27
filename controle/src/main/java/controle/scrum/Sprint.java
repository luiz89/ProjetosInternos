package controle.scrum;

import java.util.Date;
import java.util.List;

public class Sprint {

	private Long codigo;
	private Long codigoRelease;
	private Date dataInicioPrevisto;
	private Date dataTerminoPrevisto;
	private Date dataInicio;
	private Date dataTermino;
	private List<Atividade> lstAtividade;

	public Date getDataInicioPrevisto() {
		return dataInicioPrevisto;
	}

	public Date getDataTerminoPrevisto() {
		return dataTerminoPrevisto;
	}

	public void setDataTerminoPrevisto(Date dataTerminoPrevisto) {
		this.dataTerminoPrevisto = dataTerminoPrevisto;
	}

	public void setDataInicioPrevisto(Date dataInicioPrevisto) {
		this.dataInicioPrevisto = dataInicioPrevisto;
	}

	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Date getDataTermino() {
		return dataTermino;
	}

	public void setDataTermino(Date dataTermino) {
		this.dataTermino = dataTermino;
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public Long getCodigoRelease() {
		return codigoRelease;
	}

	public void setCodigoRelease(Long codigoRelease) {
		this.codigoRelease = codigoRelease;
	}

	public List<Atividade> getLstAtividade() {
		return lstAtividade;
	}

	public void setLstAtividade(List<Atividade> lstAtividade) {
		this.lstAtividade = lstAtividade;
	}

}
