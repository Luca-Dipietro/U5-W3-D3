package lucadipietro.U5_W3_D3.Composite;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

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
        for (int i = 1; i <= 27; i++){
            Pagina pagineSezioneCentrale = new Pagina(i);
            sezioneCentrale.aggiungiComponente(pagineSezioneCentrale);
        }
        for (int i = 1; i <= 10; i++){
            Pagina pagineSezioneFinale = new Pagina(i);
            sezioneFinale.aggiungiComponente(pagineSezioneFinale);
        }
    }
}
