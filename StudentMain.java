package com.myFirstclass;


	import java.util.HashSet;
	import java.util.Objects;
	import java.util.Set;

	class Student {
	    private String name;
	    private int age;
	    private String city;
	    public Student(String name, int age, String city) {
	        this.name = name;
	        this.age = age;
	        this.city = city;
	    }

	    @Override
	    public boolean equals(Object obj) {
	        if (this == obj) return true;
	        if (obj == null || getClass() != obj.getClass()) return false;
	        Student student = (Student) obj;
	        return age == student.age && name.equals(student.name) && city.equals(student.city);
	    }
	    @Override
	    public int hashCode() {
	        return Objects.hash(name, age, city);
	    }
	    @Override
	    public String toString() {
	        return "Student { Name='" + name + "', Age=" + age + ", City='" + city + "' }";
	    }
	}

	public class StudentMain {
	    public static void main(String[] args) {
	        Set<Student> students = new HashSet<>();
	        students.add(new Student("Alice", 18, "New York"));
	        students.add(new Student("Bob", 20, "Los Angeles"));
	        students.add(new Student("Charlie", 19, "Chicago"));
	        students.add(new Student("Alice", 18, "New York")); 
	        System.out.println("Unique Students:");
	        for (Student student : students) {
	            System.out.println(student);
	        }
	    }
	}



