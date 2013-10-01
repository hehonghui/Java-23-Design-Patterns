package Prototype;

import java.util.ArrayList;

/**
 * 
 * @author Mr-Simple
 *
 */
public class Person implements Cloneable{
	
	private String m_Name;
	private int m_Age;
	private ArrayList<Person> m_Persons = new ArrayList<Person>();
	
	/**
	 * 
	 * @param name
	 * @param age
	 */
	public Person(String name, int age){
		m_Name = name;
		m_Age = age;
		m_Persons.add( this ) ;
	}

	/**
	 * 克隆方法,即克隆对象,深拷贝
	 */
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// 拷贝对象
		Person person = (Person)super.clone();
		// 拷贝m_Persons
		person.m_Persons = this.m_Persons;
		
		return person;
	}

	/**
	 * show the listItem
	 */
	public void showListItems(){
		for(int i=0; i<m_Persons.size(); i++){
			System.out.println(  "ListItem Detail: " + m_Persons.get(i).toString() );
		}
	}
	
	/**
	 * toString
	 */
	@Override
	public String toString() {

		return m_Name + " is " + m_Age + " years old. ( toString() )";
	}

	
}
