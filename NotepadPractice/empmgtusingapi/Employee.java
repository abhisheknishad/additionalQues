
class Employee {
	private String name,department;
	private int age;
	private double salary;

	public Employee(){}

	public Employee(String name,int age,double salary,String department){
	this.name=name;
	this.age=age;
	this.salary = salary;
	this.department=department;
	}

	public void setName(String name){
	this.name=name;
	}

	public String getName(){
	return name;
	}

	public void setAge(int age){
	this.age=age;
	}

	public int getAge(){
	return age;
	}

	public void setSalary(double salary){
	this.salary=salary;
	}

	public double getSalary(){
	return salary;
	}

	public void setDepartment(String name){
	this.department=department;
	}

	public String getDepartment(){
	return department;
	}

	@Override
	public String toString(){
			return "Employee [name=" + name + ",age=" + age +", department=" + department + ",salary= "+salary+"]";
}
}