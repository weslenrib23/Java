class Animal {
    String nome;
    int idade;


    public Animal(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public void comer(){
        System.out.print(this.nome + "está comendo");
    }

    public void dormir(){
        System.out.print(this.nome + "está dormindo");
    }
    
}

class Cachorro extends Animal{
    String raca;

    public Cachorro(String nome, int idade, String raca){
        super("Cachorro " + nome, idade);
    }

    public void informarRaca(){
        System.out.println("A raça do " + this.nome + " é " + this.raca);
    }
}

class Gato extends Animal{
    String cor = "Sem cor";

    public Gato(String nome, int idade, String cor){
        super(nome, idade);
        this.cor = cor;
    }
}

public class Main{
    public static void main(String[]arg) {
        Cachorro cachorro = new Cachorro("Rex", 5, "Vira-Lata");
        cachorro.dormir();
        cachorro.comer();
        cachorro.informarRaca();

        Animal gato = new Animal("bolinha", 2);
        gato.comer();
        gato.dormir();
    }
}
