package leetcode.tree;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Seri{
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		HashMap<String,Object> map = new HashMap<>();
		List<Object> list = new ArrayList<>();
		Student student = new Student();
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("hello_world"));
		oos.writeObject(student);
		oos.close();

		
	//	ObjectInputStream ois = new ObjectInputStream(new FileInputStream("hello_world"));
	//	ois.readObject();
	//	ois.close();
	}



}

class Student implements Serializable{
	static final long serialVersionUID = 1L;
	private String name;
	private int age;

}
