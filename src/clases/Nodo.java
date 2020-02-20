package clases;

/**
 *
 * @author pedro
 */
public class Nodo {
    private String id;
    private boolean anulable;
    private int siguientes[];
    private int ultimos[];
    Nodo hIzquierdo, hDerecho;

    public Nodo(String id, boolean anulable) {
        this.id = id;
        this.anulable = anulable;
        this.hIzquierdo = hDerecho = null;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isAnulable() {
        return anulable;
    }

    public void setAnulable(boolean anulable) {
        this.anulable = anulable;
    }

    public int[] getSiguientes() {
        return siguientes;
    }

    public void setSiguientes(int[] siguientes) {
        this.siguientes = siguientes;
    }

    public int[] getUltimos() {
        return ultimos;
    }

    public void setUltimos(int[] ultimos) {
        this.ultimos = ultimos;
    }

    public Nodo gethIzquierdo() {
        return hIzquierdo;
    }

    public void sethIzquierdo(Nodo hIzquierdo) {
        this.hIzquierdo = hIzquierdo;
    }

    public Nodo gethDerecho() {
        return hDerecho;
    }

    public void sethDerecho(Nodo hDerecho) {
        this.hDerecho = hDerecho;
    }
    
    
}
