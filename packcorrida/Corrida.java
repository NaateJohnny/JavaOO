package packorrida;

public class Corrida {
	public String tipo;
	public String autodromo;
	public int voltas;
	
	public String listarDados(){
		
		return tipo + " de " + autodromo + ": " + voltas + " volta(s)";
		
	}

	public void iniciarCorrida(){
		
		for(int i=1;i<=7;i++){
			if(voltas > 0){
				System.out.print("Volta nº " + i + "\n");
			}
		}
	}

}
