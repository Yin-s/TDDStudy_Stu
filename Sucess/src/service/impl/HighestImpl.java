/**  
* <p>Title: Rankimpl.java</p>  
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2018</p>  
* @author Cyc 
* @date 2020年10月14日  
* @version 1.0  

*/
package service.impl;

import java.util.List;

import entity.entity;
import service.Highest;
import service.RanK;

/**
 * <p>
 * Title: Rankimpl
 * </p>
 * <p>
 * Description:
 * </p>
 * 
 * @author Cyc
 * @date 2020年10月14日
 */
public class HighestImpl implements Highest {

	/*
	 * (non-Javadoc) <p>Title: Highest</p> <p>Description: </p>
	 * 
	 * @param list
	 * 
	 * @return
	 * 
	 * @see service.Highest#Highest(java.util.List)
	 */
	@Override
	public entity Highest(List<entity> list) {
		entity e = new entity();
		e.setChinese(0);
		e.setEnglish(0);
		e.setMathematics(0);
		for (int i = 0; i < list.size(); i++) {
			if (e.getChinese() < list.get(i).getChinese()) {
				e.setChinese(list.get(i).getChinese());
			}
			if (e.getEnglish() < list.get(i).getEnglish()) {
				e.setEnglish(list.get(i).getEnglish());
			}
			if (e.getMathematics() < list.get(i).getMathematics()) {
				e.setMathematics(list.get(i).getMathematics());
			}
		}
		return e;
	}

}
