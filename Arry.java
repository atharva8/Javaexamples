
public class Arry {
	public static void main(String[] args) {
		//2D array
		int[][] arr = { { 1, 2 }, { 3, 4 } };
		  
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                System.out.println("arr[" + i + "][" + j + "] = "+ arr[i][j]);
        
        //3D array
		int[][][] arr1 = { { { 1, 2 }, { 3, 4 } }, { { 5, 6 }, { 7, 8 } } };
        
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                for (int z = 0; z < 2; z++)
                    System.out.println("arr1[" + i + "][" + j + "]["+ z + "] = "+ arr1[i][j][z]);
	}
}
