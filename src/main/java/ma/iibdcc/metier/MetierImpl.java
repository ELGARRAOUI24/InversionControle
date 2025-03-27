package ma.iibdcc.metier;

import ma.iibdcc.dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("metier")
public class MetierImpl implements IMetier{
    @Autowired
    @Qualifier("d")
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
