# CPSDocumentGenerator   
Tool to generate CPS documents containing different heterogeneity.
It creates the Gold Standard documents based on the initial document. 


## Important Dependencies

AMLGoldStandardGenerator needs Java 1.7, Maven 3.0. Download Java SE from  
http://www.oracle.com/technetwork/java/javase/downloads/index.html


## What is CPSDocumentGenerator?

CPSDocumentGenerator is a Java-based tool, which generates Gold standard documents for heterogeneity AML files (XML-based) based on probability and number of child nodes in an AML document. 
For heterogeneity such as different Granularity, it performs XML data partition into two files, keeping syntactical consistency of the obtained files against the AutomationML XSD schema. 
The goal of this project is to automate process of creating data heterogeneity in AML files based on probability distributions, e.g, Poisson Distribution. 
The tool takes as an input an 'AML file' and outputs 2 files with different heterogeneity which can be used as input for data integration. 
The integration tool output can then be compared with the orignal input of this tool thus making the process to achieve recall and precision for the obtatined result.
To create folders manually before running, you can create and put Goldstandard.txt and training data.           

Please include this config.ttl if you want to generate data

The following paramters can be configured.

```
use 0 to disable

RandomizeAllSeeds   "false" , "true", "one"                       
aml:ContaminateRoleClassAttribute   "0" , "1"          
aml:MultiHeterogeneity    "0.... 7"         
All other aml attributes can have values in range (min, max)
If there is no range , and a single value is given for Element generation then 
randomization will be disabled and fixed number of elements will be generated.
for e.g 
aml:InstanceHierarchysetInternalElement "1-10"; generates elements between 1-10
randomly

aml:InstanceHierarchysetInternalElement "5"; generated exactly 5 elements.

```

Example :

