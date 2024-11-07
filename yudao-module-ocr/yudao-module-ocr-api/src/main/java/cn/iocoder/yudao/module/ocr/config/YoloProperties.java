package cn.iocoder.yudao.module.ocr.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;


@Data
@ConfigurationProperties(prefix = "ai.yolo")
@Configuration
public class YoloProperties {

    private String deviceType = "cpu";

    private String yoloUrl = "/model/yolo/yolov5.zip";
    private String modelName = "yolov5m.onnx";
    private String engine = "OnnxRuntime";
    private String nameList = "coco.names";

    private Float threshold = 0.2f;

    private Integer width = 640;
    private Integer height = 640;

}
