package com.HuLa.common.websocket.domain.vo.resp;

import com.HuLa.common.websocket.domain.enums.WSRespTypeEnum;

/**
 * @author nyh
 */
public class WSBaseResp<T> {
    /**
     * @see WSRespTypeEnum
     **/
    private Integer type;
    private T data;
}
