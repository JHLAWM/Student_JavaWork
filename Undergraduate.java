/**   
* @Title: Undergraduate.java
* @Package 
* @Description: TODO(��һ�仰�������ļ���ʲô)
* @author ������
* @date 2017��10��15�� ����6:47:48
* @version V1.0
*/

/** 
* @ClassName: Undergraduate
* @Description: TODO(������һ�仰��������������)
* @author ������
* @date 2017��10��15�� ����6:47:48
* 
*/
public class Undergraduate extends Student {	//������
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
		setEducation("����");
		setSpecialty(specialty);
	}

	private String specialty; //רҵ

	/** 
	* @return specialty
	*/
	public String getSpecialty() {
		return specialty;
	}

	/** 
	* @param specialty Ҫ���õ� specialty
	*/
	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}
	public void Show(){
		
		System.out.println("����:"+getName()+"...����:"+getAge()+"...ѧ��"+getEducation()+"...רҵ"+getSpecialty());
	}
	

}
