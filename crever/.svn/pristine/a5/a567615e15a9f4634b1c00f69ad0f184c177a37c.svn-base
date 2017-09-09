package com.crever.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * @author : ohs
 * @message : 날짜관련 유틸
 * @date :2017. 7. 22.fewafawefawefwa
 */
public class DateUtil {
	/**
	 * 일정한 패턴으로 날짜를 변환한다. example) toDateString("200205111230", "yyyy년 MM월 dd일 HH시
	 * mm분"); --> result는 2002년 05월11일 12시 30분
	 * 
	 * @param data
	 *            변환할 날짜 (반드시 공백없이 8~14자리 숫자로만 되어야한다.)
	 * @param format
	 *            변환할 날짜 패턴 형식
	 * @return 변환된 형식의 값
	 */
	public static String toDateString(String data, String format) {
		String returnVal = "";

		if (format == null)
			format = "yyyy-MM-dd HH:mm:ss";
		if (data == null || data.trim().length() < 8)
			return "";
		data = data.trim();

		try {
			Calendar cal = null;
			if (data.length() >= 14) {
				cal = new GregorianCalendar(Integer.parseInt(data.substring(0, 4)),
						Integer.parseInt(data.substring(4, 6)) - 1, Integer.parseInt(data.substring(6, 8)),
						Integer.parseInt(data.substring(8, 10)), Integer.parseInt(data.substring(10, 12)),
						Integer.parseInt(data.substring(12, 14)));

			} else if (data.length() >= 12) {
				cal = new GregorianCalendar(Integer.parseInt(data.substring(0, 4)),
						Integer.parseInt(data.substring(4, 6)) - 1, Integer.parseInt(data.substring(6, 8)),
						Integer.parseInt(data.substring(8, 10)), Integer.parseInt(data.substring(10, 12)));

			} else if (data.length() >= 10) {
				cal = new GregorianCalendar(Integer.parseInt(data.substring(0, 4)),
						Integer.parseInt(data.substring(4, 6)) - 1, Integer.parseInt(data.substring(6, 8)),
						Integer.parseInt(data.substring(8, 10)), 0);

			} else {
				cal = new GregorianCalendar(Integer.parseInt(data.substring(0, 4)),
						Integer.parseInt(data.substring(4, 6)) - 1, Integer.parseInt(data.substring(6, 8)));
			}

			SimpleDateFormat sdf = new SimpleDateFormat(format);
			returnVal = sdf.format(cal.getTime());
		} catch (Exception e) {
			System.err.println("StrUtil.toDateString() " + e.getMessage());
		}

		return returnVal;
	}

	/**
	 * @param :
	 * @return :년월일 현재날짜를 문자열로 리턴
	 */
	public static String getToday() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Calendar c1 = Calendar.getInstance();
		String strToday = sdf.format(c1.getTime());
		return strToday;
	}

	/**
	 * @param :
	 * @return : 월말의 날짜를 리턴 yyyy-mm-dd
	 */
	public String getMonthLastDate() {
		Calendar cal = Calendar.getInstance();
		int year = cal.get(cal.YEAR);
		int monthCheck = cal.get(cal.MONTH) + 1;
		cal.set(year, monthCheck, 0);
		int date = cal.getActualMaximum(cal.DAY_OF_MONTH);
		String setdate = String.valueOf(year);
		if (String.valueOf(monthCheck).length() == 1) {
			setdate += "-0" + String.valueOf(monthCheck);
		} else {
			setdate += "-" + String.valueOf(monthCheck);
		}
		setdate += "-" + String.valueOf(date);
		return setdate;
	}
}
