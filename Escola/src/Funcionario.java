public class Funcionario {
	String nome;
	String funcao;
	int idade;
	static final double salario = 1600.95;
	// final define que esse valor não pode ser alterado
	
	// Construtor vazio
	Funcionario() {}
	
	// Construtor com parâmetros
	Funcionario(String pNome, String pFuncao, int pIdade){
		nome = pNome;
		funcao = pFuncao;
		idade = pIdade;
	}
	
	/*
	// Se for passado somente a função, o nome puxa "Vazio" e idade puxa 0 como padrões
	Funcionario(String funcao){
		this.nome = "Vazio";
		this.idade = 0;
	}
	*/

}
// classe sem boas práticas 
// não informando a privacidade dos atributos
// nem getters e setters