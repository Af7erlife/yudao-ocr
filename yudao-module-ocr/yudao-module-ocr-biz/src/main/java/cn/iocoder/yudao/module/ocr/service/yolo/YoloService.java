package cn.iocoder.yudao.module.ocr.service.yolo;

import ai.djl.modality.cv.Image;
import ai.djl.modality.cv.output.DetectedObjects;
import cn.iocoder.yudao.module.ocr.controller.admin.detect.vo.DetectOCRCreateRespVo;
import org.springframework.web.multipart.MultipartFile;

public interface YoloService {

    DetectedObjects detect(Image image);

}
