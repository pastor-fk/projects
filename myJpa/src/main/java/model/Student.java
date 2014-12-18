package model;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Student {
    @Id
    private int studId;
    private String studName;
    private double allowance;
    
    public Student(int studId) {
        super();
        this.studId = studId;
    }
    
    public Student() {
        // TODO Auto-generated constructor stub
    }
    
    public int getStudId() {
        return studId;
    }
    public void setStudId(int studId) {
        this.studId = studId;
    }
    public String getStudName() {
        return studName;
    }
    public void setStudName(String studName) {
        this.studName = studName;
    }
    public double getAllowance() {
        return allowance;
    }
    public void setAllowance(double allowance) {
        this.allowance = allowance;
    }
   
    
   
    public String toString(){
        
        return "Student Details "+getStudId()+getStudName()+getAllowance()  ;
    }
    
    
}
