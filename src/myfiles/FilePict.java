package myfiles;

import java.util.regex.MatchResult;
import java.util.regex.Pattern;

public class FilePict extends MyFile{
    private String sizes;

    public String getSizes() {
        return sizes;
    }

    @Override
    public String getText() {
        return null;
    }

    @Override
    public String getTime() {
        return null;
    }

    @Override
    public String getSizeFormat() {
        return null;
    }

    public void setSizes(String sizes) {
        this.sizes = sizes;
    }

    public boolean isValidSizes() {

        String[] words = getSizes().split("\\d{1,4}x\\d{1,4}");
        if (words.length == 0)
            return true;
       return false;
    }

    public boolean isValidFileFormat(){
        if (getFileFormat().equals(new String("image"))) return true;
        return false;
    }

    public FilePict(String filename, long size, String fileFormat, String sizes) {
        super(filename, size, fileFormat);
        this.sizes = sizes;
    }

    @Override
    public String getList() {
        return null;
    }
}
