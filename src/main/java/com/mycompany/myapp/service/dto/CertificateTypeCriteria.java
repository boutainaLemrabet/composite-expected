package com.mycompany.myapp.service.dto;

import com.mycompany.myapp.GeneratedByJHipster;
import java.io.Serializable;
import java.util.Objects;
import tech.jhipster.service.Criteria;
import tech.jhipster.service.filter.BooleanFilter;
import tech.jhipster.service.filter.DoubleFilter;
import tech.jhipster.service.filter.Filter;
import tech.jhipster.service.filter.FloatFilter;
import tech.jhipster.service.filter.IntegerFilter;
import tech.jhipster.service.filter.LongFilter;
import tech.jhipster.service.filter.StringFilter;

/**
 * Criteria class for the {@link com.mycompany.myapp.domain.CertificateType} entity. This class is used
 * in {@link com.mycompany.myapp.web.rest.CertificateTypeResource} to receive all the possible filtering options from
 * the Http GET request parameters.
 * For example the following could be a valid request:
 * {@code /certificate-types?id.greaterThan=5&attr1.contains=something&attr2.specified=false}
 * As Spring is unable to properly convert the types, unless specific {@link Filter} class are used, we need to use
 * fix type specific filters.
 */
@GeneratedByJHipster
public class CertificateTypeCriteria implements Serializable, Criteria {

    private static final long serialVersionUID = 1L;

    private LongFilter id;

    private StringFilter name;

    private LongFilter employeeSkillCertificateId;

    public CertificateTypeCriteria() {}

    public CertificateTypeCriteria(CertificateTypeCriteria other) {
        this.id = other.id == null ? null : other.id.copy();
        this.name = other.name == null ? null : other.name.copy();
        this.employeeSkillCertificateId = other.employeeSkillCertificateId == null ? null : other.employeeSkillCertificateId.copy();
    }

    @Override
    public CertificateTypeCriteria copy() {
        return new CertificateTypeCriteria(this);
    }

    public LongFilter getId() {
        return id;
    }

    public void setId(LongFilter id) {
        this.id = id;
    }

    public StringFilter getName() {
        return name;
    }

    public void setName(StringFilter name) {
        this.name = name;
    }

    public LongFilter getEmployeeSkillCertificateId() {
        return employeeSkillCertificateId;
    }

    public void setEmployeeSkillCertificateId(LongFilter employeeSkillCertificateId) {
        this.employeeSkillCertificateId = employeeSkillCertificateId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        final CertificateTypeCriteria that = (CertificateTypeCriteria) o;
        return (
            Objects.equals(id, that.id) &&
            Objects.equals(name, that.name) &&
            Objects.equals(employeeSkillCertificateId, that.employeeSkillCertificateId)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, employeeSkillCertificateId);
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "CertificateTypeCriteria{" +
                (id != null ? "id=" + id + ", " : "") +
                (name != null ? "name=" + name + ", " : "") +
                (employeeSkillCertificateId != null ? "employeeSkillCertificateId=" + employeeSkillCertificateId + ", " : "") +
            "}";
    }
}
