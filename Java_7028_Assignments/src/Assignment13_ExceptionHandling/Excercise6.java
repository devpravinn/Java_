package Assignment13_ExceptionHandling;

import java.io.IOException;

public class Excercise6 {
	//throws keyword example
	void myMethod(int num) throws IOException,ClassNotFoundException {
		if(num == 1) {
			throw new IOException("Exception Message1");
		}else {
			throw new ClassNotFoundException("Exception Message2");
		}
	}
}
