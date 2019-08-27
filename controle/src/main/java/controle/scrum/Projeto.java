package controle.scrum;

import java.util.List;

public class Projeto {

	private Long codigo;
	private List<Release> lstReleases;
	private List<Colaborador> lstColaborador;
	private String nome;

	public List<Colaborador> getLstColaborador() {
		return lstColaborador;
	}

	public void setLstColaborador(List<Colaborador> lstColaborador) {
		this.lstColaborador = lstColaborador;
	}


	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public List<Release> getLstReleases() {
		return lstReleases;
	}

	public void setLstReleases(List<Release> lstReleases) {
		this.lstReleases = lstReleases;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
