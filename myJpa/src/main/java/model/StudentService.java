/*package model;

import java.util.Collection;

import javax.persistence.EntityManager;
import javax.persistence.Query;

public class StudentService {
      protected EntityManager em;
      
      public StudentService(EntityManager em){
          this.em=em;
      }
   public Student createStudent( int studId,String studName,double allowance){
      Student stud=new Student(studId);
      stud.setStudName(studName);
      stud.setAllowance(allowance);
      em.persist(stud);
       
       return stud;
   }
   
   public void removeEmployee(int studId){
       Student stud=findStudent(studId);
       if(stud!=null);
       em.remove(stud);
   }
   
   public Student riseAllowance(int studId,double allowance){
       Student stud=em.find(Student.class,studId);
       if(stud!=null){
           stud.setAllowance(stud.getAllowance()+allowance);
           
       }
       return stud;
   }

   public Student findStudent(int studId){
       return em.find(Student.class,studId);
   }
   
   public Collection<Student>findStudents(){
       Query query=em.createQuery("SELECT s FROM student s");
       return (Collection<Student>)query.getResultList();
   }
}
*/