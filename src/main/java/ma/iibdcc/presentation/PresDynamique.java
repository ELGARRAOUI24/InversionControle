package ma.iibdcc.presentation;

import ma.iibdcc.dao.IDao;
import ma.iibdcc.metier.IMetier;

import java.io.File;
import java.util.Scanner;

public class PresDynamique {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("config.txt"));
        String doaClassName = sc.nextLine();
        Class cDao = Class.forName(doaClassName);
        IDao dao = (IDao) cDao.newInstance();

        String metierClassName = sc.nextLine();
        Class cMetier = Class.forName(metierClassName);
        IMetier metier = (IMetier) cMetier.getConstructor(IDao.class).newInstance(dao);

        System.out.println(metier.calcul());
    }
}
