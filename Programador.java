
public class Programador extends Funcionario {
	
	private String linguagem;
	private String tipoProgramador;
	
	// @Override: usamos para explicar que estamos reescrevendo um método.
	@Override 
	private void aumentaSalario() {;
	
		if (this.linguagem.equals("Java")) {
		
			// SUPER: usamos para acessar os métodos e atributos(casos estes sejam visíveis) da superclasse.
			super.setSalario(super.getSalario() * 1.4);
						
		}
		
		else {
			super.aumentaSalario():
		}
	
	}
	
	
	

}
