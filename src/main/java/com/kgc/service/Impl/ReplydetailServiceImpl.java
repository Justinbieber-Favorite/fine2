package com.kgc.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kgc.entity.Invitation;
import com.kgc.entity.Replydetail;
import com.kgc.entity.ReplydetailExample;
import com.kgc.mapper.InvitationMapper;
import com.kgc.mapper.ReplydetailMapper;
import com.kgc.service.ReplydetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class  ReplydetailServiceImpl implements ReplydetailService {

    @Autowired
    private ReplydetailMapper replydetailMapper;
    @Autowired
    private InvitationMapper invitationMapper;


    @Override
    public PageInfo<Replydetail> getListredail(Integer pageNo, Integer pageSize) {

        ReplydetailExample exampl=new ReplydetailExample();
        PageHelper.startPage(pageNo,pageSize);
        List<Replydetail> list = replydetailMapper.selectByExample(exampl);
        PageInfo<Replydetail> info=new PageInfo<>(list);
        return info;

    }

    @Override
    public boolean readd(Replydetail replydetail) {
        return replydetailMapper.insertSelective(replydetail)>0?true:false;
    }

    @Override
    public Replydetail getbyid(Integer invid) {
        Replydetail replydetail = replydetailMapper.selectByPrimaryKey(invid);
        if(replydetail!=null){
            Invitation invitation = invitationMapper.selectByPrimaryKey(replydetail.getInvid());
            replydetail.setInvitation(invitation);
        }

        return replydetail;
    }

}
