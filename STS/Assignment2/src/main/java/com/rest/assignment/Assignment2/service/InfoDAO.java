package com.rest.assignment.Assignment2.service;


import java.util.Map;
import java.util.TreeMap;

import com.rest.assignment.Assignment2.model.Information;

public class InfoDAO {
public Map<Integer, Information> getAllInformation()
{ 
	Map<Integer,Information> map=new TreeMap<Integer, Information>();
	map.put(581340, new Information("Karnataka", "Sirsi", "India"));
	map.put(581344, new Information("Karnataka", "Siddapur", "India"));
	map.put(581348, new Information("Karnataka", "Sagara", "India"));
	return map;
	
}
}
