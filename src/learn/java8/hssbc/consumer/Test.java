package learn.java8.hssbc.consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

/**
 * 
 * @version: 1.1.0
 * @Description: ������
 * @author: wsq
 * @date: 2020��5��11������10:46:04
 */
public class Test {
	public static void main(String[] args) {
		// 1�����÷���
		// ����Consumer
		Consumer<String> consumer = new Consumer<String>() {
			@Override
			public void accept(String s) {
				// TODO Auto-generated method stub
				System.err.println(s);
			}
		};
		Stream<String> stream = Stream.of("a","b","c","d","e");
		//stream.forEach(consumer);
		List<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		//list.forEach(consumer);
		// 2��java�����Է���
		Consumer<String> consumer1 = (x) -> System.out.println(x);
		list.forEach(consumer1);
	}
}
