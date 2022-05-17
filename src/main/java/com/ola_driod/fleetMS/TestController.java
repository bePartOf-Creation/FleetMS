package com.ola_driod.fleetMS;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

    @GetMapping("/index")
    public String index() {
        return "/index";
    }

    @GetMapping("/fleet")
    public String vehicleHome() {
        return "/fleet/index";
        
    }@GetMapping("/hr")
    public String hrHome() {
        return "/hr/index";
        
    }@GetMapping("/accounts")
    public String accountHome() {
        return "/account/index";
        
    }@GetMapping("/settings")
    public String settingsHome() {
        return "/settings/index";
        
    }@GetMapping("/payroll")
    public String payrollHome() {
        return "/payroll/index";
    }
    @GetMapping("/helpdesk")
    public String helpdeskHome() {
        return "/helpdesk/index";
    }
    

}
