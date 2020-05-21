package com.luv2code.ecommerce.config;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.metamodel.EntityType;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.http.HttpMethod;

import com.luv2code.ecommerce.entity.Product;
import com.luv2code.ecommerce.entity.ProductCategory;

import lombok.AllArgsConstructor;

@Configuration
@AllArgsConstructor
public class ProjectConfig implements RepositoryRestConfigurer{

	private EntityManager entityManager;
	
	
	
	@Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {

		exposeId(config);
        HttpMethod[] theUnsupportedActions = {HttpMethod.PUT, HttpMethod.POST, HttpMethod.DELETE, HttpMethod.PATCH};

        // disable HTTP methods for Product: PUT, POST, DELETE and PATCH
        config.getExposureConfiguration()
                .forDomainType(Product.class)
                .withItemExposure((metdata, httpMethods) -> httpMethods.disable(theUnsupportedActions))
                .withCollectionExposure((metdata, httpMethods) -> httpMethods.disable(theUnsupportedActions));

        // disable HTTP methods for ProductCategory: PUT, POST, DELETE and PATCH
        config.getExposureConfiguration()
                .forDomainType(ProductCategory.class)
                .withItemExposure((metdata, httpMethods) -> httpMethods.disable(theUnsupportedActions))
                .withCollectionExposure((metdata, httpMethods) -> httpMethods.disable(theUnsupportedActions));

    }
	private void exposeId(RepositoryRestConfiguration config)
	{
		Set<EntityType<?>> entities = entityManager.getMetamodel().getEntities();
		List<Class> entity=new ArrayList<Class>();
		for(EntityType temp:entities) {
			entity.add(temp.getJavaType());
		}
		Class[] domains= entity.toArray(new Class[0]);
		config.exposeIdsFor(domains);
	}
	
	
	
}
