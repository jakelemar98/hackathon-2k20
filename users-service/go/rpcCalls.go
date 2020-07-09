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

func (s *server) GetRoute(c context.Context, req *pb.UserRequest) (*pb.UserResponse, error) {
	res := getRoute("41.592723,-93.614591")
	response := &pb.UserResponse{
		Body:   res,
		Status: 200,
	}
	return response, nil
}