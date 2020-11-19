package hQL;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
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
		selectAllSql();
		selectAllCriteria();*/
//		getSomeColumnSql();
//		getSomeColumnHql();
//		getSomeColumnCriteria();
//		orderBySql();
//		orderByHql();
//		OrderByCriteria();
//		deleteSql();
//		deleteHql();
//		deleteCriteria(2410);
//		updateCriteria(1625);
//		updateSql();
//		updateHql();
//		selectTopSql();
//		selectTopHql();
//		selectTopCriteria();
//		countSql();
//		countHql();
//		countCriteria();
//		andHql();
		andCriteria();
		
	}
	
	public static Session startSession() throws HibernateException {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		return session;
	}
	
//	===============================================
	
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

//	===============================================
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
	
//	==================================================
	
	public static void selectAllCriteria() {
		Session session = startSession();
		session.beginTransaction();
		
		Criteria crit = session.createCriteria(PartDTO.class);
		List res = crit.list();
		Iterator itr = res.iterator();
		
		PartDTO emp;
		while(itr.hasNext()) {
			emp = (PartDTO) itr.next();
			System.out.println(emp.getFirstName() + " " + emp.getLastName());
		}
		
		session.close();
	}
	
//	===============================================
	
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
	
//	==================================================
	
	public static void someColumnHql() {
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
		session.close();
		
	}
	
//	===============================================
	
	public static void getSomeColumnCriteria() {
		Session session = startSession();
		session.beginTransaction();
		
		System.out.println("output from getSomeColumnCriteria");
		
		Criteria crit = session.createCriteria(PartDTO.class);
		ProjectionList p = Projections.projectionList();
		p.add(Projections.property("firstName"));
		p.add(Projections.property("lastName"));
		crit.setProjection(p);
		List res = crit.list();
		Iterator itr = res.iterator();
		
		Object columns[];
		while(itr.hasNext()) {
			columns = (Object[])itr.next();
			System.out.println(columns[0] + " " + columns[1]);
		}
		session.close();
		
	}
	
//	===============================================
	
	public static void orderBySql() {
		Session session = startSession();
		session.beginTransaction();
		
		Query qr = session.createNativeQuery("select firstName,jobTitle from employees order by jobTitle,firstName").setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
		List res = qr.list();
		for(Object obj: res) {
			Map row = (Map) obj;
			System.out.println(row.get("jobTitle") + " | " + row.get("firstName"));
		}
		
		session.close();
	}
	
//	================================================
	
	public static void orderByHql() {
		Session session = startSession();
		session.beginTransaction();
		
		Query qr = session.createQuery("select e.firstName, e.jobTitle from PartDTO e order by e.jobTitle, e.firstName");
		
		List res = qr.list();
		Iterator itr = res.iterator();
		
		Object columns[];
		
		while(itr.hasNext()) {
			columns = (Object[])itr.next();
			System.out.println(columns[0] + " | "  + columns[1]);
		}
		session.close();
	}
	
//	==================================================
	
	public static void OrderByCriteria() {
		Session session = startSession();
		session.beginTransaction();
		
		System.out.println("output from OrderByCriteria");
		
		Criteria crit = session.createCriteria(PartDTO.class);
		ProjectionList p = Projections.projectionList();
		p.add(Projections.property("firstName"));
		p.add(Projections.property("jobTitle"));
		crit.addOrder(Order.asc("jobTitle"));
		crit.addOrder(Order.asc("firstName"));
		
		List res = crit.setProjection(p).list();
		Iterator itr = res.iterator();
		Object columns[];
		while(itr.hasNext()) {
			columns = (Object[])itr.next();
			System.out.println(columns[0] + " | " + columns[1]);
		}
		
		session.close();
		
	}
	
//	==================================================
	
	public static void deleteSql() {
		Session session = startSession();
		session.beginTransaction();
		
		Query qr = session.createNativeQuery("delete from employees where firstName=:name");
		qr.setParameter("name", "Dipesh");
		int res = qr.executeUpdate();
		
		System.out.println(res);
		session.getTransaction().commit();
		session.close();
	}
//	===========================================
	
	public static void deleteHql() {
		Session session = startSession();
		session.beginTransaction();
		
		Query qr = session.createQuery("delete from PartDto p where p.firstName=:name");
		qr.setParameter("name", "Dipesh");
		int res = qr.executeUpdate();
		session.getTransaction().commit();
		session.close();
		
	}
	
//	===========================================
	
	public static void deleteCriteria(int employeeId) {
		Session session = startSession();
		session.beginTransaction();
		
		PartDTO emp = (PartDTO)session.createCriteria(PartDTO.class).add(Restrictions.eq("employeeNumber",employeeId)).uniqueResult();
		
		session.delete(emp);
		session.getTransaction().commit();
		
		System.out.println("employee " + emp.getFirstName() + " with id " + emp.getEmployeeNumber() + " is deleted");
		
		session.close();
		
	}
	
//	===========================================
	public static void updateSql() {
		Session session = startSession();
		session.beginTransaction();
		
		Query qr = session.createNativeQuery("update employees set firstName=:name, jobTitle=:title where employeeNumber=:number");
		qr.setParameter("name", "Dip");
		qr.setParameter("title", "Boss");
		qr.setParameter("number", 200);
		
		int res = qr.executeUpdate();
		session.getTransaction().commit();
		System.out.println(res);
		session.close();
	}
	
