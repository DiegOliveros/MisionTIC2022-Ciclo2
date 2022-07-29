package Semana7;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

/**
 *
 * @author ITOS
 */
public class NewClass1 {

    public static void main(String[] args) throws ParseException {

        String date = "28/07/2022 07:50:00";
        Date fecha = new SimpleDateFormat("yyy/MM/dd hh:mm:SS").parse(date);
        System.out.println("la fecha es:" + fecha);
        Actor actor;
        actor = new Actor((short) 101, "firstName", "lastName", fecha);
        System.out.println(actor.toString());

     
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CodigosClasePU");
        EntityManager em = emf.createEntityManager();

        TypedQuery<Actor> consultaActor = em.createNamedQuery("Actor.findAll", Actor.class);
        consultaActor.setParameter(0, em);
        List<Actor> lista = consultaActor.getResultList();

        System.out.println("*************Actores*********");
        for (Actor a : lista) {

            System.out.println(a.getFirstName() + "," + a.getLastName());

        }

        em.close();
        System.out.println("termino");

    }

}
