package com.wx.assigntask.controller;

import com.alibaba.fastjson.JSONObject;
import com.wx.assigntask.entity.Myreceive;
import com.wx.assigntask.entity.Release;
import com.wx.assigntask.entity.Userreceive;
import com.wx.assigntask.service.MyReceiveService;
import com.wx.assigntask.service.ReleaseService;
import com.wx.assigntask.service.UserReceiveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author:wx
 * @Date:Created in 17:03 2019/2/24
 * @Modified by:
 */
@Controller
public class MyReceiveController {
    @Autowired
    MyReceiveService myReceiveService;
    @Autowired
    ReleaseService releaseService;


    @GetMapping("/my_receive")
    @ResponseBody //此注解不能省略，否则Ajax不能接收返回值
    public Map myReceive(int userid, String optionText){

        List<Myreceive> myreceives ;

        if (!optionText.isEmpty()){
            myreceives = myReceiveService.selectIfcomByUser(userid,optionText);

        }else{
            myreceives = myReceiveService.selectByUser(userid);
        }
        List<Release> releases = new ArrayList<>();
        for (int i=0;i<myreceives.size();i++){
            Myreceive myreceive = myreceives.get(i);
            Release release = releaseService.selectById(myreceive.getReleaseid());
            releases.add(release);
        }
//        JSONObject jsonObject = new JSONObject();
//        jsonObject.put("releases:",releases);
       // jsonObject.put("myreceives:",myreceives);
        Map map = new HashMap<String,List>();
        map.put("releases",releases);
        map.put("myreceives",myreceives);

        return map;
    }
}
