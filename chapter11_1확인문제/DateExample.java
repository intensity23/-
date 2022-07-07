package chapter11_1확인문제;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class DateExample {
	public static void main(String[] args) {
		Date date = new Date();
		//SimpleDateFormat
		SimpleDateFormat format = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 hh:mm:ss");
		System.out.println(format.format(date));
		
		//LocalDateTime
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now.format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 E요일 hh:mm:ss")));
		
		//Calendar
		Calendar calendar = Calendar.getInstance();//싱글톤 형식
		int month = calendar.get(Calendar.MONTH)+1;
		int yaer =  calendar.get(Calendar.YEAR);
		int dayOfMonth = calendar.get(Calendar.DATE);
		
		System.out.println(yaer + "년 "+month+"월 "+dayOfMonth+"일");
	}

}
