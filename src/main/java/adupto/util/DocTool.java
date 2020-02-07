package adupto.util;

import java.io.File;

public class DocTool {
    public  static  int checkDirExists(String doc_url){
        File file=new File(doc_url);
        if(file.exists()){
            return 1;
        }
        else {
            file.mkdir();
            System.out.println("已文件夹");
            return 0;
        }
    }
}
