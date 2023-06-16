package com.example.testgrpctohttp;

import io.grpc.GRPCInfomation;
import io.grpc.InfoRpcServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class GRPCClient {
    private static final String host = "localhost";
    private static final int serverPort = 8899;

    public static void main(String[] args) throws Exception {
        // 1. 拿到一个通信的channel
        ManagedChannel managedChannel = ManagedChannelBuilder.forAddress(host, serverPort).usePlaintext().build();
        try {
            // 2.拿到代理对象
            InfoRpcServiceGrpc.InfoRpcServiceBlockingStub rpcDateService = InfoRpcServiceGrpc.newBlockingStub(managedChannel);

            // 构造请求数据包
            GRPCInfomation.InfoRpcRequest request = GRPCInfomation.InfoRpcRequest.newBuilder().setMessage("this+is+information").setDoubleValue(22.25).setIntegerValue(25).build();

            // 获取结果
            GRPCInfomation.InfoRpcResponse response = rpcDateService.transferInformation(request);

            // 4. 输出结果
            System.out.println(response.getMessage());
        } finally {
            // 5.关闭channel, 释放资源.
            managedChannel.shutdown();
        }
    }
}