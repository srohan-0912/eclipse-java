package set;
import java.util.*;

public class fruitDriver {
public static void main(String[] args) {
	Map<String,fruitmap> fruit=new HashMap<>();
	fruit.put("apple",new fruitmap("red","avg",200));
	fruit.put("bana",new fruitmap("blue","avg",200));
	fruit.put("ora",new fruitmap("green","g",300));
	fruit.put("papaya",new fruitmap("green","g",300));
	
//	for (Map.Entry<String, fruitmap> entry : fruit.entrySet()) {
//        System.out.println(entry.getKey() + " -> " + entry.getValue());
//    }
	for(Object o:fruit.entrySet()) {
		System.out.println(o);
	}
}
}
