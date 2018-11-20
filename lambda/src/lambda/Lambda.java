package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
/**
 * 
 * ����ӿڱ�̣�Mycalc���ӣ�
 * @author Administrator
 * 
 * note:
 * lambda ���ʽֻ�����ñ���� final �����ֲ�������
  * �����˵������ lambda �ڲ��޸Ķ���������ľֲ������������������
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
