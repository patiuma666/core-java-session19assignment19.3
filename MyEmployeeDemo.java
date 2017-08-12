package assignment19Collections;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

class Employee{ //created class Employee
	 String name; //created three properties 
	 int salary;
	 String designation;
	 
	 public Employee ( String name, int salary ,String designation){ //created constructor and passing three properties
		 this.name=name;
		 this.salary=salary;
		 this.designation=designation;
		 
	 }
  public String getName(){          //creating the set and get methods  
	  return name;
  }
  public void setName(String name){
	  this.name= name;
  }
  public int getSalary(){
	  return salary;
  }
  public void setSalary(int salary){
	  this.salary= salary;
  }
  public String getDesignation(){
	  return designation;
  }
  public void setDEsignation(String designation){
	  this.designation=designation;
  }
  public String toString(){
      return "Name: "+this.name+" Salary: "+this.salary+"DEsignation: "+this.designation;
  }
 }

      class MyEmployeeCom implements Comparator <Employee>{ //creating an interface which implements comparator 
    	  public int compare(Employee o1, Employee o2) {
    	        int flag = o1.getSalary() - o2.getSalary();
    	        if(flag==0) flag = o1.getName().compareTo(o2.getName());
    	        return flag;
    	    }
      }
    	  
  class EmployeeComparator implements Comparator<Employee>{        //here it checks the as per salary and it sorts as per salary
    	  public int compare (Employee o1,Employee o2){
    		  if (o1.getSalary()> o2.getSalary())
    			  return 1;
    		  else if (o1.getSalary()<o2.getSalary())
    			  return -1;
    		  else {
    			  int nameDiff =o1.getName().compareTo(o2.getName());
    			  if (nameDiff ==0)
    		
     		  return o2.getDesignation().compareTo(o2.getDesignation());
    				  else 
    					  return nameDiff;
    			  
    		  }
    	  }
      }

public class MyEmployeeDemo {  //created main method

	public static void main(String[] args) {     //created main method
		
		TreeSet<Employee> namelist = new TreeSet <Employee>(new MyEmployeeCom()); //created in treeset object
		
		namelist.add(new Employee("uma",40000,"manager"));                  //created objects in for the employee class and initialized the values
		namelist.add(new Employee("priya",50000," Senior manager"));
		namelist.add(new Employee("shanti",25000," ass manager"));
		namelist.add(new Employee("vanaja",40000,"supervisor"));
		namelist.add(new Employee("uma",30000,"sales manager"));
		namelist.add(new Employee("uma",32000,"trainer"));
	
	for (Employee employee : namelist){      //iterating the tree set using for each loop
		System.out.println(employee);
	}
 }
}