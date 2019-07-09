package com.kgc.service;

import com.github.pagehelper.PageInfo;
import com.kgc.entity.Replydetail;


public interface ReplydetailService {
    PageInfo<Replydetail> getListredail(Integer pageNo, Integer pageSize);
    boolean readd(Replydetail replydetail);
    Replydetail getbyid(Integer invid);
}
