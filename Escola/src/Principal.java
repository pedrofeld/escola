import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.PriorityQueue;

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
        
        // Listas
        
        System.out.println("\n--- Listas ---");
        
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
        
		 // Declaração do array - tanto ArrayList quanto LinkedList
		 // possuem métodos com a mesma assinatura, permitindo que o
		 // mesmo código funcione da mesma forma, modificando apenas
		 // a estrutura de dados escolhida.
		
		 ArrayList<String> pessoas = new ArrayList<String>();
		 // LinkedList<String> pessoas = new LinkedList<String>();
		
		 pessoas.add("Mario");  // Adição de novos elementos
		 pessoas.add("Luigi");
		 pessoas.add("Peach");
		 pessoas.add("Yoshi");
		
		 System.out.println("Lista de pessoas: " + pessoas); // Lista todos os elementos
		
		 String item1 = pessoas.get(0); // Retorna o elemento de índice 0
		 System.out.println("Item 1: " + item1);
		 pessoas.remove(3); // Remove o elemento de índice 3
		 int total = pessoas.size(); // Retorna a quantidade de elementos
		 System.out.println("Total de pessoas após exclusão: " + total);
		 pessoas.clear(); // Remove todos os elementos
		 System.out.println("Lista de pessoas após remoção geral: " + pessoas);
		 
		 // HashMap
		 
	     System.out.println("\n--- HashMap ---");
		 
		 HashMap<String, String> capitals = new HashMap<String, String>();
		 capitals.put("Brasil", "Brasilia");
		 capitals.put("Argentina", "Buenos Aires");
		 capitals.put("Paraguai", "Assunção");
		 capitals.put("Uruguai", "Montevideo");

		 System.out.println("Lista de capitais" + capitals); // Imprimindo todo o mapa

		 System.out.println("Capital do Uruguai: " + capitals.get("Uruguai")); // Imprimindo apenas a capital do Uruguai
		 
		 // HashSet
	     System.out.println("\n--- HashSet ---");

		 
		 HashSet<String> nomes = new HashSet<String>();
		 nomes.add("Mario");
		 nomes.add("Luigi");
		 nomes.add("Yoshi");
		 nomes.add("Mario"); // Mario já existe, portanto não será adicionado
		 nomes.add("Peach");
		 nomes.remove("Luigi"); // Remove Luigi

		 System.out.println("Lista de nomes: " + nomes); // Imprime todos os nomes

		 int totalNomes = nomes.size(); // Descobre total de itens

		 if(nomes.contains("Luigi")) { // Confere se existe
		     System.out.println("Ele está presente");
		 } else {
		     System.out.println("Não está presente");
		 }
		 
		 /*
			Elementos únicos: Não permite duplicatas

			Ordem não garantida: Os elementos podem ser impressos em qualquer ordem
			
			Busca rápida: Método contains() é muito eficiente
			
			Mario duplicado: A segunda adição é ignorada silenciosamente
		  */
		 
		 // PriorityQueue
		 System.out.println("\n--- PriorityQueue ---");
		 
		 // Criando a fila
		 PriorityQueue<Integer> fila = new PriorityQueue<Integer>();

		 // Adicionando elementos para fila usando add()
		 fila.add(10);
		 fila.add(20);
		 fila.add(15);

		 System.out.println("Elemento do topo da fila: " + fila.peek());

		 System.out.println("Imprimindo e removendo o primeiro elemento: " + fila.poll());

		 System.out.println("Imprimindo o elemento do topo novamente: " + fila.peek());
		 
		 /*
			Ordem natural: Os elementos são ordenados automaticamente
			
			peek(): Mostra o primeiro elemento sem remover
			
			poll(): Remove e retorna o primeiro elemento
			
			add(): Adiciona elementos mantendo a ordem
		  */
		 
		 // Exemplos de métodos estáticos do Collections
		 System.out.println("\n--- Métodos estáticos ---");
		 
		// Cria uma lista de string
		 ArrayList<String> lista = new ArrayList<String>();
		 lista.add("Mario");
		 lista.add("Luigi");
		 lista.add("Yoshi");
		 lista.add("Toad");
		 lista.add("Peach");

		 // Imprime a lista na ordem original
		 System.out.println("Ordem original: " + lista);

		 // Coloca lista em uma ordem aleatória
		 Collections.shuffle(lista);
		 System.out.println("Ordem aleatória: " + lista);

		 // Coloca lista em uma ordem alfabética
		 Collections.sort(lista);
		 System.out.println("Ordem alfabética: " + lista);

		 // Inverte a ordem anterior da lista
		 Collections.reverse(lista);
		 System.out.println("Ordem anterior invertida" + lista);

		 System.out.println("Maior elemento alfabético: " + Collections.max(lista));

		 System.out.println("Menor elemento alfabético: " + Collections.min(lista));
		 
		// Iterator
		System.out.println("\n--- Iterator ---");
		
		// Diferentes formas de iterar coleções
		System.out.println("Exemplo 1:");
		
		ArrayList<Integer> lista2 = new ArrayList<Integer>();
		HashSet<Integer> conjunto = new HashSet<Integer>();
		HashMap<String, Integer> mapa = new HashMap<String, Integer>();
		int soma;
		lista2.add(5);
		lista2.add(10);
		lista2.add(15);
		lista2.add(20);

		soma = 0; // For simples
		for(int i = 0; i < lista2.size(); i++) {
		    soma += lista2.get(i);
		}
		
		System.out.println("Utilizando FOR simples: " + soma);

		soma = 0; // For each
		for(int item : lista2) {
		    soma += item;
		}
		
		System.out.println("Utilizando FOR EACH: " + soma);

		soma = 0; // Iterator
		// Iterator it = mapa.entrySet().iterator();
		// Iterator it = conjunto.iterator();
		Iterator it = lista2.iterator();
		while(it.hasNext()) {
		    soma += (int)it.next();
		}
		
		System.out.println("Utilizando WHILE: " + soma);
		
		/*
			For simples: Funciona apenas com ArrayList (acesso por índice)
			
			For each: Mais legível, mas não permite remoção
			
			Iterator: Controle total, funciona com qualquer coleção
		 */
		
		// Iteração reversa com ListIterator
		System.out.println("Exemplo 2:");
		
		// Suponha lista como um ArrayList com dados de algum tipo, por exemplo strings.
		ListIterator it2 = lista.listIterator(lista.size());
		while (it2.hasPrevious()) {
		    System.out.println(it2.previous());
		}
		
		ArrayList<String> novaLista = new ArrayList<String>();
		novaLista.add("Maca");
		novaLista.add("Manga");
		novaLista.add("Abacate");
		novaLista.add("Laranja");
		novaLista.add("Pessego");
        
        System.out.println("Os elementos: ");
        for (String s : novaLista) {
            System.out.println(s);
        }
        
        /*
	        ListIterator é posicionado no final da lista
	
			hasPrevious() verifica se existe elemento anterior
			
			previous() retorna e move para o elemento anterior
			
			Resultado: A lista é impressa na ordem inversa
         */
        
        System.out.println("Exemplo 3:");
        Iterator i = novaLista.iterator();
        String str = "";
        while (i.hasNext()) {
            str = (String) i.next();
            if (str.equals("Laranja")) {
                i.remove();
                System.out.println("Laranja removida");
                break;
            }
        }
        
        System.out.println("Os elementos: ");
        for (String s : novaLista) {
            System.out.println(s);
        }
        
        /*
			Iterator percorre: "Maca" → "Manga" → "Abacate" → "Laranja"
			
			Quando encontra "Laranja", chama i.remove()
			
			Vantagem: Remove diretamente da coleção original sem problemas
			
			Sem Iterator: Se tentasse lista.remove("Laranja") durante um for-each, causaria erro
         */
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
	 
