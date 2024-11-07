package cn.iocoder.yudao.module.ocr.service.paddleocr;

import ai.djl.modality.cv.Image;
import ai.djl.modality.cv.output.DetectedObjects;
import cn.iocoder.yudao.module.ocr.enums.OcrType;

public interface PaddleService {
    /**
     * 文字识别
     *
     * @param image   图片
     * @param ocrType 识别类型：快速or精确
     */
    DetectedObjects ocr(Image image, OcrType ocrType);
}
