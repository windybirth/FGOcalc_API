package org.phantancy.fgocalc.api.control;

import org.phantancy.fgocalc.api.entity.ConfigInfo;
import org.phantancy.fgocalc.api.entity.Response;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/configInfo")
public class ConfigInfoController {

	private static ConfigInfo configInfo = new ConfigInfo("v1.5.2","http://nj005py.gitee.io/fgocalc/",
    		"1更新数据至198号萝莉；2修改宝具计算器错误；3简化载入外置数据库操作；4buff设置增加梅天狸快捷buff");
	
	private static final String UPDATER_TOKEN = "caojieshiSB";
	
    @RequestMapping(method=RequestMethod.GET)
    public Response<ConfigInfo> configInfoGet() {
    	Response<ConfigInfo> response = new Response<ConfigInfo>("Success", null, configInfo);
        return response;
    }
    
    @RequestMapping(method=RequestMethod.PUT)
    public Response<ConfigInfo> configInfoPut(@RequestParam(value="token") String token,
    		@RequestBody ConfigInfo requestConfigInfo) {
    	if (token != null && UPDATER_TOKEN.equals(token)) {
    		configInfo = requestConfigInfo;
    		Response<ConfigInfo> response = new Response<ConfigInfo>("Success", null, configInfo);
    		return response;
		} else {
			Response<ConfigInfo> response = new Response<ConfigInfo>("Identification Error", null, configInfo);
    		return response; 
		}
    }
}
