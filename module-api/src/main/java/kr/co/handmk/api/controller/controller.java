package kr.co.handmk.api.controller;

import kr.co.handmk.api.service.MemberServiceCustom;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
@Slf4j
public class controller {

    private final MemberServiceCustom memberServiceCustom;

    @GetMapping("/post")
    public void post() {
        memberServiceCustom.signUp();
    }

    @GetMapping("/get")
    public String get(){
        return memberServiceCustom.get();
    }
}
