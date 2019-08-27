package controle.scrum.enumeration;

public enum TipoAtividadeEnum {

	ITEM(1L), DEFEITO(2L);
	
	private Long value;
	
	TipoAtividadeEnum(Long value){
		this.setValue(value);
	}

	public Long getValue() {
		return value;
	}

	public void setValue(Long value) {
		this.value = value;
	}
}
