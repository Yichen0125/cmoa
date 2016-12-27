package com.cmoa.besteasy.poi;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFDataFormat;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellStyle;
import org.springframework.web.servlet.view.document.AbstractExcelView;

import com.cmoa.besteasy.entities.User;

public class TablePOI extends AbstractExcelView{
	/**
	 * 
	 */
	@Override
	protected void buildExcelDocument(Map<String, Object> model, HSSFWorkbook workbook, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		//封装数据
		HSSFSheet sheet = workbook.createSheet(TableTypes.XMtableName);
		CellStyle style = workbook.createCellStyle();
		HSSFDataFormat format = workbook.createDataFormat();
	
		//从model中获取“ 封装了Colname的集合”
		List<String> types = (List<String>) model.get("colNames");
		
		//创建 表头 行
		HSSFRow headerRow = sheet.createRow(0);
		int i = 0;
		for (; i < types.size(); i++) {
			HSSFCell cell = headerRow.createCell(i);
			//表头信息
			cell.setCellValue(types.get(i));
		}
		int j = 1;
		int k = 0;
		
		List <List<User>> rowTest = new ArrayList<List<User>>();
		List<User> colTest1 = new ArrayList<User>();
		List<User> colTest2 = new ArrayList<User>();
		User user1 = new User();
		User user2 = new User();
		user1.setEnabled(1);
		user1.setId(111);
		user1.setName("aaa");
		
		user2.setEnabled(1);
		user2.setId(111);
		user2.setName("bbb");
		colTest1.add(user1);
		colTest2.add(user2);
		rowTest.add(colTest1);
		rowTest.add(colTest2);
		
		for (; j <= rowTest.size(); j++) {
			
			HSSFRow row = sheet.createRow(j);  //创建数据行
			
			List<User> list = rowTest.get(j-1);  //获取该行的  装有列信息的 list
			
			for (; k < list.size(); k++) {
				 User user = list.get(k);
				 
				//创建数据列
				HSSFCell cell0 = row.createCell(k+0);
				//设置单元格内容  数值型
				cell0.setCellValue(user.getId());
				//创建数据列
				HSSFCell cell1 = row.createCell(k+1);
				//设置单元格内容   数值型
				cell1.setCellValue(user.getEnabled());
				//创建数据列
				HSSFCell cell2 = row.createCell(k+2);
				//设置单元格内容   字符型
				cell2.setCellValue(user.getName());
				
				//创建数据列
				HSSFCell cell3 = row.createCell(k+3);
				double d = 123.325;
				//设置单元格内容   数值型
				style.setDataFormat(format.getFormat("#,#.00"));
				cell3.setCellValue(d);
				cell3.setCellStyle(style);
			}
			k = 0;
		}
		
		
		//设置Excel响应消息头
		//为了设置下载的文件名   需要设置一个相应消息头
		Date date = new Date();
		SimpleDateFormat format2 = new SimpleDateFormat("yyMMdd");
		String dateStr = format2.format(date).toString();
		String fileName =dateStr+"-"+System.nanoTime()+".xls";
		response.setHeader("Content-Disposition", "attachment;filename="+fileName);
	}
	
}
