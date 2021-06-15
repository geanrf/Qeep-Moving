
public class Futebol {
	
	private String nomeTime;
	
	// SET: para modificar o valor de um atributo da classe, geramelmente, privado, que não seja acessível diretamente.  
	public void setTime(String meuTime)
	{
		nomeTime = meuTime;
	}

	// GET: para obter o valor de uma variável declarada como private e permitir sua leitura a partir de fora da classe. 
	public String getTime()
	{
		return nomeTime;
	}
	
	public void mostraTime()
	{
		System.out.printf(" Seu time do coração é %s\n", getTime());
	}
}
