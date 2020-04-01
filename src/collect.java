import java.util.ArrayList;

public class collect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> a =new ArrayList<String>();
		a.add("shobhit");
		a.add("java");
		System.out.println(a);
		a.add(0, "okay");
		System.out.println(a);
		//a.remove(0);
		System.out.println(a);
		System.out.println(a.get(2));
		System.out.println(a.contains("shobhit"));
		System.out.println(a.indexOf("Shobhit")); 
	}

}
