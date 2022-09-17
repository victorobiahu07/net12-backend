package org.example.data.jpa.service;

import org.example.data.jpa.model.Member;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public class MemberService implements IMemberService {

    private MemberRepository memberRepository;


    @Override
    public Member findMemberByName(String name) {
        return null;
    }

    @Override
    public List<Member> getAllMembers() {
        return null;
    }

    @Override
    public Optional<Member> findMemberById(Long memberId) {
        return Optional.empty();
    }
}
