package hospital;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class HospitalDriver {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("prasad");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        
        Hospital h = new Hospital();
        
        h.setId(1);
        h.setName("JJ");
        
        Branches b = new Branches();
        b.setId(1);
        b.setName("Pune");
       
        Address a = new Address();
        a.setId(1);
        a.setAddress("pune");
        a.setPincode(511001);
        
        b.setAddress(a);
        
        Branches b1 = new Branches();
        b.setId(2);
        b.setName("Mumbai");
       
        Address a1 = new Address();
        a.setId(2);
        a.setPincode(511002);
        b1.setAddress(a1);
        
        List<Branches> branches = new ArrayList<Branches>();
        branches.add(b);
        branches.add(b1);
        h.setBranches(branches);
        
        Records r = new Records();
        r.setId(1);
        r.setName("Vijay");
        r.setAge(22);
        
        Patient p = new Patient();
        p.setId(1);
        p.setSymptoms("Headche");
        
        Diseas d = new Diseas();
        d.setId(1);
        d.setDiseas("Dengue");
        
        Diseas d1 = new Diseas();
        d1.setId(2);
        d1.setDiseas("Maleria");
        
        List<Diseas> diseas = new ArrayList<Diseas>();
        p.setDiseas(diseas);
        
        Records r1 = new Records();
        r.setId(2);
        r.setName("jay");
        r.setAge(23);
        
        Patient p1 = new Patient();
        p.setId(2);
        p.setSymptoms("Headche");
        p.setDiseas(diseas);
        
        List<Records> records = new ArrayList<Records>();
        records.add(r);
        records.add(r1);
        
        r.setPatient(p);
        b.setRecords(records);
        
        et.begin();
        em.persist(p1);
        em.persist(r1);
        em.persist(d1);
        em.persist(d);
        em.persist(p);
        em.persist(r);
        em.persist(a1);
        em.persist(b1);
        em.persist(a);
        em.persist(b);
        em.persist(h);
        et.commit();
        
        System.out.println("DONE ! ");
        
        
        
        

	}

}
