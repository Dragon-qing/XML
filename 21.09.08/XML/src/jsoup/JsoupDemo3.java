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
public class JsoupDemo3 {
    public static void main(String[] args) throws IOException {
        //1.获取文档路径
        String path = JsoupDemo3.class.getClassLoader().getResource("./jsoup/student.xml").getPath();
        //2.解析xml文档,加载文档进内存,获取dom数
        Document document = Jsoup.parse(new File(path),"utf-8");
        //3.获取元素对象 Element
        Elements elements = document.getElementsByTag("student");
        //System.out.println(elements);

        Elements elements1 = document.getElementsByAttribute("id");
        System.out.println(elements1);
        System.out.println("---------------");
        Elements elements2 = document.getElementsByAttributeValue("number", "0001");
        System.out.println(elements2);
        System.out.println("------------");
        Element element = document.getElementById("123");
        System.out.println(element);

    }
}
