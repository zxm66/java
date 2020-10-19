
/*
 * @author zhangxiaomin
 * @email 1396729865@qq.com
 */
import java.util.List;
import java.util.Arrays;
import java.util.concurrent.*;
import java.util.concurrent.atomic.*;


public class StreamTest{
	public static void main(String[] args) {
		List<String> list = Arrays.asList(new String[1000]);
		System.out.println(list.size());
		
		AtomicInteger i = new AtomicInteger(0);
		list.stream().forEach(a->{
			a = ""+ i.incrementAndGet();
		});
		



	}


}

