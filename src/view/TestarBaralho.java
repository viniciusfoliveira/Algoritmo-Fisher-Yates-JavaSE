package view;

import model.Baralho;

public class TestarBaralho {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Baralho baralho = new Baralho();
        
        baralho.embaralhar (baralho.getCartas());
        
        baralho.imprimirBaralho(baralho.getCartas());
        
        System.out.println("Carta retirada: " + baralho.retirarCarta(baralho.getCartas()));

	}
}
