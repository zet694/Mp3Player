package utils;

import java.io.File;
import javax.swing.filechooser.FileFilter;


// фильтр для возможности выбора файлов только с расширением .mp3 для FileChoser
public class MyMp3FileFilter extends FileFilter{

    private String fileExtension;
    private String fileDiscription;

    public MyMp3FileFilter(String fileExtension,String fileDiscription) {
        this.fileExtension = fileExtension;
        this.fileDiscription = fileDiscription;
    }
    
    
    
    @Override
    public boolean accept(File file) {// только папки ,а так ж файл с расширением .mp3
        return file.isDirectory() || file.getAbsolutePath().endsWith(fileExtension);
    }

    @Override
    public String getDescription() {// Описание для выбора в диалоговом 
        return fileDiscription + "(*." + fileExtension + ")";
    }

    
    

}
