
public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		overload obj = new overload();
		double result;
		obj.demo(10);
		obj.demo(10,20);
		result = obj.demo(5.5);
		System.out.println("O/P : "+result);
	}

}
