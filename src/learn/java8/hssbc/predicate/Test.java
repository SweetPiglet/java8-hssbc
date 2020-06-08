package learn.java8.hssbc.predicate;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 
 * @version: 1.1.0
 * @Description: ������ 
 * @author: wsq
 * @date: 2020��5��11������4:07:59
 */
public class Test {
public static void main(String[] args) {
	// ���÷���
	Predicate pd = new Predicate<Integer>() {

		@Override
		public boolean test(Integer t) {
			// TODO Auto-generated method stub
			if(t >= 3) {
				return true;
			}
			return false;
		}
	};
	
	// ����ʽ���
	Predicate<Integer> pd1 = x -> x >= 3;
	  Stream<Integer> stream = Stream.of(1, 23, 3, 4, 5, 56, 6, 6);
      List<Integer> list = stream.filter(pd1).collect(Collectors.toList());
}
}
