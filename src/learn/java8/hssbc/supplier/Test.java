package learn.java8.hssbc.supplier;

import java.util.Optional;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 * 
 * @version: 1.1.0
 * @Description: ������
 * @author: wsq
 * @date: 2020��5��11������11:10:39
 */
public class Test {
public static void main(String[] args) {
	// 1��ƽ������
	Supplier<Integer> supplier = new Supplier<Integer>() {
		
		@Override
		public Integer get() {
			// TODO Auto-generated method stub
			return new Random().nextInt();
		}
	};
	//System.err.println(supplier.get());
	// 2��java8������
//	Supplier supplier2 = () -> new Random().nextInt();
//	System.out.println(supplier2.get());
	
	// �õ��õط�
	 Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6);
     //����һ��optional����
     Optional<Integer> first = stream.filter(i -> i > 4)
             .findFirst();
     first.orElseGet(() -> new Random().nextInt());
}
}
