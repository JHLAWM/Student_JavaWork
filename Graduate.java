/**   
* @Title: Graduate.java
* @Package 
* @Description: TODO(用一句话描述该文件做什么)
* @author 江洪亮
* @date 2017年10月15日 下午6:50:06
* @version V1.0
*/

/** 
* @ClassName: Graduate
* @Description: TODO(这里用一句话描述这个类的作用)
* @author 江洪亮
* @date 2017年10月15日 下午6:50:06
* 
*/
public class Graduate extends Student{	//研究生类
	/** 
	* Title:
	* Description:
	* @param name
	* @param age
	* @param education
	*/ 
	public Graduate(String name, int age, String direction) {
		super(name, age);
		// TODO Auto-generated constructor stub
		setEducation("研究生");
		setDirection(direction);
	}

	private String direction;	//研究方向

	/** 
	* @return direction
	*/
	public String getDirection() {
		return direction;
	}

	/** 
	* @param direction 要设置的 direction
	*/
	public void setDirection(String direction) {
		this.direction = direction;
	}
	public void Show(){
		System.out.println("姓名:"+getName()+"...年龄:"+getAge()+"...学历"+getEducation()+"...研究方向"+getDirection());
	}
	
	
}
