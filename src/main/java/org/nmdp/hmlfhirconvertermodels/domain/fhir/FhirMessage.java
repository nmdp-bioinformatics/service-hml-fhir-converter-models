package org.nmdp.hmlfhirconvertermodels.domain.fhir;

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

import org.nmdp.hmlfhirconvertermodels.domain.fhir.lists.*;

import java.io.Serializable;

public class FhirMessage implements Serializable {
    private AlleleDatabases alleleDatabases;
    private AlleleNames alleleNames;
    private DiagnosticReport diagnosticReport;
    private GeneticsPhaseSets geneticsPhaseSets;
    private GenotypingResultsHaploids genotypingResultsHaploids;
    private GenotypingResultsMethods genotypingResultsMethods;
    private Glstrings glstrings;
    private Haploids haploids;
    private Observations observations;
    private Organization organization;
    private Patient patient;
    private SbtNgss sbtNgss;
    private Sequences sequences;
    private Specimens specimens;
    private Ssos ssos;
    private Ssps ssps;

    public AlleleDatabases getAlleleDatabases() {
        return alleleDatabases;
    }

    public void setAlleleDatabases(AlleleDatabases alleleDatabases) {
        this.alleleDatabases = alleleDatabases;
    }

    public AlleleNames getAlleleNames() {
        return alleleNames;
    }

    public void setAlleleNames(AlleleNames alleleNames) {
        this.alleleNames = alleleNames;
    }

    public DiagnosticReport getDiagnosticReport() {
        return diagnosticReport;
    }

    public void setDiagnosticReport(DiagnosticReport diagnosticReport) {
        this.diagnosticReport = diagnosticReport;
    }

    public GeneticsPhaseSets getGeneticsPhaseSets() {
        return geneticsPhaseSets;
    }

    public void setGeneticsPhaseSets(GeneticsPhaseSets geneticsPhaseSets) {
        this.geneticsPhaseSets = geneticsPhaseSets;
    }

    public GenotypingResultsHaploids getGenotypingResultsHaploids() {
        return genotypingResultsHaploids;
    }

    public void setGenotypingResultsHaploids(GenotypingResultsHaploids genotypingResultsHaploids) {
        this.genotypingResultsHaploids = genotypingResultsHaploids;
    }

    public GenotypingResultsMethods getGenotypingResultsMethods() {
        return genotypingResultsMethods;
    }

    public void setGenotypingResultsMethods(GenotypingResultsMethods genotypingResultsMethods) {
        this.genotypingResultsMethods = genotypingResultsMethods;
    }

    public Glstrings getGlstrings() {
        return glstrings;
    }

    public void setGlstrings(Glstrings glstrings) {
        this.glstrings = glstrings;
    }

    public Haploids getHaploids() {
        return haploids;
    }

    public void setHaploids(Haploids haploids) {
        this.haploids = haploids;
    }

    public Observations getObservations() {
        return observations;
    }

    public void setObservations(Observations observations) {
        this.observations = observations;
    }

    public Organization getOrganization() {
        return organization;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public SbtNgss getSbtNgss() {
        return sbtNgss;
    }

    public void setSbtNgss(SbtNgss sbtNgss) {
        this.sbtNgss = sbtNgss;
    }

    public Sequences getSequences() {
        return sequences;
    }

    public void setSequences(Sequences sequences) {
        this.sequences = sequences;
    }

    public Specimens getSpecimens() {
        return specimens;
    }

    public void setSpecimens(Specimens specimens) {
        this.specimens = specimens;
    }

    public Ssos getSsos() {
        return ssos;
    }

    public void setSsos(Ssos ssos) {
        this.ssos = ssos;
    }

    public Ssps getSsps() {
        return ssps;
    }

    public void setSsps(Ssps ssps) {
        this.ssps = ssps;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FhirMessage)) return false;

        FhirMessage that = (FhirMessage) o;

