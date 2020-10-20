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
import service.Average;

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
public class AverageImpl implements Average {

	/*
	 * (non-Javadoc) <p>Title: Average</p> <p>Description: </p>
	 * 
	 * @param list
	 * 
	 * @return
	 * 
	 * @see service.Average#Average(java.util.List)
	 */
	@Override
	public entity Average(List<entity> list) {
		entity e = new entity();
		e.setChinese(0);
		e.setEnglish(0);
		e.setMathematics(0);
		System.out.println(list.size());
		for (int i = 0; i < list.size(); i++) {
			e.setEnglish(e.getEnglish() + list.get(i).getEnglish());
			e.setChinese(e.getChinese() + list.get(i).getChinese());
			e.setMathematics(e.getMathematics() + list.get(i).getMathematics());
		}
		e.setChinese(e.getChinese() / list.size());
		e.setEnglish(e.getEnglish() / list.size());
		e.setMathematics(e.getMathematics() / list.size());
		return e;
	}

}
