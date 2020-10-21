package Main;

import java.util.ArrayList;

public class Main {

	private AvgMax_Interface avgMax;
	private Select_Interface select;
	private Read_Interface read;
	private Sort_Interface sort;
	private Student[] stu;

	public Select_Interface getSelect() {
		return select;
	}

	public Read_Interface getRead() {
		return read;
	}

	public Sort_Interface getSort() {
		return sort;
	}

	public AvgMax_Interface getAvgMax() {
		return avgMax;
	}

	public void setAvgMax(AvgMax_Interface avgMax) {
		this.avgMax = avgMax;
	}

	public void setSelect(Select_Interface select) {
		this.select = select;
	}

	public void setRead(Read_Interface read) {
		this.read = read;
	}

	public void setSort(Sort_Interface sort) {
		this.sort = sort;
	}

	public float[] Sort() {
		// TODO Auto-generated method stub
		return sort.Sort(stu);
	}


	public Student[] read(String path) {
		// TODO Auto-generated method stub
		this.stu = read.read(path);
		return stu;
	}

	public float[] findnumber(String num) {
		// TODO Auto-generated method stub
		return select.findnumber(num, stu);
	}

	public float[] findname(String name) {
		// TODO Auto-generated method stub
		return select.findname(name, stu);
	}

	public float[] average() {
		// TODO Auto-generated method stub
		return avgMax.Avg(stu);
	}

	public float[] max() {
		// TODO Auto-generated method stub
		return avgMax.Max(this.stu);
	}


}
