package a15;

import java.io.Serializable;
import java.util.ArrayList;

public class Student extends Person implements Serializable {

	String studentNumber;
	ArrayList<LibraryBook> booksOut;

	public Student() {
		super();
		this.studentNumber = "012345";
		this.booksOut = new ArrayList<LibraryBook>();
	}

	public Student(String studentNumber, ArrayList<LibraryBook> booksOut, String firstName, String lastName, int age, String gender) {
		super(firstName, lastName, age, gender);
		this.studentNumber = studentNumber;
		this.booksOut = booksOut;
	}	

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}

	public ArrayList<LibraryBook> getBooksOut() {
		return booksOut;
	}

	public void setBooksOut(ArrayList<LibraryBook> booksOut) {
		this.booksOut = booksOut;
	}

	public void addBook(LibraryBook book) {
		this.booksOut.add(book);
	}

	public void removeBook(LibraryBook book) {
		this.booksOut.remove(book);
	}

}