--------------------------------------

	Classes Collections
	
	HashSet na computação, o termo Hash diz respeito a uma função que transforma 
	um valor em outro, e a palavra Set tem diversos significados diferentes sendo 
	que, nessa situação específica, significa conjunto. Então uma HashSet é um conjunto 
	de elementos organizados por meio de uma função Hash. Ela realiza operações de adição, 
	remoção e busca de forma muito rápida, contudo, não garante uma ordem dos elementos.

	LinkedHashSet é semelhante a HashSet, porém, ele armazena a ordem em que os elementos 
	foram adicionados.

	HashMap é a estrutura de dados também baseada em Hash, com a diferença que é possível 
	mapear (daí o nome Map) uma ID de um tipo diverso. Por exemplo, podemos ordenar os filmes 
	de um catálogo não por um valor inteiro, mas por uma string contendo o nome do filme 
	seguido do ano de exibição. Não possui ordem garantida.

	TreeMap semelhante a HashMap, entretanto, também armazena a ordem dos itens, essa ordem 
	pode ser livremente manipulada combinando as características de em um array.

	LinkedHashMap é semelhante a HashMap, todavia, internamente também armazena a ordem em 
	que os elementos foram adicionados.

	Queue é uma estrutura de dados geralmente adotada para representar filas de prioridade, 
	queue no inglês significa fila. Ela pode implementar uma fila de prioridade comum, 
	semelhante a uma fila convencional no mundo real em que o primeiro elemento a entrar 
	é o primeiro a ser atendido.

	Stack é outra classe semelhante a fila de prioridades, mas implementa uma fila reversa 
	à ordem de inserção, o último elemento adicionado é o primeiro a ser tratado, conceito 
	denominado pilha, se empilharmos diversos objetos um sobre o outro, o último objeto 
	empilhado será o primeiro que vamos acessar.
	
--------------------------------------
	
	Métodos estáticos do Collections
	
	Sort (List<> lista): coloca em ordem crescente os itens da lista passada por parâmetro.
	
	Shuffle (List<> lista, Random rnd): embaralha de forma aleatória os elementos da lista 
	passada por parâmetro, a aleatoriedade do embaralhamento é dada pelo objeto da classe 
	Random passado por parâmetro também.
	
	Max (Collection<> coll, Comparator<> comp): retorna o maior elemento, aceita tanto lista, 
	quanto hash. Como segundo parâmetro, você pode indicar como deseja realizar a comparação 
	com um objeto da classe Comparator, caso passe null como segundo parâmetro, a ordem 
	natural será adotada.
	
	Min (Collection<> coll, Comparator<> comp): análogo ao max, porém, retorna o menor 
	elemento.
	
	Reverse (List<> lista): coloca todos os itens em ordem reversa.
	
--------------------------------------

	Iterator
	
	O Iterator é um padrão de projeto que permite percorrer elementos de uma coleção sem 
	expor sua estrutura interna.
  
	 PRINCIPAIS FUNÇÕES:
	 - hasNext(): Verifica se existe próximo elemento
	 - next(): Retorna o próximo elemento
	 - remove(): Remove o elemento atual (OPERAÇÃO SEGURA)
	 
	 VANTAGENS:
	 - Permite remover elementos durante a iteração SEM causar
	 - ConcurrentModificationException
	 - Funciona com qualquer tipo de coleção (ArrayList, HashSet, etc.)
	 - Oferece iteração unidirecional eficiente
 */