package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
/**
 * 
 * 面向接口编程（Mycalc例子）
 * @author Administrator
 * 
 * note:
 * lambda 表达式只能引用标记了 final 的外层局部变量，
  * 这就是说不能在 lambda 内部修改定义在域外的局部变量，否则会编译错误。
 *
 */
public class Lambda {
		
	static Mycalc add=(a,b)->a+b;
	static Mycalc subtraction=(a,b)->a-b;
	Mycalc divide=(a,b)->a/b;	
	interface Mycalc{
		int operation(int a,int b);
	}
	private static int calc(int a,int b, Mycalc mycalc) {
		return mycalc.operation(a,b);
	}
	
	
	public static void main(String[] args) {
		int a=10,b=10;
		
		Lambda lambda = new Lambda();
		System.out.println(lambda.calc(a, b, add));
	}

}
