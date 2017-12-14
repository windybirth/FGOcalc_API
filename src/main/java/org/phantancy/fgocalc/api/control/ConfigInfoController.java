package org.phantancy.fgocalc.api.control;

import org.phantancy.fgocalc.api.entity.ConfigInfo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigInfoController {

    @RequestMapping("/configInfo")
    public ConfigInfo greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new ConfigInfo("v1.5.1","http://nj005py.gitee.io/fgocalc/",
        		"1更新数据至195号萝莉；2玄学计算器改欧非检测仪；3加入数据库单独更新功能；4其它优化");
    }
}
