package com.sic.bb.hudson.plugins.xcodeplugin.filefilter;

import java.io.File;
import java.io.FilenameFilter;
import java.io.Serializable;

public class ZipFileFilter implements FilenameFilter, Serializable {
	private static final long serialVersionUID = 1L;
	public static final String FILE_ENDING = ".zip";
	
	public boolean accept(File dir, String filename) {
		return new File(dir, filename).isFile() && filename.endsWith(FILE_ENDING);
	}
}