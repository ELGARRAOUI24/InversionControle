package ma.iibdcc.metier;

import ma.iibdcc.dao.IDao;

public class MetierImpl implements IMetier{
    private IDao dao; // Couplage faible

    /**Constructeur avec parametre qui implémente IDao au moment de l'instantiatin**/
    public MetierImpl(IDao dao) {
        this.dao = dao;
    }

    /**Constructeur sans parametre**/
    public MetierImpl() {
    }

    @Override
    public double calcul() {
        double result = dao.getData();
        double res = result * 12 * Math.PI/2 * Math.cos(result);
        return  res;
    }
    /**Méthode pour injecter l'interface dans l'attribut dao apès l'instantiation**/
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
