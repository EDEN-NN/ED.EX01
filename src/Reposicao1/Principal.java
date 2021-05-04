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
		c.add("kenzito");
		c.add("zaaz");
		c.add("zali");
		c.add("Days");
		c.add("amora");
		c.add("brunin");
		c.add("alura");
		c.add("zuckerberg");
		c.exists("papi");
		c.exists("Gabriel Monteiro");
		c.exists("Gadelho");
		c.print();
		c.size();
	}

}
