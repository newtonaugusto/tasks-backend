package br.ce.wcaquino.taskbackend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value ="/")
public class RootController {

	
	@GetMapping
	public String hello() {
		return "   _______________                        |*\\_/*|________<br>" + //
						"  |  ___________  |     .-.     .-.      ||_/-\\_|______  |<br>" + //
						"  | |           | |    .****. .****.     | |           | |<br>" + //
						"  | |   0   0   | |    .*****.*****.     | |   0   0   | |<br>" + //
						"  | |     -     | |     .*********.      | |     -     | |<br>" + //
						"  | |   \\___/   | |      .*******.       | |   \\___/   | |<br>" + //
						"  | |___     ___| |       .*****.        | |___________| |<br>" + //
						"  |_____|\\_/|_____|        .***.         |_______________|<br>" + //
						"    _|__|/ \\|_|_.............*.............._|________|_<br>" + //
						"   / ********** \\                          / ********** \\<br>" + //
						" /  ************  \\                      /  ************  \\<br>" + //
						"--------------------                    --------------------";
	}
}
