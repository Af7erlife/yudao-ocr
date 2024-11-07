package cn.iocoder.yudao.module.ocr.enums;

import lombok.experimental.UtilityClass;

/**
 * @author guoxiang
 * @see <a href="https://www.jianshu.com/u/aba665c4151f">简书TinyThing</a>
 * @since 2022/3/19 12:36
 */
@UtilityClass
public class ModelConstants {
    /**
     * OCR推理引擎使用百度飞浆
     */
    public static final String ENGINE_PADDLE = "PaddlePaddle";
    public static final String ENGINE_ONNX = "OnnxRuntime";
    public static final String ENGINE_PYTORCH = "PyTorch";
}
