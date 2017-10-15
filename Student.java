/**   
* @Title: Student.java
* @Package 
* @Description: TODO(用一句话描述该文件做什么)
* @author 江洪亮
* @date 2017年10月15日 下午6:46:01
* @version V1.0
*/

/** 
* @ClassName: Student
* @Description: TODO(这里用一句话描述这个类的作用)
* @author 江洪亮
* @date 2017年10月15日 下午6:46:01
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
	* @param name 要设置的 name
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
	* @param age 要设置的 age
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
	* @param education 要设置的 education
	*/
	public void setEducation(String education) {
		this.education = education;
	}
	public Student(String name,int age){//学生类构造函数构造函数
		setName(name);
		setAge(age);
	}
}
