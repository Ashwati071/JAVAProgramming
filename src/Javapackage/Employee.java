package Javapackage;

public class Employee {
	
	String name;
	int empId;
	static int population=7; // common for all
	
	Employee(String naam,int id)
	{
		this.name=naam;
		this.empId=id;
	}
	

	public static void main(String[] args) {
		
		Employee e1= new Employee("Ashwati",28);
		Employee e2= new Employee("Shuvankar",11);
		
		
		System.out.println(e1.name +" "+ e1.empId);
		System.out.println(e2.name +" "+ e2.empId);
		System.out.println(e2);  //Javapackage.Employee@2e817b38, 
		//it is internally calling obj.toString method.
		//ctrl click on println, then value of, toString
		
		System.out.println(Employee.population); // can be directly called with the help of class without any reference as static variables are object independent.



	}

}
