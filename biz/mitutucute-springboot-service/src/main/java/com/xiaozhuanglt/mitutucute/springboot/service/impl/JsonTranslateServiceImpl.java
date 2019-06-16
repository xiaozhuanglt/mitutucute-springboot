package com.xiaozhuanglt.mitutucute.springboot.service.impl;

import com.xiaozhuanglt.mitutucue.facade.JsonTranslateFacade;
import com.xiaozhuanglt.mitutucute.springboot.model.JsonValueByKeyListRO;
import com.xiaozhuanglt.mitutucute.springboot.service.interfaces.JsonTranslateService;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * @description: json转换类
 * @author: hxz
 * @create: 2019-06-16 13:02
 **/
@Service("jsonTranslateService")
public class JsonTranslateServiceImpl implements JsonTranslateService {

  @Reference(version = "1.0.0")
  JsonTranslateFacade jsonTranslateFacade;


  @Override
  public List<JsonValueByKeyListRO> getValueByKey(String inputJson, String inputKeyWord) {
//    List<Map<String, String>> valueByKey = jsonTranslateFacade.getValueByKey(inputJson, inputKeyWord);

    //根据‘,’将关键字转换为数组
    String[] keyWorld = inputKeyWord.split(",");
    List<String> keyWorldList = Arrays.asList(keyWorld);
    List<JsonValueByKeyListRO> jsonValueByKeyListROS = new ArrayList<>();
    JSONArray jsonArrays = null;
    if (inputJson.substring(0,1) != "["){
      jsonArrays = JSONArray.fromObject("[" + inputJson+ "]");
    }else{
      jsonArrays = JSONArray.fromObject(inputJson);
    }
    translateJSONArray(jsonValueByKeyListROS,jsonArrays,keyWorldList);
    return jsonValueByKeyListROS;
  }

  public void translateJSONArray(List<JsonValueByKeyListRO>jsonValueByKeyListROS, JSONArray jsonArrays, List<String> keyWorldList){
    if (!jsonArrays.isEmpty()){
      for (int i=0; i<jsonArrays.size(); i++){
        //标记空对象
        Boolean status = true;
        JsonValueByKeyListRO jsonValueByKeyListRO = new JsonValueByKeyListRO(keyWorldList);
        jsonValueByKeyListROS.add(jsonValueByKeyListRO);
        JSONObject jsonObject = jsonArrays.getJSONObject(i);
        Iterator<String> iterator = jsonObject.keys();
        while (iterator.hasNext()){
          String key = iterator.next();
          Object o = jsonObject.get(key);
          //内部嵌套，递归解析
          if (o instanceof JSONArray){
            translateJSONArray(jsonValueByKeyListROS,(JSONArray) o,keyWorldList);
          }else {
            if (keyWorldList.contains(key)){
              if (status){
                status = false;
              }
              jsonValueByKeyListRO.getMap().put(key,String.valueOf(o));
            }
          }
        }
        if(status){
          jsonValueByKeyListROS.remove(jsonValueByKeyListRO);
        }
      }
    }
  }
}
