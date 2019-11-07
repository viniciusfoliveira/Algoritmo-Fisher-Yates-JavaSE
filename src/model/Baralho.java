package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Baralho {

	private ArrayList<Carta> cartas;
	private Random random = new Random();

	public Baralho() {

		cartas = new ArrayList<Carta>();

		// paus
		cartas.add(new Carta("AS", "PAUS"));
		cartas.add(new Carta("2", "PAUS"));
		cartas.add(new Carta("3", "PAUS"));
		cartas.add(new Carta("4", "PAUS"));
		cartas.add(new Carta("5", "PAUS"));
		cartas.add(new Carta("6", "PAUS"));
		cartas.add(new Carta("7", "PAUS"));
		cartas.add(new Carta("8", "PAUS"));
		cartas.add(new Carta("9", "PAUS"));
		cartas.add(new Carta("10", "PAUS"));
		cartas.add(new Carta("VALETE", "PAUS"));
		cartas.add(new Carta("DAMA", "PAUS"));
		cartas.add(new Carta("REI", "PAUS"));

		// ouros
		cartas.add(new Carta("AS", "OUROS"));
		cartas.add(new Carta("2", "OUROS"));
		cartas.add(new Carta("3", "OUROS"));
		cartas.add(new Carta("4", "OUROS"));
		cartas.add(new Carta("5", "OUROS"));
		cartas.add(new Carta("6", "OUROS"));
		cartas.add(new Carta("7", "OUROS"));
		cartas.add(new Carta("8", "OUROS"));
		cartas.add(new Carta("9", "OUROS"));
		cartas.add(new Carta("10", "OUROS"));
		cartas.add(new Carta("VALETE", "OUROS"));
		cartas.add(new Carta("DAMA", "OUROS"));
		cartas.add(new Carta("REI", "OUROS"));

		// copas
		cartas.add(new Carta("AS", "COPAS"));
		cartas.add(new Carta("2", "COPAS"));
		cartas.add(new Carta("3", "COPAS"));
		cartas.add(new Carta("4", "COPAS"));
		cartas.add(new Carta("5", "COPAS"));
		cartas.add(new Carta("6", "COPAS"));
		cartas.add(new Carta("7", "COPAS"));
		cartas.add(new Carta("8", "COPAS"));
		cartas.add(new Carta("9", "COPAS"));
		cartas.add(new Carta("10", "COPAS"));
		cartas.add(new Carta("VALETE", "COPAS"));
		cartas.add(new Carta("DAMA", "COPAS"));
		cartas.add(new Carta("REI", "COPAS"));

		// espadas
		cartas.add(new Carta("AS", "ESPADAS"));
		cartas.add(new Carta("2", "ESPADAS"));
		cartas.add(new Carta("3", "ESPADAS"));
		cartas.add(new Carta("4", "ESPADAS"));
		cartas.add(new Carta("5", "ESPADAS"));
		cartas.add(new Carta("6", "ESPADAS"));
		cartas.add(new Carta("7", "ESPADAS"));
		cartas.add(new Carta("8", "ESPADAS"));
		cartas.add(new Carta("9", "ESPADAS"));
		cartas.add(new Carta("10", "ESPADAS"));
		cartas.add(new Carta("VALETE", "ESPADAS"));
		cartas.add(new Carta("DAMA", "ESPADAS"));
		cartas.add(new Carta("REI", "ESPADAS"));

	}

	public ArrayList<Carta> getCartas() {
		return cartas;
	}

	public void embaralhar(ArrayList baralho) {

		for (int i = 0; i < baralho.size(); i++) {
			int n = i + random.nextInt(baralho.size() - i);
			swap(baralho, i, n);
		}
	}

	private void swap(ArrayList baralho, int i, int n) {
		int tmp = baralho.indexOf(baralho.get(n));
		baralho.set(i, baralho.get(i));
		Collections.swap(baralho, i, tmp);
	}

	public void imprimirBaralho(ArrayList baralho) {
		for (int i = 0; i < baralho.size(); i++) {
			System.out.println(baralho.get(i).toString());
		}
	}

	public String retirarCarta(ArrayList baralho) {
		String carta = null;
		for (int i = 0; i < baralho.size(); i++) {
			int n = i + random.nextInt(baralho.size() - i);
			carta = baralho.remove(n).toString();
			break;
		}

		return carta;
	}
}
