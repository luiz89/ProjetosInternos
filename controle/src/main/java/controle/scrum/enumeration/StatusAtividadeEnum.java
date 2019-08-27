package controle.scrum.enumeration;

public enum StatusAtividadeEnum {

	ABERTO(1L), FINALIZADA(2L);
	
	private Long value;
	
	StatusAtividadeEnum(Long value){
		this.setValue(value);
	}

	public Long getValue() {
		return value;
	}

	public void setValue(Long value) {
		this.value = value;
	}
}
