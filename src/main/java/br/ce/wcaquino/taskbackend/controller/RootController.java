package br.ce.wcaquino.taskbackend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value ="/")
public class RootController {

	
	@GetMapping
	public String hello() {
		return "   _______________                        |*\\_/*|________\n" + //
						"  |  ___________  |     .-.     .-.      ||_/-\\_|______  |\n" + //
						"  | |           | |    .****. .****.     | |           | |\n" + //
						"  | |   0   0   | |    .*****.*****.     | |   0   0   | |\n" + //
						"  | |     -     | |     .*********.      | |     -     | |\n" + //
						"  | |   \\___/   | |      .*******.       | |   \\___/   | |\n" + //
						"  | |___     ___| |       .*****.        | |___________| |\n" + //
						"  |_____|\\_/|_____|        .***.         |_______________|\n" + //
						"    _|__|/ \\|_|_.............*.............._|________|_\n" + //
						"   / ********** \\                          / ********** \\\n" + //
						" /  ************  \\                      /  ************  \\\n" + //
						"--------------------                    --------------------";
	}
}
