package cn.iocoder.yudao.module.ocr.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;


@Data
@ConfigurationProperties(prefix = "yudao.ocr")
@Configuration
public class OcrProperties {

    /**
     * 旋转判断阈值，default=0.8
     */
    private double rotateThreshold = 0.8;

    private String detectUrl = "/model/ocr/detect.zip";

    private String detectQuickUrl = "/model/ocr/detect_mobile.zip";

    private String recognizeUrl = "/model/ocr/PP-OCRv4.zip";

    private String recognizeQuickUrl = "/model/ocr/recognize_mobile.zip";

    private String rotateUrl = "/model/ocr/rotate.zip";

    private String deviceType = "cpu";



}
