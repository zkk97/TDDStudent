package Main;

import java.io.File;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
public class Read implements Read_Interface {

	@Override
	public Student[] read(String path) {
		int i;  
        Sheet sheet;  
        Workbook book;  
        Cell cell1,cell2,cell3,cell4,cell5;  
        Student[] stu = new Student[4] ;
        try {   
            book= Workbook.getWorkbook(new File("grade.xls"));   
              
            //获得第一个工作表对象(ecxel中sheet的编号从0开始,0,1,2,3,....)  
            sheet=book.getSheet(0);   
            //获取左上角的单元格  
            cell1=sheet.getCell(0,0);  
//            System.out.println("标题："+cell1.getContents());   
              
            i=1;  
            while(true)  
            {  
                //获取每一行的单元格   
                cell1=sheet.getCell(0,i);//（列，行）  
                cell2=sheet.getCell(1,i);  
                cell3=sheet.getCell(2,i);  
                cell4=sheet.getCell(3,i);  
                cell5=sheet.getCell(4,i);  
                if("".equals(cell1.getContents())==true)    //如果读取的数据为空  
                    break;  
                
                stu[i-1].setNum(cell1.getContents());
                stu[i-1].setName(cell2.getContents());
                stu[i-1].setChinese(Float.parseFloat(cell3.getContents()));
                stu[i-1].setMath(Float.parseFloat(cell4.getContents()));
                stu[i-1].setEnglish(Float.parseFloat(cell5.getContents()));
                i++;  
                
            }  
            book.close();   
        }  
        catch(Exception e)  { }
		return stu;

	}

}
