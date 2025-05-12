package ProvaEccezioni;

public class FileGiaEsistenteException extends Exception{

    public FileGiaEsistenteException() {
    }

    public FileGiaEsistenteException(String message) {
        super(message);
    }
}
