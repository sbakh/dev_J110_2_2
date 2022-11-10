package myfiles;

public abstract class MyFile {
    private String filename;
    private long size;

    private String fileFormat;

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    public String getFileFormat() {
        return fileFormat;
    }

    public void setFileFormat(String fileFormat) {
        this.fileFormat = fileFormat;
    }

    public abstract String getList();
    public abstract String getSizes();
    public abstract String getText();
    public abstract String getTime();
    public abstract String getSizeFormat();
    public MyFile(String filename, long size, String fileFormat) {
        this.filename = filename;
        this.size = size;
        this.fileFormat = fileFormat;
    }
}
