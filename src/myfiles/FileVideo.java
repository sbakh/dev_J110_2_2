package myfiles;

public class FileVideo extends FileMedia{
    private String sizeFormat;

    public String getSizeFormat() {
        return sizeFormat;
    }

    public void setSizeFormat(String sizeFormat) {
        this.sizeFormat = sizeFormat;
    }
    public boolean isValidFileFormat(){
        if (getFileFormat().equals(new String("video"))) return true;
        return false;
    }

    public boolean isTime(){
        if(getTime().length() == 5) {
            String[] words = getTime().split("\\d{2}:\\d{2}");
            if (words.length == 0)
                return true;
        } else {
            if(getTime().length() == 8) {
                String[] words = getTime().split("\\d{2}:\\d{2}:\\d{2}");
                if (words.length == 0)
                    return true;
            }
        }
        return false;
    }

    public boolean isSizeFormat() {
        String[] words = getSizeFormat().split("\\d{3,4}x\\d{3,4}");
        if (words.length == 0)
            return true;
        return false;
    }
    public FileVideo(String filename, long size, String fileFormat, String text, String time, String sizeFormat) {
        super(filename, size, fileFormat, text, time);
        this.sizeFormat = sizeFormat;
    }
}
