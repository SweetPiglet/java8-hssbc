package learn.java8.hssbc.function;

import java.util.function.Function;
import java.util.stream.Stream;

/**
 * 
 * @version: 1.1.0
 * @Description: ������
 * @author: wsq
 * @date: 2020��5��11������4:19:34
 */
public class Test {
public static void main(String[] args) {
	// ʹ��map���������͵ĵ�һ��������ת��ǰ�����ͣ��ڶ�����ת���������
	Function<String, Integer> function = new Function<String, Integer>() {
        @Override
        public Integer apply(String s) {
            return s.length();//��ȡÿ���ַ����ĳ��ȣ����ҷ���
        }
    };
    Stream<String> stream = Stream.of("aaa", "bbbbb", "ccccccv");
    Stream<Integer> stream1 = stream.map(function);
    stream1.forEach(System.out::println);
}
}
