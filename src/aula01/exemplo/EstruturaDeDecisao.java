package aula01.exemplo;

public class EstruturaDeDecisao {
	public static void main(String[] args) {
		
		int idade = 17;
		
		// Estrutura Simples
		if(idade>18) {
			System.out.println("Pode dirigir.");
		}
		
		// Estrutura Composta
		if(idade>18) {
			System.out.println("Pode dirigir.");
		}else{
			System.out.println("Vai ter que ir a p�.");
		}
		
		String transporte = "Bicicleta";	
		
		// Estrutura Encadeada	
		if(idade>18) {
			System.out.println("Pode dirigir.");
		}else if(transporte.equalsIgnoreCase("bicicleta")){
			System.out.println("Vai ter que pedalando!");
		}else if(transporte == "onibus"){
			System.out.println("Vai ter que de bus�o!");
		}else{
			System.out.println("Vai ter que ir a p�.");
		}
		
	}
}
