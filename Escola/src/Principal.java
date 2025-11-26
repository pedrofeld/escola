import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

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
        System.out.println("Salário do funcionário: " + f.salario);
        
        Turma turma = new Turma();
        
        // Configurando o professor
        turma.prof = new Funcionario();
        turma.prof.nome = "Elaine";
        turma.prof.idade = 35;
        turma.prof.funcao = "Professora de Matemática";
        
        // Configurando os alunos
        turma.alunos = new ArrayList<Aluno>();
        
        // Adicionando primeiro aluno
        Aluno aluno1 = new Aluno();
        aluno1.setMatricula(1001);
        aluno1.setNome("Laura Silva");
        aluno1.setCpf("11122233344");
        turma.alunos.add(aluno1);
        
        // Adicionando segundo aluno
        Aluno aluno2 = new Aluno();
        aluno2.setMatricula(1002);
        aluno2.setNome("Carlos Oliveira");
        aluno2.setCpf("22233344455");
        turma.alunos.add(aluno2);
        
        // Adicionando terceiro aluno
        Aluno aluno3 = new Aluno();
        aluno3.setMatricula(1003);
        aluno3.setNome("Mariana Santos");
        aluno3.setCpf("33344455566");
        turma.alunos.add(aluno3);
        
        // EXIBINDO TODOS OS DADOS DA TURMA
        System.out.println("\n" + "=".repeat(50));
        System.out.println("           DADOS COMPLETOS DA TURMA");
        System.out.println("=".repeat(50));
        
        // Dados do Professor
        System.out.println("\n--- PROFESSOR ---");
        System.out.println("Nome: " + turma.prof.nome);
        System.out.println("Idade: " + turma.prof.idade);
        System.out.println("Função: " + turma.prof.funcao);
        System.out.println("Salário: R$ " + Funcionario.salario);
        
        // Dados dos Alunos
        System.out.println("\n--- ALUNOS DA TURMA ---");
        System.out.println("Total de alunos: " + turma.alunos.size());
        
        for (int i = 0; i < turma.alunos.size(); i++) {
            Aluno aluno = turma.alunos.get(i);
            System.out.println("\nAluno " + (i + 1) + ":");
            System.out.println("  Matrícula: " + aluno.getMatricula());
            System.out.println("  Nome: " + aluno.getNome());
            System.out.println("  CPF: " + aluno.getCpf());
        }
        
        // Resumo da Turma
        System.out.println("\n--- RESUMO DA TURMA ---");
        System.out.println("Professor: " + turma.prof.nome);
        System.out.println("Quantidade de alunos: " + turma.alunos.size());
        System.out.println("Primeiro aluno: " + turma.alunos.get(0).getNome());
        System.out.println("Último aluno: " + turma.alunos.get(turma.alunos.size() - 1).getNome());
        
        System.out.println("\n--- Avaliação ---");
        
        Avaliacao pedro = new Avaliacao(8,9,10);
        
        System.out.println("Média do Pedro: " + pedro.mediaAritmetica());
        System.out.println("Média ponderada do Pedro: " + pedro.mediaPonderada());
        
        System.out.println("\n--- ALUNO + AVALIAÇÃO ---");
        
        Aluno pedrinho = new Aluno("Pedro Teste", "000.111.222-33", "TI", new Avaliacao(9, 10, 9.5));
        
        pedrinho.info();
        
        // ArrayList
        
        List<String> novoArrayList = new ArrayList<>();
        novoArrayList.add("A"); // Geralmente rápido
        novoArrayList.get(0);   // Muito rápido - acesso direto
        novoArrayList.add(1, "B"); // Lento - desloca elementos
        System.out.println("ArrayList: " + novoArrayList);
        
        // LinkedList
        
        List<String> linkedList = new LinkedList<>();
        linkedList.add("A");
        linkedList.get(0);   // Lento - percorre até a posição
        linkedList.add(1, "B"); // Rápido - apenas ajusta ponteiros
        System.out.println("ArrayList: " + linkedList);
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

-------------------------------------

	 HIERARQUIA DE ACESSO (do mais restritivo ao mais permissivo):
	  
	 PRIVATE - Apenas na própria classe
	 DEFAULT - Classes do mesmo pacote  
	 PROTECTED - Classes do mesmo pacote + subclasses (mesmo em outros pacotes)
	 PUBLIC - Qualquer classe em qualquer pacote
	 
	 MESMA CLASSE: Todos os modificadores permitem acesso
	 MESMO PACOTE: Public, Protected e Default permitem acesso
	 SUBCLASSE MESMO PACOTE: Public, Protected e Default permitem acesso
	 SUBCLASSE OUTRO PACOTE: Public e Protected permitem acesso
	 OUTRO PACOTE: Apenas Public permite acesso
 */