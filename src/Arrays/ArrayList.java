package Arrays;

import java.util.List;

public class ArrayList {

	public static void main(String[] args) {
		
		List<String> list = new java.util.ArrayList<>();
		
		list.add("Kate");
		list.add("Mary");
		list.add("Teri");
		
		list.remove(0);
		
		System.out.println(list.get(1));
		System.out.println(list.size());
		System.out.println(list.isEmpty());
		
		for (String s : list) {
			System.out.println(s);
		}

	}

}
