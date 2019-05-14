package com.benhvien.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Repository;

import com.benhvien.interfaces.LichKhamInterface;
import com.hoclaptrinhonline.ENTITY.LichKham;

@Repository
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class LichKhamDAO implements LichKhamInterface{
	
	@Autowired
	SessionFactory sessionFactory;
	
	@Transactional
	public List<LichKham> getListLichKham(){
		Session session = sessionFactory.getCurrentSession();
		String sql = "from LichKham";	
		List<LichKham> listLichKham = (List<LichKham>) session.createQuery(sql).getResultList();
		return listLichKham;
	}
	
	@Transactional
	public LichKham getLichKham(String id) {
		Session session = sessionFactory.getCurrentSession();
		String sql = "from LichKham where id= :id";
		LichKham lichKham = (LichKham)session.createQuery(sql).getResultList();
		return lichKham;
	}
	
	@Transactional
	public void addLichKham(LichKham lichKham) {
		Session session = sessionFactory.getCurrentSession();
		session.save(lichKham);
	}
	
	@Transactional
	public void deleteLichKham(LichKham lichKham) {
		Session session = sessionFactory.getCurrentSession();
		session.delete(lichKham);
	}
	
	@Transactional
	public void updateLichKham(LichKham lichKham) {
		Session session = sessionFactory.getCurrentSession();
		session.update(lichKham);
	}
	
	@Transactional
	public long countAllLichKham() {
		Session session = sessionFactory.openSession();
		String sql = "select count(lk.id) from LichKham lk";	
		long countLichKham = (Long)session.createQuery(sql).getSingleResult();
		return countLichKham;
	}
}
