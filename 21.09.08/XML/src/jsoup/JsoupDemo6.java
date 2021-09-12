package jsoup;

import cn.wanghaomiao.xpath.exception.XpathSyntaxErrorException;
import cn.wanghaomiao.xpath.model.JXDocument;
import cn.wanghaomiao.xpath.model.JXNode;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * @author Dragon_qing
 */
public class JsoupDemo6 {
    public static void main(String[] args) throws IOException, XpathSyntaxErrorException {
        //1.获取文档路径
        String path = JsoupDemo6.class.getClassLoader().getResource("./jsoup/student.xml").getPath();
        //2.解析xml文档,加载文档进内存,获取dom数
        Document document = Jsoup.parse(new File(path),"utf-8");
        //3.创建JXDocument对象
        JXDocument jxDocument = new JXDocument(document);
        //查询所有student标签
        List<JXNode> jxNodes = jxDocument.selN("//student");
        for (JXNode jxNode : jxNodes) {
            System.out.println(jxNode);
        }
        System.out.println("=================================");
        List<JXNode> jxNodes1 = jxDocument.selN("//student/name");
        for (JXNode jxNode : jxNodes1) {
            System.out.println(jxNode);
        }
        System.out.println("===========================");
        List<JXNode> jxNodes2 = jxDocument.selN("//student/name[@id]");
        for (JXNode jxNode : jxNodes2) {
            System.out.println(jxNode);
        }
        System.out.println("=============================");
        List<JXNode> jxNodes3 = jxDocument.selN("//student/name[@id='123']");
        for (JXNode jxNode : jxNodes3) {
            System.out.println(jxNode);
        }


    }
}
