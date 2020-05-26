package exercise;

import java.util.Map;

import exercise.tasks.WordCounter;

public class Executer {

	public static void main(String[] args) {
		// Word counter  from array of string -
		WordCounter wordCounter = new WordCounter();
		String[] strings = {"a", "a", "b", "b", "c", "c", "a", "d"};
		Map<String, Integer> map = wordCounter.wordCounter(strings);
		System.out.println("La résultat de word count est :  " + map);
		
		//checkInstances  from array of string -
		Map<String, Boolean> checkInstances = wordCounter.checkInstances(strings);
		System.out.println("La résultat de word count est  - (checkInstances) :  " + checkInstances);

	}

}
