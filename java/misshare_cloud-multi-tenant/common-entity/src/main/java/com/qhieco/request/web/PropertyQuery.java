package com.qhieco.request.web;

import lombok.Data;

/**
 * @author 王宇 623619462@qq.com
 * @version 2.0.1 创建时间: 18-5-8 上午10:10
 * <p>
 * 类说明：
 * ${description}
 */
@Data
public class PropertyQuery {
    private String tableName;
    private String whereClause;

}
