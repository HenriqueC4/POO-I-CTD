import com.Cachorro;
import com.Cavalo;
import com.Preguica;

public class Main {
    public static void main(String[] args)
    {
        Cachorro pinscher = new Cachorro("Petruccio", 2);

        System.out.println(pinscher.getNome());
        System.out.println(pinscher.getIdade());
        System.out.println(pinscher.movimento());
        System.out.println(pinscher.som());

    }
}