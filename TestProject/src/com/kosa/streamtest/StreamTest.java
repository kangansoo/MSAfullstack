package com.kosa.streamtest;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamTest {

	public static void main(String[] args) {
		List<Player> playerList = new ArrayList<Player>();
		playerList.add(new Player("손흥민", 32, "공격수"));
		playerList.add(new Player("조규성", 29, "공격수"));
		playerList.add(new Player("황희찬", 30, "공격수"));
		playerList.add(new Player("황인범", 30, "미드필더"));
		playerList.add(new Player("이재성", 32, "미드필더"));
		playerList.add(new Player("이강인", 25, "미드필더"));
		playerList.add(new Player("정우영", 25, "미드필더"));
		playerList.add(new Player("정우영", 33, "미드필더"));
		playerList.add(new Player("김민재", 29, "수비수"));
		playerList.add(new Player("김진수", 31, "수비수"));
		playerList.add(new Player("김영권", 33, "수비수"));
		playerList.add(new Player("김승규", 31, "골키퍼"));
		playerList.add(new Player("조현우", 33, "골키퍼"));
		playerList.add(new Player("송범근", 28, "골키퍼"));

		playerList.stream().map(player -> player.getName() + ", " + player.getPosition()).forEach(System.out::println);
		System.out.println("============================================");

		playerList.stream().filter(player -> player.getName().equals("정우영") && player.getAge() > 30)
				.forEach(player -> System.out.println("큰 정우영: " + player));
		System.out.println("============================================");

		System.out.println("이름 순으로 정렬 :");
		playerList.stream().sorted().forEach(System.out::println);
		System.out.println("============================================");

		System.out.println("나이 내림차순으로 정렬 :");
		playerList.stream().sorted(Comparator.comparingInt(Player::getAge).reversed()).forEach(System.out::println);
		System.out.println("============================================");

//		System.out.println("나이 내림차순으로 정렬:");
//		playerList.stream()
//		    .sorted((p1, p2) -> Integer.compare(p2.getAge(), p1.getAge()))
//		    .forEach(System.out::println);

		Optional<Player> playerOver35 = playerList.stream().filter(player -> player.getAge() >= 35).findFirst();

		playerOver35.ifPresentOrElse(player -> System.out.println("나이가 35 이상인 선수: " + player),
				() -> System.out.println("나이가 35 이상인 선수가 없습니다."));
		System.out.println("============================================");

		Optional<Player> oldestPlayer = playerList.stream().reduce((p1, p2) -> p1.getAge() > p2.getAge() ? p1 : p2);

		System.out.println("나이가 가장 많은 선수: ");
		oldestPlayer.ifPresent(System.out::println);
		System.out.println("============================================");

		Map<String, List<Player>> groupedByPosition = playerList.stream()
			    .collect(Collectors.groupingBy(Player::getPosition,
			        Collectors.collectingAndThen(Collectors.toList(),
			            players -> players.stream()
			                .sorted(Comparator.comparingInt(Player::getAge).reversed()
			                    .thenComparing(Player::getName)) // 나이로 먼저 정렬하고, 이름으로 정렬
			                .collect(Collectors.toList()))));

		groupedByPosition.forEach((position, players) -> {
			System.out.println(position + " :");
			players.forEach(player -> System.out.println("이름: " + player.getName() + ", 나이: " + player.getAge()));
			System.out.println();
		});

	}
}
