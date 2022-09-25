package com.example.demo.controller;

import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.SyainDto;
import com.example.demo.repository.SyainRepository;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class SyainController {
	private final SyainRepository syainRepository;

	@GetMapping("/syain")
	public String write1(Model model) {
		List<SyainDto> list = syainRepository.getAll();
		model.addAttribute("SyainList", list);
		return "syain";
	}
}