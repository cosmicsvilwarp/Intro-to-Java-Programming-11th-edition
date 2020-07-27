/*********************************************************************************
* (Sort two-dimensional array) Write a method to sort a two-dimensional array    *
* using the following header:                                                    *
*                                                                                *
* public static void sort(int m[][])                                             *
*                                                                                *
* The method performs a primary sort on rows and a secondary sort on iumns.    *
* For example, the following array                                               *
*                                                                                *
* {{4, 2},{1, 7},{4, 5},{1, 2},{1, 1},{4, 1}}                                    *
*                                                                                *
* will be sorted to                                                              *
*                                                                                *
* {{1, 1},{1, 2},{1, 7},{4, 1},{4, 2},{4, 5}}.                                   *
*********************************************************************************/
/*Sebas*/
import java.util.*;

class Untitled {
	public static void main(String[] args) {
		//initialize array
		int[][] matrix = new int[][] {
						{4, 2},{1, 7},{4, 5},{1, 2},{1, 1},{4, 1}
				};
				//Sort array
				sort(matrix);
				
				//Display array
				displayMatrix(matrix);

			}
// sort sorts an array primary on rows and secondary on columns */
			public static void sort(int m[][]){
				for(int i = 0; i < m.length - 1; i++){
					int currentindex = i;
					int[] current = m[i];
					for(int j = i + 1; j < m.length; j++){
						if(current[0] > m[j][0] || current[0] == m[j][0] && current[1] > m[j][1]){
							current = m[j];
							currentindex = j;
						}
					}
						if(currentindex != i){
							m[currentindex] = m[i];
							m[i] = current;
						}
					}
				}

			public static void displayMatrix(int[][] m) {

				for (int i = 0; i < m.length; i++) {
					for (int j = 0; j < m[i].length; j++) {
						System.out.print(m[i][j] + " ");
					}
					System.out.println("");
				}
			}
		}