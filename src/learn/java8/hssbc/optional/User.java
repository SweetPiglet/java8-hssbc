package learn.java8.hssbc.optional;

import com.oracle.webservices.internal.api.databinding.DatabindingMode;

/**
 * 
 * @version: 1.1.0
 * @Description: ʵ����
 * @author: wsq
 * @date: 2020��5��11������2:21:37
 */
public class User {
private int id;
private String name;
private int age;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
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
@Override
public String toString() {
	return "User [id=" + id + ", name=" + name + ", age=" + age + "]";
}

}
