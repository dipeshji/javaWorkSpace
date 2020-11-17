package hQL;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import java.util.List;
import java.util.Map;
import java.util.Iterator;

public class HqlMain extends Throwable{
	
	public HqlMain(){}
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		System.out.println("main started");
		
		/*selectAllHql();
		selectAllSql();*/
//		getSomeColumnSql();
		getSomeColumnHql();
		
		
	}
	
	public static Session startSession() throws HibernateException {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		return session;
	}
	
	public static void selectAllHql() {
		Session session = startSession();
		session.beginTransaction();
		Query<PartDTO> q = session.createQuery("from PartDTO");
		
		List<PartDTO> data = q.list();
		Iterator<PartDTO> itr = data.iterator();
		
		PartDTO emp;
		while(itr.hasNext()) {
			emp = itr.next();
			System.out.println(emp.getFirstName());
		}
		session.close();
	}
	
	public static void selectAllSql() {
		Session session = startSession();
		session.beginTransaction();
		Query<PartDTO> query = session.createNativeQuery("select * from employees").addEntity(PartDTO.class);
		
		List<PartDTO> res = query.list();
		Iterator<PartDTO> itr = res.iterator();
		
		
		System.out.println("sql native query output");
		PartDTO emp;
		while(itr.hasNext()) {
			emp = itr.next();
			System.out.println(emp.getFirstName());
					
		}
		session.close();
	}
	
	public static void getSomeColumnSql() {
		Session session = startSession();
		session.beginTransaction();
		
		Query qu = session.createNativeQuery("select firstName, lastName from employees").setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
		List res = qu.list();
		
		
		for(Object obj: res) {
			Map row = (Map) obj;
			System.out.println(row.get("firstName") + " " + row.get("lastName"));
		}
		
		session.close();
	}
	
	public static void getSomeColumnHql() {
		Session session = startSession();
		session.beginTransaction();
		
		Query qr = session.createQuery("select e.firstName, e.lastName from PartDTO e");
		
		List res = qr.list();
		Iterator itr = res.iterator();
		
		Object columns[];
		
		
		while(itr.hasNext()) {
			columns = (Object[])itr.next();
			
			String fName = (String)columns[0];
			String lName  = (String)columns[1];
			
			System.out.println(fName = " " + lName);
			
		}
		
	}
	
}
