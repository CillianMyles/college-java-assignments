import java.io.Serializable;

public class FileData implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7406864945626848967L;
	private long ackNum;
	private int size;
	private byte[] data;

	public long getAckNum() {
		return ackNum;
	}

	public void setack(long ackNum1) {
		this.ackNum = ackNum1;
	}

	public int getChunksize() {
		return size;
	}

	public void setChunksize(int chunksize) {
		this.size = chunksize;
	}

	public byte[] getData() {
		return data;
	}

	public void setData(byte[] data) {
		this.data = data;
	}

	public FileData(long ackNum0, byte[] data, int size0) {
		super();
		this.ackNum = ackNum0;
		this.data = data;
		this.size = size0;
	}
}
