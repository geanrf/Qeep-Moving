
public class Programador extends Funcionario {
	
	private String linguagem;
	private String tipoProgramador;
	
	// @Override: usamos para explicar que estamos reescrevendo um m�todo.
	@Override 
	private void aumentaSalario() {;
	
		if (this.linguagem.equals("Java")) {
		
			// SUPER: usamos para acessar os m�todos e atributos(casos estes sejam vis�veis) da superclasse.
			super.setSalario(super.getSalario() * 1.4);
						
		}
		
		else {
			super.aumentaSalario():
		}
	
	}
	
	
	

}
