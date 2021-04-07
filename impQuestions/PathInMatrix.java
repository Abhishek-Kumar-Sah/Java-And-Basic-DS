package impQuestions;

public class PathInMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(path(6,6)); 
	}
	
	static int path (int n , int m ) {
		
		if(n ==1 || m== 1)
			return 1;
		
		return path(n-1 , m) + path(n , m-1);
	}

}
