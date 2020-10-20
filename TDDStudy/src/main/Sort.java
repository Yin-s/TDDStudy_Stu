package main;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;


public class Sort implements Sort_Interface {

	@Override
	public int[] sort(int[] array) {
		// TODO Auto-generated method stub
		Arrays.sort(array);
		int[] array_ret=new int[array.length];
		for(int i=0;i<array.length;i++) {
			array_ret[i]=array[array.length-i-1];
		}
		return array_ret;
	}

}
