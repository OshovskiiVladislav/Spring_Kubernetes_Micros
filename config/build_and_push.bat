copy config/Dockerfile jokes/Dockerfile

./gradlew clean build
docker build . -t vlad43590/jokes:1.0.0
docker push vlad43590/jokes:1.0.0

del jokes/Dockerfile


copy config/Dockerfile spring-admin/Dockerfile

./gradlew clean build
docker build . -t vlad43590/spring-admin:1.0.0
docker push vlad43590/spring-admin:1.0.0

del spring-admin/Dockerfile


copy config/Dockerfile cats-api/Dockerfile

./gradlew clean build
docker build . -t vlad43590/cats-api:1.0.1
docker push vlad43590/cats-api:1.0.1

del cats-api/Dockerfile
