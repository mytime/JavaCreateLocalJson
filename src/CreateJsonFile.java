import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import java.io.*;

/**
 * 导入Gson.jar
 * 对象转json文件
 */
public class CreateJsonFile {
    public static void main(String[] args) {

        //创建json文件范例

//        {
//            "cat":"it",
//            "languages":[
//                    {"id":1,"ide":"Eclipse","name":"Java"},
//                    {"id":2,"ide":"Xcode","name":"Swift"},
//                    {"id":3,"ide":"Visul","name":"C#"}
//            ],
//            "pop":true
//        }



        //创建json对象,
        JsonObject object = new JsonObject();

        //添加根部属性"cat":"it",
        //arg1:key
        //arg2:value
        object.addProperty("cat", "it");

        //创建json数组  "languages":[...]
        JsonArray array = new JsonArray();

        //创建languages内部的三个对象
        //1
        JsonObject lan1 = new JsonObject();
        //为lan1添加属性
        lan1.addProperty("id",1);
        lan1.addProperty("name","java");
        lan1.addProperty("ide","Eclipse");
        //为array添加对象
        array.add(lan1);

        //2
        JsonObject lan2 = new JsonObject();
        //为lan1添加属性
        lan2.addProperty("id",2);
        lan2.addProperty("name","Swift");
        lan2.addProperty("ide","Xcode");
        //为array添加对象
        array.add(lan2);

        //3
        JsonObject lan3 = new JsonObject();
        //为lan1添加属性
        lan3.addProperty("id",3);
        lan3.addProperty("name","C#");
        lan3.addProperty("ide","Visul");
        //为array添加对象
        array.add(lan3);

        //为object对象 添加内部对象languages
        //arg1:key
        //arg2:value 数组
        object.add("languages",array);

        //添加pop属性
        object.addProperty("pop",true);

        //输出json
        System.out.println(object.toString());

        //保存输出到文件
        // TODO: 16/1/9

//        try {
//
//
//            //准备写入文件
//            File newfile = new File("newtext.txt");
//            FileOutputStream fos = new FileOutputStream(newfile);
//            OutputStreamWriter osw = new OutputStreamWriter(fos);
//            BufferedWriter bw = new BufferedWriter(osw);
//
//            //开始写入
//
//            String str = object.toString();
//            bw.write(str);
//
//            System.out.println(str);
//
//
//
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


    }

}
