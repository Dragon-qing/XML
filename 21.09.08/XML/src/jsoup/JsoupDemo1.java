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
public class JsoupDemo1 {
    public static void main(String[] args) throws IOException {
        //1.获取文档路径
        String path = JsoupDemo1.class.getClassLoader().getResource("./jsoup/student.xml").getPath();
        //2.解析xml文档,加载文档进内存,获取dom数
        Document document = Jsoup.parse(new File(path),"utf-8");
        //3.获取元素对象 Element
        Elements names = document.getElementsByTag("name");
        System.out.println(names.size());
        Element element = names.get(0);
        String name = element.text();
        System.out.println(name);

    }
}
