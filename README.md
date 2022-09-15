# Overview
- demo rest-api application is developed using Springboot/Java11
- 2 API's to handle GET & POST requests


# Running the app
  docker pull ashwinnarayanan09/dockerapp.jar    
  docker run -p 9090:8080 ashwinnarayanan09/dockerapp.jar

# Deployment 
- Create a Task definition in AWS ECS and specify the above container.    
- Create a Cluster and run the above task in the cluster (use default VPC and subnet & allow traffic in the security group)

### Application details
- Platform - AWS Fargate
- Url - http://35.90.180.123:8080/

# Messaging design
![image](https://user-images.githubusercontent.com/18032733/190396800-cdceb7d1-5b9f-4534-9181-dbb555569a79.png)# Health check endpoint

/actuator/health
