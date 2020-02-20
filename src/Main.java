import objects.Nodo;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Main {

    static Nodo nodoA, nodoB, nodoC, nodoD, nodoE, nodoF, nodoG, nodoH, nodoI, nodoJ, nodoK, nodoL, nodoM, nodoN, nodoO;

    static View frame;

    static String path = "";

    public static void main(String[] args) {
        frame = new View();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1800, 600);

        initTree();

        frame.setVisible(true);
    }

    public static void searchNode(String letter){
        path = "";

        for (int i = 1;i<5;i++){
            readTree(nodoA, i, letter);
        }
    }

    private static void readTree(Nodo nodo, int nivelActual, String letter){
        if (nodo.getNivel() == nivelActual){
            path += " - " + nodo.getId();

            if (nodo.getId().equals(letter)){
                System.out.println("Nodo encontrado!!!");
                System.out.println(path);

                JOptionPane.showMessageDialog(null, "Recorrido " + path);
            }
        }

        if(nodo.getNodo1()!=null){
            readTree(nodo.getNodo1(), nivelActual, letter);
            readTree(nodo.getNodo2(), nivelActual, letter);
        }
    }

    private static void initTree(){
        frame.inicio();
        nodoA = new Nodo("A",null,null,1, frame.crearNodo("A", 80, 0));
        nodoB = new Nodo("B",null,null,2, frame.crearNodo("B", 40, 10));
        nodoC = new Nodo("C",null,null,2, frame.crearNodo("C", 120, 10));
        nodoD = new Nodo("D",null,null,3, frame.crearNodo("D", 20, 20));
        nodoE = new Nodo("E",null,null,3,frame.crearNodo("E", 60, 20));
        nodoF = new Nodo("F",null,null,4,frame.crearNodo("F", 10, 30));
        nodoG = new Nodo("G",null,null,4,frame.crearNodo("G", 30, 30));
        nodoH = new Nodo("H",null,null,4,frame.crearNodo("H", 50, 30));
        nodoI = new Nodo("I",null,null,4,frame.crearNodo("I", 70, 30));
        nodoJ = new Nodo("J",null,null,3,frame.crearNodo("J", 100, 20));
        nodoK = new Nodo("K",null,null,3,frame.crearNodo("K", 140, 20));
        nodoL = new Nodo("L",null,null,4,frame.crearNodo("L", 90, 30));
        nodoM = new Nodo("M",null,null,4,frame.crearNodo("M", 110, 30));
        nodoN = new Nodo("N",null,null,4,frame.crearNodo("N", 130, 30));
        nodoO = new Nodo("O",null,null,4,frame.crearNodo("O", 150, 30));
        frame.fin();

        nodoD.setNodo1(nodoF);
        nodoD.setNodo2(nodoG);
        frame.unirNodos(nodoD.getUi(), nodoF.getUi());
        frame.unirNodos(nodoD.getUi(), nodoG.getUi());

        nodoE.setNodo1(nodoH);
        nodoE.setNodo2(nodoI);
        frame.unirNodos(nodoE.getUi(), nodoH.getUi());
        frame.unirNodos(nodoE.getUi(), nodoI.getUi());

        nodoB.setNodo1(nodoD);
        nodoB.setNodo2(nodoE);
        frame.unirNodos(nodoB.getUi(), nodoD.getUi());
        frame.unirNodos(nodoB.getUi(), nodoE.getUi());

        nodoJ.setNodo1(nodoL);
        nodoJ.setNodo2(nodoM);
        frame.unirNodos(nodoJ.getUi(), nodoL.getUi());
        frame.unirNodos(nodoJ.getUi(), nodoM.getUi());

        nodoK.setNodo1(nodoN);
        nodoK.setNodo2(nodoO);
        frame.unirNodos(nodoK.getUi(), nodoN.getUi());
        frame.unirNodos(nodoK.getUi(), nodoO.getUi());

        nodoC.setNodo1(nodoJ);
        nodoC.setNodo2(nodoK);
        frame.unirNodos(nodoC.getUi(), nodoJ.getUi());
        frame.unirNodos(nodoC.getUi(), nodoK.getUi());

        nodoA.setNodo1(nodoB);
        nodoA.setNodo2(nodoC);
        frame.unirNodos(nodoA.getUi(), nodoB.getUi());
        frame.unirNodos(nodoA.getUi(), nodoC.getUi());
    }
}

