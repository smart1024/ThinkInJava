/**   
 * @Title: Property.java 
 * @Package com.brucelee.thinkinjava.chapter2 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author robertlee1059@163.com   
 * @date 2015-4-14 下午6:58:57 
 */
package com.brucelee.thinkinjava.chapter2;

/** 
 * @ClassName: Property 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author robertlee1059@163.com 
 * @date 2015-4-14 下午6:58:57 
 *  
 */
//Property.java
import java.util.*;

public class Property {
	public static void main(String[] args) {
		System.out.println(new Date());
		//the system properties
		Properties p = System.getProperties();
		p.list(System.out);
		System.out.println("--- Memory Usage:");
		//the Runtime object associated with the current Java application.
		Runtime rt = Runtime.getRuntime();
		System.out.println("Total Memory = " + rt.totalMemory()
				+ " Free Memory = " + rt.freeMemory());
	}
}