//	===========================================
	
	public static void updateHql() {
		Session session = startSession();
		session.beginTransaction();
		
		Query qr = session.createQuery("update PartDTO p set p.firstName=:name, p.jobTitle=:title where p.employeeNumber=:number");
		
		qr.setParameter("name", "Mohit");
		qr.setParameter("title", "Manager");
		qr.setParameter("number", 300);
		
		int res = qr.executeUpdate();
		System.out.println(res);
		session.getTransaction().commit();
		session.close();
	}
	
//	===========================================
	
	public static void updateCriteria(int employeeId) {
		Session session = startSession();
		session.beginTransaction();
		
		PartDTO emp = (PartDTO)session.createCriteria(PartDTO.class).add(Restrictions.eq("employeeNumber", employeeId)).uniqueResult();
		emp.setJobTitle("Exc Manager");
		
		session.update(emp);
		session.getTransaction().commit();
		session.close();
		System.out.println("employee " + emp.getFirstName() + " with id " + emp.getEmployeeNumber() + " has been updated");
	}
	
//	===========================================
	public static void selectTopSql() {
		Session session = startSession();
		session.beginTransaction();
		
		Query qr = session.createNativeQuery("select firstName from employees limit 10").setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
		List res = qr.list();
		
		for(Object obj: res) {
			Map row = (Map) obj;
			System.out.println(row.get("firstName"));
		}
		session.close();
	}
	
//	===========================================
	public static void selectTopHql() {
		Session session = startSession();
		session.beginTransaction();
		
		List res = session.createQuery("select firstName from PartDTO").setFirstResult(1).setMaxResults(10).getResultList();
		Iterator itr = res.iterator();
		
				
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		session.close();
	}
	
//	============================================
	
	public static void selectTopCriteria() {
		Session session = startSession();
		session.beginTransaction();
		
		System.out.println("You are viewing output from selectTopCriteria");
		Criteria crit = session.createCriteria(PartDTO.class);
		
		List res = crit.setFirstResult(5).setMaxResults(10).list();
		
		Iterator itr = res.iterator();
		
		PartDTO emp;
		int i = 1;
		while(itr.hasNext()) {
			emp = (PartDTO)itr.next();
			System.out.println(i + ") " + emp.getFirstName() + " " + emp.getLastName());
			i++;
		}
		
		session.close();
	}
	
//	==========================================
	
	public static void countSql() {
		Session session = startSession();
		session.beginTransaction();
		
		System.out.println("you are viewing output from countSql");
		
		Query q = session.createNativeQuery("select jobTitle, count(*) as c from employees group by jobTitle").setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
		
//		System.out.println(q.getSingleResult());
		
		List res = q.list();
		Iterator itr = res.iterator();
		
		Object columns[];
		while(itr.hasNext()) {
			Map row = (Map) itr.next();
			System.out.println(row.get("jobTitle") + " | " + row.get("c"));
		}
		
		session.close();
	}
	
//	============================================
	
	public static void countHql() {
		Session session = startSession();
		session.beginTransaction();
		
		System.out.println("this is from countHql");
		
		List res = session.createQuery("select lastName, count(*) as c from PartDTO group by lastname").list();
		
		Iterator itr = res.iterator();
		Object columns[];
		while(itr.hasNext()) {
			columns = (Object[]) itr.next();
			System.out.println(columns[0] + " | " + columns[1]);
		}
		
		session.close();
		
	}
	
//	============================================
	public static void countCriteria() {
		Session session = startSession();
		session.beginTransaction();
		
		System.out.println("this is from countCriteria");
		
		Criteria crit = session.createCriteria(PartDTO.class);
		ProjectionList p = Projections.projectionList();
		
		p.add(Projections.property("reportsTo"));
		p.add(Projections.count("reportsTo"));
		p.add(Projections.groupProperty("reportsTo"));
		
		List res = crit.setProjection(p).list();
		Iterator itr = res.iterator();
		Object columns[];
		
		while(itr.hasNext()) {
			columns = (Object[]) itr.next();
			System.out.println(columns[0] + " | " + columns[1]);
		}
		session.close();
		
	}
	
//	=================================================
	
	public static void andHql() {
		Session session = startSession();
		session.beginTransaction();
		
		System.out.println("this is from andHql");
		
		Query q = session.createQuery("select p.firstName, p.lastName from PartDTO p where firstName=:name and employeeNumber=:number");
		q.setParameter("name", "Dipesh");
		q.setParameter("number", 2421);
		
		List res = q.list();
		Iterator itr = res.iterator();
		
		Object columns[];
		while(itr.hasNext()) {
			columns = (Object[])itr.next();
			System.out.println(columns[0] + " " + columns[1]);
		}
		session.close();
	}
	
//	====================================================
	public static void andCriteria() {
		Session session = startSession();
		session.beginTransaction();
		
		System.out.println("This is from andCriteria");
		
		Criteria crit = session.createCriteria(PartDTO.class);
		ProjectionList p = Projections.projectionList();
		
		p.add(Projections.property("firstName"));
		p.add(Projections.property("lastName"));
		
		crit.add(Restrictions.like("firstName", "Dipesh"));
		crit.add(Restrictions.eq("employeeNumber", 2421));
		
		List res = crit.setProjection(p).list();
		Iterator itr = res.iterator();
		
		
		Object columns[];
		while(itr.hasNext()) {
			columns = (Object[])itr.next();
			System.out.println(columns[0] + " " + columns[1]);
		}
		session.close();
		
	}
	
}
