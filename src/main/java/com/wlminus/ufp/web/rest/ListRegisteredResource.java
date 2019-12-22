package com.wlminus.ufp.web.rest;

import com.wlminus.ufp.domain.RegisterModel;
import com.wlminus.ufp.repository.RegisterModelRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ListRegisteredResource {
    private RegisterModelRepository registerModelRepository;

    public ListRegisteredResource(RegisterModelRepository registerModelRepository) {
        this.registerModelRepository = registerModelRepository;
    }

    @GetMapping("/registered")
    public List<RegisterModel> getRegistered(@RequestParam(value = "studentCode") String studentCode) {
        return registerModelRepository.findByStudentCode(studentCode);
    }
}
