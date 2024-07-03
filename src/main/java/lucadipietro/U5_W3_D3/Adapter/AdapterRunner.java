package lucadipietro.U5_W3_D3.Adapter;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

@Component
public class AdapterRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("ESERCIZIO 1");
        Info infoUtente1 = new Info("Luca","Dipietro", new Date(97, Calendar.OCTOBER,16));
        InfoAdapter infoAdapterUtente1 = new InfoAdapter(infoUtente1);
        UserData utente1 = new UserData();
        utente1.getData(infoAdapterUtente1);
        System.out.println("L'utente 1 si chiama " + utente1.getNomeCompleto() + " ed ha " + utente1.getEta() + " anni");
        System.out.println();
    }
}
