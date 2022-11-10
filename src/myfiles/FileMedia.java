package myfiles;

public class FileMedia extends MyFile{
    private String text;
    private String time;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTime() {
        return time;
    }

    @Override
    public String getSizeFormat() {
        return null;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public boolean isValidFileFormat(){
        if (getFileFormat().equals(new String("audio"))) return true;
        return false;
    }

    public boolean isTime(){
        if(getTime().length() == 5) {
            String[] words = getTime().split("\\d{2}:\\d{2}");
            if (words.length == 0)
                return true;
        }
        return false;
    }
    public FileMedia(String filename, long size, String fileFormat, String text, String time) {
        super(filename, size, fileFormat);
        this.text = text;
        this.time = time;
    }

    @Override
    public String getList() {
        return null;
    }

    @Override
    public String getSizes() {
        return null;
    }
}
