package lucadipietro.U5_W3_D3.Composite;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Sezione implements Componente{
    private String titolo;
    private List<Componente> sottoComponenti;

    public Sezione(String titolo) {
        this.titolo = titolo;
        this.sottoComponenti = new ArrayList<>();
    }

    public void aggiungiComponente(Componente componente){
        this.sottoComponenti.add(componente);
    }

    @Override
    public int getNumeroPagine() {
        int totalePagine = 0;
        for (Componente componente : sottoComponenti){
            totalePagine += componente.getNumeroPagine();
        }
        return totalePagine;
    }

    @Override
    public void stampa() {
        System.out.println("Sezione: " + titolo);
        for (Componente componente : sottoComponenti){
            componente.stampa();
        }
    }
}
