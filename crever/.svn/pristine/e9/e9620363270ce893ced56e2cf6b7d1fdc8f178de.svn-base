
package com.crever.utils;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;

import javax.servlet.ServletRequest;


/**
 * 동적으로 변하는 데이터를 전달하기 위한 객체
 */
public class DynamicValueObject extends HashMap implements Serializable {
	/*
	  
	 */
	public DynamicValueObject() {
		super();
	}

	/**
	 * ServletRequest를 사용할 경우 Constructor
	 * 
	 * @param request
	 */
	public DynamicValueObject(ServletRequest request) {
		initMap(request);
	}
	
	/**
	 * ServletRequest의 parameter를 모두 populate
	 * 
	 * @param request
	 * @return
	 */
	private void initMap(ServletRequest request) {
		java.util.Enumeration names = request.getParameterNames();
		while (names.hasMoreElements()) {
			String name = (String) names.nextElement();
			String[] values = request.getParameterValues(name);
			if (values.length == 1) {
				try {
					put(name, (Object) request.getParameter(name));
				} catch (Exception e) {
				}
			} else {
				String[] temp = new String[values.length];
				try {
					for (int i = 0; i < values.length; i++) {
						temp[i] = values[i];
					}
				} catch (Exception e) {
				}
				put(name, temp);
			}
		}
	}
	
	/**
	 * name의 값(String)을 반환 만약 String[] 이면 첫번째 요소를 반환
	 * 
	 * @param name
	 * @return
	 */
	public String getString(String name) {
		return getString(name, "");
	}
	

	/**
	 * name의 값(String[])를 반환 만약 String 이면 요소 1개짜리 String[]를 반환
	 * 
	 * @param name
	 * @return
	 */
	public String[] getStringArray(String name) {
		String[] values = null;
		if (!this.containsKey(name))
			return null;
		Object tmpObj = this.get(name);
		if (tmpObj == null)
			return null;

		if (tmpObj instanceof String[]) {
			values = (String[]) tmpObj;

		} else if (tmpObj instanceof String) {
			values = new String[1];
			values[0] = (String) tmpObj;

		} else if (tmpObj instanceof Object[]) {
			Object[] objs = (Object[]) tmpObj;
			values = new String[objs.length];
			for (int k = 0; k < values.length; k++) {
				values[k] = String.valueOf(objs[k]);
			}
		}
		return values;
	}

	/**
	 * name의 값(String)을 반환 만약 String[] 이면 첫번째 요소를 반환
	 * 
	 * @param name
	 * @param defaultValue
	 * @return
	 */
	public String getString(String name, String defaultValue) {
		if (!this.containsKey(name))
			return defaultValue;
		Object tmpObj = this.get(name);
		if (tmpObj == null)
			return defaultValue;

		if (tmpObj instanceof String) {
			return (String) tmpObj;

		} else if (tmpObj instanceof String[]) {
			String[] tmpArr = (String[]) tmpObj;
			if (tmpArr.length > 0 && tmpArr[0] != null)
				return tmpArr[0];
			else
				return defaultValue;

		} else if (tmpObj instanceof Object[]) {
			Object[] objs = (Object[]) tmpObj;
			if (objs.length > 0 && objs[0] != null) {
				return String.valueOf(objs[0]);
			} else {
				return defaultValue;
			}

		} else {
			return String.valueOf(tmpObj);
		}
	}

	/**
	 * name의 값(String[])를 반환 만약 String 이면 요소 1개짜리 String[]를 반환
	 * 
	 * @param name
	 * @return
	 */
	public String[] getStrings(String name) {
		String[] values = null;
		if (!this.containsKey(name))
			return null;
		Object tmpObj = this.get(name);
		if (tmpObj == null)
			return null;

		if (tmpObj instanceof String[]) {
			values = (String[]) tmpObj;

		} else if (tmpObj instanceof String) {
			values = new String[1];
			values[0] = (String) tmpObj;

		} else if (tmpObj instanceof Object[]) {
			Object[] objs = (Object[]) tmpObj;
			values = new String[objs.length];
			for (int k = 0; k < values.length; k++) {
				values[k] = String.valueOf(objs[k]);
			}
		}
		return values;
	}

	/**
	 * name의 값을 int값으로 반환
	 * 
	 * @param name
	 * @return
	 */
	public int getIntValue(String name) {
		return getIntValue(name, 0);
	}

