/*Sebas*/
import java.io.*;
import java.net.*;
import java.util.*;



class Untitled {
	public static void main(String[] args) {
		int[]sensorA = {15, -4, 56, 10, -23};
		int[]sensorB = {14, -9, 56, 14, -23};
		int size = sensorA.length;
		
		
		System.out.println("The absolute difference is " + totalDiffDispatcher(sensorA, sensorB, size));
	}
	
	public static int totalDiffDispatcher(int[]sensorA, int[]sensorB, int size){
		if(size == 0) return 0;
		
		int lastElementDiff = Math.abs(sensorA[size - 1] - sensorB[size - 1]); 
		
		int diff = totalDiffDispatcher(sensorA, sensorB, size - 1);
		
		return lastElementDiff + diff;
	}
}