package com.divya.ecommerce.domain;

import java.util.HashSet;
import java.util.Set;

import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="category")
public class Category extends AbstractMongoEntity {
	
	private static final long serialVersionUID = 6647794423778775104L;
	
	@Indexed(unique = true)
	private String name;
	
	private String description;
	
	private Set<ChildCategory> childCategories = new HashSet<ChildCategory>();
	

	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Category(String name, String description, Set<ChildCategory> childCategories) {
		super();
		this.name = name;
		this.description = description;
		this.childCategories = childCategories;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set<ChildCategory> getChildCategories() {
		return childCategories;
	}

	public void setChildCategories(Set<ChildCategory> childCategories) {
		this.childCategories = childCategories;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Category other = (Category) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	

}
