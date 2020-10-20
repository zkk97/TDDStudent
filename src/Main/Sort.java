package Main;

import java.util.ArrayList;
import java.util.Collections;

public class Sort implements Sort_Interface {

	@Override
	public float[] Sort(Student[] stu) {
		// TODO Auto-generated method stub
		float[] arr_total = new float[stu.length];
		for(int i=0;i<stu.length;i++) {
			float sum=stu[i].getChinese()+stu[i].getEnglish()+stu[i].getMath();
			arr_total[i]=sum;
			sum=0;
		}
		float t;
		for(int j=0;j<stu.length-1;j++) {
		    for(int i=0;i<stu.length-1-j;i++) {
		      if(arr_total[i]>arr_total[i+1])
		      {
		        t=arr_total[i];
		        arr_total[i]=arr_total[i+1];
		        arr_total[i+1]=t;
		      }  
		    }
		}
		return arr_total;
	}

}