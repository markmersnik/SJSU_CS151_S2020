package homework6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class PersonTest {
	public static void main(String[] args) {
		Person joe = new Person("Joe", "Smith", 40);
		Person amy = new Person("Amy", "Gold", 32);
		Person tony = new Person("Tony", "Stork", 21);
		Person sean = new Person("Sean", "Irish", 24);
		Person tina = new Person("Tina", "Brock", 28);
		Person lenny = new Person("Lenny", "Hep", 18);
		
		ArrayList<Person> people = new ArrayList<Person>();
		
		people.addAll(Arrays.asList(joe, amy, tony, sean, tina, lenny));
		
		//Sorting by age
		Collections.sort(people, new Comparator<Person>() {
			  @Override
			  public int compare(Person p1, Person p2) {
			    return p1.getAge().compareTo(p2.getAge());
			  }
			});
		
		System.out.println("Ascending(Age): ");
		for(int i = 0; i < people.size(); i++) {
			Person p = people.get(i);
			System.out.println(p.getFirstName() + " " + p.getLastName() + ", " + p.getAge());
		}
		System.out.println("\n");

		Collections.reverse(people);
		System.out.println("Descending(Age): ");
		for(int i = 0; i < people.size(); i++) {
			Person p = people.get(i);
			System.out.println(p.getFirstName() + " " + p.getLastName() + ", " + p.getAge());
		}
		System.out.println("\n");
		
		//Sorting by first name
		Collections.sort(people, new Comparator<Person>() {
			  @Override
			  public int compare(Person p1, Person p2) {
			    return p1.getFirstName().compareTo(p2.getFirstName());
			  }
			});
		System.out.println("Ascending(First Name): ");
		for(int i = 0; i < people.size(); i++) {
			Person p = people.get(i);
			System.out.println(p.getFirstName() + " " + p.getLastName() + ", " + p.getAge());
		}
		System.out.println("\n");

		Collections.reverse(people);
		System.out.println("Descending(First Name): ");
		for(int i = 0; i < people.size(); i++) {
			Person p = people.get(i);
			System.out.println(p.getFirstName() + " " + p.getLastName() + ", " + p.getAge());
		}
		System.out.println("\n");
		
		//Sorting by length of last name
		Collections.sort(people, new Comparator<Person>() {
			  @Override
			  public int compare(Person p1, Person p2) {
				Integer l1 = p1.getLastName().length();
				Integer l2 = p2.getLastName().length();
			    return l1.compareTo(l2);
			  }
			});
		System.out.println("Ascending(Last Name Length): ");
		for(int i = 0; i < people.size(); i++) {
			Person p = people.get(i);
			System.out.println(p.getFirstName() + " " + p.getLastName() + ", " + p.getAge());
		}
		System.out.println("\n");

		Collections.reverse(people);
		System.out.println("Descending(Last Name Length): ");
		for(int i = 0; i < people.size(); i++) {
			Person p = people.get(i);
			System.out.println(p.getFirstName() + " " + p.getLastName() + ", " + p.getAge());
		}
		System.out.println("\n");
		
	}
}
