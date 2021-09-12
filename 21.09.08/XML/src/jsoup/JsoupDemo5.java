package jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

/**
 * @author Dragon_qing
 */
public class JsoupDemo5 {
    public static void main(String[] args) throws IOException {
        //1.获取文档路径
        String path = JsoupDemo5.class.getClassLoader().getResource("./jsoup/student.xml").getPath();
        //2.解析xml文档,加载文档进内存,获取dom数
        Document document = Jsoup.parse(new File(path),"utf-8");
        //3.获取元素对象 Element
        Elements name = document.select("name");
        System.out.println(name);
        Elements name1 = document.select("#1");
        System.out.println("=========================");
        System.out.println(name1);
        System.out.println("====================");
        Elements element = document.select("student[number=0002]");
        System.out.println(element);
        System.out.println("==========================");
        Elements element1 = document.select("student[number=0002]>age");
        System.out.println(element1);
    }
}
