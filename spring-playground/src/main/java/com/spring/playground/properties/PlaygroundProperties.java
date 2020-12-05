package com.spring.playground.properties;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource(value = "classpath:playground.properties")
@ConfigurationProperties("app")
public class PlaygroundProperties {
	
	private String name;
	private List<Menu> menu  = new ArrayList<>();

	public String getName() {
		return name;
	}

	
	
	public List<Menu> getMenu() {
		return menu;
	}



	public void setMenu(List<Menu> menu) {
		this.menu = menu;
	}



	public void setName(String name) {
		this.name = name;
	}
	
	public static class Menu{
		
		private Integer id;
		
		private String name;

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
		
		
		
		
	}

}
