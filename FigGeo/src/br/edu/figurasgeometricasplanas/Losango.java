package br.edu.figurasgeometricasplanas;

public class Losango {

	//atributos
	public double DiagonalMaior;
	public double DiagonalMenor;
	public double area;
	
	//construtor
public Losango() {
	DiagonalMaior = 0;
	DiagonalMenor = 0;

}

//metodos
public void calcArea() {
	area = (DiagonalMaior * DiagonalMenor)/2;
    System.out.println("A �rea do losango � igual a: "+ area);

}


//CODIGO N�O TERMINADO


	
}
