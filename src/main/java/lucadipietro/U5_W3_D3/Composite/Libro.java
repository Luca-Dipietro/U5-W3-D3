package lucadipietro.U5_W3_D3.Composite;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Libro implements Componente{
    private String titolo;
    private double prezzo;
    private List<String> autori;
    private List<Sezione> sezioni;

    public Libro(String titolo, double prezzo) {
        this.titolo = titolo;
        this.prezzo = prezzo;
        this.autori = new ArrayList<>();
        this.sezioni = new ArrayList<>();
    }

    public void aggiungiSezione(Sezione sezione){
        this.sezioni.add(sezione);
    }

    public void aggiungiAutore(String autore){
        this.autori.add(autore);
    }

    @Override
    public int getNumeroPagine() {
        int totalePagine = 0;
        for (Sezione sezione : sezioni){
            totalePagine += sezione.getNumeroPagine();
        }
        return totalePagine;
    }

    @Override
    public void stampa() {
        System.out.println("Stampa l'intero libro");
        for (Sezione sezione : sezioni){
            sezione.stampa();
        }

    }
}