	/**
	 * name의 값을 int값으로 반환
	 * 
	 * @param name
	 * @param defaultVal
	 * @return
	 */
	public int getIntValue(String name, int defaultVal) {
		int retVal = defaultVal;
		Object tmpObj = this.get(name);
		if (tmpObj == null)
			return defaultVal;
		try {
			if (tmpObj instanceof Object[]) {
				retVal = Integer.parseInt(String.valueOf(((Object[]) tmpObj)[0]));
			} else {
				if (String.valueOf(tmpObj).trim().length() < 1) {
					retVal = defaultVal;
				} else {
					retVal = Integer.parseInt(String.valueOf(tmpObj).trim());
				}

			}

		} catch (Exception e) {
			retVal = defaultVal;
		}
		return retVal;
	}

	/**
	 * name의 값을 int[] 값으로 반환
	 * 
	 * @param name
	 * @return
	 */
	public int[] getIntValues(String name) {
		return getIntValues(name, 0);
	}

	/**
	 * name의 값을 int[] 값으로 반환
	 * 
	 * @param name
	 * @param defaultVal
	 * @return null은 return이 되지 않고 요소1개짜리 defaultValue가 return된다.
	 */
	public int[] getIntValues(String name, int defaultVal) {
		int[] retVals = null;
		Object tmpObj = this.get(name);
		if (tmpObj == null)
			return new int[] { defaultVal };

		if (tmpObj instanceof int[]) {
			retVals = (int[]) tmpObj;

		} else if (tmpObj instanceof Integer[]) {
			Integer[] objs = (Integer[]) tmpObj;
			retVals = new int[objs.length];
			for (int k = 0; k < objs.length; k++) {
				retVals[k] = objs[k].intValue();
			}

		} else if (tmpObj instanceof Object[]) {
			Object[] objs = (Object[]) tmpObj;
			retVals = new int[objs.length];
			for (int k = 0; k < objs.length; k++) {
				try {
					retVals[k] = Integer.parseInt(String.valueOf(objs[k]));
				} catch (Exception e) {
					retVals[k] = defaultVal;
				}
			}

		} else if (tmpObj instanceof Integer) {
			retVals = new int[] { ((Integer) tmpObj).intValue() };

		} else {
			retVals = new int[1];
			try {
				retVals[0] = Integer.parseInt(String.valueOf(tmpObj));

			} catch (Exception e) {
				retVals[0] = defaultVal;
			}

		}
		return retVals;
	}

	/**
	 * name의 값을 반환
	 * 
	 * @param name
	 * @return
	 */
	public Object getValue(String name) {
		return this.get(name);
	}

	/**
	 * name의 값을 반환
	 * 
	 * @param name
	 * @return
	 */
	public Object[] getValues(String name) {
		Object tmpObj = this.get(name);
		if (tmpObj == null)
			return null;

		if (tmpObj instanceof Object[]) {
			return (Object[]) tmpObj;
		} else {
			return new Object[] { tmpObj };
		}
	}

	/**
	 * 값을 추가
	 * @param name
	 * @param value
	 */
	public void addValue(String name, Object value) {
		this.put(name, value);
	}

	/**
	 * 값을 추가(객체배열형태를 추가)
	 * 
	 * @param name
	 * @param values
	 */
	public void addValue(String name, Object[] values) {
		this.put(name, values);
	}

	/**
	 * 반환할 값의 데이터 갯수를 반환
	 * 
	 * @param name
	 * @return
	 */
	public int getSize(String name) {
		Object tmpObj = this.get(name);
		if (tmpObj instanceof Object[]) {
			return ((Object[]) tmpObj).length;
		} else {
			return 1;
		}
	}

	/**
	 * name의 값을 제거
	 * @param name
	 */
	public void removeValue(String name) {
		if (this.containsKey(name))
			this.remove(name);
	}


	/**
	 * 콘솔에 찍히는
	 */
	public String toString() {
		StringBuffer buff = new StringBuffer();
		Iterator iter = this.keySet().iterator();
		buff.append("================ (DynamicValueObject) =====================\r\n");
		while (iter.hasNext()) {
			String key = String.valueOf(iter.next());
			Object obj = get(key);
			if (obj instanceof Object[]) {
				Object[] objArr = (Object[]) obj;
				for (int i = 0; i < objArr.length; i++) {
					buff.append(key + "=" + String.valueOf(objArr[i]) + "\r\n");
				}
			} else {
				buff.append(key + "=" + getString(key) + "\r\n");
			}
		}
		buff.append("===========================================================\r\n");
		return buff.toString();
	}

}
