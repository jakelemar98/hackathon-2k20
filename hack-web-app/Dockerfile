FROM node:12-alpine as node
WORKDIR /usr/src/app

COPY ./package*.json ./

RUN npm install

COPY . .

RUN npm run ng build -- --prod

#stage 2
FROM nginx:1.13.12-alpine

COPY --from=node /usr/src/app/dist/hack-web-app /usr/share/nginx/html

EXPOSE 80

COPY ./nginx.conf /etc/nginx/conf.d/default.conf
