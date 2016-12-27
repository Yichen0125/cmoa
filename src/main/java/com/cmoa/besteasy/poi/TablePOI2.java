package com.cmoa.besteasy.poi;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFDataFormat;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.CellStyle;
import org.springframework.web.servlet.view.document.AbstractExcelView;

import com.cmoa.besteasy.entities.User;

public class TablePOI2 extends AbstractExcelView{
	
	@Override
	protected void buildExcelDocument(Map<String, Object> model, HSSFWorkbook workbook, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		//封装数据
		HSSFSheet sheet = workbook.createSheet(TableTypes.XMtableName);
		HSSFDataFormat format = workbook.createDataFormat();
		//从model中获取“ 封装了Colname的集合”
		List<String> types = (List<String>) model.get("colNames");
		//创建 表头 行
		HSSFRow headerRow = sheet.createRow(0);
		
		HSSFFont columnHeadFont = workbook.createFont();   
	    columnHeadFont.setFontName("宋体");   
	    columnHeadFont.setFontHeightInPoints((short) 10);   
	    columnHeadFont.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);   
		  // 列头的样式   
	    HSSFCellStyle columnHeadStyle = workbook.createCellStyle();   
	    columnHeadStyle.setFont(columnHeadFont);   
	    columnHeadStyle.setAlignment(HSSFCellStyle.ALIGN_CENTER);// 左右居中   
	    columnHeadStyle.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);// 上下居中   
	    columnHeadStyle.setLocked(true);   
	    columnHeadStyle.setWrapText(true);   
	    columnHeadStyle.setLeftBorderColor(HSSFColor.BLACK.index);// 左边框的颜色   
	    columnHeadStyle.setBorderLeft((short) 1);// 边框的大小   
	    columnHeadStyle.setRightBorderColor(HSSFColor.BLACK.index);// 右边框的颜色   
	    columnHeadStyle.setBorderRight((short) 1);// 边框的大小   
	    columnHeadStyle.setBorderBottom(HSSFCellStyle.BORDER_THIN); // 设置单元格的边框为粗体   
	    columnHeadStyle.setBottomBorderColor(HSSFColor.BLACK.index); // 设置单元格的边框颜色   
	    // 设置单元格的背景颜色（单元格的样式会覆盖列或行的样式）   
	    columnHeadStyle.setFillForegroundColor(HSSFColor.WHITE.index);   
	  
	    int i = 0;
		for (; i < types.size(); i++) {
			HSSFCell cell = headerRow.createCell(i);
			//表头信息
			cell.setCellValue(types.get(i));
			cell.setCellStyle(columnHeadStyle);
			sheet.autoSizeColumn(i);
		}
		
		//---------数据---------------------------------------------------------------
		int j = 0;
		int k = 0;
		
		 CellStyle style = workbook.createCellStyle();
		
     /*   Map <String ,List<Project>> map = (Map<String, List<Project>>) model.get("projectMap");
        Set<Entry<String, List<Project>>> entrySet = map.entrySet();
			for (Entry<String, List<Project>> entry : entrySet) {
				List<Project> list = new ArrayList<Project>(entry.getValue());  //获取该行的  装有列信息的 list 装有  实体类 
				for (; j < list.size(); j++) {
					HSSFRow row = sheet.createRow(j+1);  //创建数据行
					Project project = list.get(j);  //获取行数据
						 List <Object> dataList = new ArrayList<Object>();  //创建集合 封装 数据
						 dataList.add(project.getCus());
						 dataList.add(project.getDate());
						 dataList.add(project.getName());
						 dataList.add(123.321);
						 dataList.add("50.55%");
								for (; k < dataList.size(); k++) {   //遍历封装数据的集合   创建列   填充数据
									HSSFCell cell = row.createCell(k); 
									Object obj = dataList.get(k);
									if (obj instanceof Integer) {
									    int value = ((Integer) obj).intValue();
									    cell.setCellValue(value);
									   } else if (obj instanceof String) {
									    String s = (String) obj;
									    cell.setCellValue(s);
									   } else if (obj instanceof Double) {
									     double d = ((Double) obj).doubleValue();
									     style.setDataFormat(format.getFormat("#,#.00"));
										 cell.setCellValue(d);
										 cell.setCellStyle(style);
									   } else if (obj instanceof Long) {
									    long l = ((Long) obj).longValue();
									    cell.setCellValue(l);
									   } else if (obj instanceof Boolean) {
									    boolean b = ((Boolean) obj).booleanValue();
									    cell.setCellValue(b);
									   } else if (obj instanceof Date) {
									    Date d = (Date) obj;
									    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
									    cell.setCellValue(dateFormat.format(d));
									   }  
									sheet.autoSizeColumn(k);
								}
								
								k = 0;
			}	
		}*/
		//--------------------------------------------------------------------------------
		//设置Excel响应消息头
		//为了设置下载的文件名   需要设置一个相应消息头
		Date date = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyMMdd");
		String dateStr = dateFormat.format(date).toString();
		String fileName =dateStr+"-"+System.nanoTime()+".xls";
		response.setHeader("Content-Disposition", "attachment;filename="+fileName);
	}
}
