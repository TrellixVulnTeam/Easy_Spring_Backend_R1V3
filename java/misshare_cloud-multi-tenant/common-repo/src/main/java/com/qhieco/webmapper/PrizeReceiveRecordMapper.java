package com.qhieco.webmapper;

import com.qhieco.response.data.web.PrizeReceiveRecordData;
import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;
import java.util.List;

/**
 * @author 蒙延章 970915683@qq.com
 * @version 2.0.1 创建时间: 2018/6/13 14:59
 * <p>
 * 类说明：
 * ${说明}
 */
@Mapper
public interface PrizeReceiveRecordMapper {

    public List<PrizeReceiveRecordData> queryPrizeReceiveListByCondition(HashMap params);

    public Integer queryCountPrizeReceiveListByCondition(HashMap params);
}
