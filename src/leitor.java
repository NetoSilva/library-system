public class leitor extends usuario {
    
    private boolean multaPendente;

    public leitor(String id, String nome, String email) {
        super(id, nome, email);
        this.multaPendente = false;
    }

    public boolean multaPendente() {
        return multaPendente;
    }

    public void setmultaPendente(boolean status) {
        this.multaPendente = status;
    }

}
