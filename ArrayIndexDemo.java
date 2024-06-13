
public class ArrayIndexDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[3];
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		try {
			System.out.println(arr[2]);
		}
		catch(ArrayIndexOutOfBoundsException aioobe) {
			System.err.println(aioobe.getMessage());
		}
		finally {
			System.out.println("In finally block");
		}
		

	}

}
