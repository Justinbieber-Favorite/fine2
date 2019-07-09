package com.kgc.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kgc.entity.Invitation;
import com.kgc.entity.InvitationExample;
import com.kgc.entity.Replydetail;
import com.kgc.mapper.InvitationMapper;
import com.kgc.mapper.ReplydetailMapper;
import com.kgc.service.InvitationService;
import com.kgc.utils.Check;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvitationServiceImpl implements InvitationService {
    @Autowired
    private InvitationMapper invitationMapper;
    @Autowired
    private ReplydetailMapper replydetailMapper;


    @Override
    public boolean delete(Integer id) {
         return invitationMapper.deleteByPrimaryKey(id)>0?true:false;

    }


    @Override
    public Invitation getInvia(Integer id) {
        Invitation invitation = invitationMapper.selectByPrimaryKey(id);
        if(invitation!=null){
            Replydetail replydetail = replydetailMapper.selectByPrimaryKey(invitation.getId());
            invitation.setReplydetail(replydetail);
        }
        return invitation;
    }

    @Override
    public boolean update(Invitation invitation) {
        return invitationMapper.updateByPrimaryKeySelective(invitation)>0?true:false;
    }

    @Override
    public boolean add(Invitation invitation) {
        return invitationMapper.insertSelective(invitation)>0?true:false;
    }

    @Override
    public PageInfo<Invitation> getBypage(Integer pageNo, Integer pageSize, Check check) {
        InvitationExample example=new InvitationExample();
        InvitationExample.Criteria criteria = example.createCriteria();
        if(check!=null){
            if(check.getTitle()!=null&&!check.getTitle().equals("")){
                criteria.andTitleLike("%"+check.getTitle()+"%");
            }
        }
        PageHelper.startPage(pageNo,pageSize);
        List<Invitation> list = invitationMapper.selectByExample(example);
        if(list!=null&&list.size()>0){
            for(Invitation invitation:list){
                Integer id = invitation.getId();
                Replydetail replydetail = replydetailMapper.selectByPrimaryKey(id);
                invitation.setReplydetail(replydetail);
            }

        }
        PageInfo<Invitation> info=new PageInfo<>(list);
        return info;
    }
}
