/**   
* @Title: Undergraduate.java
* @Package 
* @Description: TODO(用一句话描述该文件做什么)
* @author 江洪亮
* @date 2017年10月15日 下午6:47:48
* @version V1.0
*/

/** 
* @ClassName: Undergraduate
* @Description: TODO(这里用一句话描述这个类的作用)
* @author 江洪亮
* @date 2017年10月15日 下午6:47:48
* 
*/
public class Undergraduate extends Student {	//本科类
	/** 
	* Title:
	* Description:
	* @param name
	* @param age
	* @param education
	*/ 
	public Undergraduate(String name, int age,String specialty) {
		super(name,age);
		// TODO Auto-generated constructor stub
		setEducation("本科");
		setSpecialty(specialty);
	}

	private String specialty; //专业

	/** 
	* @return specialty
	*/
	public String getSpecialty() {
		return specialty;
	}

	/** 
	* @param specialty 要设置的 specialty
	*/
	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}
	public void Show(){
		
		System.out.println("姓名:"+getName()+"...年龄:"+getAge()+"...学历"+getEducation()+"...专业"+getSpecialty());
	}
	

}
