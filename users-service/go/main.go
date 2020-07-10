package main

import (
	pbS "../proto/users"
	"flag"
	"google.golang.org/grpc"
	"log"
	"net"
)

var (
	port    = flag.String("port", "8000", "port")
	apiBase = "https://roads.googleapis.com/v1/snapToRoads?path="
	apiKey  = "AIzaSyBEQgCxiGwGNRNiEp8PRcnxHVkKRq7Igmo"
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
	first := "41.592723,-93.614591|41.592666,-93.615643|41.591736,-93.615530|41.591254,-93.615315|41.590853,-93.615895|41.590652,-93.616754|41.590307,-93.616625|41.589738,-93.616443|41.589385,-93.617323|41.589072,-93.618901|41.588662,-93.621038|41.588197,-93.623314|41.587844,-93.624989|41.587386,-93.627061|41.587178,-93.627962|41.586905,-93.628909|41.586367,-93.628748|41.585701,-93.628501|41.585116,-93.628361|41.584987,-93.628952|41.584843,-93.629521|41.584698,-93.630272|41.584465,-93.631324"

	res := getRoutes(first)
	if 0 == 1 {
		log.Println(res)
	}
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
