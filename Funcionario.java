
public class Funcionario {

	private String nome;
	private String cpf;
	private double salario;
	private double horasSemanais;
	
	
	
	public void setSalario(double salario) {
		this.salario = salario;
		
	}
	
	public double getSalario() {
		return this.salario;
	}
	
	
	public void aumentaSalario() {
		this.salario = this.salario * 1.3;
	}
	
}
