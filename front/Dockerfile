FROM node:lts-alpine
WORKDIR /front
COPY front/package*.json ./
RUN npm install

COPY . .
EXPOSE 3000
ENTRYPOINT ["npm", "run", "dev"]