import java.util.*;
import java.util.stream.*;
import java.util.function.*;

class EmployeeMain{
	public static void main(String args[]){
	EmployeeMain app= new EmployeeMain();
	List<Employee>list=new ArrayList<>();
	list.add(new Employee("Abhishek",22,40000.0,"developer"));
	list.add(new Employee("Raghav",52,60000.0,"tester"));
	list.add(new Employee("Arpit",23,45000.0,"developer"));
	list.add(new Employee("Prakhar",55,100000.0,"tester"));

	Double salary=app.getSalary(list);
	System.out.println("Sum of Salary above age 50:"+salary);

	System.out.println("\n\n----DISPLAYING DETAILS OF OLDEST EMPLOYEE----");
	Employee emp = app.getOldestEmployee(list);
	System.out.println(emp);
	
	System.out.println("\n\n----DISPLAYING EMPLOYEE IN ASCENDING ORDER----");
	List<Employee>asc =app.getAscOrder(list);
	for(Employee e:asc){
	System.out.println(e);
	}

	System.out.println("\n\n----DISPLAYING EMPLOYEE IN DESCENDING ORDER----");
	List<Employee>desc =app.getDescOrder(list);
	for(Employee e:desc){
	System.out.println(e);
	}

	System.out.println("\n\n----DISPLAYING EMPLOYEE BETWEEN 21 & 25----");
	List<Employee>emp21 =app.getEmpDetails(list); 
	for(Employee e:emp21){
	System.out.println(e);
	}
	
	}

	public double getSalary(List<Employee>list){
	Optional<Double>salary=list.stream().filter(emp->emp.getAge()>=50).map(emp->emp.getSalary()).reduce((e1,e2)->e1+e2);
	return salary.get();
	}
	
	public Employee getOldestEmployee(List<Employee>list){
	EmployeeAgeDescComparator desc = new EmployeeAgeDescComparator();
	Optional<Employee>oldestEmployee=list.stream().sorted(desc).findFirst();
	return oldestEmployee.get();
	}
	
	
	public List<Employee> getAscOrder(List<Employee>list){
	EmployeeAgeComparator asc = new EmployeeAgeComparator();
	List<Employee>result=list.stream().filter(emp->emp.getAge()>30).sorted(asc).collect(Collectors.toList());
	return result;
	}

	public List<Employee> getDescOrder(List<Employee>list){
	EmployeeAgeDescComparator asc = new EmployeeAgeDescComparator();
	List<Employee>result=list.stream().sorted(asc).collect(Collectors.toList());
	return result;
	}

	public List<Employee> getEmpDetails(List<Employee>list){
	List<Employee>result=list.stream().filter(emp->emp.getAge()>21 && emp.getAge()<25).collect(Collectors.toList());
	return result;
	}


}