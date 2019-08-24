package com.wechat.entity;

import java.util.List;

import com.jfinal.plugin.activerecord.Record;

/**
 * 
 * Project: wechat-model-entity Title: com.wechat.entity.GridData Description:
 * layui数据表格的返回值类
 * 
 * @author ChenXin
 * @date 2019年8月20日
 *
 */
public class GridData {

	private Integer code;
	private String message;
	private Integer count;
	private List<Record> list;

	public GridData() {
		super();
	}

	public GridData(Integer code, String message, Integer count, List<Record> list) {
		super();
		this.code = code;
		this.message = message;
		this.count = count;
		this.list = list;
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

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public List<Record> getList() {
		return list;
	}

	public void setList(List<Record> list) {
		this.list = list;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((code == null) ? 0 : code.hashCode());
		result = prime * result + ((count == null) ? 0 : count.hashCode());
		result = prime * result + ((list == null) ? 0 : list.hashCode());
		result = prime * result + ((message == null) ? 0 : message.hashCode());
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
		GridData other = (GridData) obj;
		if (code == null) {
			if (other.code != null)
				return false;
		} else if (!code.equals(other.code))
			return false;
		if (count == null) {
			if (other.count != null)
				return false;
		} else if (!count.equals(other.count))
			return false;
		if (list == null) {
			if (other.list != null)
				return false;
		} else if (!list.equals(other.list))
			return false;
		if (message == null) {
			if (other.message != null)
				return false;
		} else if (!message.equals(other.message))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "GridData [code=" + code + ", message=" + message + ", count=" + count + ", list=" + list + "]";
	}

}
