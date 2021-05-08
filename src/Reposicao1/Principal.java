package Reposicao1;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Controle c = new Controle();
		
		
		c.add("Pedrada");
		c.add("Paula Tejando");
		c.add("Cavalo");
		c.add("Calova");
		c.add("gadelho");
		c.add("gads");
		c.add("Kenzao");
		c.add("Beatriz");
		c.add("kenzito");
		c.add("zaaz");
		c.add("zali");
		c.add("zULEIKA");
		c.add("Days");
		c.add("amora");
		c.add("brunin");
		c.add("alura");
		c.add("zuckerberg");
		c.add("Aastuncio");
		c.add("Denis");
		c.add("Daiane");
		c.add("Cesar");
		c.add("Luizeiro");
		c.add("zelbert");
		c.add("Luizada da Silva");
		c.add("Barbara");
		c.add("Luiz");
		c.add("Luiza");
		c.add("cu");
		c.rename("zali", "Zalison");
		c.rename("CALOVA", "caavalo");
		c.exists("papi");
		c.exists("Gabriel Monteiro");
		c.exists("Gadelho");
		c.print();
		c.size();
	}

}
