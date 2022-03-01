package arraysDemo;

public class MultiDimArray {

	public static void main(String[] args) {
		int arr[][]={{1,2,3},{2,4,5},{4,4,5}};
		//ij 0 1 2
		//0 {1,2,3}
		//1 {2,4,5}
		//2 {4,4,5}
		int len = arr.length;
		//System.out.println(len);
		//System.out.println(arr[1][1]);
		for(int i=0; i<len;i++) {
			
			for(int j=0; j<len; j++) {
				//arr[1][j]
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
			
		}

	}

}
