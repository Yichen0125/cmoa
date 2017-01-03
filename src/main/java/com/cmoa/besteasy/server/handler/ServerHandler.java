package com.cmoa.besteasy.server.handler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ServerHandler {

	@RequestMapping("/system/auth")
	public String toAuthUi() {
		return "server/auth";
	}
	@RequestMapping("/system/group")
	public String toGroupUi() {
		return "server/group";
	}
}
