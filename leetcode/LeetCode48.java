package leetcode;

public class LeetCode48 {
	
	
	//������Գƣ�ÿ�з�ת
    public void rotate(int[][] matrix) {
    	
    	for (int i = 0; i < matrix.length; i++) {
    		for (int j = 0; j <= i; j++) {
				int temp = matrix[j][i];
				matrix[j][i] = matrix[i][j];
				matrix[i][j] = temp;
			}	
		}
    	for (int i = 0; i < matrix.length; i++) {
    		for (int j = 0; j < matrix.length / 2; j++) {
    			int temp = matrix[i][matrix.length-j-1];
				matrix[i][matrix.length-j-1] = matrix[i][j];
				matrix[i][j] = temp;
			}
			
		}

    }

}
