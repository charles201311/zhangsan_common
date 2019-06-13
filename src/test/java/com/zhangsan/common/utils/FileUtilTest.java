package com.zhangsan.common.utils;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FileUtilTest {

	@Test
	void testGetExtendName() {
		
		System.out.println(FileUtil.getExtendName("aaa.doc"));
	}

	@Test
	void testGetTempDirectory() {
		FileUtil.getTempDirectory();
	}

	@Test
	void testGetUserDirectory() {
		FileUtil.getUserDirectory();
	}

}
