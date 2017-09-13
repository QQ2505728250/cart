package com.ceshi.dao;

import com.ceshi.bean.Member;
import com.ceshi.bean.MemberExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MemberMapper {
    long countByExample(MemberExample example);

    int deleteByExample(MemberExample example);

    int deleteByPrimaryKey(Integer meId);

    int insert(Member record);

    int insertSelective(Member record);

    List<Member> selectByExample(MemberExample example);
    
    
    List<Member> selectMemWithAll();
    
    

    Member selectByPrimaryKey(Integer meId);
    
    //获取会员的同时也有等级信息
    List<Member> selectByExampleWithLevel(MemberExample example);

    int updateByExampleSelective(@Param("record") Member record, @Param("example") MemberExample example);

    int updateByExample(@Param("record") Member record, @Param("example") MemberExample example);

    int updateByPrimaryKeySelective(Member record);

    int updateByPrimaryKey(Member record);
}