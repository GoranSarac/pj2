import model.*;

public class Zadatak {

    public static void main(String[] args) {
        Teritorija teritorija = new Teritorija();
        new Thread(new Kompozicija('A', 'B', teritorija.getPruga('A', 'B'))).start();
        new Thread(new Kompozicija('A', 'B', teritorija.getPruga('A', 'B'))).start();
    }
}
