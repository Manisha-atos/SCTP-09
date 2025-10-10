package com.p1.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.p1.Entity.Student;
import com.p1.util.HibernateUtil;


	

	public class StudentDao {
		//save Students
		//get All students
		//get Student ByID
		//Update Student
		//Delete Student
		
		public void saveStudent(Student student)
		{
			Transaction transaction=null;
			try(Session session=HibernateUtil.getSessionFactory().openSession())
			{
				//start the transaction
				transaction=session.beginTransaction();
				//save student object
				session.save(student);
				//commit the transaction
				transaction.commit();
			}catch(Exception e)
			{
				if(transaction !=null) {
					transaction.rollback();
				}
			}
			
		}
		public void UpdateStudent(Student student)
		{
			Transaction transaction=null;
			try(Session session=HibernateUtil.getSessionFactory().openSession())
			{
				//start the transaction
				transaction=session.beginTransaction();
				//save student object
				session.saveOrUpdate(student);
				//commit the transaction
				transaction.commit();
			}catch(Exception e)
			{
				if(transaction !=null) {
					transaction.rollback();
				}
			}
			
		}
	    
		public Student getStudentById(long id)
		{
			Transaction transaction=null;
			Student student=null;
			try(Session session=HibernateUtil.getSessionFactory().openSession())
			{
				//start the transaction
				transaction=session.beginTransaction();
				//get student object
				student=session.get(Student.class, id);
				//commit the transaction
				transaction.commit();
			}catch(Exception e)
			{
				if(transaction !=null) {
					transaction.rollback();
				}
			}
			return student;
		}
		
		@SuppressWarnings("unchecked")
		public List<Student> getAllStudents()
		{
			Transaction transaction=null;
			List<Student> students=null;
			try(Session session=HibernateUtil.getSessionFactory().openSession())
			{
				//start the transaction
				transaction=session.beginTransaction();
				//get students 
				students=session.createQuery("from Student").list();
				//commit the transaction
				transaction.commit();
			}catch(Exception e)
			{
				if(transaction !=null) {
					transaction.rollback();
				}
			}
			return students;
		}

		public Student deleteStudent(long id)
		{
			Transaction transaction=null;
			Student student=null;
			try(Session session=HibernateUtil.getSessionFactory().openSession())
			{
				//start the transaction
				transaction=session.beginTransaction();
				//get students 
				student=session.get(Student.class,id);
				//commit the transaction
				transaction.commit();
			}catch(Exception e)
			{
				if(transaction !=null) {
					transaction.rollback();
				}
			}
			return student;
		}
	}

