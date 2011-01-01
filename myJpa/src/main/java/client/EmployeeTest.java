package client;

import java.util.Collection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Employee;
import model.EmployeeService;

public class EmployeeTest {

    public static void main(String[] args) {
        
        EntityManagerFactory emf = 
                        Persistence.createEntityManagerFactory("EmployeeService");
                EntityManager em = emf.createEntityManager();
                EmployeeService service = new EmployeeService(em);
                
                EntityManagerFactory ems=Persistence.createEntityManagerFactory("StudentService");
                EntityManager es=ems.createEntityManager();
               // StudentService serv=new StudentService(es);
                
                es.getTransaction().begin();
                //Student stud=serv.createStudent(2,"Sibisi Andile",1000);
                es.getTransaction().commit();
                //System.out.println(" Student Persisted" +stud);
                //  create and persist an employee
                em.getTransaction().begin();
                Employee emp = service.createEmployee(21, "Ntsikelelo Vani", 3000);
                Employee another = service.createEmployee(31, "Ayanda Prusent", 30000);
                Employee nez = service.createEmployee(19, "Dyantyi Billy", 40000);
                em.getTransaction().commit();
                System.out.println("Persisted " + emp+another+nez);
                
                // find a specific employee
                emp = service.findEmployee(158);
                System.out.println("Found " + emp);
                
                // find all employees
                Collection<Employee> emps = service.findAllEmployees();
                for (Employee e : emps) 
                    System.out.println("Found Employee: " + e);
                
                // update the employee
                em.getTransaction().begin();
                emp = service.raiseEmployeeSalary(158, 1000);
                em.getTransaction().commit();
                System.out.println("Updated " + emp);

                /*// remove an employee
                em.getTransaction().begin();
                service.removeEmployee(158);
                em.getTransaction().commit();
                System.out.println("Removed Employee 158");      */  
                
                // close the EM and EMF when done
                em.close();
                emf.close();
            }

}
