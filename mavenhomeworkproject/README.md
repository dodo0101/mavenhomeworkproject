1. A parent has to have type of pom. If you want to add a war it will have to be a child module.
(https://stackoverflow.com/questions/45351672/maven-war-packaging-with-value-war-is-invalid-aggregator-projects-require)
So rest module has additional war packaging

2.To run project on non default profile use:
mvn packaging -P production