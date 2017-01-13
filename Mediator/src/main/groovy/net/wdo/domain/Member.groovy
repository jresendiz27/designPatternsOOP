package net.wdo.domain

//College
abstract class Member {
    String nickName

    abstract void send(Room<Member> room, String message)
    abstract void receive(String message)

}