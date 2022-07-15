package com.unisys.SpringCoreDemo;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class CollectionsBean {
	List<String> itemsList;
	Set<Integer> intSet;
	Map<Integer, String> myMap;
	Properties myProps;
	
	public List<String> getItemsList() {
		return itemsList;
	}
	
	public void setItemsList(List<String> itemsList) {
		this.itemsList = itemsList;
	}
	
	public Set<Integer> getIntSet() {
		return intSet;
	}
	
	public void setIntSet(Set<Integer> intSet) {
		this.intSet = intSet;
	}
	
	public Map<Integer, String> getMyMap() {
		return myMap;
	}
	
	public void setMyMap(Map<Integer, String> myMap) {
		this.myMap = myMap;
	}
	
	public Properties getMyProps() {
		return myProps;
	}
	
	public void setMyProps(Properties myProps) {
		this.myProps = myProps;
	}

	@Override
	public String toString() {
		return "CollectionsBean [itemsList=" + itemsList + ", intSet=" + intSet + ", myMap=" + myMap + ", myProps="
				+ myProps + "]";
	}
	
	
}
