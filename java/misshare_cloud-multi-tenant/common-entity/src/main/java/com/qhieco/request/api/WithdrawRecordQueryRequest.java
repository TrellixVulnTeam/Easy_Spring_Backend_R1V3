package com.qhieco.request.api;

import lombok.Data;

/**
 * @author 蒙延章 970915683@qq.com
 * @version 2.0.1 创建时间: 2018/3/14 10:50
 * <p>
 * 类说明：
 * ${说明}
 */
@Data
public class WithdrawRecordQueryRequest extends AbstractRequest {
    private Integer user_id;
    private Integer page_num;
}
