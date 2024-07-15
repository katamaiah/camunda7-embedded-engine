### Steps to execute locally
- mvn clean install
- mvn spring-boot:run
- ``Dashboard: http://localhost:9090``

  ``Cockpit: http://localhost:9090/camunda/app/cockpit/default/#/processes``
  
  ``Tasklist: http://localhost:9090/camunda/app/tasklist/default/``
- credential: demo/demo
- Trigger a case :

      url : http://localhost:9090/engine-rest/process-definition/key/invoice-payout/start
      Method: POST
      Content-Type: application/json 
      Body :
      {
          "variables": {
              "invoiceNumber" : {
                  "value" : "<any_value>",
                  "type": "String"
              },
              "eSign" : {
                  "value" : "true",
                  "type": "Boolean"
              }
          },
          "businessKey" : "<any_value>"
      }
      
 