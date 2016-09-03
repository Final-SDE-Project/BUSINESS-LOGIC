#BUSINESS LOGIC Services
Business Logic Service implements all the logics and get requests that are used in this application. This service has connection with Storage-Service and gets all the information asked by the user and send it to process centric-service. It uses SOAP technologies. It takes external-data from storage and passes them to the Process-Centric service after obtaining meaningful information. It also make comparison of the current measures and expected measures (coming from database and external service) and decides the new goal and send this information to Process-Centric layer to set a new goal.

##WIKI Page

##HEROKU Address
https://sde-bl.herokuapp.com/ws/bl?wsdl
