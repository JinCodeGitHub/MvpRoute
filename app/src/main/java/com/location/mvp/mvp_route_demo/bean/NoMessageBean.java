package com.location.mvp.mvp_route_demo.bean;

/**
 * 项目:Mvp_Route_Demo
 *
 * @author：location time：2018/7/12 17:23
 * description：
 */

public class NoMessageBean {
	private String name;
	private int id;

	@Override
	public String toString() {
		return "NoMessageBean{" +
				"name='" + name + '\'' +
				", id=" + id +
				'}';
	}

	public NoMessageBean(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
