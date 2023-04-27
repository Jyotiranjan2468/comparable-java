package comparable;
import java.util.ArrayList;
import java.util.Collections;
public class comparable {
	public static void main(String[] args) {
		ArrayList<student> list=new ArrayList<>();
		list.add(new student(10,"Bapi","BBSR"));
		list.add(new student(45,"jyotiranjan","Banglore"));
		list.add(new student(25,"khyamasagar","Delhi"));
		list.add(new student(12,"Happy","Mumbai"));
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		
	}

}
