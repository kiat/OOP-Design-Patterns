package edu.bu.met.cs665.io;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class LowerCaseInputStream extends FilterInputStream {

	/**
	 * 
	 * @param in the inputStream to process 
	 */
	public LowerCaseInputStream(InputStream in) {
		super(in);
	}

	/**
	 * reads the input stream and convert
	 */
	public int read() throws IOException {
		int c = in.read();
		return (c == -1 ? c : Character.toLowerCase((char) c));
	}

	/**
	 * Read the byte array with an offset.
	 */
	public int read(byte[] b, int offset, int len) throws IOException {
		int result = in.read(b, offset, len);
		for (int i = offset; i < offset + result; i++) {
			b[i] = (byte) Character.toLowerCase((char) b[i]);
		}
		return result;
	}
}
