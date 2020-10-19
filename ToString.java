
/*
 * @author zhangxiaomin
 * @email 1396729865@qq.com
 * javac 指定lib的路径。
 */
import com.alibaba.fastjson.JSON;

public class ToString{
	String hello="hello";
	String world="world";
	
	@Override
	public String toString(){
		return JSON.toJSONString(this);
	}
	
	public static void main(String[] args) {
		System.out.println(new ToString());
	}


}

