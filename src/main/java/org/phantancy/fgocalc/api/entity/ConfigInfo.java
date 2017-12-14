package org.phantancy.fgocalc.api.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ConfigInfo {
	
	/**
	 * 版本编号
	 */
	private String version;
	
	/**
	 * 下载地址
	 */
	private String path;
	
	/**
	 * 更新内容
	 */
	private String update;
}