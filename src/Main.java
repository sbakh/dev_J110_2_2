import myfiles.*;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


public class Main {
    public static void printAll(MyFile[] myFiles){
        System.out.println("      File name     |   Size   | Details");
        System.out.println("---------------------------------------------------");
        long i=0,j=0;
        for (MyFile m: myFiles) {
            if (i < m.getFilename().length()) i = m.getFilename().length();
            if (j < Long.toString(m.getSize()).length()) j = Long.toString(m.getSize()).length();
        }
        for (MyFile m: myFiles) {
            String strName = m.getFilename();
            String strSize = Long.toString(m.getSize());
            for (int k = m.getFilename().length();k < i ; k++)
                strName = strName + " ";
            for (int k = strSize.length();k < j ; k++)
                strSize = " " + strSize ;
            System.out.print(strName+"|"+ strSize+"|"+ m.getFileFormat() + ", ");
            if(m.getFileFormat().equals("docx"))
                System.out.println( m.getList());
            if (m.getFileFormat().equals("image"))
                System.out.println(m.getSizes());
            if (m.getFileFormat().equals("audio"))
                System.out.println(m.getText() + ", " + m.getTime());
            if (m.getFileFormat().equals("video"))
                System.out.println(m.getText() + ", " + m.getTime() + ", " + m.getSizeFormat());
        }

    }

    public static void main(String[] args) {
     //   int l = Integer.getInteger("2",10);
        FileDocs fileDocs = new FileDocs("j110-lab2-hiers.docx",23212,"docx","2 pages");
        System.out.println("fileDocs.isValidFileFormat() = " + fileDocs.isValidFileFormat());
        System.out.println("fileDocs.isValidList() = " + fileDocs.isValidList());
        FilePict filePict = new FilePict("spb-map.png", 1703527, "image","1024x3072");
        System.out.println("filePict.isValidFileFormat() = " + filePict.isValidFileFormat());
        System.out.println("filePic.isValidSizes() = " + filePict.isValidSizes());
        FileMedia fileMedia = new FileMedia("06-PrettyGirl.mp3",7893454,"audio","EricClapton, PrettyGirl","05:28");
        System.out.println("fileMedia.isValidFileFormat()" + fileMedia.isValidFileFormat());
        System.out.println("fileMedia.isTime()" + fileMedia.isTime());
        FileVideo fileVideo = new FileVideo("BackToTheFuture1.avi",1470984192,"video","Back to the future I, 1985","01:48:08","640x352");
        System.out.println("fileVideo.isValidFileFormat() = " + fileVideo.isValidFileFormat());
        System.out.println("fileVideo.isTime() = " + fileVideo.isTime());
        System.out.println("fileVideo.isSizeFormat() = " + fileVideo.isSizeFormat());
        System.out.println("для финального коммита");

        MyFile[] myFiles = new MyFile[4];
        myFiles[0] = fileDocs;
        myFiles[1] = filePict;
        myFiles[2] = fileMedia;
        myFiles[3] = fileVideo;
        printAll(myFiles);
    }
}