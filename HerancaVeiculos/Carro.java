package HerancaVeiculos;

public class Carro extends Veiculo {
    public Carro(String modelo) {
        super(modelo);
    }

    public void iniciar() {
        super.iniciar();
        System.out.println("Carro está iniciado...");
    }
}