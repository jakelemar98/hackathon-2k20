package main

import (
	pbS "../proto/users"
	"flag"
	"google.golang.org/grpc"
	"log"
	"net"
)

var (
	port = flag.String("port", "8000", "port")
	apiBase = "https://roads.googleapis.com/v1/snapToRoads?path="
	apiKey = "AIzaSyBEQgCxiGwGNRNiEp8PRcnxHVkKRq7Igmo"
)

func init() {
	flag.Parse()
}

type server struct {
	name string
}

func UserService() *server {
	return &server{
		name: "Server",
	}
}

func main() {
	log.Println("ZERO Server listening in :", *port)
	lis, err := net.Listen("tcp", ":"+*port)
	if err != nil {
		log.Fatalf("failed to listen: %v", err)
	}

	grpcServer := grpc.NewServer()
	userService := UserService()
	pbS.RegisterUserServiceServer(grpcServer, userService)

	if err := grpcServer.Serve(lis); err != nil {
		log.Fatalf("failed to serve: %v", err)
	}
}
