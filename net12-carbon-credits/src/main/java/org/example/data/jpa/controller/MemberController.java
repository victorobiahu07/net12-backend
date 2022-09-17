package org.example.data.jpa.controller;
import org.example.data.jpa.model.Member;
import org.example.data.jpa.service.MemberRepository;
import org.example.data.jpa.service.IMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@ComponentScan("org.example.data.jpa.model")
@EnableJpaRepositories("org.example.data.jpa.service")
public class MemberController {

    @Autowired
    MemberRepository memberRepository;

    @Autowired
    IMemberService IMemberService;

    @Autowired

    @RequestMapping(value = "/members", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<List<Member>> getAllMembers(@RequestParam(required = false) String name)
    {
        try {
            List<Member> members = new ArrayList<>();
            if (name == null)
                memberRepository.findAll().forEach(members::add);
            else {
                Member memberByName = memberRepository.findMemberByName(name);
                members.add(memberByName);
            }
            if (members.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(members, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @RequestMapping(value = "/members/{memberId}", method = RequestMethod.GET)
    public ResponseEntity<Member> getMemberById(@PathVariable("memberId") long memberId){
        Optional<Member> memberData = Optional.ofNullable(memberRepository.findMemberById(memberId));
        if(memberData.isPresent()){
            return new ResponseEntity<>(memberData.get(), HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}
