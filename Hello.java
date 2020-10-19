import java.util.Map;

/*
 * @author zhangxiaomin @email 1396729865@qq.com
 */

public class	Hello {
	public static void main1(String[] args) {
		Map<Object, String> map = new HashMap<Object, String>();
		map.put("hello ","world");
		map.put("hello","world");
		map.put("hello,","world");
		
		System.out.println("hello world");
	}
	// todo "this is todo"
	public static void main(String[] args) {
		try {
			File file = new File("pom.xml");
			FileInputStream fileInputStream = new FileInputStream(file);
			
		} catch (Exception e) {
			//TODO: handle exception
		} finally{
			fileInputStream.close();

		}
	}


}
