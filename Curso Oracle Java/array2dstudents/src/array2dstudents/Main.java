package array2dstudents;

public class Main {
	public static void main(String[] args) {
		
		String[] studentNames;
		Student[][] groups = new Student [3][5];
		
		int x = 0;
		for(int i=0; i<3; i++) {
			for(int j=0; j<5; j++) {
				String name = studentNames [x];
				groups[i][j] = new Student("temp");
				x++;
			}
		}
	}

}
