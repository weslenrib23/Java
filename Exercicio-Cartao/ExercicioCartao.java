class Cartao {
    protected String numero;
    protected String nomeTitular;
    protected String validade;
    protected int cvv;
    protected String bandeira;

    public Cartao(
        String numero,
        String nomeTitular,
        String validade,
        int cvv,
        String bandeira
    ) {
        this.numero = numero;
        this.nomeTitular = nomeTitular;
        this.validade = validade;
        this.cvv = cvv;
        this.bandeira = bandeira;
    }
}

class CartaoCredito extends Cartao {
    public CartaoCredito(
        String numero,
        String nomeTitular,
        String validade,
        int cvv,
        String bandeira
    ) {
        super(
            numero,
            nomeTitular,
            validade,
            cvv,
            bandeira
        );
    }
}

class Compra {
    public Compra(
        float valor,
        int parcela,
        int quantidade
    ) {
        this.valor = valor;
        this.parcela = parcela;
        this.quantidade = quantidade;
    }
}

public class ExercicioCartao {
    public static void main(String[] args) {
        CartaoCredito cartaoCredito = new CartaoCredito(
            "001515151551",
            "João da Silva",
            "10/30",
            999,
            "VISA"
        );

        Compra compra = new Compra(
            100.00,
            10,
            1
        );

        Pagamento pagamento = new Pagamento(
            compra,
            cartaoCredito
        );

        pagamento.realizar();
    }
}