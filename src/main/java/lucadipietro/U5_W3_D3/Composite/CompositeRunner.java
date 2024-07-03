package lucadipietro.U5_W3_D3.Composite;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CompositeRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("ESERCIZIO 2");
        Sezione introduzione = new Sezione("Introduzione");
        Sezione sezioneCentrale = new Sezione("Sezione centrale");
        Sezione sezioneFinale = new Sezione("Sezione Finale");
        for (int i = 1; i <= 3; i++){
            Pagina pagineIntroduzione = new Pagina(i);
            introduzione.aggiungiComponente(pagineIntroduzione);
        }
        for (int i = 1; i <= 20; i++){
            Pagina pagineSezioneCentrale = new Pagina(i);
            sezioneCentrale.aggiungiComponente(pagineSezioneCentrale);
        }
        for (int i = 1; i <= 10; i++){
            Pagina pagineSezioneFinale = new Pagina(i);
            sezioneFinale.aggiungiComponente(pagineSezioneFinale);
        }
        Libro libro = new Libro("Paradiso", 33.33);
        libro.aggiungiSezione(introduzione);
        libro.aggiungiSezione(sezioneCentrale);
        libro.aggiungiSezione(sezioneFinale);
        libro.aggiungiAutore("Giacomo");
        libro.aggiungiAutore("Aldo");
        libro.aggiungiAutore("Giovanni");

        System.out.println();
        libro.stampa();
        System.out.println();
        System.out.println("Costo del libro: " + libro.getPrezzo());
        System.out.println("Numero totale delle pagine del libro: " + libro.getNumeroPagine());
        System.out.println("Autori del libro: " + libro.getAutori());
        System.out.println();
    }
}
