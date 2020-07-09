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
	log.Println(getRoute("41.592723,-93.614591"))
	// log.Println(getRoute("-35.27801,149.12958%7C-35.28032,149.12907%7C-35.28099,149.12929%7C-35.28144,149.12984%7C-35.28194,149.13003%7C-35.28282,149.12956%7C-35.28302,149.12881%7C-35.28473,149.12836%20"))
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
