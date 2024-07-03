package lucadipietro.U5_W3_D3.Adapter;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
public class UserData {
    private String nomeCompleto;
    private int eta;

    public void getData(DataSource ds){
        nomeCompleto = ds.getNomeCompleto();
        eta = ds.getEta();
    }
}
