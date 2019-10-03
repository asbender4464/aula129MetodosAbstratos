package entidades;

import entidadeEnum.CorDaForma;

public class Retangulo extends FormasGenericas {

	//Atributos
	private Double largura;
	private Double altura;
	
	//Construtores
	public Retangulo() {
		super();
	}
	
	public Retangulo(CorDaForma cor, Double largura, Double altura) {
		super(cor);
		this.largura = largura;
		this.altura = altura;
	}

	//GETs e SETs
	public Double getLargura() {
		return largura;
	}

	public void setLargura(Double largura) {
		this.largura = largura;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	//Método
	@Override
	public Double area() {
		return largura * altura;
	}
	
}
