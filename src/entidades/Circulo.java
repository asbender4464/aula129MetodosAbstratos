package entidades;

import entidadeEnum.CorDaForma;

public class Circulo extends FormasGenericas {

	//Atributos
	private Double raio;
	
	//Construtores
	public Circulo() {
		super();
	}
	
	public Circulo(CorDaForma cor, Double raio) {
		super(cor);
		this.raio = raio;
	}

	//GETs e SETs
	public Double getRaio() {
		return raio;
	}

	public void setRaio(Double raio) {
		this.raio = raio;
	}

	//Métodos
	@Override
	public Double area() {
		return Math.PI * Math.pow(raio, 2);
	}
	
}
