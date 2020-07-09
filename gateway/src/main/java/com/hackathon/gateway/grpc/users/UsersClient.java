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

    public UserResponse userData() {

        final ManagedChannel channel = ManagedChannelBuilder.forAddress("127.0.0.1", 8000).usePlaintext().build();
        final UserServiceGrpc.UserServiceBlockingStub stub = UserServiceGrpc.newBlockingStub(channel);
    
        response = stub.getUserData(UserRequest.newBuilder()
            .setBody("hey")
            .build());
        
        channel.shutdown();
        return response;
    }
}