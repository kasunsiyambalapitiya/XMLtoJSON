import org.json.JSONObject;
import org.json.XML;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
/*import java.nio.file.Files;
import java.nio.file.Paths;*/
import java.util.Scanner;

/**
 * Created by kasun on 8/29/17.
 */
public class XMLtoJSON {
    public static void main(String[] args) {


        String content=readFile("/home/kasun/Downloads/WSO2/Products/C5-Patching-Model/artifacts.xml");
        System.out.println(content);
        System.out.println(convertToJson(content));
    }


    public static String readFile(String path) {
        String content = null;
        try {
            content = new Scanner(new File(path)).useDelimiter("\\Z").next();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return content;
    }

    public static String convertToJson(String xml){
        JSONObject jsonObject = XML.toJSONObject(xml);
        return jsonObject.toString();
    }


   /* public String readFile(String path, Charset encoding){
        try {
            byte[] encoded= Files.readAllBytes(Paths.get(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }*/
}
