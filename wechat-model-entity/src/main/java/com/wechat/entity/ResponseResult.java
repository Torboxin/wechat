package com.wechat.entity;

import net.sf.json.JSONObject;

/**
 * 
 * Project: wechat-model-entity Title: com.wechat.entity.ResponseResult
 * Description: 通用json格式返回值类
 * 
 * @author ChenXin
 * @date 2019年8月20日
 *
 */
public class ResponseResult {

	private Integer code;
	private String message;
	private JSONObject json;
	private Object obj;

	public ResponseResult() {
		super();
	}

	public ResponseResult(Integer code, String message, JSONObject json, Object obj) {
		super();
		this.code = code;
		this.message = message;
		this.json = json;
		this.obj = obj;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public JSONObject getJson() {
		return json;
	}

	public void setJson(JSONObject json) {
		this.json = json;
	}

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((code == null) ? 0 : code.hashCode());
		result = prime * result + ((json == null) ? 0 : json.hashCode());
		result = prime * result + ((message == null) ? 0 : message.hashCode());
		result = prime * result + ((obj == null) ? 0 : obj.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ResponseResult other = (ResponseResult) obj;
		if (code == null) {
			if (other.code != null)
				return false;
		} else if (!code.equals(other.code))
			return false;
		if (json == null) {
			if (other.json != null)
				return false;
		} else if (!json.equals(other.json))
			return false;
		if (message == null) {
			if (other.message != null)
				return false;
		} else if (!message.equals(other.message))
			return false;
		if (this.obj == null) {
			if (other.obj != null)
				return false;
		} else if (!this.obj.equals(other.obj))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ResponseResult [code=" + code + ", message=" + message + ", json=" + json + ", obj=" + obj + "]";
	}

}
