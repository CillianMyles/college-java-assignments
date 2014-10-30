import java.io.Serializable;

public class FTP implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5852177693095972738L;
	private long sequenceNum;
	private String file;
	private String dir;

	public long getSequenceNum() {
		return sequenceNum;
	}

	public void setSequenceNum(long sequenceNum0) {
		this.sequenceNum = sequenceNum0;
	}

	public String getFile() {
		return file;
	}

	public void setFile(String file1) {
		this.file = file1;
	}

	public String getDir() {
		return dir;
	}

	public void setDir(String dir1) {
		this.dir = dir1;
	}

	public FTP(long sequence_number, String file0, String dir0) {
		super();
		this.sequenceNum = sequence_number;
		this.file = file0;
		this.dir = dir0;

	}
}