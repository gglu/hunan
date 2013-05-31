/**
 * 
 */
package com.soft.hunan.injury.helper;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * @author liwencheng
 *
 */
public class PageHelper<T> implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5991610889859949063L;

	private int pageSize = 10;

	private int pageNum = 1;
	
	private int startNum = 1;//起始页
	
	private long count = 0;
	
	private String path;//当前访问路径

	public transient List<T> data;

	private Map<String, Serializable> params = new LinkedHashMap<String, Serializable>();// 查询条件

	public long getPageCount() {

		if (count % pageSize == 0)
			return count / pageSize;

		return count / pageSize + 1;

	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getPageNum() {
		return pageNum;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

	public int getStartNum() {
		return startNum;
	}

	public void setStartNum(int startNum) {
		this.startNum = startNum;
	}

	public List<T> getData() {
		return data;
	}

	public void setData(List<T> data) {
		this.data = data;
	}

	public long getCount() {
		return count;
	}

	public void setCount(long size) {
		this.count = size;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public Map<String, Serializable> getParams() {
		return params;
	}

	public void setParams(Map<String, Serializable> params) {
		this.params = params;
	}
	
	public long getLastStart(){
		return getPageCount()/7*7+1;
	}
	
	
	public String getReqparams(){
		if(params.isEmpty())
			return null;
		
		StringBuilder sb = new StringBuilder();
		for(Map.Entry<String, Serializable> entry :  params.entrySet()){
			sb.append("&").append(entry.getKey()).append("=").append(entry.getValue());
		}
		return sb.substring(1);
	}

	public int getOffset() {
		// TODO Auto-generated method stub
		return (pageNum - 1) * pageSize;
	}

	public int getLimit() {
		return pageNum * pageSize;
	}

	public boolean hasOffset() {
		return pageNum > 1;
	}
	
	//控制 分页栏 前一页样式，
	public boolean isForward(){
		return startNum > 1;
	}
	
	//控制 分页栏 下一页 样式，
	public boolean isNext(){
		return (startNum+6) < getPageCount();
	}
	
	public List<Integer> getPages(){
		List<Integer> ps = new ArrayList<Integer>();
		for(int i=0;i<7;i++){
			int p = startNum+i;
			if(p<=getPageCount()){
				ps.add(p);
			}
			
		}
		return ps;
	}


	
	
}
