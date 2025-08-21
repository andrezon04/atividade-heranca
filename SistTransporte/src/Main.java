import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Veiculo> veiculo = new ArrayList<>();

        veiculo.add(new Carro(""));
        veiculo.add(new Onibus("",4));
        veiculo.add(new Bicicleta(""));

        for(Veiculo v : veiculo){
            System.out.println(v);
            System.out.println("O tempo em horas são: "+ v.calcularTempo(100));
        }

    }
}