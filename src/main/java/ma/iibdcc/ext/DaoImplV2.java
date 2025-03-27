package ma.iibdcc.ext;

import ma.iibdcc.dao.IDao;
import org.springframework.stereotype.Component;

@Component("d2")
public class DaoImplV2 implements IDao {

    @Override
    public double getData() {
        System.out.println("Version capteurs");
        return 5.7;
    }
}