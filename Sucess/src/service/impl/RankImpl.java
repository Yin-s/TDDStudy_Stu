/**  
* <p>Title: Rankimpl.java</p>  
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2018</p>  
* @author Cyc 
* @date 2020年10月14日  
* @version 1.0  

*/
package service.impl;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import entity.entity;
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
public class RankImpl implements RanK {

	/*
	 * (non-Javadoc) <p>Title: RanK</p> <p>Description: </p>
	 * 
	 * @param list
	 * 
	 * @return
	 * 
	 * @see service.RanK#RanK(java.util.List)
	 */
	@Override
	public List<entity> RanK(List<entity> list) {

		for (int i = 0; i < list.size(); i++) {
			list.get(i).setTotal(list.get(i).getChinese() + list.get(i).getEnglish() + list.get(i).getMathematics());
		}
		entity e = new entity();
		System.out.println("排序前--:" + list.toString());
		Collections.sort(list, new Comparator<entity>() {

			@Override
			public int compare(entity o1, entity o2) {
				// TODO Auto-generated method stub
				return o1.getTotal().compareTo(o2.getTotal());
			}
		});
		System.out.println("升序排序后--:" + list.toString());

		Collections.sort(list, new Comparator<entity>() {

			@Override
			public int compare(entity o1, entity o2) {
				return o2.getTotal().compareTo(o1.getTotal());
			}
		});
		System.out.println("降序排序后--:" + list.toString());

		return list;
	}

}
