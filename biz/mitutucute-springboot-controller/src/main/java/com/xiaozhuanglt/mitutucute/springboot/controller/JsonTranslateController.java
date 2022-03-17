package com.xiaozhuanglt.mitutucute.springboot.controller;

import com.xiaozhuanglt.mitutucute.springboot.model.JsonValueByKeyListRO;
import com.xiaozhuanglt.mitutucute.springboot.service.interfaces.JsonTranslateService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @description: json转换
 * @author: hxz
 * @create: 2019-06-15 16:58
 **/
@RestController
@RequestMapping("/JsonTranslate")
public class JsonTranslateController {

  @Autowired
  JsonTranslateService jsonTranslateService;

  @PostMapping("/getValueByKey")
  List<JsonValueByKeyListRO> getValueByKey(String inputJson, String inputKeyWord){
    try {
      if(StringUtils.isBlank(inputJson) || StringUtils.isBlank(inputKeyWord)){
        return null;
      }
//      局部跨域
//      response.setHeader("Access-Control-Allow-Origin","*");
      List<JsonValueByKeyListRO> valueByKey = jsonTranslateService.getValueByKey(inputJson, inputKeyWord);
      return valueByKey;
    }catch (Exception e){
       e.printStackTrace();
       return null;
    }
  }
}
