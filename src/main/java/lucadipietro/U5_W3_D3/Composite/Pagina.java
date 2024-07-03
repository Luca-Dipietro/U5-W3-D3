package lucadipietro.U5_W3_D3.Composite;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Pagina implements Componente{
    private int numeroPagine;

    @Override
    public int getNumeroPagine(){
        return 1;
    }

    @Override
    public void stampa() {
        System.out.println("Pagina numero " + numeroPagine);
    }
}
