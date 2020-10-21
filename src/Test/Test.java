package Test;



import org.easymock.EasyMock;

import Main.AvgMax_Interface;
import Main.Main;
import Main.Read_Interface;
import Main.Select_Interface;
import Main.Sort;
import Main.Sort_Interface;
import Main.Student;

import static org.junit.jupiter.api.Assertions.*;

import org.easymock.EasyMock;




class  Test {

	@org.junit.jupiter.api.Test
	void test() {
		
			Main main = new Main();
			String path="sutdent.txt";
			Student[] stu = new Student[4];
			stu[0] = new Student("1001", "张三",98,97,95);
			stu[1] = new Student("1002", "里斯",89,94,97);
			stu[2] = new Student("1003", "梨花",89,86,92);
			stu[3] = new Student("1004", "小红",98,67,68);
			
			Read_Interface read = EasyMock.createMock(Read_Interface.class);//模拟的
			EasyMock.expect(read.read(path)).andReturn(stu);
			EasyMock.replay(read);
			main.setRead(read);		
			stu = main.read(path);
		    
			Select_Interface select = EasyMock.createMock(Select_Interface.class);
		    Select_Interface select_real = new Select_Interface() {
				@Override
				public float[] findnumber(String num, Student[] stu) {
					return null;}
				@Override
				public float[] findname(String name, Student[] stu) {
					return null;}
			};
			main.setSelect(select_real);
			//assertArrayEquals(main.findnumber("1001"),new float[]{98,97,95});
			//assertArrayEquals(main.findname("里斯"),new float[]{89,94,97});
			
			float[] sum = new float[]{290,280,267,233};
			Sort_Interface sort_real = new Sort();
			main.setSort(sort_real);
			//assertArrayEquals(sum,main.Sort());
			AvgMax_Interface avgMax = EasyMock.createMock(AvgMax_Interface.class);//模拟的
			float[] max= {98,97,97};
			float[]  avg= {93.5f,86,88};
			EasyMock.expect(avgMax.Avg(stu)).andReturn(avg);
			EasyMock.expect(avgMax.Max(stu)).andReturn(max);
			EasyMock.replay(avgMax);
			main.setAvgMax(avgMax);
			assertArrayEquals(max,main.max());
			assertArrayEquals(avg,main.average());
			
			
		
	}

}
