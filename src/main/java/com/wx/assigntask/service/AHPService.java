package com.wx.assigntask.service;

import com.wx.assigntask.comment.ItemList;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Repository
public interface AHPService {
    List<ItemList> CreatTask();
}
