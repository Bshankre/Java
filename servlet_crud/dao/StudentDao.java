package servlet_crud.dao;

import javax.persistence.EntityManagerFactory;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import servlet_crud.dto.StudentDto;
public class StudentDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
	  EntityManager entityManager = entityManagerFactory.createEntityManager();
	  EntityTransaction entityTransaction = entityManager.getTransaction();
	  
	  public String insert(StudentDto d1)
	 {
		  entityTransaction.begin();
	      entityManager.persist(d1);
		  entityTransaction.commit();
		  return "Account created successfully";
	  }
	  public Object fetchById(String s1) {
		  StudentDto sdto=entityManager.find(StudentDto.class,s1 );
		  if(sdto==null) {
			  return "no data fetched";
		  }else {
			  return sdto; //object-->classtype
		  }
	  }

	  public String deleteById(String s1) {
		  StudentDto sdto=entityManager.find(StudentDto.class,s1);
		  if(sdto!=null) {
			  entityTransaction.begin();
			  entityManager.remove(sdto);
			  entityTransaction.commit();
			  return "data deleted";
		  }else {
			 return "no data is there";
		  }
	  }
	  
	  public List<StudentDto> fetchAll() {
		  //select vn from table_name vn;
		  //select a from Studentdto a;    hquey language
		  Query q=entityManager.createQuery("select a from StudentDto a");
		  List<StudentDto> list=q.getResultList();
		  if(list.isEmpty())
		  {
			  return null;
		  }
		  else 
			  return list;
	  }
	  public String deleteAll(){
		  Query q=entityManager.createQuery("select a from StudentDto a");
		  List<StudentDto> list=q.getResultList();
		  if(list.isEmpty()) {
			  return "no data found";
		  }else {
			  for(StudentDto s:list) {
				  entityTransaction.begin();
				  entityManager.remove(s);
				  entityTransaction.commit();
			  }
			  return "all data govinda";
		  }
		
	  }
	  public void update(StudentDto sd) {
		  entityTransaction.begin();
		  entityManager.merge(sd);
		  entityTransaction.commit();
	  }
}
