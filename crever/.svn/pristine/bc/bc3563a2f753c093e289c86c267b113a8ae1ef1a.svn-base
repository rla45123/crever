package com.crever.utils;

/**
 * @author : ohs
 * @message : 공통으로 쓰는 자바 static 메소드
 * @date :2017. 7. 22.
 */
public class StringUtil {

	/**
	 * @param :
	 *            null 체크하려는 String 문자열
	 * @return : null이면 true, null이 아니면 false
	 */
	public static boolean StringNullCheck(String str) {
		return str == null || str.equals("") ? true : false;
	}

	/**
	 * @param :
	 *            String 배열
	 * @return : String |을 연결한 문자열 리턴 String 배열을 | 파이프로 연결해서 하나의 문자열로 리턴
	 */
	public static String PipeArr(String[] strArr) {
		String strQuery = "";
		if (strArr.length != 1) {
			for (int i = 0; i < strArr.length - 1; i++) {
				strQuery += strArr[i].trim() + "|";
			}
			strQuery += strArr[strArr.length - 1].trim();

		} else {
			strQuery += strArr[strArr.length - 1].trim();
		}
		return strQuery;
	}

	/**
	 * String[] 에 특정 값이 존재하는지 check
	 */
	public static boolean contains(String[] array, String value) {
		if (array == null || value == null)
			return false;
		boolean containFlag = false;
		for (int i = 0; i < array.length; i++) {
			if (array[i] != null && value.trim().equals(array[i].trim())) {
				containFlag = true;
			}
		}
		return containFlag;
	}
}