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
              
            //��õ�һ�����������(ecxel��sheet�ı�Ŵ�0��ʼ,0,1,2,3,....)  
            sheet=book.getSheet(0);   
            //��ȡ���Ͻǵĵ�Ԫ��  
            cell1=sheet.getCell(0,0);  
//            System.out.println("���⣺"+cell1.getContents());   
              
            i=1;  
            while(true)  
            {  
                //��ȡÿһ�еĵ�Ԫ��   
                cell1=sheet.getCell(0,i);//���У��У�  
                cell2=sheet.getCell(1,i);  
                cell3=sheet.getCell(2,i);  
                cell4=sheet.getCell(3,i);  
                cell5=sheet.getCell(4,i);  
                if("".equals(cell1.getContents())==true)    //�����ȡ������Ϊ��  
                    break;  
                
                stu[i-1].setNum(cell1.getContents());
                stu[i-1].setName(cell2.getContents());
                stu[i-1].setChinese(Float.parseFloat(cell3.getContents()));
                stu[i-1].setMath(Float.parseFloat(cell4.getContents()));
                stu[i-1].setEnglish(Float.parseFloat(cell5.getContents()));
                //System.out.println(cell1.getContents()+"\t"+cell2.getContents()+"\t"+cell3.getContents()+"\t"+cell4.getContents()  
                   //     +"\t"+cell5.getContents());   
                i++;  
            }  
            book.close();   
        }  
        catch(Exception e)  { }
		return stu;

	}

}
