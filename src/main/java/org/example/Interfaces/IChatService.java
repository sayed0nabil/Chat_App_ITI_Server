package org.example.Interfaces;

import org.example.model.Message;
import org.example.model.Notification;
import org.example.model.User;
import org.example.model.UserStatus;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface IChatService extends Remote {

    public List<User> getFriendList(User user) throws RemoteException;
    public void changeStatus(UserStatus userStatus) throws RemoteException;
    public Message sendMessage(User user) throws RemoteException;
    public List<Notification>getNotifications() throws RemoteException;
    public void register(User user) throws RemoteException;
//    public void unRegister(User user) throws RemoteException;
    public void addFriend() throws RemoteException;
    public void sendGroupMsg(User user, Message groupMessage) throws RemoteException;
}
