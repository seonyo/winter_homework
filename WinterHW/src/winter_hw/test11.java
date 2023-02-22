package winter_hw;


public class test11 {

	public static void main(String[] args) {
		int [][] random = new int[4][4];
		
		getRandom(random);
	}
	
	static void getRandom(int random[][]){
		for(int i=0; i<random.length; i++) {
			for(int j=0; j<random[i].length; j++) {
				random[i][j]=(int) (Math.random()*9)+1;
				System.out.print(random[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
