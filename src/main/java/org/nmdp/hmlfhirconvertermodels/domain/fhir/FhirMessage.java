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

public class FhirMessage {
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
}
