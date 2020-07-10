package com.hackathon.gateway.grpc.users;

import org.springframework.beans.factory.annotation.Autowired;
import com.grpc.services.users.UserResponse;
import com.grpc.services.users.UserServiceGrpc;
import com.grpc.services.users.UserRequest;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class UsersClient {
    @Autowired
    ManagedChannel managedChannel;

    private UserResponse response;

    private String url = "users-service";

    public UserResponse userData() {
        final ManagedChannel channel = ManagedChannelBuilder.forAddress(url, 8000).usePlaintext().build();
        final UserServiceGrpc.UserServiceBlockingStub stub = UserServiceGrpc.newBlockingStub(channel);
    
        response = stub.getUserData(UserRequest.newBuilder()
            .setBody("hey")
            .build());
        System.out.println("shutting down");
        channel.shutdown();
        return response;
    }

    public UserResponse getRoute() {
        final ManagedChannel channel = ManagedChannelBuilder.forAddress(url, 8000).usePlaintext().build();
        final UserServiceGrpc.UserServiceBlockingStub stub = UserServiceGrpc.newBlockingStub(channel);
    
        response = stub.getRoute(UserRequest.newBuilder()
            .setBody("hey")
            .build());
        System.out.println("shutting down");
        channel.shutdown();
        return response;
    }
    public UserResponse getRoutes() {
        final ManagedChannel channel = ManagedChannelBuilder.forAddress(url, 8000).usePlaintext().build();
        final UserServiceGrpc.UserServiceBlockingStub stub = UserServiceGrpc.newBlockingStub(channel);
    
        // response = stub.getRoutes(UserRequest.newBuilder()
        //     .setBody("hey")
        //     .build());
        System.out.println("shutting down");
        channel.shutdown();
        return response;
    }
}