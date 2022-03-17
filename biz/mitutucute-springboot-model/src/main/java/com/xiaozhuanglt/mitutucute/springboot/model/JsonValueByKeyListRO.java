package com.xiaozhuanglt.mitutucute.springboot.model;

import lombok.Data;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @description: json根据key抽取value 出参
 * @author: hxz
 * @create: 2019-06-16 16:50
 **/
@Data
public class JsonValueByKeyListRO {

  Map<String,String> map;

  public JsonValueByKeyListRO(List<String> keys){
    if(keys != null && !keys.isEmpty() ){
      map = new HashMap<>();
      for (String key : keys){
        map.put(key,null);
      }
    }
  }
}
