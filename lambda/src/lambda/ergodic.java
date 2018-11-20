package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class ergodic {
	/**
	 * ÈİÆ÷±éÀú
	 * @param list
	 */
	public static void lambda_List(List<String> list) {
		// TODO Auto-generated method stub
				
				// java5
				System.out.println("============================foreach==================================");
				for (String string : list) {
					System.out.println(string);
				}
				//java8
				System.out.println("============================lambda==================================");
				list.forEach(s -> {
					System.out.println(s);
				});

	}
	public static void main(String[] args) {
		Random r=new Random();
		List<String> list = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			list.add(r.nextInt(100) + "");
		}

	}
}
