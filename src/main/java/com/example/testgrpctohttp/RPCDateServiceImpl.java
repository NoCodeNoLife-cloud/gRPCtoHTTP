package com.example.testgrpctohttp;

import io.grpc.GRPCInfomation;
import io.grpc.InfoRpcServiceGrpc;
import io.grpc.stub.StreamObserver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class RPCDateServiceImpl extends InfoRpcServiceGrpc.InfoRpcServiceImplBase {

    @Override
    public void transferInformation(GRPCInfomation.InfoRpcRequest request, StreamObserver<GRPCInfomation.InfoRpcResponse> responseObserver) {
        // 拆包
        String message = request.getMessage();
        int intValue = request.getIntegerValue();
        double doubleValue = request.getDoubleValue();

        System.out.println(message);
        System.out.println(intValue);
        System.out.println(doubleValue);

        try {
            // 发送http请求
            StringBuilder url = new StringBuilder();
            // like this:http://localhost:8080/send?message=message&intValue=25&doubleValue=22.25
            url.append("http://localhost:8080/send?message=\"").append(message).append("\"&intValue=").append(String.valueOf(intValue)).append("&doubleValue=").append(String.valueOf(doubleValue));

            System.out.println(url.toString());

            // 打开连接
            HttpURLConnection httpURLConnection = (HttpURLConnection) (new URL(url.toString()).openConnection());
            // 设置参数
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.setConnectTimeout(15000);
            httpURLConnection.setReadTimeout(60000);
            // httpURLConnection.setDoOutput(true);
            httpURLConnection.connect();

            StringBuilder returnMessage = new StringBuilder();
            // 成功接收
            if (httpURLConnection.getResponseCode() == 200) {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), StandardCharsets.UTF_8));
                String temp = null;
                // 读取返回值
                while ((temp = bufferedReader.readLine()) != null) {
                    returnMessage.append(temp);
                    returnMessage.append("\r\n");
                }
            }

            // 结束
            httpURLConnection.disconnect();

            GRPCInfomation.InfoRpcResponse helloRpcResponse = GRPCInfomation.InfoRpcResponse.newBuilder().setMessage(returnMessage.toString()).setIntegerValue(1).setDoubleValue(1.1).build();
            responseObserver.onNext(helloRpcResponse);
            responseObserver.onCompleted();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}