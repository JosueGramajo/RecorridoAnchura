package objects;

public class Nodo {
    private String id;
    private Nodo nodo1;
    private Nodo nodo2;
    private int nivel;
    private Object ui;

    public Nodo(){}

    public Nodo(String id, Nodo nodo1, Nodo nodo2, int nivel, Object ui) {
        this.id = id;
        this.nodo1 = nodo1;
        this.nodo2 = nodo2;
        this.nivel = nivel;
        this.ui = ui;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the nodo1
     */
    public Nodo getNodo1() {
        return nodo1;
    }

    /**
     * @param nodo1 the nodo1 to set
     */
    public void setNodo1(Nodo nodo1) {
        this.nodo1 = nodo1;
    }

    /**
     * @return the nodo2
     */
    public Nodo getNodo2() {
        return nodo2;
    }

    /**
     * @param nodo2 the nodo2 to set
     */
    public void setNodo2(Nodo nodo2) {
        this.nodo2 = nodo2;
    }

    /**
     * @return the nivel
     */
    public int getNivel() {
        return nivel;
    }

    /**
     * @param nivel the nivel to set
     */
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    /**
     * @return the ui
     */
    public Object getUi() {
        return ui;
    }

    /**
     * @param ui the ui to set
     */
    public void setUi(Object ui) {
        this.ui = ui;
    }

}
