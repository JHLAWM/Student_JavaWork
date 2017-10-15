/**   
* @Title: TestExtends.java
* @Package 
* @Description: TODO(用一句话描述该文件做什么)
* @author 江洪亮
* @date 2017年10月15日 下午6:52:37
* @version V1.0
*/

/** 
* @ClassName: TestExtends
* @Description: TODO(这里用一句话描述这个类的作用)
* @author 江洪亮
* @date 2017年10月15日 下午6:52:37
* 
*/
public class TestExtends {

	/** 
	* @Title: main
	* @Description: TODO(这里用一句话描述这个方法的作用)
	* @param @param args
	* @return void
	* @throws 
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Undergraduate undergraduate=new Undergraduate("张三",21,"软件工程");	//创建本科生对象
		Graduate graduate=new Graduate("张四",24,"AI算法");//创建研究生对象
		undergraduate.Show();
		graduate.Show();

	}

}
