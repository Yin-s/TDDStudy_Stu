package Main;

import java.util.ArrayList;
import java.util.Collections;

public class Sort implements Sort_Interface {

	@Override
	public ArrayList Sort(Student[] stu) {
		// TODO Auto-generated method stub
		ArrayList arr_total = new ArrayList();
		for(int i=0;i<stu.length;i++) {
			int sum=stu[i].getChinese()+stu[i].getEnglish()+stu[i].getMath();
			arr_total.add(sum);
			sum=0;
		}
		Collections.sort(arr_total);
		return arr_total;
	}

}
