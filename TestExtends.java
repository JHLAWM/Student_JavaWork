/**   
* @Title: TestExtends.java
* @Package 
* @Description: TODO(��һ�仰�������ļ���ʲô)
* @author ������
* @date 2017��10��15�� ����6:52:37
* @version V1.0
*/

/** 
* @ClassName: TestExtends
* @Description: TODO(������һ�仰��������������)
* @author ������
* @date 2017��10��15�� ����6:52:37
* 
*/
public class TestExtends {

	/** 
	* @Title: main
	* @Description: TODO(������һ�仰�����������������)
	* @param @param args
	* @return void
	* @throws 
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Undergraduate undergraduate=new Undergraduate("����",21,"�������");	//��������������
		Graduate graduate=new Graduate("����",24,"AI�㷨");//�����о�������
		undergraduate.Show();
		graduate.Show();

	}

}
