package org.example.data.jpa.service;

import org.example.data.jpa.controller.MemberController;
import org.example.data.jpa.model.Member;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import java.util.List;
import java.util.logging.Logger;

@Component(value = "memberService")
@Transactional
public class MemberServiceImpl {

    private final MemberRepository memberRepository;

    @Autowired
    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public Member findMemberByName(String name){
        Assert.hasLength(name, "Name must not be empty");
        return this.memberRepository.findMemberByName(name);
    }

    public Member findMemberById(Long memberId){
        return memberRepository.findMemberById(memberId);
    }

    public List<Member> getAllMembers(){
        return (List<Member>) memberRepository.findAll();
    }

}
