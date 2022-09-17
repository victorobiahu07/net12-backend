package org.example.data.jpa.service;

import org.example.data.jpa.model.*;
import org.springframework.data.repository.Repository;

import java.util.List;

@org.springframework.stereotype.Repository
public interface MemberRepository extends Repository<Member, Long>{

    List<Member> findAll();

    Member findMemberByName(String name);

    Member findMemberById(Long memberId);
}