        if (getAlleleDatabases() != null ? !getAlleleDatabases().equals(that.getAlleleDatabases()) : that.getAlleleDatabases() != null)
            return false;
        if (getAlleleNames() != null ? !getAlleleNames().equals(that.getAlleleNames()) : that.getAlleleNames() != null)
            return false;
        if (getDiagnosticReport() != null ? !getDiagnosticReport().equals(that.getDiagnosticReport()) : that.getDiagnosticReport() != null)
            return false;
        if (getGeneticsPhaseSets() != null ? !getGeneticsPhaseSets().equals(that.getGeneticsPhaseSets()) : that.getGeneticsPhaseSets() != null)
            return false;
        if (getGenotypingResultsHaploids() != null ? !getGenotypingResultsHaploids().equals(that.getGenotypingResultsHaploids()) : that.getGenotypingResultsHaploids() != null)
            return false;
        if (getGenotypingResultsMethods() != null ? !getGenotypingResultsMethods().equals(that.getGenotypingResultsMethods()) : that.getGenotypingResultsMethods() != null)
            return false;
        if (getGlstrings() != null ? !getGlstrings().equals(that.getGlstrings()) : that.getGlstrings() != null)
            return false;
        if (getHaploids() != null ? !getHaploids().equals(that.getHaploids()) : that.getHaploids() != null)
            return false;
        if (getObservations() != null ? !getObservations().equals(that.getObservations()) : that.getObservations() != null)
            return false;
        if (getOrganization() != null ? !getOrganization().equals(that.getOrganization()) : that.getOrganization() != null)
            return false;
        if (getPatient() != null ? !getPatient().equals(that.getPatient()) : that.getPatient() != null) return false;
        if (getSbtNgss() != null ? !getSbtNgss().equals(that.getSbtNgss()) : that.getSbtNgss() != null) return false;
        if (getSequences() != null ? !getSequences().equals(that.getSequences()) : that.getSequences() != null)
            return false;
        if (getSpecimens() != null ? !getSpecimens().equals(that.getSpecimens()) : that.getSpecimens() != null)
            return false;
        if (getSsos() != null ? !getSsos().equals(that.getSsos()) : that.getSsos() != null) return false;
        return getSsps() != null ? getSsps().equals(that.getSsps()) : that.getSsps() == null;
    }

    @Override
    public int hashCode() {
        int result = getAlleleDatabases() != null ? getAlleleDatabases().hashCode() : 0;
        result = 31 * result + (getAlleleNames() != null ? getAlleleNames().hashCode() : 0);
        result = 31 * result + (getDiagnosticReport() != null ? getDiagnosticReport().hashCode() : 0);
        result = 31 * result + (getGeneticsPhaseSets() != null ? getGeneticsPhaseSets().hashCode() : 0);
        result = 31 * result + (getGenotypingResultsHaploids() != null ? getGenotypingResultsHaploids().hashCode() : 0);
        result = 31 * result + (getGenotypingResultsMethods() != null ? getGenotypingResultsMethods().hashCode() : 0);
        result = 31 * result + (getGlstrings() != null ? getGlstrings().hashCode() : 0);
        result = 31 * result + (getHaploids() != null ? getHaploids().hashCode() : 0);
        result = 31 * result + (getObservations() != null ? getObservations().hashCode() : 0);
        result = 31 * result + (getOrganization() != null ? getOrganization().hashCode() : 0);
        result = 31 * result + (getPatient() != null ? getPatient().hashCode() : 0);
        result = 31 * result + (getSbtNgss() != null ? getSbtNgss().hashCode() : 0);
        result = 31 * result + (getSequences() != null ? getSequences().hashCode() : 0);
        result = 31 * result + (getSpecimens() != null ? getSpecimens().hashCode() : 0);
        result = 31 * result + (getSsos() != null ? getSsos().hashCode() : 0);
        result = 31 * result + (getSsps() != null ? getSsps().hashCode() : 0);
        return result;
    }
}
