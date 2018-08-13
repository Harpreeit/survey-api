# survey-api
Parse inputstream JSON data to Java Object and store them in MySQL database

# Introduction

Survey-api is designed to store the JSON response from qualtrics api. This api performs create operations which takes the JSON survey response file and converts it into Java Object. The response data is maped and stored in the survey-output database table in MySQL. 

In this example, a static JSON file (survey.json) is used as a dummy survey response which is parsed to Java Object using Jackson library. If the incoming JSON data is through the API, this static file can be replaced with the URL object.

URL url = new URL(“Your-Third-Party-REST-Endpoint-Here”);

Using Postman, create a post request by adding survey responses from qualtrics which should be in JSON, and send it to the endpoint http://localhost:8080/api/surveys 

# Prerequisites:

Eclipse IDE: Import the project into IDE and run it on tomcat server

MySQL : Configure and start the server before running the application

Postman: Create a post request to send survey response JSON data from qualtrics

# Add External Jars: 

Add the three jar files into your project build path from the below google drive link. These jar files are dependencies for the ExportClient.java file which is provided by Qualtrics to export the incoming survey responses using .CSV file format.

https://drive.google.com/open?id=1x1TktW1KYDePbiGpoDFlwyY19G2l0OLk

