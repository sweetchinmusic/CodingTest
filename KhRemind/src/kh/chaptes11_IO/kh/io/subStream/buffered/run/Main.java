package com.kh.io.subStream.buffered.run;

import com.kh.io.subStream.buffered.model.dao.TestBufferedStream;

public class Main {

	public static void main(String[] args) {
		TestBufferedStream tbs = new TestBufferedStream();
		
		// tbs.fileSave();
		tbs.fileRead();
	}

}
