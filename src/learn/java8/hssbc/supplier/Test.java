package learn.java8.hssbc.supplier;

import java.util.Optional;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 * 
 * @version: 1.1.0
 * @Description: 测试类
 * @author: wsq
 * @date: 2020年5月11日上午11:10:39
 */
public class Test {
public static void main(String[] args) {
	// 1、平常方法
	Supplier<Integer> supplier = new Supplier<Integer>() {
		
		@Override
		public Integer get() {
			// TODO Auto-generated method stub
			return new Random().nextInt();
		}
	};
	//System.err.println(supplier.get());
	// 2、java8新特性
//	Supplier supplier2 = () -> new Random().nextInt();
//	System.out.println(supplier2.get());
	
	// 用到得地方
	 Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6);
     //返回一个optional对象
     Optional<Integer> first = stream.filter(i -> i > 4)
             .findFirst();
     first.orElseGet(() -> new Random().nextInt());
}
}
