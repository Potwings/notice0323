package org.judy.time.controller;

import org.judy.time.service.TimeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/time")
@Log4j
@RequiredArgsConstructor
public class TimeController {
	
	private final TimeService timeService;
	
	@GetMapping("/now")
	public void getTime(Model model) {
		log.info("TimeController now............");
		log.info(timeService);
		model.addAttribute("time", timeService.getTime());
	}

}
