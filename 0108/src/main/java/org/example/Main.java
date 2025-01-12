package org.example;

import org.example.calc.Calc1;
import org.example.knn.Point;
import org.example.lotto.LottoBall;
import org.example.save.PiggySave;
import org.example.snakegame.Tile;
import org.example.yesnotest.Question;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;



public class Main {

    public static double calcDistance(Point p1, Point p2) {

        double result = Math.sqrt(
                Math.pow(p1.xpos - p2.xpos, 2) + Math.pow(p1.ypos - p2.ypos, 2)
        );

        return result;

    }

    public static void main(String[] args) {

        //테스트 노드 만들기
        ArrayList<Question> questions = new ArrayList<>();
        questions.add(new Question("일을 하기는 하는데 뭘 하고 있는지 잘 모르겠다.", 1, 3));
        questions.add(new Question("일과 관련한 기록을 어떤 방식으로든 하고 있다.", 3, 5));
        questions.add(new Question("주변에 일 고민을 나눌 수 있는 사수나 동료가 없다", 4, 8));
        questions.add(new Question("지나온 커리어가 나에게 어떤 의미인지 잘 알고 있다.", 6, 4));
        questions.add(new Question("지금 나에게 가장 필요한 건 일에 대한 피드백이다.", 8, 7));
        questions.add(new Question("일에서 실수가 잦은게 고민이다.", 8, 9));
        questions.add(new Question("나의 커리어패스나 경험을 눈에 보이는 방식으로 한번 정리하고 싶다", 9, 7));
        questions.add(new Question("사이드프로젝트에 대한 생각이 있다.", 15, 10));
        questions.add(new Question("분명히 했던 일인데 또 하려면 어떻게 했는지 기억이 잘 나지 않는다.", 11, 9));
        questions.add(new Question("내 강점을 잘 성명하고 싶다.", 12, 10));
        questions.add(new Question("긴 글을 쓰고 싶다는 마음이 늘 있다.", 13, 11));
        questions.add(new Question("내가 일에서 뭘 원하는지, 뭘 하고 싶지 않은지 알고 싶다.", 14, 15));
        questions.add(new Question("A : 내가 어떻게 일하는지, 내 강점은 무엇인지 스스로 이미 너무 잘 알고 있어요.", 0, 0));
        questions.add(new Question("B : 일에 대해 뭔가 하고 싶은 이야기는 있는데, 그게 어떤 방식으로 쓰일 수 있을지 감이 잡히지 않죠.", 0, 0));
        questions.add(new Question("C : 일을 하고 있지만 내가 뭘 배우고 있는지, 내가 어떻게 '일하는 나'를 만들어가고 있는지 아직은 의문인 당신. ", 0, 0));
        questions.add(new Question("D : 지금 하고 있는 일에서 크게 고민되는 게 없거나, 지금 하는 일에 지루함을 느끼는 상황인가요?", 0, 0));

        //System.out.println(questions);

        //지금 현재 위치
        int current = 0;
        Scanner scanner = new Scanner(System.in);

        //로직

        while (true) {
            //종료 조건
            if (questions.get(current).getYesIndex()==0 | questions.get(current).getNoIndex() == 0) {
                System.out.println(questions.get(current).getText());
                System.out.println("끝!");
                break;
            }

            //현재 위치에 해당하는 질문 보여주기
            System.out.println(questions.get(current).getText());
            System.out.println("yes : 0, no : 1");

            //yes, no 답 받기
            int a = scanner.nextInt();

            //해당하는 질문으로 현재위치 이동
            if (a==0){
                current = questions.get(current).getYesIndex();
            }else {
                current = questions.get(current).getNoIndex();
            }

        }
    }
}
            //타일 정보에 desc정보가 있다면 다른 곳으로 이동
//            if(currentTile.getDesc() != null){
//                //화면에 desc의 내용을 출력
//
//                int moving = currentTile.getMoving();
//                String type = currentTile.getType();
//
//                //어떤 방향으로 얼마나 이동해야 하는지 알아야 한다.
//
//                //current 위치 바꿔줘야 한다.
//                if(type.equals("고속도로")) {
//                    current = current + moving;
//                }else {
//                    current = current - moving;
//                }
//
//                Tile dest = tiles.get(current);
//
//                System.out.println(dest);
//                //다시 해당 위치의 타일을 가져와서 출력해야 한다.
//            }

