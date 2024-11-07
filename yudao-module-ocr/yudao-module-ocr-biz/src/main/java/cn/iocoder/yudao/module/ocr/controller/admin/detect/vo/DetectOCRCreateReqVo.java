package cn.iocoder.yudao.module.ocr.controller.admin.detect.vo;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.NotEmpty;

@Schema(description = "管理后台 - 请求OCR识别")
@Data
public class DetectOCRCreateReqVo {

    @Schema(description = "识别文件", requiredMode = Schema.RequiredMode.REQUIRED, example = "身份证.pdf")
    @NotEmpty(message = "未上传识别文件")
    private MultipartFile file;
}
