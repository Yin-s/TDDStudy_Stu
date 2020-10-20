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
import service.RanK;
import service.Select;

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
public class SelectImpl implements Select {

	/*
	 * (non-Javadoc) <p>Title: Select</p> <p>Description: </p>
	 * 
	 * @param e
	 * 
	 * @return
	 * 
	 * @see service.Select#Select(entity.entity)
	 */
	@Override
	public entity Select(List<entity> list, entity s) {
		entity e = new entity();
		// 以学号查询
		if (!("").equals(s.getNum())) {
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getNum().equals(s.getNum())) {
					e = list.get(i);
				}
			}
		}
		// 以名字查询
		if (!("").equals(s.getName())) {
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getName().equals(s.getNum())) {
					e = list.get(i);
				}
			}
		}

		return e;
	}

}
