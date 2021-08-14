package cn.hsp.login.exception;

import cn.hsp.login.domain.ResultJson;
import lombok.Getter;

/**
 * @author 花生皮编程(抖音、快手、B站、西瓜视频、今日头条)
 */
@Getter
public class CustomException extends RuntimeException{
    private ResultJson resultJson;

    public CustomException(ResultJson resultJson) {
        this.resultJson = resultJson;
    }
}
