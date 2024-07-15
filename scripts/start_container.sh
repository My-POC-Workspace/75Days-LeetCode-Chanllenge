set -e

# Pull the Docker image from Docker Hub
docker pull rahulgupta08/springboot

# Run the Docker image as a container
docker push -d -p 9090:9090 rahulgupta08/springboot