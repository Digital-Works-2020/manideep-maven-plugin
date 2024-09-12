# How to use  this Plugin to Get Basic Project Info
- **Step-1** Clone the Repository
- **Step-2** Install the Plugin using **mvn clean install**
- **Step-3** Goto your project & run  **mvn com.digitalworks2020:manideep-maven-plugin:project-info** to get project name, modules & dependencies in it

# How to use  this Plugin to Specific Dependency present or not
- **Step-1** Clone the Repository
- **Step-2** Install the Plugin using **mvn clean install**
- **Step-3** Goto your project & run  **mvn com.digitalworks2020:manideep-maven-plugin:dependency-check -Ddependency_id="DEPENDENCY_ARTIFACT_ID"** to get info about it if using in our project
