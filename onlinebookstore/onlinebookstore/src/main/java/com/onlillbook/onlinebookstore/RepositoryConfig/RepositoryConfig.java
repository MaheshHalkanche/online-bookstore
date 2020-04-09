package com.onlillbook.onlinebookstore.RepositoryConfig;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;

import aj.org.objectweb.asm.Type;

@Configuration
public class RepositoryConfig implements RepositoryRestConfigurer{
	
	@Autowired
	private EntityManager entitymanager;
	
	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
		// TODO Auto-generated method stub
		
		config.exposeIdsFor(entitymanager.getMetamodel().getEntities().stream().map(javax.persistence.metamodel.Type::getJavaType).toArray(Class[]::new));
	}

}
