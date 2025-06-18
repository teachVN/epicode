package adapter;

import java.util.Date;

public class InfoAdapter implements DataSource{

    private Info info;

    public InfoAdapter(Info info) {
        this.info = info;
    }

    @Override
    public String getNomeCompleto() {
        return info.getNome() + " " + info.getCognome();
    }

    @Override
    public int getEta() {
        return (int)((new Date().getTime()-info.getDataNascita().getTime())/(365*24*3600*1000));
    }
}
