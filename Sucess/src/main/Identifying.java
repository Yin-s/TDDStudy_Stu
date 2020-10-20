/**  
* <p>Title: Identifying.java</p>  
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2018</p>  
* @author Cyc 
* @date 2020年10月14日  
* @version 1.0  

*/
package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import entity.entity;
import utils.Read;

/**
 * <p>
 * Title: Identifying
 * </p>
 * <p>
 * Description:
 * </p>
 * 
 * @author Cyc
 * @date 2020年10月14日
 */
public class Identifying {
	public static List Identifying() {
		String str = Read.readTxt("D:2.txt");
		System.out.println(str);
		String[] parts = str.split("-");
		entity e = new entity();
		List<entity> list = new ArrayList();
		for (int j = 1; j < parts.length; j++) {
			String[] parts1 = parts[j].split(" ");
			e.setNum(parts1[0]);
			e.setName(parts1[1]);
			e.setMathematics(Integer.valueOf(parts1[2]));
			e.setChinese(Integer.valueOf(parts1[3]));
			e.setEnglish(Integer.valueOf(parts1[3]));
			list.add(e);
			e = new entity();
		}
		return list;
	}

}
