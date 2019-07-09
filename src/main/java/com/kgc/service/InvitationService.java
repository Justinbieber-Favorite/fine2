package com.kgc.service;

import com.github.pagehelper.PageInfo;
import com.kgc.entity.Invitation;
import com.kgc.utils.Check;

public interface InvitationService {
boolean delete(Integer id);
    Invitation getInvia(Integer id);
    boolean update(Invitation invitation);
    boolean add(Invitation invitation);
    PageInfo<Invitation> getBypage(Integer pageNo, Integer pageSize, Check check);


}
