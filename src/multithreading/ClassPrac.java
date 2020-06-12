package multithreading;

/** q1. create a separate class having 3 types of member variables integer, string & double. Each representing name, age and weight of a person
 * 		add getter and setter methods and create two object of this class in public static void main()
 * 	q2. write a method in main class which will take parameters required to create person and return a  obj of person class with values taken as parameter
 * 
 * 
 *
 */

public class ClassPrac {
	public static void main(String args[]) {
		Person ram= new Person();
		Person sham= new Person();
		
		ram.setName("RAM");
		ram.setAge(30);
		ram.setWeight(55.2);
		
		System.out.println(ram.getName()+" " + ram.getAge() + " "+ ram.getWeight());
		
		sham.setName("SHAM");
		sham.setAge(32);
		sham.setWeight(50);
		
		System.out.println(sham.getName()+" " + sham.getAge() + " "+ sham.getWeight());
		
	}
	
	public Person createPerson(String name, int age, double weight) {
		
		Person obj= new Person();
		
		return obj;
	}
		

}



class Person{
	
	String name;
	int age;
	double weight;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	
	
}