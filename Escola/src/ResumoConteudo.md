# RESUMO COMPLETO -- POO EM JAVA (Aula 1, 2 e 3)

## 1. Paradigmas de Programação

-   **Procedural**: foco em passos sequenciais.
-   **Funcional**: baseado em funções matemáticas.
-   **Lógico**: baseado em relações lógicas.
-   **Orientado a Objetos (POO)**: modela o mundo real com objetos; base
    do Java.

## 2. Java -- História e Arquitetura

-   Criado pela **Sun Microsystems** (James Gosling).
-   Independente de plataforma: JVM executa o **bytecode**.
-   **JDK**: desenvolvimento.\
-   **JRE**: execução.\
-   **JVM**: interpreta o bytecode.\
-   **JIT**: compila trechos críticos em tempo real.
-   **Garbage Collector**: gerenciamento automático de memória.

## 3. Projetos Java no Eclipse

Estrutura: - `src/` → classes Java. - Pacotes → organização lógica
(`com.exemplo.app`). - Classe principal com:

``` java
public static void main(String[] args)
```

## 4. Classes, Objetos e Atributos

-   **Classe**: modelo.
-   **Objeto**: instância (`new`).
-   **Atributos**: dados internos.
-   **Métodos**: ações do objeto.
-   **Estado**: valores atuais dos atributos.

Exemplo:

``` java
class Aluno {
    String nome;
    int matricula;
    String cpf;

    void info() {
        System.out.println(nome);
    }
}
```

## 5. Construtores

-   Mesmo nome da classe.
-   Sem tipo de retorno.
-   Usados para inicializar objetos.
-   Podem ter vários (sobrecarga).

Exemplo:

``` java
Aluno(String nome, int matricula) {
    this.nome = nome;
    this.matricula = matricula;
}
```

## 6. Modificador `static`

-   Pertence à classe, não ao objeto.
-   **Atributos estáticos**: compartilhados entre todas as instâncias.
-   **Métodos estáticos**: podem ser chamados sem criar objeto.

Exemplo:

``` java
class Matematica {
    static int somar(int a, int b) {
        return a + b;
    }
}
```

## 7. Visibilidade (public, private, protected)

  Modificador     Acesso
  --------------- -----------------------------------
  **public**      qualquer classe
  **private**     apenas dentro da própria classe
  **protected**   mesma classe, pacote e subclasses
  **default**     pacote

Exemplo:

``` java
public class Pessoa {
    private String nome;
    public int idade;
    protected String documento;
}
```

## 8. Encapsulamento (getters e setters)

-   Protege atributos internos.
-   Acesso controlado via métodos públicos.

Exemplo:

``` java
class Conta {
    private float saldo;

    public float getSaldo() { return saldo; }
    public void setSaldo(float s) { if (s > 0) saldo = s; }
}
```

## 9. Collections (API)

Estruturas prontas para manipular dados.

### Principais:

-   **ArrayList** -- lista dinâmica, rápida para leitura.
-   **LinkedList** -- rápida para inserção/remoção.
-   **HashSet** -- conjunto sem ordem, sem repetições.
-   **LinkedHashSet** -- conjunto com ordem de inserção.
-   **HashMap** -- chave/valor rápido sem ordem.
-   **LinkedHashMap** -- chave/valor com ordem de inserção.
-   **PriorityQueue** -- fila de prioridade.
-   **Stack** -- pilha (LIFO).

Exemplo ArrayList:

``` java
ArrayList<String> nomes = new ArrayList<>();
nomes.add("Mario");
nomes.get(0);
```

Exemplo HashMap:

``` java
HashMap<String, String> capitais = new HashMap<>();
capitais.put("Brasil", "Brasília");
```

## 10. Métodos Utilitários (Collections)

-   `Collections.sort(lista)`
-   `Collections.shuffle(lista)`
-   `Collections.reverse(lista)`
-   `Collections.max(lista)`
-   `Collections.min(lista)`

## 11. Iterators

Permitem percorrer qualquer estrutura Collection.

Exemplo:

``` java
Iterator<Integer> it = lista.iterator();
while (it.hasNext()) {
    System.out.println(it.next());
}
```
