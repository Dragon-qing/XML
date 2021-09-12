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
public class JsoupDemo4 {
    public static void main(String[] args) throws IOException {
        //1.获取文档路径
        String path = JsoupDemo4.class.getClassLoader().getResource("./jsoup/student.xml").getPath();
        //2.解析xml文档,加载文档进内存,获取dom数
        Document document = Jsoup.parse(new File(path),"utf-8");
        //3.获取元素对象 Element
        Elements elements = document.getElementsByTag("name");
        System.out.println(elements.size());
        Element student = document.getElementsByTag("student").get(0);
        Elements element_name = student.getElementsByTag("name");
        System.out.println(element_name.size());

        String number = student.attr("number");
        System.out.println(number);

        String text = element_name.text();
        String html = element_name.html();
        System.out.println("text:\n"+text);
        System.out.println("html:\n"+html);
    }
}
