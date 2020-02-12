package org.example.Controller;

import org.example.Interfaces.IChatService;
import org.example.model.Message;
import org.example.model.Notification;
import org.example.model.User;
import org.example.model.UserStatus;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

public class ChatService extends UnicastRemoteObject implements IChatService {
    static List<User> onlineUsers = new ArrayList<>();
    protected ChatService() throws RemoteException {
    }

    @Override
    public List<User> getFriendList(User user) {
        return null;
    }

    @Override
    public void changeStatus(UserStatus userStatus) {

    }

    @Override
    public Message sendMessage(User user) {
        return null;
    }

    @Override
    public List<Notification> getNotifications() {
        return null;
    }

    @Override
    public void register(User user) {
        System.out.println("Get Registered");
//        onlineUsers.add(user);
    }

//    @Override
//    public void unRegister(User user) {
////        onlineUsers.remove(user);
//    }

    @Override
    public void addFriend() {

    }

    @Override
    public void sendGroupMsg(User user, Message groupMessage) {

    }
}
