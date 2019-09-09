package com.hansujuan.common.test;

import org.junit.Test;

import com.hansujuan.common.utils.StringUtil;

/**
 * @作者 hsj
 * @日期 2019年9月9日
 */
public class StringTest {

	@Test
	public void testToHtml(){
		String html = StringUtil.toHtml("发多少进度款\\n\\r,好多个砂浆\\r");
		System.out.println(html);
	}
	
	@Test
	public void testIsPhone(){
		boolean b = StringUtil.isPhone("15345678901");
		System.out.println(b);
	}
	
	@Test
	public void testIsEmail(){
		boolean b = StringUtil.isEmail("1234567890@qq.com");
		System.out.println(b);
	}
	
	@Test
	public void testHasNext(){
		boolean b = StringUtil.hasNext("   11");
		System.out.println(b);
	}
}
