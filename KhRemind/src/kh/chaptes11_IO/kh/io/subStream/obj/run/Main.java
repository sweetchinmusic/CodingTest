package com.kh.io.subStream.obj.run;

import com.kh.io.subStream.obj.model.dao.TestObjectStream;

public class Main {

	public static void main(String[] args) {
		TestObjectStream tos = new TestObjectStream();
		
		tos.fileSave();
		tos.fileOpen();
		
	}

}
