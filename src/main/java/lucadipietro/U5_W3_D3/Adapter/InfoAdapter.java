package lucadipietro.U5_W3_D3.Adapter;

import lombok.AllArgsConstructor;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;

@AllArgsConstructor
public class InfoAdapter implements DataSource{
    private Info info;

    @Override
    public String getNomeCompleto() {
        return info.getNome() + " " + info.getCognome();
    }

    @Override
    public int getEta() {
        LocalDate dataDiNascita = info.getDataDiNascita().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate oggi = LocalDate.now();
        return Period.between(dataDiNascita, oggi).getYears();
    }
}
