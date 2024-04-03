package com.sh;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

import com.sh.card.Card;
import com.sh.objectType.CircularPlayLinkedList;

public class Main {

    private CircularPlayLinkedList<Player> players = null;
    private int numPlayers;

    private LinkedList<Card> openDeque = null;

    private LinkedList<Card> garbageDeque  = null;


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Random random = new Random();

        System.out.println("게임을 시작 하시겠습니까");


        while(true) {


            numPlayers = intput....

            startGameInit(numPlayers);


            //순서 정하기
            playerOrdering();
            //오픈 덱에서 카드 한장 공개
            openCard();
            ㅁㄴㅇㄹㅁㄴㅇ
            // Game start
            while(true) {

                Player currPlayer = players.remove();

                while(true) {
                    // 해당 순서 플레이어 카드덱 프린트
                    currPlayer.printDeque();

                    // 한장이라도 냈는지 안냈는지
                    boolean flag = false;

                    // 선수로 부터 입력값 받기 (낼지 말지)
                    System.out.println("카드를 제출 하시겠습니까?");
                    System.out.printt("Y/N, yes/no");


                    String response = scanner.next();


                    if (response == "N" || response == "no") {

                        // 한장도 제출하지 않았을경우 오픈뎅에서 한장의 카드를 가져간다
                        if(!flag) {
                            Card topCard = openDeque.poll();

                            currPlayer.insertCard(card);
                        }

                        break;

                    }

                    // 카드 인데스 인풋 받기
                    System.out.println("카드를 선택해 주세요.");
                    int cardIndex = scanner.nextInt();

                    Card recievedCard = getCard(cardIndex);

                    Card topGarbage = garbageDeque.peek();
                    // 카드 검사
                    boolean valid = recievedCard.compare(topGarbage);

                    if (valid == true) {
                        currPlayer.removeCard(cardIndex);

                        garbageDeque.insertCard(card);

                        // j, k, q 효과카드 처리

                        flag = true;

                    } eles {
                        System.out.println("wrong card!!!");
                    }

                } // turn loop

                // 플레이어 카드 수 확인 (한명이라도 카드가 0 장이면 게임 끝)

                //
                rotation();


            } // game loop

            regame()?




        } // main loop
    }

    void startGameInit() {
        openDequeInit();

        playerInit(numPlayers);

    }

    void palyerInit(int numPlayers) {
        // numPlayers 의 플레이어 생성
        createPlayers();
        // 각 자에게 카드 분배
        cardSeperation();

    }
}