```

@prefix aml:     <http://vocab.cs.uni-bonn.de/aml#> .
@prefix owl:     <http://www.w3.org/2002/07/owl#> .
@prefix rdf:     <http://www.w3.org/1999/02/22-rdf-syntax-ns#> .
@prefix rdfs:    <http://www.w3.org/2000/01/rdf-schema#> .
@prefix schema:  <http://schema.org/> .
@prefix skos:    <http://www.w3.org/2004/02/skos/core#> .
@prefix xml:     <http://www.w3.org/XML/1998/namespace> .
@prefix xsd:     <http://www.w3.org/2001/XMLSchema#> .
@prefix uri:     <http://uri4uri.net/vocab.html/#>
@prefix sto:     <https://w3id.org/i40/sto#>.
@prefix ontosec: <http://www.semanticweb.org/ontologies/2008/11/OntologySecurity.owl#>

aml:conf 
rdfs:label "General Configuration"@en ;
uri:path "C:/HeterogeneityExampleData/AutomationML/Single-Heterogeneity/M2/Testbeds-1/";
uri:root "C:/HeterogeneityExampleData/AutomationML/Single-Heterogeneity/"; 
aml:RandomizeAllSeeds   "false";          
aml:ContaminateRoleClassAttribute "1";
aml:MultiHeterogeneity "2";

aml:Copyright  "0"; 
aml:Description "0"; 
aml:Version "0"; 
aml:AttributeNameMapping "0"; 
aml:AttributeValueRequirements "0"; 
aml:AttributesetConstraint  "0"; 
aml:MappingObject "0"; 
aml:Attribute "0";

aml:InstanceHierarchy "1";
aml:InstanceHierarchysetInternalElement "1-4";
aml:InstanceHierarchysetInternalElementNested  "2-4";
aml:InstanceHierarchysetInternalRoleRequirement "0";

aml:InternalElementsetAttribute "1"; 

aml:InterfaceClassLib "1";
aml:InterfaceClass "1";
aml:InterfaceClasssetInterfaceClassNested "0";
aml:InterfaceClasssetAttribute "2"; 

aml:RoleClassLib "1";
aml:RoleClass "1";
aml:RoleClassSetAttribute "2";
aml:RoleClassNested "0";
aml:RoleClassSetExternalInterface "0";

aml:SystemUnitClass "1";
aml:SystemUnitClassSetAttribute "1";
aml:SystemUnitClasssetInternalElement "1"; 
aml:SystemUnitClassLib "2";
aml:SystemUnitClasssetSystemUnitClassNested  "0".
 

```
if you want to reproduce results, please add the below config.ttl and make changes to path where possible.
```

@prefix aml:     <http://vocab.cs.uni-bonn.de/aml#> .
@prefix het:     <http://vocab.cs.uni-bonn.de/het#> .
@prefix owl:     <http://www.w3.org/2002/07/owl#> .
@prefix rdf:     <http://www.w3.org/1999/02/22-rdf-syntax-ns#> .
@prefix rdfs:    <http://www.w3.org/2000/01/rdf-schema#> .
@prefix schema:  <http://schema.org/> .
@prefix skos:    <http://www.w3.org/2004/02/skos/core#> .
@prefix xml:     <http://www.w3.org/XML/1998/namespace> .
@prefix xsd:     <http://www.w3.org/2001/XMLSchema#> .
@prefix uri:     <http://uri4uri.net/vocab.html/#>
@prefix sto:     <https://w3id.org/i40/sto#>.
@prefix ontosec: <http://www.semanticweb.org/ontologies/2008/11/OntologySecurity.owl#>

aml:conf 
rdfs:label "General Configuration"@en ;
uri:path "C:/HeterogeneityExampleData/AutomationML/Single-Heterogeneity/M1/M1.1/Testbeds-1/";
uri:root "C:/HeterogeneityExampleData/AutomationML/Single-Heterogeneity/"; 

aml:MultiHeterogeneity "1-10";
aml:RandomizeAllSeeds   "false";
aml:ContaminateRoleClassAttribute "1";

aml:Copyright  "0"; 
aml:Description "0"; 
aml:Version "0"; 
aml:AttributeNameMapping "0"; 
aml:AttributeValueRequirements "0"; 
aml:AttributesetConstraint  "0"; 
aml:MappingObject "0"; 
aml:Attribute "0";
aml:SetExternalReference "0";

aml:InstanceHierarchy "1";
aml:InstanceHierarchysetInternalElement "1-5";
aml:InstanceHierarchysetInternalElementNested  "0";
aml:InstanceHierarchysetInternalRoleRequirement "0";

aml:InternalElementsetAttribute "0"; 

aml:InterfaceClassLib "0";
aml:InterfaceClass "0";
aml:InterfaceClasssetInterfaceClassNested "0";
aml:InterfaceClasssetAttribute "0"; 

aml:RoleClassLib "2";
aml:RoleClass "2";
aml:RoleClassSetAttribute "2";
aml:RoleClassNested "0";
aml:RoleClassSetExternalInterface "0";

aml:SystemUnitClass "2";
aml:SystemUnitClassSetAttribute "2";
aml:SystemUnitClasssetInternalElement "1"; 
aml:SystemUnitClassLib "2";
aml:SystemUnitClasssetSystemUnitClassNested  "0"
```
 


## Build and Setup  
* You can find runnable jar in jar/ folder if you prefer to run the project in this way.
## For compilation please do the following                             
* Import as JAVA project in Eclipse or your favourite JAVA IDE.
* RUN as JAVA project.
* Output files are stored in output folder.
* Input is stored in resource folder

## Documentation  

Research Documentation available at:   
https://docs.google.com/document/d/1RwsLnVYC9ZFuBUpTo2p_v73yrWLIhxh-xIuTWWdb9dc/edit?usp=sharing

## Usage  

* Configure the parameters in configuration.ttl
* Run as Java Project
* Output is stored according to configuration.


##License

Copyright (C) 2017 EIS University of Bonn