//        //준비물
//        //100개의 타일
//        ArrayList<Tile> tiles = new ArrayList<>();
//
//        for (int i = 1; i <=100; i++){
//            Tile tile = new Tile(i);
//            tiles.add(tile);
//        }
//
//        tiles.get(3) .setDesc(" 12 - 노인에게 길을 비켜주어 노인에게 칭찬받았다.");
//        tiles.get(3).setType("고속도로");
//        tiles.get(3).setMoving(12);
//
//        tiles.get(7) .setDesc(" 14 - 열심히 역도 훈련을 해서 트로피를 받았다.");
//        tiles.get(7).setType("고속도로");
//        tiles.get(7).setMoving(14);
//
//        tiles.get(17) .setDesc(" 20 - 나무를 심어서 후에 숲을 만들었다.");
//        tiles.get(17).setType("고속도로");
//        tiles.get(17).setMoving(20);
//
//        tiles.get(19) .setDesc(" 54 - 경찰에게 범죄자가 있다고 신고한 뒤 표창장을 받았다.");
//        tiles.get(19).setType("고속도로");
//        tiles.get(19).setMoving(54);
//
//        tiles.get(23) .setDesc(" 12 - 환자를 치료하는 연습을 한 뒤 의사가 되었다.");
//        tiles.get(23).setType("고속도로");
//        tiles.get(23).setMoving(12);
//
//        tiles.get(31) .setDesc(" 24 - 공부를 열심히 해서 좋은 대학에 진학해 졸업했다.");
//        tiles.get(31).setType("고속도로");
//        tiles.get(31).setMoving(24);
//
//        tiles.get(33) .setDesc(" 12 - 열심히 일하여 후에 큰돈을 모았다.");
//        tiles.get(33).setType("고속도로");
//        tiles.get(33).setMoving(12);
//
//        tiles.get(39) .setDesc(" 20 - 닭에게 모이를 줘서 달걀을 많이 얻었다.");
//        tiles.get(39).setType("고속도로");
//        tiles.get(39).setMoving(20);
//
//        tiles.get(47) .setDesc(" 6 - 청소를 열심히 한 후 남자에게 잘 보였다.");
//        tiles.get(47).setType("고속도로");
//        tiles.get(47).setMoving(6);
//
//        tiles.get(69) .setDesc(" 18 - 농사를 열심히 지어서 많은 작물을 얻었다.");
//        tiles.get(69).setType("고속도로");
//        tiles.get(69).setMoving(18);
//
//        tiles.get(75) .setDesc(" 10 - 학을 연구해 후에 화학자가 되었다.");
//        tiles.get(75).setType("고속도로");
//        tiles.get(75).setMoving(10);
//
//        tiles.get(79) .setDesc(" 20 - 달리기에서 1등을 했다.");
//        tiles.get(79).setType("고속도로");
//        tiles.get(79).setMoving(20);
//
//        tiles.get(89) .setDesc(" 2 - 공산군을 쫓아내고 전투에서 승리하였다.");
//        tiles.get(89).setType("고속도로");
//        tiles.get(89).setMoving(2);
//
//        //snake
//        tiles.get(21) .setDesc(" 20 - 스케이트를 지정 장소가 아닌 언 호수에서 타다가 얼음이 깨져 빠졌다.");
//        tiles.get(21).setType("뱀 쉭쉭");
//        tiles.get(21).setMoving(20);
//
//        tiles.get(28) .setDesc(" 22 - 공부를 열심히 안 해 훗날 거지가 되었다(...).");
//        tiles.get(28).setType("뱀 쉭쉭");
//        tiles.get(28).setMoving(22);
//
//        tiles.get(29) .setDesc(" 20 - 벽에 낙서를 해서[14] 한 여자한테[15] 스팽킹을 당했다(...).");
//        tiles.get(29).setType("뱀 쉭쉭");
//        tiles.get(29).setMoving(20);
//
//        tiles.get(43) .setDesc(" 18 - 친구를 폭행해서 경찰에게 용서를 빌으며 깽값을 물어주게 되었다.");
//        tiles.get(43).setType("뱀 쉭쉭");
//        tiles.get(43).setMoving(18);
//
//        tiles.get(57) .setDesc(" 16 - 개를 발로 찼다가 개한테 쫓기게 된다(...).");
//        tiles.get(57).setType("뱀 쉭쉭");
//        tiles.get(57).setMoving(16);
//
//        tiles.get(65) .setDesc(" 52 - 여자를 성추행해서 감옥에 갇혔다.");
//        tiles.get(65).setType("뱀 쉭쉭");
//        tiles.get(65).setMoving(52);
//
//        tiles.get(67) .setDesc(" 16 - 과식해서 배탈이 났다. 당시 시대상을 생각하면 불량식품에 관한 내용으로도 해석할 수 있다.");
//        tiles.get(67).setType("뱀 쉭쉭");
//        tiles.get(67).setMoving(16);
//
//        tiles.get(71) .setDesc(" 22 - 불발탄을 가지고 놀다가 폭발해서 다친다.");
//        tiles.get(71).setType("뱀 쉭쉭");
//        tiles.get(71).setMoving(22);
//
//        tiles.get(83) .setDesc(" 22 - 기찻길에서 놀다가 기차에 치일 위기에 처한다.");
//        tiles.get(83).setType("뱀 쉭쉭");
//        tiles.get(83).setMoving(22);
//
//        tiles.get(93) .setDesc(" 30 - 지푸라기에 불을 붙이는 불장난을 하는 바람에 화재가 났다.");
//        tiles.get(93).setType("뱀 쉭쉭");
//        tiles.get(93).setMoving(30);
//
//        tiles.get(95) .setDesc(" 14 - 나무를 너무 많이 베어서 홍수가 나 휩쓸린다.");
//        tiles.get(95).setType("뱀 쉭쉭");
//        tiles.get(95).setMoving(15);
//
//        tiles.get(97) .setDesc(" 20 - 나무에 올라갔다가 추락했다.");
//        tiles.get(97).setType("뱀 쉭쉭");
//        tiles.get(97).setMoving(20);
//
//
//        System.out.println(tiles);
//
//        // 지금 현재 위치
//        int current = 0;
//        Scanner scanner = new Scanner(System.in);
//
//        //로직
//        while(true) {
//            System.out.println("마음의 준비를 하시고 Enter");
//            scanner.nextLine();
//
//            //주사위 굴리기 - value
//            int value = Calc1.roll();
//            System.out.println("주사위 눈은 : " + value);
//
//            //어떤 타일을 가져와야 하나?
//            current = current + value;
//            System.out.println("현재 위치 : " + current);
//
//            // 만일 current+value가 전체 99보다 크면 break;
//            if(current > 99) {
//                System.out.println("Game over");
//                break;
//
//            }
//
//            Tile currentTile = tiles.get(current);
//
//            System.out.println("===============");
//            System.out.println(currentTile);
//
//            //타일 정보에 desc정보가 있다면 다른 곳으로 이동
//            if(currentTile.getDesc() != null){
//                //화면에 desc의 내용을 출력
//
//                int moving = currentTile.getMoving();
//                String type = currentTile.getType();
//
//                //어떤 방향으로 얼마나 이동해야 하는지 알아야 한다.
//
//                //current 위치 바꿔줘야 한다.
//                if(type.equals("고속도로")) {
//                    current = current + moving;
//                }else {
//                    current = current - moving;
//                }
//
//                Tile dest = tiles.get(current);
//
//                System.out.println(dest);
//                //다시 해당 위치의 타일을 가져와서 출력해야 한다.
//            }
//        }


//        PiggySave mine = new PiggySave();
//        PiggySave yours = new PiggySave();
//
//        mine.deposit(1000);
//        mine.deposit(3000);
//        mine.deposit(5000);
//
//        yours.deposit(500);
//        yours.deposit(1000);
//
//        System.out.println(mine.withcraw());
//        System.out.println(yours.withcraw());
//
//        System.out.println(mine.withcraw());
//        System.out.println(yours.withcraw());

//        System.out.println(Calc1.plus(10, 20));


//        Point p1 = new Point(5,5);
//        Point p2 = new Point(1,1);
//
//        System.out.println(calcDistance(p1, p2));

//        ArrayList<LottoBall> balls = new ArrayList<>();
//
////        LottoBall b1 = new LottoBall(1);
////
////        balls.add(b1);
//
//        for (int i=1; i<=45; i++){
//            balls.add(new LottoBall(i));
//        }//end for
//
//
//        for (int i = 0; i < 3; i++) {
//            Collections.shuffle(balls);
//            System.out.println(balls.subList(0, 6));
//            System.out.println("--------------");
//            System.out.println(balls.size());
//        }