package com.xiaozhuanglt.mitutucute.springboot.service.interfaces;

import com.xiaozhuanglt.mitutucute.springboot.model.JsonValueByKeyListRO;

import java.util.List;
import java.util.Map;

/**
 * @author hxz
 * @date  2019/6/16 13:01
 * @Description: json 转换
 */
public interface JsonTranslateService {

  /**
   * @author hxz
   * @date  2019/6/16 13:19
   * @Description: 根据json关键字抽取value值
   * @Param: [inputJson, inputKeyWord]
   * @return {@link List< Map< String, String>>}
   */
  List<JsonValueByKeyListRO> getValueByKey(String inputJson, String inputKeyWord);
}
