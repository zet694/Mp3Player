package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;

public class FileUtils {

    // Имя файла без расширения
    public static String getFileNameWithouExtension(String filename){
        File file = new File(filename);
        int index = file.getName().lastIndexOf('.');
        if (index > 0 && index < file.getName().length() - 2 ){
            return file.getName().substring(0,index);
        }
        return   "No name";
    }
    // Получить расширение
    public static String getaFileExtension(File f){
        String ext = null;
        String s = f.getName();
        int i = s.lastIndexOf(".");

        if (i > 0 && i < s.length() - 1){
            ext = s.substring(i+1).toLowerCase();
        }
        return ext;
    }
    
    // Удалить старый файл - фальтр,заменить на новый.
    public static void addFileFilter(JFileChooser jfc, FileFilter ff) { // Проверить фильтр
        jfc.removeChoosableFileFilter(jfc.getFileFilter());
        jfc.setFileFilter(ff);
        jfc.setSelectedFile(new File("")); // Удалить последние имя открываемого файла/сохроняемого файла
    }
    // Сохранить объект
    public static void serialize(Object obj,String filname){
        try{
        FileOutputStream fos = new FileOutputStream(filname);
        ObjectOutputStream obJectOutStream = new ObjectOutputStream(fos);
        obJectOutStream.writeObject(obj);
        obJectOutStream.flush();
        obJectOutStream.close();
        fos.close();
        } catch (IOException ex) {
            System.out.println("Ошибка! " + ex.getMessage());
        }
        
    }
    
    public static Object deserialize(String filename){
        try {
            FileInputStream fis = new FileInputStream(filename);
            ObjectInputStream oin = new ObjectInputStream(fis);
            Object ts = (Object) oin.readObject();
            fis.close();
            return ts;
        }catch(ClassNotFoundException | IOException ex){
            System.out.println("Ошибка!" + ex.getMessage());
        }
        return null;
    }

}
