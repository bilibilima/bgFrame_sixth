package com.neuedu.util;

public class StringUtil {
	public static int totalPage(int count,int rows){
		int total=0;
		if(count%rows!=0){
			total=count/rows+1;
		}else{
			total=count/rows;
		}
		return total;
	}
	
	public static void main(String[] args) {
		int a=StringUtil.totalPage(21, 5);
		System.out.println(a);
	}
}
