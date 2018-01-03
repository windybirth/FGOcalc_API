package org.phantancy.fgocalc.api.control;

import org.phantancy.fgocalc.api.entity.ConfigInfo;
import org.phantancy.fgocalc.api.entity.Response;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/test")
public class TestController {

    @RequestMapping(method=RequestMethod.GET)
    public Response<ConfigInfo> testGet(@RequestParam(value="name", defaultValue="World") String name) {
    	ConfigInfo configInfo = new ConfigInfo("v1.5.2","http://nj005py.gitee.io/fgocalc/",
        		"This is test message.");
    	Response<ConfigInfo> response = new Response<ConfigInfo>("Success", null, configInfo);
        return response;
    }
    
    @RequestMapping(method=RequestMethod.PUT)
    public Response<ConfigInfo> testPUT(@RequestParam(value="name", defaultValue="World") String name) {
    	ConfigInfo configInfo = new ConfigInfo("v1.5.2","http://nj005py.gitee.io/fgocalc/",
        		"This is response of PUT");
    	Response<ConfigInfo> response = new Response<ConfigInfo>("Success", null, configInfo);
        return response;
    }
}
