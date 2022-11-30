package Filereadwr;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class FileRead {
	private  File file;
	static ArrayList al;
	public FileRead(ArrayList<String> al2) {
		this.al=al2;
	}
	public File isAvailable() {
		return file;
	}
	public void setAvailable(File file) {
		this.file = file;
	}
	@Override
	public String toString() {
		return "FileRead [file=" + file + "]";
	}
}

		