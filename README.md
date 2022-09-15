# Overview
- demo rest-api application is developed using Springboot/Java11
- 2 API's to handle GET & POST requests


# Running the app
  docker pull ashwinnarayanan09/dockerapp.jar    
  docker run -p 9090:8080 ashwinnarayanan09/dockerapp.jar

# Deployment 
1.Create a Task definition in AWS ECS and specify the above container
2.Create a Cluster and run the above task in the cluster (use default VPC and subnet & allow traffic in the security group)

# Messaging design
![image](https://user-images.githubusercontent.com/18032733/190382023-deb5449f-58e3-4f10-9c45-617d1b29a70a.png)
# Health check endpoint

/actuator/health
