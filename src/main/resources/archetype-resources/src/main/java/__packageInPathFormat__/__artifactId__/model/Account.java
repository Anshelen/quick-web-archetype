package ${package}.${artifactId}.model;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Account extends AbstractPersistable<Long> {

    private String username;

    private String email;

    private String password;

    private boolean enabled;

    @ManyToMany(cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    private Set<Role> roles = new HashSet<>();

    public String getEmail() {
        return email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public void addRole(Role role) {
        roles.add(role);
        role.getAccounts().add(this);
    }

    public void removeRole(Role role) {
        roles.remove(role);
        role.getAccounts().remove(this);
    }

    public void clearRoles() {
        for (Role role : new ArrayList<>(roles)) {
            removeRole(role);
        }
    }

    public Set<Role> getRoles() {
        return Collections.unmodifiableSet(roles);
    }
}