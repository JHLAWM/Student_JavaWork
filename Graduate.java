/**   
* @Title: Graduate.java
* @Package 
* @Description: TODO(��һ�仰�������ļ���ʲô)
* @author ������
* @date 2017��10��15�� ����6:50:06
* @version V1.0
*/

/** 
* @ClassName: Graduate
* @Description: TODO(������һ�仰��������������)
* @author ������
* @date 2017��10��15�� ����6:50:06
* 
*/
public class Graduate extends Student{	//�о�����
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
		setEducation("�о���");
		setDirection(direction);
	}

	private String direction;	//�о�����

	/** 
	* @return direction
	*/
	public String getDirection() {
		return direction;
	}

	/** 
	* @param direction Ҫ���õ� direction
	*/
	public void setDirection(String direction) {
		this.direction = direction;
	}
	public void Show(){
		System.out.println("����:"+getName()+"...����:"+getAge()+"...ѧ��"+getEducation()+"...�о�����"+getDirection());
	}
	
	
}
