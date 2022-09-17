package org.example.data.jpa.service;

import org.example.data.jpa.model.Member;

import java.util.List;
import java.util.Optional;

public interface IMemberService {

    Member findMemberByName(String name);

    List<Member> getAllMembers();

    Optional<Member> findMemberById(Long memberId);
}
