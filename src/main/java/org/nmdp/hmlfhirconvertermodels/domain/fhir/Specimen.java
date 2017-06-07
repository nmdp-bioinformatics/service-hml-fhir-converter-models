package org.nmdp.hmlfhirconvertermodels.domain.fhir;

import org.apache.commons.lang3.StringUtils;

import java.util.Date;

/**
 * Created by Andrew S. Brown, Ph.D., <andrew@nmdp.org>, on 5/26/17.
 * <p>
 * service-hml-fhir-converter-models
 * Copyright (c) 2012-2017 National Marrow Donor Program (NMDP)
 * <p>
 * This library is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as published
 * by the Free Software Foundation; either version 3 of the License, or (at
 * your option) any later version.
 * <p>
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; with out even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public
 * License for more details.
 * <p>
 * You should have received a copy of the GNU Lesser General Public License
 * along with this library;  if not, write to the Free Software Foundation,
 * Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307  USA.
 * <p>
 * > http://www.fsf.org/licensing/licenses/lgpl.html
 * > http://www.opensource.org/licenses/lgpl-license.php
 */

import java.io.Serializable;

public class Specimen implements Serializable {
    private Identifier identifier;
    private Collection collection;
    private String accessionIdentifier;
    private Enum<Status> status;
    private Date receivedTime;
    private Specimen parent;
    private Request request;
    private String note;
    private Type type;

    public Identifier getIdentifier() {
        return identifier;
    }

    public void setIdentifier(Identifier identifier) {
        this.identifier = identifier;
    }

    public Collection getCollection() {
        return collection;
    }

    public void setCollection(Collection collection) {
        this.collection = collection;
    }

    public String getAccessionIdentifier() {
        return accessionIdentifier;
    }

    public void setAccessionIdentifier(String accessionIdentifier) {
        this.accessionIdentifier = accessionIdentifier;
    }

    public Enum<Status> getStatus() {
        return status;
    }

    public void setStatus(Enum<Status> status) {
        this.status = status;
    }

    public Date getReceivedTime() {
        return receivedTime;
    }

    public void setReceivedTime(Date receivedTime) {
        this.receivedTime = receivedTime;
    }

    public Specimen getParent() {
        return parent;
    }

    public void setParent(Specimen parent) {
        this.parent = parent;
    }

    public Request getRequest() {
        return request;
    }

    public void setRequest(Request request) {
        this.request = request;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Specimen)) return false;

        Specimen specimen = (Specimen) o;

        if (getIdentifier() != null ? !getIdentifier().equals(specimen.getIdentifier()) : specimen.getIdentifier() != null)
            return false;
        if (getCollection() != null ? !getCollection().equals(specimen.getCollection()) : specimen.getCollection() != null)
            return false;
        if (getAccessionIdentifier() != null ? !getAccessionIdentifier().equals(specimen.getAccessionIdentifier()) : specimen.getAccessionIdentifier() != null)
            return false;
        if (getStatus() != null ? !getStatus().equals(specimen.getStatus()) : specimen.getStatus() != null)
            return false;
        if (getReceivedTime() != null ? !getReceivedTime().equals(specimen.getReceivedTime()) : specimen.getReceivedTime() != null)
            return false;
        if (getParent() != null ? !getParent().equals(specimen.getParent()) : specimen.getParent() != null)
            return false;
        if (getRequest() != null ? !getRequest().equals(specimen.getRequest()) : specimen.getRequest() != null)
            return false;
        if (getNote() != null ? !getNote().equals(specimen.getNote()) : specimen.getNote() != null) return false;
        return getType() != null ? getType().equals(specimen.getType()) : specimen.getType() == null;
    }

    @Override
    public int hashCode() {
        int result = getIdentifier() != null ? getIdentifier().hashCode() : 0;
        result = 31 * result + (getCollection() != null ? getCollection().hashCode() : 0);
        result = 31 * result + (getAccessionIdentifier() != null ? getAccessionIdentifier().hashCode() : 0);
        result = 31 * result + (getStatus() != null ? getStatus().hashCode() : 0);
        result = 31 * result + (getReceivedTime() != null ? getReceivedTime().hashCode() : 0);
        result = 31 * result + (getParent() != null ? getParent().hashCode() : 0);
        result = 31 * result + (getRequest() != null ? getRequest().hashCode() : 0);
        result = 31 * result + (getNote() != null ? getNote().hashCode() : 0);
        result = 31 * result + (getType() != null ? getType().hashCode() : 0);
        return result;
    }

    public Boolean hasValue() {
        Boolean hasValue = false;

        if (getIdentifier() != null && getIdentifier().hasValue()) { hasValue = true; }
        if (getCollection() != null && getCollection().hasValue()) { hasValue = true; }
        if (!StringUtils.isBlank(getAccessionIdentifier())) { hasValue = true; }
        if (getStatus() != null) { hasValue = true; }
        if (getReceivedTime() != null) { hasValue = true; }
        if (getParent() != null && getParent().hasValue()) { hasValue = true; }
        if (getReceivedTime() != null) { hasValue = true; }
        if (!StringUtils.isBlank(getNote())) { hasValue = true; }
        if (getType() != null && getType().hasValue()) { hasValue = true; }

        return hasValue;
    }
}
