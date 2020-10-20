package Main;

public class Select  implements Select_Interface {

	@Override
	public  float[] findnumber(String num, Student[] stu) {
		// TODO Auto-generated method stub
		float grade[]=new float[3]; 
		for(int i=0;i<stu.length;i++){
			if(stu[i].getNum() == num){
				grade[0]  = stu[i].getChinese();
				grade[1] = stu[i].getMath();				
				grade[2] = stu[i].getEnglish();
			}
		}
		return grade;
	}

	@Override
	public float[] findname(String name, Student[] stu) {
		// TODO Auto-generated method stub
		float grade[]=new float[3]; 
		for(int i=0;i<stu.length;i++){
			if(stu[i].getName() == name){
				grade[1] = stu[i].getMath();
				grade[0] = stu[i].getChinese();
				grade[2] = stu[i].getEnglish();
			}
		}
		return grade;
	}

}
