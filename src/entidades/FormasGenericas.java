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
	
	//Método - observe que a Classe precisa ser 'abstrata' também.
	public abstract Double area();
	
}
