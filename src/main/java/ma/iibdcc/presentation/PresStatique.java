package ma.iibdcc.presentation;

import ma.iibdcc.dao.DaoImpl;
import ma.iibdcc.metier.MetierImpl;

public class PresStatique {
    public static void main(String[] args) {
        DaoImpl dao = new DaoImpl();
        MetierImpl mi = new MetierImpl(dao);
        System.out.println("Résultat est : " + mi.calcul());
    }
}
