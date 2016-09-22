package SuperHeroi;

public class Batalha {
	
	public static void main(String [] args){
		Heroi h1 = new Heroi();
		Heroi h2 = new Heroi("Arqueiro", new Poder());
		Heroi h3 = new Heroi("Ryu", new Hadoukem());
		Heroi h4 = new Heroi("Superman", new RaioX());
		
		h1.usarPoder();
		h2.usarPoder();
		h3.usarPoder();
		h4.usarPoder();
		
		h1.setPoder(new Hadoukem());
		
		h1.usarPoder();

	}

}
