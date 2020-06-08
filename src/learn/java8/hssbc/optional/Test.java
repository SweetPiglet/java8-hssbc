package learn.java8.hssbc.optional;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * 
 * @version: 1.1.0
 * @Description: 测试类
 * @author: wsq
 * @date: 2020年5月11日下午2:19:21
 */
public class Test {
public static void main(String[] args) {
	/*
	 *  创建Optional实例
	 */
	// 非空
	//Optional<User> op = Optional.of(new User());
	
	// 空值
	// Optional<User> op1 = Optional.ofNullable(null);
	
	
	/*
	 *  获取值
	 */
	/*String name = null;
	Optional<String> op2 = Optional.ofNullable(name);
	// 判断是否为空值
	if(op2.isPresent()) {
		op2.get();
	}*/
	
	// opt.ifPresent( u -> {}); 非空时候运行
	
	
	/*
	 *  返回默认值
	 */
	// Map<String, Object> map = new HashMap<String, Object>();
	// 如果有值则返回该值，否则返回传递给它的参数值：
	// User result = Optional.ofNullable(user).orElse(user2);
	// 第二个同类型的 API 是 orElseGet() —— 其行为略有不同。这个方法会在有值的时候返回值，如果没有值，它会执行作为参数传入的 Supplier(供应者) 函数式接口，并将返回其执行结果
	// User result = Optional.ofNullable(user).orElseGet( () -> {});
	
	
	/*
	 * 抛出异常 
	 */
	// User result = Optional.ofNullable(user).orElseThrow( () -> new IllegalArgumentException());
	
	
	/*
	 * map和flatMap的使用方法，值得转换
	 */
	// String email = Optional.ofNullable(user).map(u -> u.getEmail()).orElse("default@gmail.com");
	
	
	/*
	 * filter的使用方法
	 */
	// Optional<User> result = Optional.ofNullable(user).filter(u -> u.getEmail() != null && u.getEmail().contains("@"));
	
	
	
	
	
	
	
}
}
