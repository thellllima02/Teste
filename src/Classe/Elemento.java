package Classe;

public class Elemento{

    private String Nome;
    private int ID;

    public Elemento(String Nome, int ID) {
        this.Nome = Nome;
        this.ID = ID;
    }

    public Elemento() {
    }

    public String toString() {
        return "Nome=" + Nome + " ID=" + ID + "\n";
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
//
//    public int compareTo(Elemento o) {
//        if (this.getID() < o.getID()) {
//            return -1;
//        } else if (this.getID() == o.getID()) {
//            return 0;
//        } else {
//            return 1;
//        }
//    }
}
