package com.zhangsan.common.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.jupiter.api.Test;

class DateUtilTest {

	/**
	 * 拼接下面根据时间范围查询订单的SQL： String sql = "select * from t_order where
	 * create_time>='{1}' and create_time<='{2}' ";
	 * 将上面{1}的位置使用DateUtil工具类中的getDateByInitMonth()返回值替换，
	 * 将上面{2}的位置使用DateUtil工具类中的getDateByFullMonth()返回值替换。最后打印出正确拼接的SQL字符串。
	 */
	
	@Test
	public void testDate() {
		//月初
		Date date = DateUtil.getDateByInitMonth(new Date());
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		//月末
		Date date2 = DateUtil.getDateByFullMonth(new Date());
		
		String sql = "select * from t_order where create_time>='{1}' and create_time<='{2}' ";
		
		String string = sql.replace("{1}",df.format(date)).replace("{2}",  df.format(date2));
		System.out.println(string);
	}

	@Test
	void testGetDateByInitMonth() {

		Date date = DateUtil.getDateByInitMonth(new Date());
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String string = df.format(date);
		System.out.println(string);

	}

	@Test
	void testgetDateByFullMonth() {

		Date date = DateUtil.getDateByFullMonth(new Date());
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String string = df.format(date);
		System.out.println(string);

	}

	@Test
	void testgetDateByMonthDiff() {

		Integer month = 3;
		Date date = DateUtil.getDateByMonthDiff(month);

		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String string = df.format(date);
		System.out.println(string);

	}

}
