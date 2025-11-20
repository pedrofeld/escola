public class Principal {

    public static void main(String[] args) {
        // Criando objeto Aluno
        Aluno a = new Aluno();
        
        // Usando setters para definir valores
        a.setMatricula(1000);
        a.setNome("Pedro Feld");
        a.setCpf("00011122233");
                
        // Usando getters para acessar valores
        System.out.println("Matrícula: " + a.getMatricula());
        System.out.println("Nome: " + a.getNome());
        System.out.println("CPF: " + a.getCpf());

        // Alterando o nome
        a.setNome("Pedro Gael Feld");
                
        System.out.println("Nome atualizado: " + a.getNome());
        
        Funcionario f = new Funcionario();
        f.nome = "Augusto Carrara";
        f.idade = 61;
        f.funcao = "Zelador";
        
        System.out.println("Nome do funcionário: " + f.nome);
        System.out.println("Idade do funcionário: " + f.idade);
        System.out.println("Função do funcionário: " + f.funcao);
        System.out.println("Salário do funcionário" + f.salario);
    }
}

/*
	Dentro do Java, os padrões são os seguintes:
	
	• Pacotes: são descritos inteiramente em letras minúsculas. 
	Ex: com.empresa
	
	• Classes: inicia com letra maiúscula e segue o Camel Case. 
	Ex: Aluno
	
	• Métodos, atributos e variáveis: iniciam com letra minúscula e seguem o Camel Case. 
	Ex: nomeCompleto
	
	• Constantes: inteiramente com letras maiúsculas separadas por underline. 
	Ex: VALOR_PI
*/