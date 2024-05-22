package br.ce.wcaquino.taskbackend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value ="/")
public class RootController {

	
	@GetMapping
	public String hello() {
		return "&nbsp;&nbsp;&nbsp;_______________&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|*\\_/*|________<br>" + //
						"&nbsp;&nbsp;|&nbsp;&nbsp;___________&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;.-.&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;.-.&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;||_/-\\_|______&nbsp;&nbsp;|<br>" + //
						"&nbsp;&nbsp;|&nbsp;|&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|&nbsp;|&nbsp;&nbsp;&nbsp;&nbsp;.****.&nbsp;.****.&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|&nbsp;|&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|&nbsp;|<br>" + //
						"&nbsp;&nbsp;|&nbsp;|&nbsp;&nbsp;&nbsp;0&nbsp;&nbsp;&nbsp;0&nbsp;&nbsp;&nbsp;|&nbsp;|&nbsp;&nbsp;&nbsp;&nbsp;.*****.*****.&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|&nbsp;|&nbsp;&nbsp;&nbsp;0&nbsp;&nbsp;&nbsp;0&nbsp;&nbsp;&nbsp;|&nbsp;|<br>" + //
						"&nbsp;&nbsp;|&nbsp;|&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;-&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|&nbsp;|&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;.*********.&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|&nbsp;|&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;-&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|&nbsp;|<br>" + //
						"&nbsp;&nbsp;|&nbsp;|&nbsp;&nbsp;&nbsp;\\___/&nbsp;&nbsp;&nbsp;|&nbsp;|&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;.*******.&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|&nbsp;|&nbsp;&nbsp;&nbsp;\\___/&nbsp;&nbsp;&nbsp;|&nbsp;|<br>" + //
						"&nbsp;&nbsp;|&nbsp;|___&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;___|&nbsp;|&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;.*****.&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|&nbsp;|___________|&nbsp;|<br>" + //
						"&nbsp;&nbsp;|_____|\\_/|_____|&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;.***.&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|_______________|<br>" + //
						"&nbsp;&nbsp;&nbsp;&nbsp;_|__|/&nbsp;\\|_|_.............*.............._|________|_<br>" + //
						"&nbsp;&nbsp;&nbsp;/&nbsp;**********&nbsp;\\&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;/&nbsp;**********&nbsp;\\<br>" + //
						"&nbsp;/&nbsp;&nbsp;************&nbsp;&nbsp;\\&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;/&nbsp;&nbsp;************&nbsp;&nbsp;\\<br>" + //
						"--------------------&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;--------------------";
	}
}
