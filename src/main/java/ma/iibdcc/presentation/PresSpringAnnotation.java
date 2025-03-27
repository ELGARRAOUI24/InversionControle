package ma.iibdcc.presentation;

import ma.iibdcc.metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PresSpringAnnotation {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("ma.iibdcc");
        IMetier metier = context.getBean(IMetier.class);
        System.out.println("Résultat est : " + metier.calcul());
    }
}
