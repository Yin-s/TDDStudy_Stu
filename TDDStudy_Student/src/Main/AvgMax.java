package Main;

public class AvgMax implements AvgMax_Interface {

	@Override
	public double[] Avg(Student[] stu) {
		// TODO Auto-generated method stub
		int sum_chinese = 0,sum_math = 0,sum_english = 0;
		for(int i=0;i<stu.length;i++){
			sum_chinese += stu[i].getChinese();
			sum_math += stu[i].getMath();
			sum_english += stu[i].getEnglish();
		}
		double[] array_avg=new double[3];
		array_avg[0]=sum_chinese/stu.length;
		array_avg[1]=sum_math/stu.length;
		array_avg[2]=sum_english/stu.length;
		return array_avg;
	}

	@Override
	public int[] Max(Student[] stu) {
		// TODO Auto-generated method stub
		int max_chinese = stu[0].getChinese();
		int max_math = stu[0].getMath();
		int max_english = stu[0].getEnglish();
		for(int i=1;i<stu.length;i++) {
			if(stu[i].getChinese()>max_chinese)
				max_chinese=stu[i].getChinese();
		}
		for(int i=1;i<stu.length;i++) {
			if(stu[i].getMath()>max_math)
				max_math=stu[i].getMath();
		}
		for(int i=1;i<stu.length;i++) {
			if(stu[i].getEnglish()>max_english)
				max_english=stu[i].getEnglish();
		}
		int[] array_max=new int[3];
		array_max[0]=max_chinese;
		array_max[1]=max_math;
		array_max[2]=max_english;
		return array_max;
	}

}
