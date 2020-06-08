package learn.java8.hssbc.optional;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * 
 * @version: 1.1.0
 * @Description: ������
 * @author: wsq
 * @date: 2020��5��11������2:19:21
 */
public class Test {
public static void main(String[] args) {
	/*
	 *  ����Optionalʵ��
	 */
	// �ǿ�
	//Optional<User> op = Optional.of(new User());
	
	// ��ֵ
	// Optional<User> op1 = Optional.ofNullable(null);
	
	
	/*
	 *  ��ȡֵ
	 */
	/*String name = null;
	Optional<String> op2 = Optional.ofNullable(name);
	// �ж��Ƿ�Ϊ��ֵ
	if(op2.isPresent()) {
		op2.get();
	}*/
	
	// opt.ifPresent( u -> {}); �ǿ�ʱ������
	
	
	/*
	 *  ����Ĭ��ֵ
	 */
	// Map<String, Object> map = new HashMap<String, Object>();
	// �����ֵ�򷵻ظ�ֵ�����򷵻ش��ݸ����Ĳ���ֵ��
	// User result = Optional.ofNullable(user).orElse(user2);
	// �ڶ���ͬ���͵� API �� orElseGet() ���� ����Ϊ���в�ͬ���������������ֵ��ʱ�򷵻�ֵ�����û��ֵ������ִ����Ϊ��������� Supplier(��Ӧ��) ����ʽ�ӿڣ�����������ִ�н��
	// User result = Optional.ofNullable(user).orElseGet( () -> {});
	
	
	/*
	 * �׳��쳣 
	 */
	// User result = Optional.ofNullable(user).orElseThrow( () -> new IllegalArgumentException());
	
	
	/*
	 * map��flatMap��ʹ�÷�����ֵ��ת��
	 */
	// String email = Optional.ofNullable(user).map(u -> u.getEmail()).orElse("default@gmail.com");
	
	
	/*
	 * filter��ʹ�÷���
	 */
	// Optional<User> result = Optional.ofNullable(user).filter(u -> u.getEmail() != null && u.getEmail().contains("@"));
	
	
	
	
	
	
	
}
}
