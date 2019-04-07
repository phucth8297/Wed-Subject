package com.hoclaptrinhonline.DAO;

import java.util.List;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Repository;

import com.hoclaptrinhonline.Imp.CourseImp;
import com.hoclaptrinhonline.entity.Course;
import com.hoclaptrinhonline.entity.TypeCourse;
@Repository
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class CourseDAO implements CourseImp {

	@Autowired
	SessionFactory sessionFactory;
	
	@Transactional
	public List<TypeCourse> loadListCourse(int start) {
		Session session = sessionFactory.getCurrentSession();
		String sql = "from TYPECOURSE";	
		List<TypeCourse> listTypeCourse = (List<TypeCourse>) session.createQuery(sql).setFirstResult(start).setMaxResults(4).getResultList();
		return listTypeCourse;
	}

	
	@SuppressWarnings("deprecation")
	@Transactional
	public long countAll() {
		Session session = sessionFactory.openSession();
		return  (Long) session.createCriteria(TypeCourse.class).setProjection(Projections.rowCount()).uniqueResult();
		
	}
	
	@SuppressWarnings({ "deprecation", "unchecked" })
	@Transactional
	public List<TypeCourse> findAll(Integer offset, Integer maxResults) {
		Session session = sessionFactory.openSession();
	    Criteria criteria = session.createCriteria(TypeCourse.class);
	    criteria.setFirstResult(offset!=null?offset:0);
	    criteria.setMaxResults(maxResults!=null?maxResults:10);
	    return criteria.list();
	}

	@Transactional
	public List<Course> findAllCourse(Integer offset, Integer maxResults) {
		Session session = sessionFactory.openSession();
	    Criteria criteria = session.createCriteria(Course.class);
	    criteria.setFirstResult(offset!=null?offset:0);
	    criteria.setMaxResults(maxResults!=null?maxResults:10);
	    return criteria.list();
		
	}

	@Transactional
	public long countAllCoure() {
		Session session = sessionFactory.openSession();
		return  (Long) session.createCriteria(Course.class).setProjection(Projections.rowCount()).uniqueResult();
	}


	public List<Course> getCourseById(int idTypeCourse) {
		Session session = sessionFactory.getCurrentSession();
		String sql = "from COURSE where id_type_course='" + idTypeCourse + "'";	
		List<Course> listCourse = (List<Course>) session.createQuery(sql).getResultList();
		return listCourse;
	}


	public boolean addTypeCourse(TypeCourse typeCourse) {
		Session session = sessionFactory.getCurrentSession();
		session.save(typeCourse);
		return false;
		
	}


	public boolean deleteTypeCourse(TypeCourse typeCourse) {
		Session session = sessionFactory.getCurrentSession();
		session.delete(typeCourse);
		return false;
	}


	

}
