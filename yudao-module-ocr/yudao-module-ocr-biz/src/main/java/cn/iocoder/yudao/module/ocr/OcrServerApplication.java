package cn.iocoder.yudao.module.ocr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.net.URL;

/**
 * 项目的启动类
 *
 * 如果你碰到启动的问题，请认真阅读 https://cloud.iocoder.cn/quick-start/ 文章
 * 如果你碰到启动的问题，请认真阅读 https://cloud.iocoder.cn/quick-start/ 文章
 * 如果你碰到启动的问题，请认真阅读 https://cloud.iocoder.cn/quick-start/ 文章
 *
 * @author 芋道源码
 */
@SpringBootApplication
public class OcrServerApplication {

    public static void main(String[] args) {
        URL resource = OcrServerApplication.class.getClassLoader().getResource("cache");
        String classpathDir = null;

        if (resource != null) {
            classpathDir = resource.getPath();

            // 去除路径开头的多余斜杠 (只有在路径以 / 开头时才去除)
            if (classpathDir.startsWith("/")) {
                classpathDir = classpathDir.substring(1);
            }
        }
        System.setProperty("ENGINE_CACHE_DIR",classpathDir );

        SpringApplication.run(OcrServerApplication.class, args);

    }

}
