package com.wechat.entity.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.jfinal.plugin.activerecord.Model;

/**
 * 
 * Project: wechat-model-entity
 * Title: com.wechat.entity.model.State
 * Description: 状态数据表
 * @author ChenXin
 * @date 2019年8月20日
 *
 */
public class State extends Model<State> {

	/** 
	 * serialVersionUID : TODO(描述此变量)
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * 数据对象
	 */
	public static final State STATE_DAO = new State().dao();
	/**
	 * 状态数据对象
	 */
	private static Map<Integer, Map<Integer, String>> stateMap = new HashMap<>();
	
	/**
	 * 
	 * Ttile: com.wechat.entity.model.State.findAllStateData
	 * Description: 查询数据库内所有状态信息并按照特定的格式保存
	 * @datetime 2019年8月20日上午10:40:46
	 * @return Map<Integer,Map<Integer,String>>
	 */
	public static Map<Integer, Map<Integer, String>> findAllStateData(){
		Map<Integer, Map<Integer, String>> resultMap = new HashMap<Integer, Map<Integer,String>>(16);
		List<State> stateList = STATE_DAO.find("select s1.id,s1.state_msg s1msg,s2.father_id,s2.state_type_code,s2.state_msg s2msg from state s1 join state s2 on s1.id=s2.father_id");
		for(State state : stateList){
			int stateId = state.getInt("id");
			Map<Integer, String> map = null;
			if(resultMap.containsKey(stateId)){
				map = resultMap.get(stateId);
			}else{
				map = new HashMap<>(16);
				map.put(0, state.getStr("s1msg"));
			}
			map.put(state.getInt("state_type_code"), state.getStr("s2msg"));
			resultMap.put(stateId, map);
		}
		setStateMap(resultMap);
		return resultMap;
		
	}

	public static Map<Integer, Map<Integer, String>> getStateMap() {
		if(stateMap.isEmpty()){
			findAllStateData();
		}
		return stateMap;
	}

	public static void setStateMap(Map<Integer, Map<Integer, String>> stateMap) {
		State.stateMap = stateMap;
	}
	
	
}
