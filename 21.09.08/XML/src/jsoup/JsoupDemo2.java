package jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;
import java.net.URL;

/**
 * @author Dragon_qing
 */
public class JsoupDemo2 {
    public static void main(String[] args) throws IOException {
        //1.获取文档路径
        String path = JsoupDemo2.class.getClassLoader().getResource("./jsoup/student.xml").getPath();
        //2.解析xml文档,加载文档进内存,获取dom数
//        1.
//        Document document = Jsoup.parse(new File(path),"utf-8");
//        System.out.println(document);
//        2.
//        String str="<!--?xml version=\"1.0\" encoding=\"utf-8\" ?-->\n" +
//                "<html>\n" +
//                " <head></head>\n" +
//                " <body>\n" +
//                "  <studnets> \n" +
//                "   <student number=\"0001\"> \n" +
//                "    <name>\n" +
//                "     tom\n" +
//                "    </name> \n" +
//                "    <age>\n" +
//                "     15\n" +
//                "    </age> \n" +
//                "    <sex>\n" +
//                "     male\n" +
//                "    </sex> \n" +
//                "   </student> \n" +
//                "   <student number=\"0002\"> \n" +
//                "    <name>\n" +
//                "     jack\n" +
//                "    </name> \n" +
//                "    <age>\n" +
//                "     18\n" +
//                "    </age> \n" +
//                "    <sex>\n" +
//                "     male\n" +
//                "    </sex> \n" +
//                "   </student> \n" +
//                "   <student number=\"0003\"> \n" +
//                "    <name>\n" +
//                "     rose\n" +
//                "    </name> \n" +
//                "    <age>\n" +
//                "     17\n" +
//                "    </age> \n" +
//                "    <sex>\n" +
//                "     female\n" +
//                "    </sex> \n" +
//                "   </student> \n" +
//                "  </studnets>\n" +
//                " </body>\n" +
//                "</html>";
//        Document document = Jsoup.parse(str);
//        System.out.println(document);
// 3.通过网络路径获取指定的html或xml的文档对象

        URL url=new URL("https://www.baidu.com/");
        Document document = Jsoup.parse(url, 10000);
        System.out.println(document);


    }
}
