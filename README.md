

# Docker Setup Guide 🚀

## **2. Build the Docker Image**
Run the following command in the directory where the `Dockerfile` is located:

```bash
docker build -t my-app .
```
- `-t my-app` → Assigns the name **my-app** to the Docker image.
- `.` → Uses the current directory as the build context.

---

## **3. Verify the Docker Image**
```bash
docker images
```
This lists all available Docker images.

---

## **4. Run the Docker Container**
```bash
docker run -d -p 3000:3000 --name my-container my-app
```
- `-d` → Runs the container in detached mode (background).
- `-p 3000:3000` → Maps port 3000 of the container to port 3000 on your system.(Given port in docker file)
- `--name my-container` → Assigns the name **my-container** to the running container.

---

## **5. Check Running Containers**
```bash
docker ps
```
This lists all active containers.

---

## **6. Stop and Remove the Container (If Needed)**
```bash
docker stop my-container
docker rm my-container
```

---

## **7. Remove the Docker Image (If Needed)**
```bash
docker rmi my-app
```

---

## **8. Push the Image to Docker Hub (Optional)**
First, log in to Docker Hub:
```bash
docker login
```
Then, tag the image:
```bash
docker tag my-app username/my-app:latest
```
Finally, push it to Docker Hub:
```bash
docker push username/my-app:latest
```
Replace `username` with your Docker Hub username.

---

### **🎉 Your Docker container is now running successfully!**
To clean up unused Docker resources, run:
```bash
docker system prune -a
```

