/**   
* @Title: Student.java
* @Package 
* @Description: TODO(��һ�仰�������ļ���ʲô)
* @author ������
* @date 2017��10��15�� ����6:46:01
* @version V1.0
*/

/** 
* @ClassName: Student
* @Description: TODO(������һ�仰��������������)
* @author ������
* @date 2017��10��15�� ����6:46:01
* 
*/
public class Student {
	private String name;
	private int age;
	private String education;
	/** 
	* @return name
	*/
	public String getName() {
		return name;
	}
	/** 
	* @param name Ҫ���õ� name
	*/
	public void setName(String name) {
		this.name = name;
	}
	/** 
	* @return age
	*/
	public int getAge() {
		return age;
	}
	/** 
	* @param age Ҫ���õ� age
	*/
	public void setAge(int age) {
		this.age = age;
	}
	/** 
	* @return education
	*/
	public String getEducation() {
		return education;
	}
	/** 
	* @param education Ҫ���õ� education
	*/
	public void setEducation(String education) {
		this.education = education;
	}
	public Student(String name,int age){//ѧ���๹�캯�����캯��
		setName(name);
		setAge(age);
	}
}
