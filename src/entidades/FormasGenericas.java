package entidades;

import entidadeEnum.CorDaForma;

public  abstract class FormasGenericas {

	private CorDaForma cor;

	//Construtores
	public FormasGenericas () {
	}
	
	public FormasGenericas(CorDaForma cor) {
		this.cor = cor;
	}

	//GET e SET
	public CorDaForma getCor() {
		return cor;
	}

	public void setCor(CorDaForma cor) {
		this.cor = cor;
	}
	
	//M�todo - observe que a Classe precisa ser 'abstrata' tamb�m.
	public abstract Double area();
	
}
