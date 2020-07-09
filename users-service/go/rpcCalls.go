package main

import (
	"context"

	pb "../proto/users"
)

func (s *server) GetUserData(c context.Context, req *pb.UserRequest) (*pb.UserResponse, error) {
	res := "hello"
	response := &pb.UserResponse{
		Body:   res,
		Status: 200,
	}
	return response, nil
}

func (s *server) getRoute(c context.Context, req *pb.UserRequest) (*pb.UserResponse, error) {
	res := "Route"
	response := &pb.UserResponse{
		Body:   res,
		Status: 200,
	}
	return response, nil
}