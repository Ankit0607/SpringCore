package com.springCore.standalone.collections;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class person {
	private List<String> friends;
	private Map<String, Integer> feestruct ;
	Properties prop;

	public Properties getProp() {
		return prop;
	}

	public void setProp(Properties prop) {
		this.prop = prop;
	}

	public List<String> getFriends() {
		return friends;
	}

	public Map<String, Integer> getFeestruct() {
		return feestruct;
	}

	public void setFeestruct(Map<String, Integer> feestruct) {
		this.feestruct = feestruct;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}

	@Override
	public String toString() {
		return "person [friends=" + friends + ", feestruct=" + feestruct + ", prop=" + prop + "]";
	}

	
}
