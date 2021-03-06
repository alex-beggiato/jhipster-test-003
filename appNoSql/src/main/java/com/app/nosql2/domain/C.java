package com.app.nosql2.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import javax.persistence.*;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.Type;

/**
 * A C.
 */
@Entity
@Table(name = "c")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class C implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Type(type = "uuid-char")
    @Column(name = "uid", length = 36)
    private UUID uid;

    @Column(name = "ent_cc_ccod")
    private String entCCCcod;

    @Column(name = "ent_cc_cdsc")
    private String entCCCdsc;

    @OneToMany(mappedBy = "entCCCuid")
    @Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
    @JsonIgnoreProperties(value = { "entCCCuid" }, allowSetters = true)
    private Set<E> uids = new HashSet<>();

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public Long getId() {
        return this.id;
    }

    public C id(Long id) {
        this.setId(id);
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public UUID getUid() {
        return this.uid;
    }

    public C uid(UUID uid) {
        this.setUid(uid);
        return this;
    }

    public void setUid(UUID uid) {
        this.uid = uid;
    }

    public String getEntCCCcod() {
        return this.entCCCcod;
    }

    public C entCCCcod(String entCCCcod) {
        this.setEntCCCcod(entCCCcod);
        return this;
    }

    public void setEntCCCcod(String entCCCcod) {
        this.entCCCcod = entCCCcod;
    }

    public String getEntCCCdsc() {
        return this.entCCCdsc;
    }

    public C entCCCdsc(String entCCCdsc) {
        this.setEntCCCdsc(entCCCdsc);
        return this;
    }

    public void setEntCCCdsc(String entCCCdsc) {
        this.entCCCdsc = entCCCdsc;
    }

    public Set<E> getUids() {
        return this.uids;
    }

    public void setUids(Set<E> es) {
        if (this.uids != null) {
            this.uids.forEach(i -> i.setEntCCCuid(null));
        }
        if (es != null) {
            es.forEach(i -> i.setEntCCCuid(this));
        }
        this.uids = es;
    }

    public C uids(Set<E> es) {
        this.setUids(es);
        return this;
    }

    public C addUid(E e) {
        this.uids.add(e);
        e.setEntCCCuid(this);
        return this;
    }

    public C removeUid(E e) {
        this.uids.remove(e);
        e.setEntCCCuid(null);
        return this;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof C)) {
            return false;
        }
        return id != null && id.equals(((C) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "C{" +
            "id=" + getId() +
            ", uid='" + getUid() + "'" +
            ", entCCCcod='" + getEntCCCcod() + "'" +
            ", entCCCdsc='" + getEntCCCdsc() + "'" +
            "}";
    }
}
