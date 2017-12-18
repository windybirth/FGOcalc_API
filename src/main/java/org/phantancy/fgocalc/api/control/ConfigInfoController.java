package org.phantancy.fgocalc.api.control;

import org.phantancy.fgocalc.api.entity.ConfigInfo;
import org.phantancy.fgocalc.api.entity.Response;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigInfoController {

    @RequestMapping("/configInfo")
    public Response<ConfigInfo> configInfo(@RequestParam(value="name", defaultValue="World") String name) {
    	ConfigInfo configInfo = new ConfigInfo("v1.5.1","http://nj005py.gitee.io/fgocalc/",
        		"1更新数据至195号萝莉；2玄学计算器改欧非检测仪；3加入数据库单独更新功能；4其它优化");
    	Response<ConfigInfo> response = new Response<ConfigInfo>("Success", null, configInfo);
        return response;
    }
    
    @RequestMapping("/test")
    public Response<ConfigInfo> test(@RequestParam(value="name", defaultValue="World") String name) {
    	ConfigInfo configInfo = new ConfigInfo("v1.5.1","http://nj005py.gitee.io/fgocalc/",
        		"1更新数据至195号萝莉；2玄学计算器改欧非检测仪；3加入数据库单独更新功能；4其它优化");
    	Response<ConfigInfo> response = new Response<ConfigInfo>("Success", null, configInfo);
        return response;
    }
}
