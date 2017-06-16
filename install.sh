#!/usr/bin/env bash

username=$1
password=$2
branch=$3
models_path=$4

sh build.sh username password branch models_path

mvn install:install-file -Dfile=target/service-hml-fhir-converter-models-2.0.0-SNAPSHOT.jar
