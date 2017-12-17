package org.phantancy.fgocalc.api.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Response<T> {
	
	/**
	 * 状态
	 */
	private String Status;
	
	/**
	 * 信息
	 */
	private String message;
	
	/**
	 * response data
	 */
	private T data;
}