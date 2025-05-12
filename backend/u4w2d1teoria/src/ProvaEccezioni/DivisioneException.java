package ProvaEccezioni;
/*
Per creare una classe di eccezioni dobbiamo estendere o la classe Exception o la
classe RuntimeException a seconda del tipo di eccezione che vogliamo creare.
SE estendiamo RuntimeException otteniamo una Eccezione unchecked
Altrimenti otteniamo una eccezione Checked che è obbligatorio gestire
 */
public class DivisioneException extends Exception{

    public DivisioneException() {
    }

    public DivisioneException(String message) {
        super(message);
    }
}
