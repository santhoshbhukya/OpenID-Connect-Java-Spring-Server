/**
 * 
 */
package org.mitre.oauth2.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * @author jricher
 *
 */
@Entity
@Table(name = "system_scope")
@NamedQueries({
	@NamedQuery(name = "SystemScope.findAll", query = "select s from SystemScope s ORDER BY s.id"),
	@NamedQuery(name = "SystemScope.getByValue", query = "select s from SystemScope s WHERE s.value = :value")
})
public class SystemScope {

	private Long id;
	private String value; // scope value
	private String description; // human-readable description
	private String icon; // class of the icon to display on the auth page	
	private boolean allowDynReg = false; // can a dynamically registered client ask for this scope?
	private boolean defaultScope = false; // is this a default scope for newly-registered clients?

	/**
	 * Make a blank system scope with no value
	 */
	public SystemScope() {
		
	}
	
	/**
	 * Make a system scope with the given scope value
	 * @param value
	 */
    public SystemScope(String value) {
    	this.value = value;
    }
	/**
	 * @return the id
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the value
	 */
	@Basic
	@Column(name = "scope")
	public String getValue() {
		return value;
	}
	/**
	 * @param value the value to set
	 */
	public void setValue(String value) {
		this.value = value;
	}
	/**
	 * @return the description
	 */
	@Basic
	@Column(name = "description")
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the icon
	 */
	@Basic
	@Column(name = "icon")
	public String getIcon() {
		return icon;
	}
	/**
	 * @param icon the icon to set
	 */
	public void setIcon(String icon) {
		this.icon = icon;
	}
	/**
	 * @return the allowDynReg
	 */
	@Basic
	@Column(name = "allow_dyn_reg")
	public boolean isAllowDynReg() {
		return allowDynReg;
	}
	/**
	 * @param allowDynReg the allowDynReg to set
	 */
	public void setAllowDynReg(boolean allowDynReg) {
		this.allowDynReg = allowDynReg;
	}
	
	/**
	 * @return the defaultScope
	 */
	@Basic
	@Column(name = "default_scope")
	public boolean isDefaultScope() {
		return defaultScope;
	}
	/**
	 * @param defaultScope the defaultScope to set
	 */
	public void setDefaultScope(boolean defaultScope) {
		this.defaultScope = defaultScope;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
    @Override
    public int hashCode() {
	    final int prime = 31;
	    int result = 1;
	    result = prime * result + (allowDynReg ? 1231 : 1237);
	    result = prime * result + (defaultScope ? 1231 : 1237);
	    result = prime * result + ((description == null) ? 0 : description.hashCode());
	    result = prime * result + ((icon == null) ? 0 : icon.hashCode());
	    result = prime * result + ((id == null) ? 0 : id.hashCode());
	    result = prime * result + ((value == null) ? 0 : value.hashCode());
	    return result;
    }

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
    @Override
    public boolean equals(Object obj) {
	    if (this == obj) {
		    return true;
	    }
	    if (obj == null) {
		    return false;
	    }
	    if (getClass() != obj.getClass()) {
		    return false;
	    }
	    SystemScope other = (SystemScope) obj;
	    if (allowDynReg != other.allowDynReg) {
		    return false;
	    }
	    if (defaultScope != other.defaultScope) {
		    return false;
	    }
	    if (description == null) {
		    if (other.description != null) {
			    return false;
		    }
	    } else if (!description.equals(other.description)) {
		    return false;
	    }
	    if (icon == null) {
		    if (other.icon != null) {
			    return false;
		    }
	    } else if (!icon.equals(other.icon)) {
		    return false;
	    }
	    if (id == null) {
		    if (other.id != null) {
			    return false;
		    }
	    } else if (!id.equals(other.id)) {
		    return false;
	    }
	    if (value == null) {
		    if (other.value != null) {
			    return false;
		    }
	    } else if (!value.equals(other.value)) {
		    return false;
	    }
	    return true;
    }

	
	
}