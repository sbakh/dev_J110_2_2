package myfiles;

public class FileDocs extends MyFile{

    private String list;


    public String getList() {
        return list;
    }

    @Override
    public String getSizes() {
        return null;
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

    public void setList(String list) {
        this.list = list;
    }

    public boolean isValidList() {

        String[] words = getList().split(" ");
        if (words.length == 2) {
            long i = Long.getLong(words[0],10);
            if (i>0 && words[1].equals(new String("pages"))) return true;
        }
        return false;
    }

    public boolean isValidFileFormat(){
        if (getFileFormat().equals(new String("docx"))) return true;
        return false;
    }
    public FileDocs(String filename, long size, String fileFormat, String list) {
        super(filename, size, fileFormat);
        this.list = list;
    }


}
